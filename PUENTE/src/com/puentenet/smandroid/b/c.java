package com.puentenet.smandroid.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;
import com.puentenet.smandroid.b.a;
import com.puentenet.smandroid.b.b;
import com.puentenet.smandroid.b.d;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class c {
   private static final Map a = new HashMap();
   private static final Object[] b = new Object[0];
   private static final Set c = Collections.unmodifiableSet(a());
   private final SQLiteDatabase d;

   private c(Context var1, String var2) {
      this.d = (new d(var1, String.format("com.localytics.android.%s.sqlite", new Object[]{b.a(var2)}), 3)).getWritableDatabase();
   }

   public static c a(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   private static Set a() {
      HashSet var0 = new HashSet();
      var0.add("api_keys");
      var0.add("attributes");
      var0.add("events");
      var0.add("event_history");
      var0.add("sessions");
      var0.add("upload_blobs");
      var0.add("upload_blob_events");
      return var0;
   }

   static void a(Context var0) {
      if(a.c && var0 == null) {
         throw new IllegalArgumentException("context cannot be null");
      } else {
         a(new File(var0.getFilesDir(), "localytics"));
      }
   }

   private static boolean a(File var0) {
      boolean var4 = false;
      boolean var3;
      if(var0.exists() && var0.isDirectory()) {
         String[] var5 = var0.list();
         int var2 = var5.length;

         for(int var1 = 0; var1 < var2; ++var1) {
            var3 = var4;
            if(!a(new File(var0, var5[var1]))) {
               return var3;
            }
         }
      }

      var3 = var0.delete();
      return var3;
   }

   private static boolean a(String var0) {
      boolean var1 = false;
      if(var0 != null && c.contains(var0)) {
         var1 = true;
      }

      return var1;
   }

   public int a(String var1, ContentValues var2, String var3, String[] var4) {
      if(a.c && !a(var1)) {
         throw new IllegalArgumentException(String.format("tableName %s is invalid", new Object[]{var1}));
      } else {
         if(a.b) {
            Log.v("Localytics", String.format("Update table: %s, values: %s, selection: %s, selectionArgs: %s", new Object[]{var1, var2.toString(), var3, Arrays.toString(var4)}));
         }

         return this.d.update(var1, var2, var3, var4);
      }
   }

   public int a(String var1, String var2, String[] var3) {
      if(a.c && !a(var1)) {
         throw new IllegalArgumentException(String.format("tableName %s is invalid", new Object[]{var1}));
      } else {
         if(a.b) {
            Log.v("Localytics", String.format("Delete table: %s, selection: %s, selectionArgs: %s", new Object[]{var1, var2, Arrays.toString(var3)}));
         }

         int var4;
         if(var2 == null) {
            var4 = this.d.delete(var1, "1", (String[])null);
         } else {
            var4 = this.d.delete(var1, var2, var3);
         }

         if(a.b) {
            Log.v("Localytics", String.format("Deleted %d rows", new Object[]{Integer.valueOf(var4)}));
         }

         return var4;
      }
   }

   public long a(String var1, ContentValues var2) {
      if(a.c) {
         if(!a(var1)) {
            throw new IllegalArgumentException(String.format("tableName %s is invalid", new Object[]{var1}));
         }

         if(var2 == null) {
            throw new IllegalArgumentException("values cannot be null");
         }
      }

      if(a.b) {
         Log.v("Localytics", String.format("Insert table: %s, values: %s", new Object[]{var1, var2.toString()}));
      }

      long var3 = this.d.insertOrThrow(var1, (String)null, var2);
      if(a.b) {
         Log.v("Localytics", String.format("Inserted row with new id %d", new Object[]{Long.valueOf(var3)}));
      }

      return var3;
   }

   public Cursor a(String var1, String[] var2, String var3, String[] var4, String var5) {
      if(a.c && !a(var1)) {
         throw new IllegalArgumentException(String.format("tableName %s is invalid", new Object[]{var1}));
      } else {
         if(a.b) {
            Log.v("Localytics", String.format("Query table: %s, projection: %s, selection: %s, selectionArgs: %s", new Object[]{var1, Arrays.toString(var2), var3, Arrays.toString(var4)}));
         }

         SQLiteQueryBuilder var6 = new SQLiteQueryBuilder();
         var6.setTables(var1);
         Cursor var7 = var6.query(this.d, var2, var3, var4, (String)null, (String)null, var5);
         if(a.b) {
            Log.v("Localytics", "Query result is: " + DatabaseUtils.dumpCursorToString(var7));
         }

         return var7;
      }
   }

   public void a(Runnable var1) {
      if(a.c && var1 == null) {
         throw new IllegalArgumentException("runnable cannot be null");
      } else {
         this.d.beginTransaction();

         try {
            var1.run();
            this.d.setTransactionSuccessful();
         } finally {
            this.d.endTransaction();
         }

      }
   }
}

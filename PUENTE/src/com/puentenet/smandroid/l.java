package com.puentenet.smandroid;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.puentenet.smandroid.m;
import java.util.Vector;

public class l {
   private static boolean d;
   private m a;
   private SQLiteDatabase b;
   private final Context c;

   public l(Context var1) {
      this.c = var1;
   }

   private void a(com.puentenet.a.e.e param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void a(boolean var0) {
      d = var0;
   }

   public static boolean a() {
      return d;
   }

   public Cursor a(int var1) {
      SQLiteDatabase var2 = this.b;
      String var3 = "_watchlist=" + var1;
      return var2.query("tickers", new String[]{"name"}, var3, (String[])null, (String)null, (String)null, (String)null);
   }

   public void a(Vector var1) {
      this.b.delete("watchlists", (String)null, (String[])null);
      this.b.delete("tickers", (String)null, (String[])null);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.a((com.puentenet.a.e.e)var1.elementAt(var2), (long)var2);
      }

   }

   public l b() {
      this.a = new m(this.c);
      this.b = this.a.getWritableDatabase();
      return this;
   }

   public void c() {
      this.a.close();
   }

   public Cursor d() {
      return this.b.query("watchlists", new String[]{"_id", "name"}, (String)null, (String[])null, (String)null, (String)null, (String)null);
   }
}

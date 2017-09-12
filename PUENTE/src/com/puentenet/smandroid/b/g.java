package com.puentenet.smandroid.b;

import android.content.Context;
import android.database.CursorJoiner.Result;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.puentenet.smandroid.b.a;
import com.puentenet.smandroid.b.c;
import com.puentenet.smandroid.b.e;
import com.puentenet.smandroid.b.h;
import com.puentenet.smandroid.b.k;
import java.util.Map;

final class g extends Handler {
   private static final String a = String.format("CAST(%s AS TEXT)", new Object[]{"events_key_ref"});
   private static final String b = String.format("CAST(%s as TEXT)", new Object[]{"_id"});
   // $FF: synthetic field
   private static int[] k;
   private final Context c;
   private c d;
   private final String e;
   private long f;
   private long g;
   private boolean h = false;
   private boolean i = false;
   private Handler j;

   public g(Context var1, String var2, Looper var3) {
      super(var3);
      if(a.c) {
         if(var1 == null) {
            throw new IllegalArgumentException("context cannot be null");
         }

         if(TextUtils.isEmpty(var2)) {
            throw new IllegalArgumentException("key cannot be null or empty");
         }
      }

      this.c = var1;
      this.e = var2;
   }

   // $FF: synthetic method
   static c a(g var0) {
      return var0.d;
   }

   private void a(long param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void a(g var0, long var1) {
      var0.g = var1;
   }

   // $FF: synthetic method
   static long b(g var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static boolean c(g var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static long d(g var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static int[] d() {
      int[] var0 = k;
      if(var0 == null) {
         var0 = new int[Result.values().length];

         try {
            var0[Result.BOTH.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            var0[Result.LEFT.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            var0[Result.RIGHT.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         k = var0;
      }

      return var0;
   }

   private void e() {
      // $FF: Couldn't be decompiled
   }

   private void f() {
      // $FF: Couldn't be decompiled
   }

   public void a() {
      // $FF: Couldn't be decompiled
   }

   void a(Runnable var1) {
      if(((Boolean)e.d().get(this.e)).booleanValue()) {
         if(a.b) {
            Log.d("Localytics", "Already uploading");
         }

         this.j.sendMessage(this.j.obtainMessage(2, var1));
      } else {
         try {
            c var3 = this.d;
            k var2 = new k(this);
            var3.a((Runnable)var2);
            e.d().put(this.e, Boolean.TRUE);
            this.j.sendMessage(this.j.obtainMessage(1, var1));
         } catch (Exception var4) {
            if(a.b) {
               Log.w("Localytics", "Error occurred during upload", var4);
            }

            e.d().put(this.e, Boolean.FALSE);
            if(var1 != null) {
               (new Thread(var1, "upload_callback")).start();
            }
         }
      }

   }

   void a(String param1) {
      // $FF: Couldn't be decompiled
   }

   void a(String param1, Map param2) {
      // $FF: Couldn't be decompiled
   }

   void a(boolean var1) {
      if(a.b) {
         Log.v("Localytics", String.format("Prior opt-out state is %b, requested opt-out state is %b", new Object[]{Boolean.valueOf(this.i), Boolean.valueOf(var1)}));
      }

      if(this.i != var1) {
         this.d.a((Runnable)(new h(this, var1)));
         this.i = var1;
      }

   }

   void b() {
      if(!this.h) {
         if(a.b) {
            Log.w("Localytics", "Session was not open, so close is not possible.");
         }
      } else {
         this.a(e.b, (Map)null);
         this.h = false;
      }

   }

   void b(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   void c() {
      // $FF: Couldn't be decompiled
   }

   public void handleMessage(Message param1) {
      // $FF: Couldn't be decompiled
   }
}

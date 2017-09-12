package com.puentenet.smandroid.b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import com.puentenet.smandroid.b.a;
import com.puentenet.smandroid.b.f;
import com.puentenet.smandroid.b.g;
import com.puentenet.smandroid.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public final class e {
   static final String a = String.format("%s:%s", new Object[]{"com.localytics.android", "open"});
   static final String b = String.format("%s:%s", new Object[]{"com.localytics.android", "close"});
   static final String c = String.format("%s:%s", new Object[]{"com.localytics.android", "opt_in"});
   static final String d = String.format("%s:%s", new Object[]{"com.localytics.android", "opt_out"});
   static final String e = String.format("%s:%s", new Object[]{"com.localytics.android", "flow"});
   private static final HandlerThread f = b(g.class.getSimpleName());
   private static final HandlerThread g = b(l.class.getSimpleName());
   private static Map k = new HashMap();
   private final Handler h;
   private final Context i;
   private final String j;

   public e(Context var1, String var2) {
      if(var1 == null) {
         throw new IllegalArgumentException("context cannot be null");
      } else if(TextUtils.isEmpty(var2)) {
         throw new IllegalArgumentException("key cannot be null or empty");
      } else {
         Context var3 = var1;
         if(!var1.getClass().getName().equals("android.test.RenamingDelegatingContext")) {
            var3 = var1;
            if(a.e >= 8) {
               var3 = var1.getApplicationContext();
            }
         }

         this.i = var3;
         this.j = var2;
         this.h = new g(this.i, this.j, f.getLooper());
         this.h.sendMessage(this.h.obtainMessage(0));
      }
   }

   private static HandlerThread b(String var0) {
      HandlerThread var1 = new HandlerThread(var0, 10);
      var1.start();
      return var1;
   }

   // $FF: synthetic method
   static Map d() {
      return k;
   }

   // $FF: synthetic method
   static HandlerThread e() {
      return g;
   }

   public void a() {
      this.h.sendEmptyMessage(1);
   }

   public void a(String var1) {
      this.a(var1, (Map)null);
   }

   public void a(String var1, Map var2) {
      if(a.c) {
         if(var1 == null) {
            throw new IllegalArgumentException("event cannot be null");
         }

         if(var1.length() == 0) {
            throw new IllegalArgumentException("event cannot be empty");
         }

         if(var2 != null) {
            if(var2.isEmpty() && a.b) {
               Log.i("Localytics", "attributes is empty.  Did the caller make an error?");
            }

            Iterator var3 = var2.entrySet().iterator();

            while(var3.hasNext()) {
               Entry var5 = (Entry)var3.next();
               String var4 = (String)var5.getKey();
               String var6 = (String)var5.getValue();
               if(var4 == null) {
                  throw new IllegalArgumentException("attributes cannot contain null keys");
               }

               if(var6 == null) {
                  throw new IllegalArgumentException("attributes cannot contain null values");
               }

               if(var4.length() == 0) {
                  throw new IllegalArgumentException("attributes cannot contain empty keys");
               }

               if(var6.length() == 0) {
                  throw new IllegalArgumentException("attributes cannot contain empty values");
               }
            }
         }
      }

      var1 = String.format("%s:%s", new Object[]{this.i.getPackageName(), var1});
      if(var2 == null) {
         this.h.sendMessage(this.h.obtainMessage(3, new f(var1, (Object)null)));
         Log.i("Localytics ", var1);
      } else {
         this.h.sendMessage(this.h.obtainMessage(3, new f(var1, new TreeMap(var2))));
         Log.i("Localytics ", var1 + var2.toString());
      }

   }

   public void b() {
      this.h.sendEmptyMessage(2);
   }

   public void c() {
      this.h.sendMessage(this.h.obtainMessage(4, (Object)null));
   }
}

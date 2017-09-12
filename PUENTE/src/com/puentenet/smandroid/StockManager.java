package com.puentenet.smandroid;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Handler;
import android.provider.Settings.Secure;
import java.util.Hashtable;
import java.util.UUID;

public class StockManager extends Application {
   private String b() {
      String var2 = Secure.getString(this.getContentResolver(), "android_id");
      boolean var1;
      if(var2 != null && !var2.equals("9774d56d682e549c") && !var2.toLowerCase().equals("null")) {
         var1 = true;
      } else {
         var1 = false;
      }

      if(!var1) {
         var2 = this.c();
      }

      return var2;
   }

   private String c() {
      SharedPreferences var3 = this.getSharedPreferences("android_id_preference_key", 0);
      String var2 = var3.getString("android_id_key", (String)null);
      String var1 = var2;
      if(var2 == null) {
         var1 = UUID.randomUUID().toString();
         var3.edit().putString("android_id_key", var1).commit();
      }

      return var1;
   }

   private Hashtable d() {
      SharedPreferences var2 = this.a();
      Hashtable var1;
      if(var2.contains("numeroDocumento")) {
         var1 = new Hashtable();
         var1.put("numeroDocumento", var2.getString("numeroDocumento", (String)null));
         var1.put("tipoDocumento", Integer.valueOf(var2.getInt("tipoDocumento", 0)));
         var1.put("username", var2.getString("username", (String)null));
         var1.put("password", var2.getString("password", (String)null));
      } else {
         var1 = null;
      }

      return var1;
   }

   public SharedPreferences a() {
      return this.getSharedPreferences("GLOBAL_SETTINGS", 0);
   }

   public void onCreate() {
      com.puentenet.b.a.a.a((com.puentenet.b.a.a)(new com.puentenet.smandroid.a.c(new Handler())));
      com.puentenet.b.c.a.a((com.puentenet.b.c.c)(new com.puentenet.smandroid.a.d()));
      com.puentenet.b.e.a.a(new com.puentenet.smandroid.a.b(), new com.puentenet.smandroid.a.a(), new com.puentenet.smandroid.a.g());
      com.puentenet.b.e.b.a(this.getString(2131099659), this.getString(2131099660), this.getString(2131099661), this.getString(2131099662));
      String var1 = this.b();
      com.puentenet.a.d.d.a(var1, "ANDROID", var1);
      com.puentenet.a.e.b.a(this.d());
   }
}

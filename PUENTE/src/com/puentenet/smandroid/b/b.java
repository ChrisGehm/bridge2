package com.puentenet.smandroid.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.puentenet.smandroid.b.a;
import com.puentenet.smandroid.b.n;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class b {
   static int a() {
      int var0;
      try {
         var0 = Integer.parseInt((String)VERSION.class.getField("SDK").get((Object)null));
      } catch (Exception var3) {
         Log.w("Localytics", "Caught exception", var3);

         try {
            var0 = VERSION.class.getField("SDK_INT").getInt((Object)null);
         } catch (Exception var2) {
            if(a.b) {
               Log.w("Localytics", "Caught exception", var2);
            }

            var0 = 3;
         }
      }

      return var0;
   }

   public static String a(Context param0) {
      // $FF: Couldn't be decompiled
   }

   public static String a(Context var0, TelephonyManager var1) {
      String var3;
      if(var0.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", var0.getPackageName()) == 0) {
         NetworkInfo var2 = ((ConnectivityManager)var0.getSystemService("connectivity")).getNetworkInfo(1);
         if(var2 != null && var2.isConnectedOrConnecting()) {
            var3 = "wifi";
            return var3;
         }
      } else if(a.b) {
         Log.w("Localytics", "Application does not have permission ACCESS_WIFI_STATE; determining Wi-Fi connectivity is unavailable");
      }

      var3 = "android_network_type_" + var1.getNetworkType();
      return var3;
   }

   static String a(String var0) {
      if(a.c && var0 == null) {
         throw new IllegalArgumentException("string cannot be null");
      } else {
         try {
            byte[] var4 = MessageDigest.getInstance("SHA-256").digest(var0.getBytes("UTF-8"));
            BigInteger var1 = new BigInteger(1, var4);
            var0 = var1.toString(16);
            return var0;
         } catch (NoSuchAlgorithmException var2) {
            throw new RuntimeException(var2);
         } catch (UnsupportedEncodingException var3) {
            throw new RuntimeException(var3);
         }
      }
   }

   public static String b() {
      String var0;
      if(a.e >= 9) {
         try {
            var0 = (String)Build.class.getField("SERIAL").get((Object)null);
         } catch (Exception var1) {
            throw new RuntimeException(var1);
         }
      } else {
         var0 = null;
      }

      if(var0 == null) {
         var0 = null;
      } else {
         var0 = a(var0);
      }

      return var0;
   }

   public static String b(Context var0) {
      Object var1 = null;
      String var2;
      if(a.e >= 8 && !((Boolean)n.a(var0.getPackageManager(), "hasSystemFeature", new Class[]{String.class}, new Object[]{"android.hardware.telephony"})).booleanValue()) {
         var2 = (String)var1;
         if(a.b) {
            Log.i("Localytics", "Device does not have telephony; cannot read telephony id");
            var2 = (String)var1;
         }
      } else if(var0.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", var0.getPackageName()) == 0) {
         var2 = ((TelephonyManager)var0.getSystemService("phone")).getDeviceId();
      } else {
         if(a.b) {
            Log.w("Localytics", "Application does not have permission READ_PHONE_STATE; determining device id is not possible.  Please consider requesting READ_PHONE_STATE in the AndroidManifest");
         }

         var2 = null;
      }

      return var2;
   }

   public static String c() {
      String var0;
      if(a.e > 3) {
         try {
            var0 = (String)Build.class.getField("MANUFACTURER").get((Object)null);
            return var0;
         } catch (Exception var1) {
            if(a.b) {
               Log.w("Localytics", "Caught exception", var1);
            }
         }
      }

      var0 = "unknown";
      return var0;
   }

   public static String c(Context var0) {
      String var1 = b(var0);
      if(var1 == null) {
         var1 = null;
      } else {
         var1 = a(var1);
      }

      return var1;
   }

   public static String d(Context param0) {
      // $FF: Couldn't be decompiled
   }
}

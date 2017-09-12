package com.puentenet.smandroid.a;

import com.puentenet.smandroid.a.e;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class f implements X509TrustManager {
   // $FF: synthetic field
   final e a;

   f(e var1) {
      this.a = var1;
   }

   public void checkClientTrusted(X509Certificate[] var1, String var2) {
      e.a(this.a).checkClientTrusted(var1, var2);
   }

   public void checkServerTrusted(X509Certificate[] var1, String var2) {
      if(var1 != null) {
         var1[0].checkValidity();
      } else {
         e.a(this.a).checkServerTrusted(var1, var2);
      }

   }

   public X509Certificate[] getAcceptedIssuers() {
      return e.a(this.a).getAcceptedIssuers();
   }
}

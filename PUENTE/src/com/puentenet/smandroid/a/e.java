package com.puentenet.smandroid.a;

import com.puentenet.smandroid.a.d;
import com.puentenet.smandroid.a.f;
import java.net.Socket;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

public class e extends SSLSocketFactory {
   SSLContext a;
   // $FF: synthetic field
   final d b;
   private X509TrustManager c;

   public e(d var1, KeyStore var2) {
      super(var2);
      this.b = var1;
      this.a = SSLContext.getInstance("TLS");
      this.c = null;
      TrustManagerFactory var3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      var3.init(var2);
      TrustManager[] var4 = var3.getTrustManagers();
      if(var4.length == 0) {
         throw new NoSuchAlgorithmException("no trust manager found");
      } else {
         this.c = (X509TrustManager)var4[0];
         f var5 = new f(this);
         this.a.init((KeyManager[])null, new TrustManager[]{var5}, (SecureRandom)null);
      }
   }

   // $FF: synthetic method
   static X509TrustManager a(e var0) {
      return var0.c;
   }

   public Socket createSocket() {
      return this.a.getSocketFactory().createSocket();
   }

   public Socket createSocket(Socket var1, String var2, int var3, boolean var4) {
      return this.a.getSocketFactory().createSocket(var1, var2, var3, var4);
   }
}

package com.puentenet.smandroid.a;

import com.puentenet.smandroid.a.e;
import java.io.InputStream;
import java.net.URI;
import java.security.KeyStore;
import java.util.Iterator;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpProtocolParams;

public class d implements com.puentenet.b.c.c {
   private HttpClient a = this.a();

   static {
      ConnManagerParams.setMaxTotalConnections(new BasicHttpParams(), 100);
   }

   public com.puentenet.b.c.d a(com.puentenet.b.c.a var1) {
      com.puentenet.b.c.d var2;
      switch(var1.c()) {
      case 1:
         var2 = this.b(var1);
         break;
      case 2:
         var2 = this.c(var1);
         break;
      case 3:
         var2 = this.d(var1);
         break;
      case 4:
         var2 = this.e(var1);
         break;
      default:
         throw new UnsupportedOperationException("Request method not supported");
      }

      return var2;
   }

   protected com.puentenet.b.c.d a(HttpResponse var1) {
      com.puentenet.b.c.d var4 = new com.puentenet.b.c.d();
      var4.a(var1.getStatusLine().getStatusCode());
      var4.a(var1.getStatusLine().getReasonPhrase());
      Header[] var6 = var1.getAllHeaders();
      int var3 = var6.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         Header var5 = var6[var2];
         var4.a(var5.getName(), var5.getValue());
      }

      HttpEntity var7 = var1.getEntity();
      if(var7 != null) {
         var4.a(var7.getContent());
      }

      return var4;
   }

   public HttpClient a() {
      DefaultHttpClient var1;
      try {
         KeyStore var2 = KeyStore.getInstance(KeyStore.getDefaultType());
         var2.load((InputStream)null, (char[])null);
         e var6 = new e(this, var2);
         var6.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
         BasicHttpParams var7 = new BasicHttpParams();
         HttpProtocolParams.setVersion(var7, HttpVersion.HTTP_1_1);
         HttpProtocolParams.setContentCharset(var7, "UTF-8");
         SchemeRegistry var3 = new SchemeRegistry();
         Scheme var4 = new Scheme("http", PlainSocketFactory.getSocketFactory(), 80);
         var3.register(var4);
         var4 = new Scheme("https", var6, 443);
         var3.register(var4);
         ThreadSafeClientConnManager var8 = new ThreadSafeClientConnManager(var7, var3);
         var1 = new DefaultHttpClient(var8, var7);
      } catch (Exception var5) {
         var1 = new DefaultHttpClient();
      }

      return var1;
   }

   protected HttpRequestBase a(com.puentenet.b.c.a var1, HttpRequestBase var2) {
      var2.setURI(new URI(var1.e()));
      Iterator var3 = var1.d().iterator();

      while(var3.hasNext()) {
         com.puentenet.b.e.f var4 = (com.puentenet.b.e.f)var3.next();
         var2.setHeader(var4.a, var4.b);
      }

      return var2;
   }

   protected com.puentenet.b.c.d b(com.puentenet.b.c.a var1) {
      HttpGet var2 = (HttpGet)this.a(var1, new HttpGet());
      return this.a(this.a.execute(var2));
   }

   protected com.puentenet.b.c.d c(com.puentenet.b.c.a var1) {
      HttpPost var2 = (HttpPost)this.a(var1, new HttpPost());
      if(var1.b() != null) {
         var2.setEntity(new StringEntity(var1.b(), "UTF-8"));
      }

      return this.a(this.a.execute(var2));
   }

   protected com.puentenet.b.c.d d(com.puentenet.b.c.a var1) {
      HttpPut var2 = (HttpPut)this.a(var1, new HttpPut());
      return this.a(this.a.execute(var2));
   }

   protected com.puentenet.b.c.d e(com.puentenet.b.c.a var1) {
      HttpDelete var2 = (HttpDelete)this.a(var1, new HttpDelete());
      return this.a(this.a.execute(var2));
   }
}

package com.puentenet.b.c;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

public class d {
   Hashtable a = new Hashtable();
   private int b;
   private String c;
   private InputStream d;

   public int a() {
      return this.b;
   }

   public void a(int var1) {
      this.b = var1;
   }

   public void a(d var1) {
      var1.a(this.a());
      var1.a(this.b());
      var1.a(this.c());
   }

   public void a(InputStream var1) {
      this.d = var1;
   }

   public void a(String var1) {
      this.c = var1;
   }

   public void a(String var1, String var2) {
      this.a.put(var1, var2);
   }

   public String b() {
      return this.c;
   }

   public InputStream c() {
      return this.d;
   }

   public void d() {
      try {
         this.d.close();
      } catch (IOException var2) {
         ;
      } catch (Exception var3) {
         ;
      }

   }
}

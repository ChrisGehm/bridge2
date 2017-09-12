package com.puentenet.b.d.a;

public class b extends Exception {
   private Throwable a;

   public b(String var1) {
      super(var1);
   }

   public b(Throwable var1) {
      super(var1.getMessage());
      this.a = var1;
   }

   public Throwable getCause() {
      return this.a;
   }
}

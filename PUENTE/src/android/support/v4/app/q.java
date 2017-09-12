package android.support.v4.app;

import android.support.v4.app.o;

class q implements Runnable {
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final int b;
   // $FF: synthetic field
   final o c;

   q(o var1, int var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      this.c.a(this.c.o.a, (String)null, this.a, this.b);
   }
}

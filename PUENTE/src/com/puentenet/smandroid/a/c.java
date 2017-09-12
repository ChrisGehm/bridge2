package com.puentenet.smandroid.a;

import android.os.Handler;

public class c extends com.puentenet.b.a.f {
   private Handler a;

   public c(Handler var1) {
      this.a = var1;
   }

   public void a(Runnable var1) {
      this.a.post(var1);
   }
}

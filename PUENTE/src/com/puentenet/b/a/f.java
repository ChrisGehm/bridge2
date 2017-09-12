package com.puentenet.b.a;

import com.puentenet.b.a.a;

public class f extends a {
   public void a(Runnable var1) {
      var1.run();
   }

   public void b(Runnable var1) {
      (new Thread(var1)).start();
   }
}

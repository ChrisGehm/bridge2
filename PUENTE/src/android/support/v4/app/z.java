package android.support.v4.app;

import android.support.v4.app.ListFragment;

class z implements Runnable {
   // $FF: synthetic field
   final ListFragment a;

   z(ListFragment var1) {
      this.a = var1;
   }

   public void run() {
      this.a.b.focusableViewAvailable(this.a.b);
   }
}

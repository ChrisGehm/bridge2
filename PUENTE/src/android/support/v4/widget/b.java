package android.support.v4.widget;

import android.support.v4.widget.ContentLoadingProgressBar;

class b implements Runnable {
   // $FF: synthetic field
   final ContentLoadingProgressBar a;

   b(ContentLoadingProgressBar var1) {
      this.a = var1;
   }

   public void run() {
      ContentLoadingProgressBar.a(this.a, false);
      ContentLoadingProgressBar.a(this.a, -1L);
      this.a.setVisibility(8);
   }
}

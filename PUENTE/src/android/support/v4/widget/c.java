package android.support.v4.widget;

import android.support.v4.widget.ContentLoadingProgressBar;

class c implements Runnable {
   // $FF: synthetic field
   final ContentLoadingProgressBar a;

   c(ContentLoadingProgressBar var1) {
      this.a = var1;
   }

   public void run() {
      ContentLoadingProgressBar.b(this.a, false);
      if(!ContentLoadingProgressBar.a(this.a)) {
         ContentLoadingProgressBar.a(this.a, System.currentTimeMillis());
         this.a.setVisibility(0);
      }

   }
}

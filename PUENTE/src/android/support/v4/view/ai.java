package android.support.v4.view;

import android.database.DataSetObserver;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ae;
import android.support.v4.view.ah;
import android.support.v4.view.cc;
import android.support.v4.view.cd;

class ai extends DataSetObserver implements cc, cd {
   // $FF: synthetic field
   final PagerTitleStrip a;
   private int b;

   private ai(PagerTitleStrip var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   ai(PagerTitleStrip var1, ah var2) {
      this(var1);
   }

   public void a(int var1) {
      float var2 = 0.0F;
      if(this.b == 0) {
         this.a.a(this.a.a.getCurrentItem(), this.a.a.getAdapter());
         if(PagerTitleStrip.a(this.a) >= 0.0F) {
            var2 = PagerTitleStrip.a(this.a);
         }

         this.a.a(this.a.a.getCurrentItem(), var2, true);
      }

   }

   public void a(int var1, float var2, int var3) {
      var3 = var1;
      if(var2 > 0.5F) {
         var3 = var1 + 1;
      }

      this.a.a(var3, var2, false);
   }

   public void a(ae var1, ae var2) {
      this.a.a(var1, var2);
   }

   public void b(int var1) {
      this.b = var1;
   }

   public void onChanged() {
      float var1 = 0.0F;
      this.a.a(this.a.a.getCurrentItem(), this.a.a.getAdapter());
      if(PagerTitleStrip.a(this.a) >= 0.0F) {
         var1 = PagerTitleStrip.a(this.a);
      }

      this.a.a(this.a.a.getCurrentItem(), var1, true);
   }
}

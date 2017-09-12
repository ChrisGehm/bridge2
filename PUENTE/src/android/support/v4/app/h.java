package android.support.v4.app;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;

class h extends Handler {
   // $FF: synthetic field
   final FragmentActivity a;

   h(FragmentActivity var1) {
      this.a = var1;
   }

   public void handleMessage(Message var1) {
      switch(var1.what) {
      case 1:
         if(this.a.f) {
            this.a.a(false);
         }
         break;
      case 2:
         this.a.a();
         this.a.b.e();
         break;
      default:
         super.handleMessage(var1);
      }

   }
}

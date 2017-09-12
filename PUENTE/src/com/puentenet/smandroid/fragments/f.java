package com.puentenet.smandroid.fragments;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.fragments.WatchlistActionDialog;

class f implements OnClickListener {
   // $FF: synthetic field
   final WatchlistActionDialog a;

   f(WatchlistActionDialog var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if(WatchlistActionDialog.a(this.a) != null) {
         WatchlistActionDialog.a(this.a).a(var1.getId(), this.a);
      }

   }
}

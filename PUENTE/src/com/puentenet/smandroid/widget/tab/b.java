package com.puentenet.smandroid.widget.tab;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.widget.tab.CheckableViewGroup;

class b implements OnClickListener {
   // $FF: synthetic field
   final CheckableViewGroup a;

   b(CheckableViewGroup var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      this.a.check(var1.getId());
   }
}

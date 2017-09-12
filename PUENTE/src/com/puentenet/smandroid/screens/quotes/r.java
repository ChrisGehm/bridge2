package com.puentenet.smandroid.screens.quotes;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.quotes.QuotesTopBar;

class r implements OnClickListener {
   // $FF: synthetic field
   final QuotesTopBar a;

   r(QuotesTopBar var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      this.a.setState(2);
   }
}

package com.puentenet.smandroid.screens.quotes.edit;

import android.view.View;
import android.view.View.OnClickListener;
import com.puentenet.smandroid.screens.quotes.edit.QuotesEditTopBar;

class b implements OnClickListener {
   // $FF: synthetic field
   final QuotesEditTopBar a;

   b(QuotesEditTopBar var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if(QuotesEditTopBar.a(this.a) != null) {
         QuotesEditTopBar.a(this.a).a();
      }

   }
}

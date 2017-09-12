package com.puentenet.smandroid.screens.quotes.detail;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.puentenet.smandroid.screens.quotes.detail.QuotesDetailFragment;
import com.puentenet.smandroid.screens.quotes.detail.graph.HistoryPanel;

class a implements OnCheckedChangeListener {
   // $FF: synthetic field
   final QuotesDetailFragment a;

   a(QuotesDetailFragment var1) {
      this.a = var1;
   }

   public void onCheckedChanged(RadioGroup var1, int var2) {
      switch(var2) {
      case 2131361946:
         QuotesDetailFragment.a(this.a, 0);
         break;
      case 2131361947:
         QuotesDetailFragment.a(this.a, 1);
         break;
      case 2131361948:
         QuotesDetailFragment.a(this.a, 2);
         break;
      case 2131361949:
         QuotesDetailFragment.a(this.a, 3);
         break;
      case 2131361950:
         QuotesDetailFragment.a(this.a, 4);
         break;
      case 2131361951:
         QuotesDetailFragment.a(this.a, 5);
      }

      this.a.b = (HistoryPanel)this.a.q().findViewById(2131361944);
      if(!this.a.b.b()) {
         this.a.b();
      }

   }
}

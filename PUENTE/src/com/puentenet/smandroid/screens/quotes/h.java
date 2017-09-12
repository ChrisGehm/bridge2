package com.puentenet.smandroid.screens.quotes;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.puentenet.smandroid.screens.quotes.QuotesActivity;

class h implements OnItemSelectedListener {
   // $FF: synthetic field
   final QuotesActivity a;

   h(QuotesActivity var1) {
      this.a = var1;
   }

   public void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
      QuotesActivity.a(this.a, var3);
   }

   public void onNothingSelected(AdapterView var1) {
   }
}

package com.puentenet.smandroid.screens.quotes;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import com.puentenet.smandroid.screens.quotes.QuotesActivity;

class g implements OnItemClickListener {
   // $FF: synthetic field
   final QuotesActivity a;

   g(QuotesActivity var1) {
      this.a = var1;
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      Toast.makeText(this.a, "Mantenga presionado una celda para ver opciones", 0).show();
   }
}

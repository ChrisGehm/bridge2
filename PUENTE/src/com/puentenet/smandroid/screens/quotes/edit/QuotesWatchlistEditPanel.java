package com.puentenet.smandroid.screens.quotes.edit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.puentenet.smandroid.screens.quotes.edit.d;
import com.puentenet.smandroid.screens.quotes.edit.e;
import com.puentenet.smandroid.screens.quotes.edit.f;

public class QuotesWatchlistEditPanel extends LinearLayout {
   final OnClickListener a = new d(this);
   final OnClickListener b = new e(this);
   private f c;
   private Button d;
   private Button e;

   public QuotesWatchlistEditPanel(Context var1) {
      super(var1);
   }

   public QuotesWatchlistEditPanel(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   // $FF: synthetic method
   static f a(QuotesWatchlistEditPanel var0) {
      return var0.c;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.d = (Button)this.findViewById(2131361969);
      if(this.d != null) {
         this.d.setOnClickListener(this.a);
      }

      this.e = (Button)this.findViewById(2131361970);
      if(this.e != null) {
         this.e.setOnClickListener(this.b);
      }

   }

   public void setListener(f var1) {
      this.c = var1;
   }
}

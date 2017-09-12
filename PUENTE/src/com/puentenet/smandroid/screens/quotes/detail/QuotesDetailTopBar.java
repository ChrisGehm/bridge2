package com.puentenet.smandroid.screens.quotes.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.puentenet.smandroid.screens.quotes.detail.f;
import com.puentenet.smandroid.screens.quotes.detail.g;
import com.puentenet.smandroid.screens.quotes.detail.h;

public class QuotesDetailTopBar extends LinearLayout {
   final OnClickListener a = new f(this);
   final OnClickListener b = new g(this);
   private h c;
   private Button d;
   private Button e;

   public QuotesDetailTopBar(Context var1) {
      super(var1);
   }

   public QuotesDetailTopBar(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   // $FF: synthetic method
   static h a(QuotesDetailTopBar var0) {
      return var0.c;
   }

   public void a(boolean var1) {
      if(var1) {
         this.e.setVisibility(0);
      } else {
         this.e.setVisibility(4);
      }

   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.d = (Button)this.findViewById(2131361955);
      if(this.d != null) {
         this.d.setOnClickListener(this.a);
      }

      this.e = (Button)this.findViewById(2131361959);
      if(this.e != null) {
         this.e.setOnClickListener(this.b);
      }

   }

   public void setListener(h var1) {
      this.c = var1;
   }
}

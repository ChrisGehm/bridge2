package com.puentenet.smandroid.screens.quotes.edit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.puentenet.smandroid.screens.quotes.edit.a;
import com.puentenet.smandroid.screens.quotes.edit.b;
import com.puentenet.smandroid.screens.quotes.edit.c;

public class QuotesEditTopBar extends LinearLayout {
   final OnClickListener a = new a(this);
   final OnClickListener b = new b(this);
   private c c;
   private Button d;
   private Button e;

   public QuotesEditTopBar(Context var1) {
      super(var1);
   }

   public QuotesEditTopBar(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   // $FF: synthetic method
   static c a(QuotesEditTopBar var0) {
      return var0.c;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.d = (Button)this.findViewById(2131361955);
      if(this.d != null) {
         this.d.setOnClickListener(this.b);
      }

      this.e = (Button)this.findViewById(2131361959);
      if(this.e != null) {
         this.e.setOnClickListener(this.a);
      }

   }

   public void setListener(c var1) {
      this.c = var1;
   }
}

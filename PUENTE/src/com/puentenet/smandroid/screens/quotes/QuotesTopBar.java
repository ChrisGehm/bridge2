package com.puentenet.smandroid.screens.quotes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.puentenet.smandroid.screens.quotes.r;
import com.puentenet.smandroid.screens.quotes.s;
import com.puentenet.smandroid.screens.quotes.t;

public class QuotesTopBar extends LinearLayout {
   final OnClickListener a = new r(this);
   final OnClickListener b = new s(this);
   private t c;
   private ImageButton d;
   private ImageButton e;
   private int f = 0;

   public QuotesTopBar(Context var1) {
      super(var1);
   }

   public QuotesTopBar(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.d = (ImageButton)this.findViewById(2131361961);
      if(this.d != null) {
         this.d.setOnClickListener(this.b);
      }

      this.e = (ImageButton)this.findViewById(2131361964);
      if(this.e != null) {
         this.e.setOnClickListener(this.a);
      }

   }

   public void setListener(t var1) {
      this.c = var1;
   }

   public void setState(int var1) {
      boolean var3 = true;
      if(this.f == var1) {
         var1 = 0;
      }

      this.f = var1;
      ImageButton var4 = this.d;
      boolean var2;
      if(this.f == 1) {
         var2 = true;
      } else {
         var2 = false;
      }

      var4.setSelected(var2);
      var4 = this.e;
      if(this.f == 2) {
         var2 = var3;
      } else {
         var2 = false;
      }

      var4.setSelected(var2);
      var4 = this.e;
      if(this.f == 2) {
         var1 = 2130837655;
      } else {
         var1 = 2130837654;
      }

      var4.setImageResource(var1);
      if(this.c != null) {
         this.c.a(this.f);
      }

   }

   public void setText(String var1) {
      ((TextView)this.findViewById(2131361963)).setText(var1);
   }
}

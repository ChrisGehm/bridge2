package com.puentenet.smandroid.screens.quotes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public abstract class QuoteView extends FrameLayout {
   private com.puentenet.smandroid.k a = new com.puentenet.smandroid.k(1, 5, 2, 2);
   private com.puentenet.a.c.k b;

   public QuoteView(Context var1) {
      super(var1);
   }

   public QuoteView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public QuoteView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public String a(float var1) {
      return this.a(Float.valueOf(var1));
   }

   public String a(Float var1) {
      this.a.setMinimumFractionDigits(2);
      String var3;
      if(var1 == null) {
         var3 = "---";
      } else {
         float var2 = Math.abs(var1.floatValue());
         var3 = this.a.format((double)var2);
      }

      return var3;
   }

   public String a(Integer var1) {
      this.a.setMinimumFractionDigits(0);
      String var2;
      if(var1 == null) {
         var2 = "";
      } else {
         var2 = this.a.format(var1);
      }

      return var2;
   }

   public abstract void a(com.puentenet.a.c.k var1);

   public String b(float var1) {
      this.a.setMinimumFractionDigits(2);
      var1 = Math.abs(var1);
      return this.a.format((double)var1) + "%";
   }

   public boolean b() {
      boolean var1;
      if(this.b.b() == null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public com.puentenet.a.c.k getQuote() {
      return this.b;
   }

   public void setQuote(com.puentenet.a.c.k var1) {
      this.b = var1;
      this.a(var1);
   }
}

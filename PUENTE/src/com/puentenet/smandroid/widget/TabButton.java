package com.puentenet.smandroid.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.puentenet.smandroid.widget.CustomCompoundButton;

public class TabButton extends CustomCompoundButton {
   private int a;
   private int b;
   private int c;

   public TabButton(Context var1) {
      super(var1);
   }

   public TabButton(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var2);
   }

   private void a(AttributeSet var1) {
      TypedArray var2 = this.getContext().obtainStyledAttributes(var1, com.a.a.b.TabButton);
      this.a = var2.getResourceId(0, 0);
      this.b = var2.getResourceId(1, 0);
      this.c = var2.getResourceId(2, 0);
      String var3 = var2.getString(3);
      if(var3 != null) {
         if(var3.equals("left")) {
            this.setBackgroundResource(this.a);
         } else if(var3.equals("middle")) {
            this.setBackgroundResource(this.b);
         } else if(var3.equals("right")) {
            this.setBackgroundResource(this.c);
         }
      }

   }
}

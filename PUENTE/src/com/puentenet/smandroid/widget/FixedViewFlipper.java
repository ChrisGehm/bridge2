package com.puentenet.smandroid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ViewFlipper;

public class FixedViewFlipper extends ViewFlipper {
   public FixedViewFlipper(Context var1) {
      super(var1);
   }

   public FixedViewFlipper(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   protected void onDetachedFromWindow() {
      try {
         super.onDetachedFromWindow();
      } catch (IllegalArgumentException var2) {
         this.stopFlipping();
      }

   }
}

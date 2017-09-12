package com.puentenet.smandroid.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class CheckedImageView extends LinearLayout implements Checkable {
   private ImageView a;
   private RadioButton b;

   public CheckedImageView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public RadioButton getRadio() {
      return this.b;
   }

   public boolean isChecked() {
      return this.b.isChecked();
   }

   public boolean isClickable() {
      return true;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.a = (ImageView)this.findViewById(2131361827);
      this.b = (RadioButton)this.findViewById(2131361828);
   }

   public void setChecked(boolean var1) {
      this.b.setChecked(var1);
   }

   public void setImage(int var1) {
      this.a.setImageResource(var1);
   }

   public void setImage(Drawable var1) {
      this.a.setImageDrawable(var1);
   }

   public void toggle() {
      RadioButton var2 = this.b;
      boolean var1;
      if(this.b.isChecked()) {
         var1 = false;
      } else {
         var1 = true;
      }

      var2.setChecked(var1);
   }
}

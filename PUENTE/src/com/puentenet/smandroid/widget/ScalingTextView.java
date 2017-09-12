package com.puentenet.smandroid.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

public class ScalingTextView extends TextView {
   private float a;
   private float b;
   private boolean c = true;

   public ScalingTextView(Context var1) {
      super(var1);
      this.a();
   }

   public ScalingTextView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a();
   }

   public void a() {
      this.setMinTextSize(this.getTextSize());
      this.setMaxTextSize(this.getTextSize());
      this.setBackgroundColor(-65536);
   }

   public void a(int var1, int var2) {
      this.setTextSize(0, this.b(var1, var2));
   }

   protected float b(int var1, int var2) {
      TextPaint var6 = this.getPaint();
      Rect var8 = new Rect();
      String var7 = this.getText().toString();
      float var3 = this.b;

      float var4;
      do {
         var6.setTextSize(var3);
         var6.getTextBounds(var7, 0, var7.length(), var8);
         boolean var5;
         if(var8.width() < var1 && var8.height() < var2) {
            var5 = true;
         } else {
            var5 = false;
         }

         var4 = var3;
         if(var5) {
            break;
         }

         var4 = var3 - 0.25F;
         var3 = var4;
      } while(var4 >= this.a);

      if(var4 < this.a) {
         var4 += 0.25F;
      }

      return var4;
   }

   public void b() {
      this.a(this.getWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getHeight() - this.getPaddingTop() - this.getPaddingBottom());
   }

   protected void c() {
      this.c = true;
      this.requestLayout();
      this.invalidate();
   }

   public float getMaxTextSize() {
      return this.b;
   }

   public float getMinTextSize() {
      return this.a;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      if(var1 || this.c) {
         this.b();
      }

      super.onLayout(var1, var2, var3, var4, var5);
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      boolean var5;
      if(var1 == var3 && var2 == var4) {
         var5 = false;
      } else {
         var5 = true;
      }

      this.c = var5;
      super.onSizeChanged(var1, var2, var3, var4);
   }

   protected void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      this.c = true;
      super.onTextChanged(var1, var2, var3, var4);
   }

   public void setMaxTextSize(float var1) {
      this.b = var1;
      this.c();
   }

   public void setMinTextSize(float var1) {
      this.a = var1;
      this.c();
   }
}

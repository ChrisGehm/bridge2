package com.puentenet.smandroid.customlayouts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;

public class DividerLayout extends View {
   private int a = -9736853;
   private int b = -1;
   private boolean c = false;

   public DividerLayout(Context var1) {
      super(var1);
      this.setLayoutParams(this.a());
   }

   public DividerLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setLayoutParams(this.a());
   }

   public DividerLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.setLayoutParams(this.a());
   }

   private LayoutParams a() {
      LayoutParams var1;
      if(this.c) {
         var1 = new LayoutParams(3, -1);
      } else {
         var1 = new LayoutParams(-1, 3);
      }

      return var1;
   }

   public void a(boolean var1) {
      this.c = var1;
   }

   public void draw(Canvas var1) {
      super.draw(var1);
      Paint var2 = new Paint();
      if(this.c) {
         var2.setColor(this.a);
         var1.drawLine(0.0F, 0.0F, 0.0F, (float)var1.getHeight(), var2);
         var2.setColor(this.b);
         var1.drawLine(1.0F, 0.0F, 1.0F, (float)var1.getHeight(), var2);
      } else {
         var2.setColor(this.a);
         var1.drawLine(0.0F, 0.0F, (float)var1.getWidth(), 0.0F, var2);
         var2.setColor(this.b);
         var1.drawLine(0.0F, 1.0F, (float)var1.getWidth(), 1.0F, var2);
      }

   }
}

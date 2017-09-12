package com.puentenet.smandroid.screens.quotes.detail.graph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.puentenet.smandroid.screens.quotes.detail.graph.a;
import java.util.Vector;

public class ChartView extends View {
   private static a a;
   private Vector b;
   private int c;
   private float d;

   public ChartView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1);
   }

   public ChartView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var1);
   }

   public void a(Context var1) {
      this.setWillNotDraw(false);
      this.d = this.getContext().getResources().getDisplayMetrics().density;
   }

   public void a(Vector var1, int var2) {
      this.c = var2;
      this.b = var1;
   }

   protected void onDraw(Canvas var1) {
      if(this.b != null) {
         if(a != null) {
            a.a(this.b, this.c);
         }

         Paint var2 = new Paint();
         var1.drawBitmap(a.a(), 0.0F, 0.0F, var2);
      }

      super.onDraw(var1);
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if(a == null) {
         a = new a(this.getWidth(), this.getHeight(), this.d);
      } else {
         a.a(this.getWidth(), this.getHeight());
      }

   }
}

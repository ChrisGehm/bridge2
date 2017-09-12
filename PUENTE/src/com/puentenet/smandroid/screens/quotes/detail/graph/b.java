package com.puentenet.smandroid.screens.quotes.detail.graph;

import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import com.puentenet.smandroid.screens.quotes.detail.graph.a;

class b {
   public static Paint a() {
      Paint var1 = new Paint(129);
      var1.setAntiAlias(true);
      var1.setSubpixelText(true);
      float var0;
      if(a.b() <= 1.0F) {
         var0 = 0.0F;
      } else {
         var0 = a.b();
      }

      var1.setStrokeWidth(var0);
      var1.setColor(-16777216);
      var1.setStyle(Style.STROKE);
      return var1;
   }

   public static Paint a(float var0, boolean var1) {
      Paint var5 = new Paint(129);
      if(var1) {
         float var2 = (float)a.e();
         float var3 = (float)a.e();
         LinearGradient var4 = new LinearGradient(0.0F, var2 * 0.2F + var0, 0.0F, (float)a.e() * 0.2F + var3 + var0, -7869431, -1355520, TileMode.CLAMP);
         var5.setStyle(Style.FILL);
         var5.setShader(var4);
      } else {
         var5.setColor(-16777216);
      }

      var5.setStrokeWidth(a.f());
      return var5;
   }

   public static Paint a(int var0) {
      Paint var1 = new Paint(129);
      Typeface var2 = Typeface.create((String)null, 1);
      var1.setColor(-16777216);
      var1.setTypeface(var2);
      var1.setAntiAlias(true);
      var1.setSubpixelText(true);
      var1.setTextSize((float)var0);
      return var1;
   }

   public static Paint b() {
      Paint var0 = new Paint();
      var0.setStyle(Style.FILL_AND_STROKE);
      var0.setAlpha(75);
      var0.setStrokeWidth(1.0F);
      var0.setColor(-1);
      return var0;
   }

   public static Paint c() {
      Paint var1 = new Paint(129);
      var1.setAntiAlias(true);
      var1.setSubpixelText(true);
      float var0;
      if(a.b() <= 1.0F) {
         var0 = 0.0F;
      } else {
         var0 = a.b();
      }

      var1.setStrokeWidth(var0);
      var1.setStyle(Style.STROKE);
      var1.setPathEffect(new DashPathEffect(a.c(), 0.0F));
      var1.setColor(-3355444);
      return var1;
   }

   public static Paint d() {
      Paint var0 = new Paint();
      var0.setColor(-16777216);
      var0.setStrokeWidth(a.d());
      return var0;
   }
}

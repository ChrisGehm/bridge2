package com.puentenet.smandroid.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChangeIconView extends LinearLayout {
   private Drawable a;
   private Drawable b;
   private Drawable c;
   private ImageView d;
   private TextView e;

   public ChangeIconView(Context var1, AttributeSet var2) {
      super(var1, var2);
      inflate(var1, 2130903046, this);
      this.d = (ImageView)this.findViewById(2131361825);
      this.e = (TextView)this.findViewById(2131361826);
      this.a = var1.getResources().getDrawable(2130837708);
      this.b = var1.getResources().getDrawable(2130837587);
      this.c = var1.getResources().getDrawable(2130837664);
   }

   public static int b(float var0) {
      int var1;
      if(var0 > 0.0F) {
         var1 = -16711936;
      } else if(var0 < 0.0F) {
         var1 = -65536;
      } else {
         var1 = -7829368;
      }

      return var1;
   }

   private Drawable c(float var1) {
      Drawable var2;
      if(var1 > 0.0F) {
         var2 = this.a;
      } else if(var1 < 0.0F) {
         var2 = this.b;
      } else {
         var2 = this.c;
      }

      return var2;
   }

   public String a(float var1) {
      String var2;
      if(var1 > 0.0F) {
         var2 = this.getResources().getString(2131099731);
      } else if(var1 < 0.0F) {
         var2 = this.getResources().getString(2131099732);
      } else {
         var2 = this.getResources().getString(2131099733);
      }

      return var2;
   }

   public void setValue(float var1) {
      this.d.setImageDrawable(this.c(var1));
      this.e.setText(this.a(var1));
      this.e.setTextColor(b(var1));
   }
}

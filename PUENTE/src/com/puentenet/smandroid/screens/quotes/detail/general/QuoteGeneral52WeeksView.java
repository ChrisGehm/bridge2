package com.puentenet.smandroid.screens.quotes.detail.general;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;
import com.puentenet.smandroid.k;

public class QuoteGeneral52WeeksView extends RelativeLayout {
   private k a = new k(1, 5, 2, 2);
   private float b;
   private View c;
   private TextView d;
   private TextView e;
   private TextView f;
   private ImageView g;
   private ImageView h;
   private ImageView i;
   private ImageView j;

   public QuoteGeneral52WeeksView(Context var1) {
      super(var1);
      this.setWillNotDraw(false);
   }

   public QuoteGeneral52WeeksView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setWillNotDraw(false);
   }

   public QuoteGeneral52WeeksView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.setWillNotDraw(false);
   }

   private void a() {
      LayoutParams var4 = (LayoutParams)this.g.getLayoutParams();
      LayoutParams var5 = (LayoutParams)this.f.getLayoutParams();
      int var3 = (int)((float)this.c.getLeft() + (float)this.c.getWidth() * this.b - (float)(this.g.getWidth() / 2));
      var4.setMargins(var3, this.c.getTop() - (int)((double)this.g.getHeight() * 0.35D), 0, 0);
      this.g.setLayoutParams(var4);
      int var2 = var3 - this.f.getWidth() / 2;
      int var1;
      if(var2 >= this.getRight()) {
         var1 = this.getRight() - this.f.getWidth();
      } else {
         var1 = var2;
         if(var2 <= this.getLeft()) {
            var1 = this.getLeft();
         }
      }

      var5.setMargins(var1, 0, 0, 0);
      this.f.setLayoutParams(var5);
      this.h.setVisibility(4);
      this.i.setVisibility(4);
      this.j.setVisibility(4);
      if(var3 < this.h.getRight()) {
         this.h.setVisibility(0);
      } else if(var3 < this.i.getRight()) {
         this.i.setVisibility(0);
      } else {
         this.j.setVisibility(0);
      }

   }

   private void b() {
      this.h = (ImageView)this.findViewById(2131361886);
      this.i = (ImageView)this.findViewById(2131361885);
      this.j = (ImageView)this.findViewById(2131361884);
      this.g = (ImageView)this.findViewById(2131361889);
      this.c = this.findViewById(2131361883);
      this.d = (TextView)this.findViewById(2131361882);
      this.e = (TextView)this.findViewById(2131361887);
      this.f = (TextView)this.findViewById(2131361881);
   }

   public void a(Float var1, Float var2, Float var3) {
      if(var1 != null && var2 != null && var3 != null) {
         this.setVisibility(0);
         this.d.setText(this.a.format(var1));
         this.e.setText(this.a.format(var2));
         this.b = (var3.floatValue() - var1.floatValue()) / (var2.floatValue() - var1.floatValue());
         float var4;
         String var5;
         if((double)this.b > 0.5D) {
            var4 = (var2.floatValue() - var3.floatValue()) / var2.floatValue();
            var5 = this.a.format((double)(var4 * 100.0F)) + "% bajo el máximo";
         } else {
            var4 = (var3.floatValue() - var1.floatValue()) / var1.floatValue();
            var5 = this.a.format((double)(var4 * 100.0F)) + "% sobre el mínimo";
         }

         this.f.setText(var5);
         this.a();
      } else {
         this.setVisibility(4);
      }

   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.b();
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if(this.b != 0.0F) {
         this.a();
      }

   }

   protected void onRestoreInstanceState(Parcelable var1) {
      if(var1 instanceof Bundle) {
         Bundle var2 = (Bundle)var1;
         this.b = var2.getFloat("percentage");
         super.onRestoreInstanceState(var2.getParcelable("instanceState"));
      } else {
         super.onRestoreInstanceState(var1);
      }

   }

   protected Parcelable onSaveInstanceState() {
      Bundle var1 = new Bundle();
      var1.putParcelable("instanceState", super.onSaveInstanceState());
      var1.putFloat("percentage", this.b);
      return var1;
   }
}

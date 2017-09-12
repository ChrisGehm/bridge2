package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.af;
import android.support.v4.view.ag;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private final Paint l;
   private final Rect m;
   private int n;
   private boolean o;
   private boolean p;
   private int q;
   private boolean r;
   private float s;
   private float t;
   private int u;

   public PagerTabStrip(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public PagerTabStrip(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.l = new Paint();
      this.m = new Rect();
      this.n = 255;
      this.o = false;
      this.p = false;
      this.f = this.e;
      this.l.setColor(this.f);
      float var3 = var1.getResources().getDisplayMetrics().density;
      this.g = (int)(3.0F * var3 + 0.5F);
      this.h = (int)(6.0F * var3 + 0.5F);
      this.i = (int)(64.0F * var3);
      this.k = (int)(16.0F * var3 + 0.5F);
      this.q = (int)(1.0F * var3 + 0.5F);
      this.j = (int)(var3 * 32.0F + 0.5F);
      this.u = ViewConfiguration.get(var1).getScaledTouchSlop();
      this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
      this.setTextSpacing(this.getTextSpacing());
      this.setWillNotDraw(false);
      this.b.setFocusable(true);
      this.b.setOnClickListener(new af(this));
      this.d.setFocusable(true);
      this.d.setOnClickListener(new ag(this));
      if(this.getBackground() == null) {
         this.o = true;
      }

   }

   void a(int var1, float var2, boolean var3) {
      Rect var10 = this.m;
      int var5 = this.getHeight();
      int var8 = this.c.getLeft();
      int var9 = this.k;
      int var6 = this.c.getRight();
      int var7 = this.k;
      int var4 = var5 - this.g;
      var10.set(var8 - var9, var4, var6 + var7, var5);
      super.a(var1, var2, var3);
      this.n = (int)(Math.abs(var2 - 0.5F) * 2.0F * 255.0F);
      var10.union(this.c.getLeft() - this.k, var4, this.c.getRight() + this.k, var5);
      this.invalidate(var10);
   }

   public boolean getDrawFullUnderline() {
      return this.o;
   }

   int getMinHeight() {
      return Math.max(super.getMinHeight(), this.j);
   }

   public int getTabIndicatorColor() {
      return this.f;
   }

   protected void onDraw(Canvas var1) {
      super.onDraw(var1);
      int var3 = this.getHeight();
      int var2 = this.c.getLeft();
      int var4 = this.k;
      int var6 = this.c.getRight();
      int var7 = this.k;
      int var5 = this.g;
      this.l.setColor(this.n << 24 | this.f & 16777215);
      var1.drawRect((float)(var2 - var4), (float)(var3 - var5), (float)(var6 + var7), (float)var3, this.l);
      if(this.o) {
         this.l.setColor(-16777216 | this.f & 16777215);
         var1.drawRect((float)this.getPaddingLeft(), (float)(var3 - this.q), (float)(this.getWidth() - this.getPaddingRight()), (float)var3, this.l);
      }

   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var5 = false;
      int var4 = var1.getAction();
      if(var4 == 0 || !this.r) {
         float var3 = var1.getX();
         float var2 = var1.getY();
         switch(var4) {
         case 0:
            this.s = var3;
            this.t = var2;
            this.r = false;
            break;
         case 1:
            if(var3 < (float)(this.c.getLeft() - this.k)) {
               this.a.setCurrentItem(this.a.getCurrentItem() - 1);
            } else if(var3 > (float)(this.c.getRight() + this.k)) {
               this.a.setCurrentItem(this.a.getCurrentItem() + 1);
            }
            break;
         case 2:
            if(Math.abs(var3 - this.s) > (float)this.u || Math.abs(var2 - this.t) > (float)this.u) {
               this.r = true;
            }
         }

         var5 = true;
      }

      return var5;
   }

   public void setBackgroundColor(int var1) {
      super.setBackgroundColor(var1);
      if(!this.p) {
         boolean var2;
         if((-16777216 & var1) == 0) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.o = var2;
      }

   }

   public void setBackgroundDrawable(Drawable var1) {
      super.setBackgroundDrawable(var1);
      if(!this.p) {
         boolean var2;
         if(var1 == null) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.o = var2;
      }

   }

   public void setBackgroundResource(int var1) {
      super.setBackgroundResource(var1);
      if(!this.p) {
         boolean var2;
         if(var1 == 0) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.o = var2;
      }

   }

   public void setDrawFullUnderline(boolean var1) {
      this.o = var1;
      this.p = true;
      this.invalidate();
   }

   public void setPadding(int var1, int var2, int var3, int var4) {
      int var5 = var4;
      if(var4 < this.h) {
         var5 = this.h;
      }

      super.setPadding(var1, var2, var3, var5);
   }

   public void setTabIndicatorColor(int var1) {
      this.f = var1;
      this.l.setColor(this.f);
      this.invalidate();
   }

   public void setTabIndicatorColorResource(int var1) {
      this.setTabIndicatorColor(this.getContext().getResources().getColor(var1));
   }

   public void setTextSpacing(int var1) {
      int var2 = var1;
      if(var1 < this.i) {
         var2 = this.i;
      }

      super.setTextSpacing(var2);
   }
}

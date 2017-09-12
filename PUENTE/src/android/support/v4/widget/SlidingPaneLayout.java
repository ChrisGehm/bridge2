package android.support.v4.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.support.v4.view.at;
import android.support.v4.widget.SlidingPaneLayout$SavedState;
import android.support.v4.widget.aa;
import android.support.v4.widget.ac;
import android.support.v4.widget.ad;
import android.support.v4.widget.ae;
import android.support.v4.widget.af;
import android.support.v4.widget.ap;
import android.support.v4.widget.v;
import android.support.v4.widget.w;
import android.support.v4.widget.x;
import android.support.v4.widget.y;
import android.support.v4.widget.z;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
   static final ac a;
   private int b;
   private int c;
   private Drawable d;
   private Drawable e;
   private final int f;
   private boolean g;
   private View h;
   private float i;
   private float j;
   private int k;
   private boolean l;
   private int m;
   private float n;
   private float o;
   private aa p;
   private final ap q;
   private boolean r;
   private boolean s;
   private final Rect t;
   private final ArrayList u;

   static {
      int var0 = VERSION.SDK_INT;
      if(var0 >= 17) {
         a = new af();
      } else if(var0 >= 16) {
         a = new ae();
      } else {
         a = new ad();
      }

   }

   public SlidingPaneLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public SlidingPaneLayout(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public SlidingPaneLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.b = -858993460;
      this.s = true;
      this.t = new Rect();
      this.u = new ArrayList();
      float var4 = var1.getResources().getDisplayMetrics().density;
      this.f = (int)(32.0F * var4 + 0.5F);
      ViewConfiguration.get(var1);
      this.setWillNotDraw(false);
      at.a(this, (android.support.v4.view.a)(new w(this)));
      at.c(this, 1);
      this.q = ap.a(this, 0.5F, new y(this, (v)null));
      this.q.a(var4 * 400.0F);
   }

   private void a(float var1) {
      boolean var8;
      boolean var10;
      label39: {
         var8 = this.f();
         z var9 = (z)this.h.getLayoutParams();
         if(var9.c) {
            int var3;
            if(var8) {
               var3 = var9.rightMargin;
            } else {
               var3 = var9.leftMargin;
            }

            if(var3 <= 0) {
               var10 = true;
               break label39;
            }
         }

         var10 = false;
      }

      int var7 = this.getChildCount();

      for(int var4 = 0; var4 < var7; ++var4) {
         View var11 = this.getChildAt(var4);
         if(var11 != this.h) {
            int var5 = (int)((1.0F - this.j) * (float)this.m);
            this.j = var1;
            int var6 = var5 - (int)((1.0F - var1) * (float)this.m);
            var5 = var6;
            if(var8) {
               var5 = -var6;
            }

            var11.offsetLeftAndRight(var5);
            if(var10) {
               float var2;
               if(var8) {
                  var2 = this.j - 1.0F;
               } else {
                  var2 = 1.0F - this.j;
               }

               this.a(var11, var2, this.c);
            }
         }
      }

   }

   private void a(int var1) {
      if(this.h == null) {
         this.i = 0.0F;
      } else {
         boolean var4 = this.f();
         z var5 = (z)this.h.getLayoutParams();
         int var3 = this.h.getWidth();
         int var2 = var1;
         if(var4) {
            var2 = this.getWidth() - var1 - var3;
         }

         if(var4) {
            var1 = this.getPaddingRight();
         } else {
            var1 = this.getPaddingLeft();
         }

         if(var4) {
            var3 = var5.rightMargin;
         } else {
            var3 = var5.leftMargin;
         }

         this.i = (float)(var2 - (var3 + var1)) / (float)this.k;
         if(this.m != 0) {
            this.a(this.i);
         }

         if(var5.c) {
            this.a(this.h, this.i, this.b);
         }

         this.a(this.h);
      }

   }

   // $FF: synthetic method
   static void a(SlidingPaneLayout var0, int var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(SlidingPaneLayout var0, View var1) {
      var0.g(var1);
   }

   private void a(View var1, float var2, int var3) {
      z var5 = (z)var1.getLayoutParams();
      if(var2 > 0.0F && var3 != 0) {
         int var4 = (int)((float)((-16777216 & var3) >>> 24) * var2);
         if(var5.d == null) {
            var5.d = new Paint();
         }

         var5.d.setColorFilter(new PorterDuffColorFilter(var4 << 24 | 16777215 & var3, Mode.SRC_OVER));
         if(at.d(var1) != 2) {
            at.a(var1, 2, var5.d);
         }

         this.g(var1);
      } else if(at.d(var1) != 0) {
         if(var5.d != null) {
            var5.d.setColorFilter((ColorFilter)null);
         }

         x var6 = new x(this, var1);
         this.u.add(var6);
         at.a(this, (Runnable)var6);
      }

   }

   // $FF: synthetic method
   static boolean a(SlidingPaneLayout var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static boolean a(SlidingPaneLayout var0, boolean var1) {
      var0.r = var1;
      return var1;
   }

   private boolean a(View var1, int var2) {
      boolean var3 = false;
      if(this.s || this.a(0.0F, var2)) {
         this.r = false;
         var3 = true;
      }

      return var3;
   }

   // $FF: synthetic method
   static ap b(SlidingPaneLayout var0) {
      return var0.q;
   }

   private boolean b(View var1, int var2) {
      boolean var3 = true;
      if(!this.s && !this.a(1.0F, var2)) {
         var3 = false;
      } else {
         this.r = true;
      }

      return var3;
   }

   // $FF: synthetic method
   static float c(SlidingPaneLayout var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static View d(SlidingPaneLayout var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static boolean e(SlidingPaneLayout var0) {
      return var0.f();
   }

   // $FF: synthetic method
   static int f(SlidingPaneLayout var0) {
      return var0.k;
   }

   private boolean f() {
      boolean var1 = true;
      if(at.e(this) != 1) {
         var1 = false;
      }

      return var1;
   }

   private static boolean f(View var0) {
      boolean var1 = true;
      if(!at.g(var0)) {
         if(VERSION.SDK_INT >= 18) {
            var1 = false;
         } else {
            Drawable var2 = var0.getBackground();
            if(var2 != null) {
               if(var2.getOpacity() != -1) {
                  var1 = false;
               }
            } else {
               var1 = false;
            }
         }
      }

      return var1;
   }

   // $FF: synthetic method
   static ArrayList g(SlidingPaneLayout var0) {
      return var0.u;
   }

   private void g(View var1) {
      a.a(this, var1);
   }

   void a() {
      int var2 = this.getChildCount();

      for(int var1 = 0; var1 < var2; ++var1) {
         View var3 = this.getChildAt(var1);
         if(var3.getVisibility() == 4) {
            var3.setVisibility(0);
         }
      }

   }

   void a(View var1) {
      if(this.p != null) {
         this.p.a(var1, this.i);
      }

   }

   boolean a(float var1, int var2) {
      boolean var5;
      if(!this.g) {
         var5 = false;
      } else {
         var5 = this.f();
         z var6 = (z)this.h.getLayoutParams();
         if(var5) {
            var2 = this.getPaddingRight();
            int var3 = var6.rightMargin;
            int var4 = this.h.getWidth();
            var2 = (int)((float)this.getWidth() - ((float)(var3 + var2) + (float)this.k * var1 + (float)var4));
         } else {
            var2 = this.getPaddingLeft();
            var2 = (int)((float)(var6.leftMargin + var2) + (float)this.k * var1);
         }

         if(this.q.a(this.h, var2, this.h.getTop())) {
            this.a();
            at.b(this);
            var5 = true;
         } else {
            var5 = false;
         }
      }

      return var5;
   }

   void b(View var1) {
      if(this.p != null) {
         this.p.a(var1);
      }

      this.sendAccessibilityEvent(32);
   }

   public boolean b() {
      return this.b(this.h, 0);
   }

   void c(View var1) {
      if(this.p != null) {
         this.p.b(var1);
      }

      this.sendAccessibilityEvent(32);
   }

   public boolean c() {
      return this.a((View)this.h, 0);
   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      boolean var2;
      if(var1 instanceof z && super.checkLayoutParams(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void computeScroll() {
      if(this.q.a(true)) {
         if(!this.g) {
            this.q.f();
         } else {
            at.b(this);
         }
      }

   }

   void d(View var1) {
      boolean var17 = this.f();
      int var2;
      if(var17) {
         var2 = this.getWidth() - this.getPaddingRight();
      } else {
         var2 = this.getPaddingLeft();
      }

      int var3;
      if(var17) {
         var3 = this.getPaddingLeft();
      } else {
         var3 = this.getWidth() - this.getPaddingRight();
      }

      int var11 = this.getPaddingTop();
      int var10 = this.getHeight();
      int var12 = this.getPaddingBottom();
      int var4;
      int var5;
      int var6;
      int var7;
      if(var1 != null && f(var1)) {
         var7 = var1.getLeft();
         var6 = var1.getRight();
         var4 = var1.getTop();
         var5 = var1.getBottom();
      } else {
         var5 = 0;
         var4 = 0;
         var6 = 0;
         var7 = 0;
      }

      int var13 = this.getChildCount();

      for(int var8 = 0; var8 < var13; ++var8) {
         View var18 = this.getChildAt(var8);
         if(var18 == var1) {
            break;
         }

         int var9;
         if(var17) {
            var9 = var3;
         } else {
            var9 = var2;
         }

         int var14 = Math.max(var9, var18.getLeft());
         int var15 = Math.max(var11, var18.getTop());
         if(var17) {
            var9 = var2;
         } else {
            var9 = var3;
         }

         int var16 = Math.min(var9, var18.getRight());
         var9 = Math.min(var10 - var12, var18.getBottom());
         byte var19;
         if(var14 >= var7 && var15 >= var4 && var16 <= var6 && var9 <= var5) {
            var19 = 4;
         } else {
            var19 = 0;
         }

         var18.setVisibility(var19);
      }

   }

   public boolean d() {
      boolean var1;
      if(this.g && this.i != 1.0F) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void draw(Canvas var1) {
      super.draw(var1);
      Drawable var7;
      if(this.f()) {
         var7 = this.e;
      } else {
         var7 = this.d;
      }

      View var8;
      if(this.getChildCount() > 1) {
         var8 = this.getChildAt(1);
      } else {
         var8 = null;
      }

      if(var8 != null && var7 != null) {
         int var4 = var8.getTop();
         int var5 = var8.getBottom();
         int var6 = var7.getIntrinsicWidth();
         int var2;
         int var3;
         if(this.f()) {
            var2 = var8.getRight();
            var3 = var2 + var6;
         } else {
            var3 = var8.getLeft();
            var2 = var3 - var6;
         }

         var7.setBounds(var2, var4, var3, var5);
         var7.draw(var1);
      }

   }

   protected boolean drawChild(Canvas var1, View var2, long var3) {
      z var7 = (z)var2.getLayoutParams();
      int var5 = var1.save(2);
      if(this.g && !var7.b && this.h != null) {
         var1.getClipBounds(this.t);
         if(this.f()) {
            this.t.left = Math.max(this.t.left, this.h.getRight());
         } else {
            this.t.right = Math.min(this.t.right, this.h.getLeft());
         }

         var1.clipRect(this.t);
      }

      boolean var6;
      if(VERSION.SDK_INT >= 11) {
         var6 = super.drawChild(var1, var2, var3);
      } else if(var7.c && this.i > 0.0F) {
         if(!var2.isDrawingCacheEnabled()) {
            var2.setDrawingCacheEnabled(true);
         }

         Bitmap var8 = var2.getDrawingCache();
         if(var8 != null) {
            var1.drawBitmap(var8, (float)var2.getLeft(), (float)var2.getTop(), var7.d);
            var6 = false;
         } else {
            Log.e("SlidingPaneLayout", "drawChild: child view " + var2 + " returned null drawing cache");
            var6 = super.drawChild(var1, var2, var3);
         }
      } else {
         if(var2.isDrawingCacheEnabled()) {
            var2.setDrawingCacheEnabled(false);
         }

         var6 = super.drawChild(var1, var2, var3);
      }

      var1.restoreToCount(var5);
      return var6;
   }

   public boolean e() {
      return this.g;
   }

   boolean e(View var1) {
      boolean var2 = false;
      if(var1 != null) {
         z var3 = (z)var1.getLayoutParams();
         if(this.g && var3.c && this.i > 0.0F) {
            var2 = true;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   protected LayoutParams generateDefaultLayoutParams() {
      return new z();
   }

   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return new z(this.getContext(), var1);
   }

   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      z var2;
      if(var1 instanceof MarginLayoutParams) {
         var2 = new z((MarginLayoutParams)var1);
      } else {
         var2 = new z(var1);
      }

      return var2;
   }

   public int getCoveredFadeColor() {
      return this.c;
   }

   public int getParallaxDistance() {
      return this.m;
   }

   public int getSliderFadeColor() {
      return this.b;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.s = true;
   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.s = true;
      int var2 = this.u.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         ((x)this.u.get(var1)).run();
      }

      this.u.clear();
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var6 = false;
      int var4 = android.support.v4.view.z.a(var1);
      boolean var5;
      if(!this.g && var4 == 0 && this.getChildCount() > 1) {
         View var7 = this.getChildAt(1);
         if(var7 != null) {
            if(!this.q.b(var7, (int)var1.getX(), (int)var1.getY())) {
               var5 = true;
            } else {
               var5 = false;
            }

            this.r = var5;
         }
      }

      if(!this.g || this.l && var4 != 0) {
         this.q.e();
         var5 = super.onInterceptTouchEvent(var1);
      } else if(var4 != 3 && var4 != 1) {
         boolean var8;
         label50: {
            float var2;
            float var3;
            switch(var4) {
            case 0:
               this.l = false;
               var2 = var1.getX();
               var3 = var1.getY();
               this.n = var2;
               this.o = var3;
               if(this.q.b(this.h, (int)var2, (int)var3) && this.e(this.h)) {
                  var8 = true;
                  break label50;
               }
            case 1:
            default:
               break;
            case 2:
               var2 = var1.getX();
               var3 = var1.getY();
               var2 = Math.abs(var2 - this.n);
               var3 = Math.abs(var3 - this.o);
               if(var2 > (float)this.q.d() && var3 > var2) {
                  this.q.e();
                  this.l = true;
                  var5 = var6;
                  return var5;
               }
            }

            var8 = false;
         }

         if(!this.q.a(var1)) {
            var5 = var6;
            if(!var8) {
               return var5;
            }
         }

         var5 = true;
      } else {
         this.q.e();
         var5 = var6;
      }

      return var5;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      boolean var13 = this.f();
      if(var13) {
         this.q.a(2);
      } else {
         this.q.a(1);
      }

      int var9 = var4 - var2;
      if(var13) {
         var2 = this.getPaddingRight();
      } else {
         var2 = this.getPaddingLeft();
      }

      if(var13) {
         var5 = this.getPaddingLeft();
      } else {
         var5 = this.getPaddingRight();
      }

      int var11 = this.getPaddingTop();
      int var10 = this.getChildCount();
      if(this.s) {
         float var6;
         if(this.g && this.r) {
            var6 = 1.0F;
         } else {
            var6 = 0.0F;
         }

         this.i = var6;
      }

      int var7 = 0;

      for(var3 = var2; var7 < var10; var3 = var4) {
         View var15 = this.getChildAt(var7);
         if(var15.getVisibility() == 8) {
            var4 = var2;
            var2 = var3;
            var3 = var4;
         } else {
            z var14 = (z)var15.getLayoutParams();
            int var12 = var15.getMeasuredWidth();
            int var8;
            if(var14.b) {
               var8 = var14.leftMargin;
               var4 = var14.rightMargin;
               var8 = Math.min(var2, var9 - var5 - this.f) - var3 - (var8 + var4);
               this.k = var8;
               if(var13) {
                  var4 = var14.rightMargin;
               } else {
                  var4 = var14.leftMargin;
               }

               if(var3 + var4 + var8 + var12 / 2 > var9 - var5) {
                  var1 = true;
               } else {
                  var1 = false;
               }

               var14.c = var1;
               var8 = (int)((float)var8 * this.i);
               var3 += var4 + var8;
               this.i = (float)var8 / (float)this.k;
               var4 = 0;
            } else if(this.g && this.m != 0) {
               var4 = (int)((1.0F - this.i) * (float)this.m);
               var3 = var2;
            } else {
               var4 = 0;
               var3 = var2;
            }

            if(var13) {
               var4 += var9 - var3;
               var8 = var4 - var12;
            } else {
               var8 = var3 - var4;
               var4 = var8 + var12;
            }

            var15.layout(var8, var11, var4, var15.getMeasuredHeight() + var11);
            var4 = var15.getWidth() + var2;
            var2 = var3;
            var3 = var4;
         }

         ++var7;
         var4 = var2;
         var2 = var3;
      }

      if(this.s) {
         if(this.g) {
            if(this.m != 0) {
               this.a(this.i);
            }

            if(((z)this.h.getLayoutParams()).c) {
               this.a(this.h, this.i, this.b);
            }
         } else {
            for(var2 = 0; var2 < var10; ++var2) {
               this.a(this.getChildAt(var2), 0.0F, this.b);
            }
         }

         this.d(this.h);
      }

      this.s = false;
   }

   protected void onMeasure(int var1, int var2) {
      int var5;
      int var6;
      int var7;
      label177: {
         var7 = MeasureSpec.getMode(var1);
         var5 = MeasureSpec.getSize(var1);
         var6 = MeasureSpec.getMode(var2);
         var1 = MeasureSpec.getSize(var2);
         if(var7 != 1073741824) {
            if(!this.isInEditMode()) {
               throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }

            if(var7 == Integer.MIN_VALUE) {
               var2 = var5;
               var5 = var6;
               break label177;
            }

            if(var7 == 0) {
               var5 = var6;
               var2 = 300;
               break label177;
            }
         } else if(var6 == 0) {
            if(!this.isInEditMode()) {
               throw new IllegalStateException("Height must not be UNSPECIFIED");
            }

            if(var6 == 0) {
               var6 = Integer.MIN_VALUE;
               var2 = var5;
               var1 = 300;
               var5 = var6;
               break label177;
            }
         }

         var2 = var5;
         var5 = var6;
      }

      int var8;
      switch(var5) {
      case Integer.MIN_VALUE:
         var7 = this.getPaddingTop();
         var8 = this.getPaddingBottom();
         byte var19 = 0;
         var7 = var1 - var7 - var8;
         var1 = var19;
         break;
      case 1073741824:
         var1 = var1 - this.getPaddingTop() - this.getPaddingBottom();
         var7 = var1;
         break;
      default:
         var1 = 0;
         var7 = -1;
      }

      boolean var15 = false;
      int var11 = var2 - this.getPaddingLeft() - this.getPaddingRight();
      int var12 = this.getChildCount();
      if(var12 > 2) {
         Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
      }

      this.h = null;
      int var10 = 0;
      var6 = var11;

      float var3;
      int var9;
      int var13;
      for(var3 = 0.0F; var10 < var12; var1 = var8) {
         View var17 = this.getChildAt(var10);
         z var18 = (z)var17.getLayoutParams();
         if(var17.getVisibility() == 8) {
            var18.c = false;
            var8 = var6;
            var6 = var1;
            var1 = var8;
         } else {
            label189: {
               float var4 = var3;
               if(var18.a > 0.0F) {
                  var3 += var18.a;
                  var4 = var3;
                  if(var18.width == 0) {
                     var8 = var1;
                     var1 = var6;
                     var6 = var8;
                     break label189;
                  }
               }

               var8 = var18.leftMargin + var18.rightMargin;
               if(var18.width == -2) {
                  var8 = MeasureSpec.makeMeasureSpec(var11 - var8, Integer.MIN_VALUE);
               } else if(var18.width == -1) {
                  var8 = MeasureSpec.makeMeasureSpec(var11 - var8, 1073741824);
               } else {
                  var8 = MeasureSpec.makeMeasureSpec(var18.width, 1073741824);
               }

               if(var18.height == -2) {
                  var9 = MeasureSpec.makeMeasureSpec(var7, Integer.MIN_VALUE);
               } else if(var18.height == -1) {
                  var9 = MeasureSpec.makeMeasureSpec(var7, 1073741824);
               } else {
                  var9 = MeasureSpec.makeMeasureSpec(var18.height, 1073741824);
               }

               var17.measure(var8, var9);
               var9 = var17.getMeasuredWidth();
               var13 = var17.getMeasuredHeight();
               var8 = var1;
               if(var5 == Integer.MIN_VALUE) {
                  var8 = var1;
                  if(var13 > var1) {
                     var8 = Math.min(var13, var7);
                  }
               }

               var1 = var6 - var9;
               boolean var16;
               if(var1 < 0) {
                  var16 = true;
               } else {
                  var16 = false;
               }

               var18.b = var16;
               if(var18.b) {
                  this.h = var17;
               }

               var6 = var8;
               var15 |= var16;
               var3 = var4;
            }
         }

         ++var10;
         var8 = var6;
         var6 = var1;
      }

      if(var15 || var3 > 0.0F) {
         var10 = var11 - this.f;

         for(var8 = 0; var8 < var12; ++var8) {
            View var22 = this.getChildAt(var8);
            if(var22.getVisibility() != 8) {
               z var21 = (z)var22.getLayoutParams();
               if(var22.getVisibility() != 8) {
                  boolean var20;
                  if(var21.width == 0 && var21.a > 0.0F) {
                     var20 = true;
                  } else {
                     var20 = false;
                  }

                  if(var20) {
                     var9 = 0;
                  } else {
                     var9 = var22.getMeasuredWidth();
                  }

                  if(var15 && var22 != this.h) {
                     if(var21.width < 0 && (var9 > var10 || var21.a > 0.0F)) {
                        if(var20) {
                           if(var21.height == -2) {
                              var5 = MeasureSpec.makeMeasureSpec(var7, Integer.MIN_VALUE);
                           } else if(var21.height == -1) {
                              var5 = MeasureSpec.makeMeasureSpec(var7, 1073741824);
                           } else {
                              var5 = MeasureSpec.makeMeasureSpec(var21.height, 1073741824);
                           }
                        } else {
                           var5 = MeasureSpec.makeMeasureSpec(var22.getMeasuredHeight(), 1073741824);
                        }

                        var22.measure(MeasureSpec.makeMeasureSpec(var10, 1073741824), var5);
                     }
                  } else if(var21.a > 0.0F) {
                     if(var21.width == 0) {
                        if(var21.height == -2) {
                           var5 = MeasureSpec.makeMeasureSpec(var7, Integer.MIN_VALUE);
                        } else if(var21.height == -1) {
                           var5 = MeasureSpec.makeMeasureSpec(var7, 1073741824);
                        } else {
                           var5 = MeasureSpec.makeMeasureSpec(var21.height, 1073741824);
                        }
                     } else {
                        var5 = MeasureSpec.makeMeasureSpec(var22.getMeasuredHeight(), 1073741824);
                     }

                     if(var15) {
                        var13 = var21.leftMargin;
                        var13 = var11 - (var21.rightMargin + var13);
                        int var14 = MeasureSpec.makeMeasureSpec(var13, 1073741824);
                        if(var9 != var13) {
                           var22.measure(var14, var5);
                        }
                     } else {
                        var13 = Math.max(0, var6);
                        var22.measure(MeasureSpec.makeMeasureSpec((int)(var21.a * (float)var13 / var3) + var9, 1073741824), var5);
                     }
                  }
               }
            }
         }
      }

      this.setMeasuredDimension(var2, this.getPaddingTop() + var1 + this.getPaddingBottom());
      this.g = var15;
      if(this.q.a() != 0 && !var15) {
         this.q.f();
      }

   }

   protected void onRestoreInstanceState(Parcelable var1) {
      SlidingPaneLayout$SavedState var2 = (SlidingPaneLayout$SavedState)var1;
      super.onRestoreInstanceState(var2.getSuperState());
      if(var2.a) {
         this.b();
      } else {
         this.c();
      }

      this.r = var2.a;
   }

   protected Parcelable onSaveInstanceState() {
      SlidingPaneLayout$SavedState var2 = new SlidingPaneLayout$SavedState(super.onSaveInstanceState());
      boolean var1;
      if(this.e()) {
         var1 = this.d();
      } else {
         var1 = this.r;
      }

      var2.a = var1;
      return var2;
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      if(var1 != var3) {
         this.s = true;
      }

   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var7;
      if(!this.g) {
         var7 = super.onTouchEvent(var1);
      } else {
         this.q.b(var1);
         int var6 = var1.getAction();
         boolean var8 = true;
         float var2;
         float var3;
         switch(var6 & 255) {
         case 0:
            var2 = var1.getX();
            var3 = var1.getY();
            this.n = var2;
            this.o = var3;
            var7 = var8;
            break;
         case 1:
            var7 = var8;
            if(this.e(this.h)) {
               var2 = var1.getX();
               float var4 = var1.getY();
               float var5 = var2 - this.n;
               var3 = var4 - this.o;
               var6 = this.q.d();
               var7 = var8;
               if(var5 * var5 + var3 * var3 < (float)(var6 * var6)) {
                  var7 = var8;
                  if(this.q.b(this.h, (int)var2, (int)var4)) {
                     this.a((View)this.h, 0);
                     var7 = var8;
                  }
               }
            }
            break;
         default:
            var7 = var8;
         }
      }

      return var7;
   }

   public void requestChildFocus(View var1, View var2) {
      super.requestChildFocus(var1, var2);
      if(!this.isInTouchMode() && !this.g) {
         boolean var3;
         if(var1 == this.h) {
            var3 = true;
         } else {
            var3 = false;
         }

         this.r = var3;
      }

   }

   public void setCoveredFadeColor(int var1) {
      this.c = var1;
   }

   public void setPanelSlideListener(aa var1) {
      this.p = var1;
   }

   public void setParallaxDistance(int var1) {
      this.m = var1;
      this.requestLayout();
   }

   public void setShadowDrawable(Drawable var1) {
      this.setShadowDrawableLeft(var1);
   }

   public void setShadowDrawableLeft(Drawable var1) {
      this.d = var1;
   }

   public void setShadowDrawableRight(Drawable var1) {
      this.e = var1;
   }

   public void setShadowResource(int var1) {
      this.setShadowDrawable(this.getResources().getDrawable(var1));
   }

   public void setShadowResourceLeft(int var1) {
      this.setShadowDrawableLeft(this.getResources().getDrawable(var1));
   }

   public void setShadowResourceRight(int var1) {
      this.setShadowDrawableRight(this.getResources().getDrawable(var1));
   }

   public void setSliderFadeColor(int var1) {
      this.b = var1;
   }
}

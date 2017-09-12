package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.at;
import android.support.v4.view.bo;
import android.support.v4.widget.DrawerLayout$SavedState;
import android.support.v4.widget.ap;
import android.support.v4.widget.d;
import android.support.v4.widget.e;
import android.support.v4.widget.f;
import android.support.v4.widget.g;
import android.support.v4.widget.i;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class DrawerLayout extends ViewGroup {
   private static final int[] a = new int[]{16842931};
   private final e b;
   private int c;
   private int d;
   private float e;
   private Paint f;
   private final ap g;
   private final ap h;
   private final i i;
   private final i j;
   private int k;
   private boolean l;
   private boolean m;
   private int n;
   private int o;
   private boolean p;
   private boolean q;
   private f r;
   private float s;
   private float t;
   private Drawable u;
   private Drawable v;
   private CharSequence w;
   private CharSequence x;

   public DrawerLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public DrawerLayout(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public DrawerLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.b = new e(this);
      this.d = -1728053248;
      this.f = new Paint();
      this.m = true;
      float var4 = this.getResources().getDisplayMetrics().density;
      this.c = (int)(64.0F * var4 + 0.5F);
      var4 *= 400.0F;
      this.i = new i(this, 3);
      this.j = new i(this, 5);
      this.g = ap.a(this, 1.0F, this.i);
      this.g.a(1);
      this.g.a(var4);
      this.i.a(this.g);
      this.h = ap.a(this, 1.0F, this.j);
      this.h.a(2);
      this.h.a(var4);
      this.j.a(this.h);
      this.setFocusableInTouchMode(true);
      at.c(this, 1);
      at.a(this, (android.support.v4.view.a)(new d(this)));
      bo.a(this, false);
   }

   // $FF: synthetic method
   static View a(DrawerLayout var0) {
      return var0.g();
   }

   static String c(int var0) {
      String var1;
      if((var0 & 3) == 3) {
         var1 = "LEFT";
      } else if((var0 & 5) == 5) {
         var1 = "RIGHT";
      } else {
         var1 = Integer.toHexString(var0);
      }

      return var1;
   }

   // $FF: synthetic method
   static int[] d() {
      return a;
   }

   private boolean e() {
      int var2 = this.getChildCount();
      int var1 = 0;

      boolean var3;
      while(true) {
         if(var1 >= var2) {
            var3 = false;
            break;
         }

         if(((g)this.getChildAt(var1).getLayoutParams()).c) {
            var3 = true;
            break;
         }

         ++var1;
      }

      return var3;
   }

   private boolean f() {
      boolean var1;
      if(this.g() != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private View g() {
      int var2 = this.getChildCount();
      int var1 = 0;

      View var3;
      while(true) {
         if(var1 >= var2) {
            var3 = null;
            break;
         }

         var3 = this.getChildAt(var1);
         if(this.g(var3) && this.j(var3)) {
            break;
         }

         ++var1;
      }

      return var3;
   }

   // $FF: synthetic method
   static boolean k(View var0) {
      return m(var0);
   }

   private static boolean l(View var0) {
      boolean var2 = false;
      Drawable var3 = var0.getBackground();
      boolean var1 = var2;
      if(var3 != null) {
         var1 = var2;
         if(var3.getOpacity() == -1) {
            var1 = true;
         }
      }

      return var1;
   }

   private static boolean m(View var0) {
      boolean var1;
      if(at.c(var0) != 4 && at.c(var0) != 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int a(View var1) {
      int var2 = this.e(var1);
      if(var2 == 3) {
         var2 = this.n;
      } else if(var2 == 5) {
         var2 = this.o;
      } else {
         var2 = 0;
      }

      return var2;
   }

   View a() {
      int var2 = this.getChildCount();
      int var1 = 0;

      View var3;
      while(true) {
         if(var1 >= var2) {
            var3 = null;
            break;
         }

         var3 = this.getChildAt(var1);
         if(((g)var3.getLayoutParams()).d) {
            break;
         }

         ++var1;
      }

      return var3;
   }

   public CharSequence a(int var1) {
      var1 = android.support.v4.view.n.a(var1, at.e(this));
      CharSequence var2;
      if(var1 == 3) {
         var2 = this.w;
      } else if(var1 == 5) {
         var2 = this.x;
      } else {
         var2 = null;
      }

      return var2;
   }

   public void a(int var1, int var2) {
      var2 = android.support.v4.view.n.a(var2, at.e(this));
      if(var2 == 3) {
         this.n = var1;
      } else if(var2 == 5) {
         this.o = var1;
      }

      if(var1 != 0) {
         ap var3;
         if(var2 == 3) {
            var3 = this.g;
         } else {
            var3 = this.h;
         }

         var3.e();
      }

      View var4;
      switch(var1) {
      case 1:
         var4 = this.b(var2);
         if(var4 != null) {
            this.i(var4);
         }
         break;
      case 2:
         var4 = this.b(var2);
         if(var4 != null) {
            this.h(var4);
         }
      }

   }

   void a(int var1, int var2, View var3) {
      byte var4 = 1;
      int var5 = this.g.a();
      int var6 = this.h.a();
      byte var8 = var4;
      if(var5 != 1) {
         if(var6 == 1) {
            var8 = var4;
         } else if(var5 != 2 && var6 != 2) {
            var8 = 0;
         } else {
            var8 = 2;
         }
      }

      if(var3 != null && var2 == 0) {
         g var7 = (g)var3.getLayoutParams();
         if(var7.b == 0.0F) {
            this.b(var3);
         } else if(var7.b == 1.0F) {
            this.c(var3);
         }
      }

      if(var8 != this.k) {
         this.k = var8;
         if(this.r != null) {
            this.r.a(var8);
         }
      }

   }

   void a(View var1, float var2) {
      if(this.r != null) {
         this.r.a(var1, var2);
      }

   }

   void a(boolean var1) {
      int var5 = this.getChildCount();
      int var3 = 0;

      boolean var2;
      boolean var4;
      for(var2 = false; var3 < var5; var2 = var4) {
         View var7 = this.getChildAt(var3);
         g var6 = (g)var7.getLayoutParams();
         var4 = var2;
         if(this.g(var7)) {
            if(var1 && !var6.c) {
               var4 = var2;
            } else {
               int var8 = var7.getWidth();
               if(this.a(var7, 3)) {
                  var2 |= this.g.a(var7, -var8, var7.getTop());
               } else {
                  var2 |= this.h.a(var7, this.getWidth(), var7.getTop());
               }

               var6.c = false;
               var4 = var2;
            }
         }

         ++var3;
      }

      this.i.a();
      this.j.a();
      if(var2) {
         this.invalidate();
      }

   }

   boolean a(View var1, int var2) {
      boolean var3;
      if((this.e(var1) & var2) == var2) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public void addView(View var1, int var2, LayoutParams var3) {
      if(var2 <= 0 && (var2 >= 0 || this.getChildCount() <= 0)) {
         at.c(var1, 1);
      } else {
         at.c(var1, 4);
         at.a(var1, (android.support.v4.view.a)this.b);
      }

      super.addView(var1, var2, var3);
   }

   View b(int var1) {
      int var2 = android.support.v4.view.n.a(var1, at.e(this));
      int var3 = this.getChildCount();
      var1 = 0;

      View var4;
      while(true) {
         if(var1 >= var3) {
            var4 = null;
            break;
         }

         var4 = this.getChildAt(var1);
         if((this.e(var4) & 7) == (var2 & 7)) {
            break;
         }

         ++var1;
      }

      return var4;
   }

   public void b() {
      this.a(false);
   }

   void b(View var1) {
      g var2 = (g)var1.getLayoutParams();
      if(var2.d) {
         var2.d = false;
         if(this.r != null) {
            this.r.b(var1);
         }

         View var3 = this.getChildAt(0);
         if(var3 != null) {
            at.c(var3, 1);
         }

         at.c(var1, 4);
         if(this.hasWindowFocus()) {
            var1 = this.getRootView();
            if(var1 != null) {
               var1.sendAccessibilityEvent(32);
            }
         }
      }

   }

   void b(View var1, float var2) {
      g var3 = (g)var1.getLayoutParams();
      if(var2 != var3.b) {
         var3.b = var2;
         this.a(var1, var2);
      }

   }

   void c() {
      int var1 = 0;
      if(!this.q) {
         long var3 = SystemClock.uptimeMillis();
         MotionEvent var5 = MotionEvent.obtain(var3, var3, 3, 0.0F, 0.0F, 0);

         for(int var2 = this.getChildCount(); var1 < var2; ++var1) {
            this.getChildAt(var1).dispatchTouchEvent(var5);
         }

         var5.recycle();
         this.q = true;
      }

   }

   void c(View var1) {
      g var2 = (g)var1.getLayoutParams();
      if(!var2.d) {
         var2.d = true;
         if(this.r != null) {
            this.r.a(var1);
         }

         View var3 = this.getChildAt(0);
         if(var3 != null) {
            at.c(var3, 4);
         }

         at.c(var1, 1);
         this.sendAccessibilityEvent(32);
         var1.requestFocus();
      }

   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      boolean var2;
      if(var1 instanceof g && super.checkLayoutParams(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void computeScroll() {
      int var3 = this.getChildCount();
      float var1 = 0.0F;

      for(int var2 = 0; var2 < var3; ++var2) {
         var1 = Math.max(var1, ((g)this.getChildAt(var2).getLayoutParams()).b);
      }

      this.e = var1;
      if(this.g.a(true) | this.h.a(true)) {
         at.b(this);
      }

   }

   float d(View var1) {
      return ((g)var1.getLayoutParams()).b;
   }

   protected boolean drawChild(Canvas var1, View var2, long var3) {
      int var12 = this.getHeight();
      boolean var15 = this.f(var2);
      int var8 = 0;
      byte var10 = 0;
      int var6 = this.getWidth();
      int var13 = var1.save();
      int var7 = var6;
      int var9;
      if(var15) {
         int var14 = this.getChildCount();
         var9 = 0;

         int var18;
         for(var8 = var10; var9 < var14; var8 = var18) {
            label56: {
               View var17 = this.getChildAt(var9);
               if(var17 != var2 && var17.getVisibility() == 0 && l(var17) && this.g(var17)) {
                  if(var17.getHeight() < var12) {
                     var18 = var8;
                     var7 = var6;
                     break label56;
                  }

                  if(this.a(var17, 3)) {
                     var7 = var17.getRight();
                     if(var7 <= var8) {
                        var7 = var8;
                     }

                     var18 = var7;
                     var7 = var6;
                     break label56;
                  }

                  int var11 = var17.getLeft();
                  var7 = var11;
                  var18 = var8;
                  if(var11 < var6) {
                     break label56;
                  }
               }

               var7 = var6;
               var18 = var8;
            }

            ++var9;
            var6 = var7;
         }

         var1.clipRect(var8, 0, var6, this.getHeight());
         var7 = var6;
      }

      boolean var16 = super.drawChild(var1, var2, var3);
      var1.restoreToCount(var13);
      if(this.e > 0.0F && var15) {
         var6 = (int)((float)((this.d & -16777216) >>> 24) * this.e);
         var9 = this.d;
         this.f.setColor(var6 << 24 | var9 & 16777215);
         var1.drawRect((float)var8, 0.0F, (float)var7, (float)this.getHeight(), this.f);
      } else {
         float var5;
         if(this.u != null && this.a(var2, 3)) {
            var6 = this.u.getIntrinsicWidth();
            var8 = var2.getRight();
            var7 = this.g.b();
            var5 = Math.max(0.0F, Math.min((float)var8 / (float)var7, 1.0F));
            this.u.setBounds(var8, var2.getTop(), var6 + var8, var2.getBottom());
            this.u.setAlpha((int)(255.0F * var5));
            this.u.draw(var1);
         } else if(this.v != null && this.a(var2, 5)) {
            var8 = this.v.getIntrinsicWidth();
            var9 = var2.getLeft();
            var7 = this.getWidth();
            var6 = this.h.b();
            var5 = Math.max(0.0F, Math.min((float)(var7 - var9) / (float)var6, 1.0F));
            this.v.setBounds(var9 - var8, var2.getTop(), var9, var2.getBottom());
            this.v.setAlpha((int)(255.0F * var5));
            this.v.draw(var1);
         }
      }

      return var16;
   }

   int e(View var1) {
      return android.support.v4.view.n.a(((g)var1.getLayoutParams()).a, at.e(this));
   }

   boolean f(View var1) {
      boolean var2;
      if(((g)var1.getLayoutParams()).a == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   boolean g(View var1) {
      boolean var2;
      if((android.support.v4.view.n.a(((g)var1.getLayoutParams()).a, at.e(var1)) & 7) != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   protected LayoutParams generateDefaultLayoutParams() {
      return new g(-1, -1);
   }

   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return new g(this.getContext(), var1);
   }

   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      g var2;
      if(var1 instanceof g) {
         var2 = new g((g)var1);
      } else if(var1 instanceof MarginLayoutParams) {
         var2 = new g((MarginLayoutParams)var1);
      } else {
         var2 = new g(var1);
      }

      return var2;
   }

   public void h(View var1) {
      if(!this.g(var1)) {
         throw new IllegalArgumentException("View " + var1 + " is not a sliding drawer");
      } else {
         if(this.m) {
            g var2 = (g)var1.getLayoutParams();
            var2.b = 1.0F;
            var2.d = true;
         } else if(this.a(var1, 3)) {
            this.g.a(var1, 0, var1.getTop());
         } else {
            this.h.a(var1, this.getWidth() - var1.getWidth(), var1.getTop());
         }

         this.invalidate();
      }
   }

   public void i(View var1) {
      if(!this.g(var1)) {
         throw new IllegalArgumentException("View " + var1 + " is not a sliding drawer");
      } else {
         if(this.m) {
            g var2 = (g)var1.getLayoutParams();
            var2.b = 0.0F;
            var2.d = false;
         } else if(this.a(var1, 3)) {
            this.g.a(var1, -var1.getWidth(), var1.getTop());
         } else {
            this.h.a(var1, this.getWidth(), var1.getTop());
         }

         this.invalidate();
      }
   }

   public boolean j(View var1) {
      if(!this.g(var1)) {
         throw new IllegalArgumentException("View " + var1 + " is not a drawer");
      } else {
         boolean var2;
         if(((g)var1.getLayoutParams()).b > 0.0F) {
            var2 = true;
         } else {
            var2 = false;
         }

         return var2;
      }
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.m = true;
   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.m = true;
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var5;
      boolean var6;
      boolean var7;
      boolean var8;
      label37: {
         var5 = false;
         int var4 = android.support.v4.view.z.a(var1);
         var7 = this.g.a(var1);
         var6 = this.h.a(var1);
         switch(var4) {
         case 0:
            float var3 = var1.getX();
            float var2 = var1.getY();
            this.s = var3;
            this.t = var2;
            if(this.e > 0.0F && this.f(this.g.d((int)var3, (int)var2))) {
               var8 = true;
            } else {
               var8 = false;
            }

            this.p = false;
            this.q = false;
            break label37;
         case 1:
         case 3:
            this.a(true);
            this.p = false;
            this.q = false;
            break;
         case 2:
            if(this.g.d(3)) {
               this.i.a();
               this.j.a();
               var8 = false;
               break label37;
            }
         }

         var8 = false;
      }

      if(var7 | var6 || var8 || this.e() || this.q) {
         var5 = true;
      }

      return var5;
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3;
      if(var1 == 4 && this.f()) {
         android.support.v4.view.s.b(var2);
         var3 = true;
      } else {
         var3 = super.onKeyDown(var1, var2);
      }

      return var3;
   }

   public boolean onKeyUp(int var1, KeyEvent var2) {
      boolean var3;
      if(var1 == 4) {
         View var4 = this.g();
         if(var4 != null && this.a(var4) == 0) {
            this.b();
         }

         if(var4 != null) {
            var3 = true;
         } else {
            var3 = false;
         }
      } else {
         var3 = super.onKeyUp(var1, var2);
      }

      return var3;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      this.l = true;
      int var10 = var4 - var2;
      int var11 = this.getChildCount();

      for(var4 = 0; var4 < var11; ++var4) {
         View var16 = this.getChildAt(var4);
         if(var16.getVisibility() != 8) {
            g var15 = (g)var16.getLayoutParams();
            if(this.f(var16)) {
               var16.layout(var15.leftMargin, var15.topMargin, var15.leftMargin + var16.getMeasuredWidth(), var15.topMargin + var16.getMeasuredHeight());
            } else {
               int var12 = var16.getMeasuredWidth();
               int var13 = var16.getMeasuredHeight();
               float var6;
               int var7;
               if(this.a(var16, 3)) {
                  var2 = -var12;
                  var7 = (int)((float)var12 * var15.b) + var2;
                  var6 = (float)(var12 + var7) / (float)var12;
               } else {
                  var7 = var10 - (int)((float)var12 * var15.b);
                  var6 = (float)(var10 - var7) / (float)var12;
               }

               boolean var8;
               if(var6 != var15.b) {
                  var8 = true;
               } else {
                  var8 = false;
               }

               switch(var15.a & 112) {
               case 16:
                  int var14 = var5 - var3;
                  int var9 = (var14 - var13) / 2;
                  if(var9 < var15.topMargin) {
                     var2 = var15.topMargin;
                  } else {
                     var2 = var9;
                     if(var9 + var13 > var14 - var15.bottomMargin) {
                        var2 = var14 - var15.bottomMargin - var13;
                     }
                  }

                  var16.layout(var7, var2, var12 + var7, var13 + var2);
                  break;
               case 80:
                  var2 = var5 - var3;
                  var16.layout(var7, var2 - var15.bottomMargin - var16.getMeasuredHeight(), var12 + var7, var2 - var15.bottomMargin);
                  break;
               default:
                  var16.layout(var7, var15.topMargin, var12 + var7, var13 + var15.topMargin);
               }

               if(var8) {
                  this.b(var16, var6);
               }

               byte var17;
               if(var15.b > 0.0F) {
                  var17 = 0;
               } else {
                  var17 = 4;
               }

               if(var16.getVisibility() != var17) {
                  var16.setVisibility(var17);
               }
            }
         }
      }

      this.l = false;
      this.m = false;
   }

   protected void onMeasure(int var1, int var2) {
      int var3;
      int var4;
      int var6;
      int var7;
      int var11;
      label53: {
         label57: {
            short var5 = 300;
            int var8 = MeasureSpec.getMode(var1);
            var7 = MeasureSpec.getMode(var2);
            var4 = MeasureSpec.getSize(var1);
            var6 = MeasureSpec.getSize(var2);
            if(var8 == 1073741824) {
               var3 = var4;
               if(var7 == 1073741824) {
                  break label57;
               }
            }

            if(!this.isInEditMode()) {
               throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }

            if(var8 == Integer.MIN_VALUE) {
               var3 = var4;
            } else {
               var3 = var4;
               if(var8 == 0) {
                  var3 = 300;
               }
            }

            if(var7 == Integer.MIN_VALUE) {
               var4 = var6;
               var11 = var3;
               break label53;
            }

            var4 = var5;
            var11 = var3;
            if(var7 == 0) {
               break label53;
            }
         }

         var4 = var6;
         var11 = var3;
      }

      this.setMeasuredDimension(var11, var4);
      var6 = this.getChildCount();

      for(var3 = 0; var3 < var6; ++var3) {
         View var9 = this.getChildAt(var3);
         if(var9.getVisibility() != 8) {
            g var10 = (g)var9.getLayoutParams();
            if(this.f(var9)) {
               var9.measure(MeasureSpec.makeMeasureSpec(var11 - var10.leftMargin - var10.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec(var4 - var10.topMargin - var10.bottomMargin, 1073741824));
            } else {
               if(!this.g(var9)) {
                  throw new IllegalStateException("Child " + var9 + " at index " + var3 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
               }

               var7 = this.e(var9) & 7;
               if((0 & var7) != 0) {
                  throw new IllegalStateException("Child drawer has absolute gravity " + c(var7) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
               }

               var9.measure(getChildMeasureSpec(var1, this.c + var10.leftMargin + var10.rightMargin, var10.width), getChildMeasureSpec(var2, var10.topMargin + var10.bottomMargin, var10.height));
            }
         }
      }

   }

   protected void onRestoreInstanceState(Parcelable var1) {
      DrawerLayout$SavedState var3 = (DrawerLayout$SavedState)var1;
      super.onRestoreInstanceState(var3.getSuperState());
      if(var3.a != 0) {
         View var2 = this.b(var3.a);
         if(var2 != null) {
            this.h(var2);
         }
      }

      this.a(var3.b, 3);
      this.a(var3.c, 5);
   }

   protected Parcelable onSaveInstanceState() {
      DrawerLayout$SavedState var3 = new DrawerLayout$SavedState(super.onSaveInstanceState());
      int var2 = this.getChildCount();

      for(int var1 = 0; var1 < var2; ++var1) {
         View var4 = this.getChildAt(var1);
         if(this.g(var4)) {
            g var5 = (g)var4.getLayoutParams();
            if(var5.d) {
               var3.a = var5.a;
               break;
            }
         }
      }

      var3.b = this.n;
      var3.c = this.o;
      return var3;
   }

   public boolean onTouchEvent(MotionEvent var1) {
      this.g.b(var1);
      this.h.b(var1);
      float var2;
      float var3;
      switch(var1.getAction() & 255) {
      case 0:
         var3 = var1.getX();
         var2 = var1.getY();
         this.s = var3;
         this.t = var2;
         this.p = false;
         this.q = false;
         break;
      case 1:
         boolean var5;
         label23: {
            var3 = var1.getX();
            var2 = var1.getY();
            View var6 = this.g.d((int)var3, (int)var2);
            if(var6 != null && this.f(var6)) {
               var3 -= this.s;
               var2 -= this.t;
               int var4 = this.g.d();
               if(var3 * var3 + var2 * var2 < (float)(var4 * var4)) {
                  var6 = this.a();
                  if(var6 != null) {
                     if(this.a(var6) == 2) {
                        var5 = true;
                     } else {
                        var5 = false;
                     }
                     break label23;
                  }
               }
            }

            var5 = true;
         }

         this.a(var5);
         this.p = false;
      case 2:
      default:
         break;
      case 3:
         this.a(true);
         this.p = false;
         this.q = false;
      }

      return true;
   }

   public void requestDisallowInterceptTouchEvent(boolean var1) {
      super.requestDisallowInterceptTouchEvent(var1);
      this.p = var1;
      if(var1) {
         this.a(true);
      }

   }

   public void requestLayout() {
      if(!this.l) {
         super.requestLayout();
      }

   }

   public void setDrawerListener(f var1) {
      this.r = var1;
   }

   public void setDrawerLockMode(int var1) {
      this.a(var1, 3);
      this.a(var1, 5);
   }

   public void setScrimColor(int var1) {
      this.d = var1;
      this.invalidate();
   }
}

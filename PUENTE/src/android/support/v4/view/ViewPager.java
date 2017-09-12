package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager$SavedState;
import android.support.v4.view.a;
import android.support.v4.view.ae;
import android.support.v4.view.ao;
import android.support.v4.view.at;
import android.support.v4.view.bj;
import android.support.v4.view.bv;
import android.support.v4.view.bw;
import android.support.v4.view.bx;
import android.support.v4.view.by;
import android.support.v4.view.bz;
import android.support.v4.view.ca;
import android.support.v4.view.cb;
import android.support.v4.view.cc;
import android.support.v4.view.cd;
import android.support.v4.view.ce;
import android.support.v4.view.cf;
import android.support.v4.view.ch;
import android.support.v4.view.s;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup {
   private static final int[] a = new int[]{16842931};
   private static final ch af = new ch();
   private static final Comparator c = new bv();
   private static final Interpolator d = new bw();
   private boolean A;
   private boolean B;
   private int C;
   private int D;
   private int E;
   private float F;
   private float G;
   private float H;
   private float I;
   private int J = -1;
   private VelocityTracker K;
   private int L;
   private int M;
   private int N;
   private int O;
   private boolean P;
   private android.support.v4.widget.k Q;
   private android.support.v4.widget.k R;
   private boolean S = true;
   private boolean T = false;
   private boolean U;
   private int V;
   private cd W;
   private cd Z;
   private cc aa;
   private ce ab;
   private Method ac;
   private int ad;
   private ArrayList ae;
   private final Runnable ag = new bx(this);
   private int ah = 0;
   private int b;
   private final ArrayList e = new ArrayList();
   private final bz f = new bz();
   private final Rect g = new Rect();
   private ae h;
   private int i;
   private int j = -1;
   private Parcelable k = null;
   private ClassLoader l = null;
   private Scroller m;
   private cf n;
   private int o;
   private Drawable p;
   private int q;
   private int r;
   private float s = -3.4028235E38F;
   private float t = Float.MAX_VALUE;
   private int u;
   private int v;
   private boolean w;
   private boolean x;
   private boolean y;
   private int z = 1;

   public ViewPager(Context var1) {
      super(var1);
      this.a();
   }

   public ViewPager(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a();
   }

   private int a(int var1, float var2, int var3, int var4) {
      if(Math.abs(var4) > this.N && Math.abs(var3) > this.L) {
         if(var3 <= 0) {
            ++var1;
         }
      } else {
         float var5;
         if(var1 >= this.i) {
            var5 = 0.4F;
         } else {
            var5 = 0.6F;
         }

         var1 = (int)(var5 + (float)var1 + var2);
      }

      var3 = var1;
      if(this.e.size() > 0) {
         bz var6 = (bz)this.e.get(0);
         bz var7 = (bz)this.e.get(this.e.size() - 1);
         var3 = Math.max(var6.b, Math.min(var1, var7.b));
      }

      return var3;
   }

   private Rect a(Rect var1, View var2) {
      if(var1 == null) {
         var1 = new Rect();
      }

      if(var2 == null) {
         var1.set(0, 0, 0, 0);
      } else {
         var1.left = var2.getLeft();
         var1.right = var2.getRight();
         var1.top = var2.getTop();
         var1.bottom = var2.getBottom();

         ViewGroup var4;
         for(ViewParent var3 = var2.getParent(); var3 instanceof ViewGroup && var3 != this; var3 = var4.getParent()) {
            var4 = (ViewGroup)var3;
            var1.left += var4.getLeft();
            var1.right += var4.getRight();
            var1.top += var4.getTop();
            var1.bottom += var4.getBottom();
         }
      }

      return var1;
   }

   // $FF: synthetic method
   static ae a(ViewPager var0) {
      return var0.h;
   }

   private void a(int var1, int var2, int var3, int var4) {
      float var5;
      bz var10;
      if(var2 > 0 && !this.e.isEmpty()) {
         int var6 = this.getPaddingLeft();
         int var7 = this.getPaddingRight();
         int var8 = this.getPaddingLeft();
         int var9 = this.getPaddingRight();
         var5 = (float)this.getScrollX() / (float)(var2 - var8 - var9 + var4);
         var2 = (int)((float)(var1 - var6 - var7 + var3) * var5);
         this.scrollTo(var2, this.getScrollY());
         if(!this.m.isFinished()) {
            var4 = this.m.getDuration();
            var3 = this.m.timePassed();
            var10 = this.b(this.i);
            this.m.startScroll(var2, 0, (int)(var10.e * (float)var1), 0, var4 - var3);
         }
      } else {
         var10 = this.b(this.i);
         if(var10 != null) {
            var5 = Math.min(var10.e, this.t);
         } else {
            var5 = 0.0F;
         }

         var1 = (int)(var5 * (float)(var1 - this.getPaddingLeft() - this.getPaddingRight()));
         if(var1 != this.getScrollX()) {
            this.a(false);
            this.scrollTo(var1, this.getScrollY());
         }
      }

   }

   private void a(int var1, boolean var2, int var3, boolean var4) {
      bz var7 = this.b(var1);
      int var6;
      if(var7 != null) {
         float var5 = (float)this.getClientWidth();
         var6 = (int)(Math.max(this.s, Math.min(var7.e, this.t)) * var5);
      } else {
         var6 = 0;
      }

      if(var2) {
         this.a(var6, 0, var3);
         if(var4 && this.W != null) {
            this.W.a(var1);
         }

         if(var4 && this.Z != null) {
            this.Z.a(var1);
         }
      } else {
         if(var4 && this.W != null) {
            this.W.a(var1);
         }

         if(var4 && this.Z != null) {
            this.Z.a(var1);
         }

         this.a(false);
         this.scrollTo(var6, 0);
         this.d(var6);
      }

   }

   // $FF: synthetic method
   static void a(ViewPager var0, int var1) {
      var0.setScrollState(var1);
   }

   private void a(bz var1, int var2, bz var3) {
      int var10 = this.h.b();
      int var7 = this.getClientWidth();
      float var5;
      if(var7 > 0) {
         var5 = (float)this.o / (float)var7;
      } else {
         var5 = 0.0F;
      }

      float var4;
      float var6;
      int var8;
      int var9;
      if(var3 != null) {
         var7 = var3.b;
         if(var7 < var1.b) {
            var4 = var3.e + var3.d + var5;
            ++var7;

            for(var8 = 0; var7 <= var1.b && var8 < this.e.size(); var7 = var9 + 1) {
               var3 = (bz)this.e.get(var8);

               while(true) {
                  var9 = var7;
                  var6 = var4;
                  if(var7 <= var3.b) {
                     break;
                  }

                  var9 = var7;
                  var6 = var4;
                  if(var8 >= this.e.size() - 1) {
                     break;
                  }

                  ++var8;
                  var3 = (bz)this.e.get(var8);
               }

               while(var9 < var3.b) {
                  var6 += this.h.d(var9) + var5;
                  ++var9;
               }

               var3.e = var6;
               var4 = var6 + var3.d + var5;
            }
         } else if(var7 > var1.b) {
            var8 = this.e.size() - 1;
            var4 = var3.e;
            --var7;

            while(var7 >= var1.b && var8 >= 0) {
               var3 = (bz)this.e.get(var8);

               while(true) {
                  var9 = var7;
                  var6 = var4;
                  if(var7 >= var3.b) {
                     break;
                  }

                  var9 = var7;
                  var6 = var4;
                  if(var8 <= 0) {
                     break;
                  }

                  --var8;
                  var3 = (bz)this.e.get(var8);
               }

               while(var9 > var3.b) {
                  var6 -= this.h.d(var9) + var5;
                  --var9;
               }

               var4 = var6 - (var3.d + var5);
               var3.e = var4;
               var7 = var9 - 1;
            }
         }
      }

      var9 = this.e.size();
      var6 = var1.e;
      var7 = var1.b - 1;
      if(var1.b == 0) {
         var4 = var1.e;
      } else {
         var4 = -3.4028235E38F;
      }

      this.s = var4;
      if(var1.b == var10 - 1) {
         var4 = var1.e + var1.d - 1.0F;
      } else {
         var4 = Float.MAX_VALUE;
      }

      this.t = var4;
      var8 = var2 - 1;

      for(var4 = var6; var8 >= 0; --var8) {
         for(var3 = (bz)this.e.get(var8); var7 > var3.b; --var7) {
            var4 -= this.h.d(var7) + var5;
         }

         var4 -= var3.d + var5;
         var3.e = var4;
         if(var3.b == 0) {
            this.s = var4;
         }

         --var7;
      }

      var4 = var1.e + var1.d + var5;
      var8 = var1.b + 1;
      var7 = var2 + 1;

      for(var2 = var8; var7 < var9; ++var7) {
         for(var1 = (bz)this.e.get(var7); var2 < var1.b; ++var2) {
            var4 += this.h.d(var2) + var5;
         }

         if(var1.b == var10 - 1) {
            this.t = var1.d + var4 - 1.0F;
         }

         var1.e = var4;
         var4 += var1.d + var5;
         ++var2;
      }

      this.T = false;
   }

   private void a(MotionEvent var1) {
      int var2 = z.b(var1);
      if(z.b(var1, var2) == this.J) {
         byte var3;
         if(var2 == 0) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.F = z.c(var1, var3);
         this.J = z.b(var1, var3);
         if(this.K != null) {
            this.K.clear();
         }
      }

   }

   private void a(boolean var1) {
      boolean var2;
      if(this.ah == 2) {
         var2 = true;
      } else {
         var2 = false;
      }

      if(var2) {
         this.setScrollingCacheEnabled(false);
         this.m.abortAnimation();
         int var5 = this.getScrollX();
         int var6 = this.getScrollY();
         int var3 = this.m.getCurrX();
         int var4 = this.m.getCurrY();
         if(var5 != var3 || var6 != var4) {
            this.scrollTo(var3, var4);
         }
      }

      this.y = false;
      byte var10 = 0;
      boolean var9 = var2;

      for(int var8 = var10; var8 < this.e.size(); ++var8) {
         bz var7 = (bz)this.e.get(var8);
         if(var7.c) {
            var7.c = false;
            var9 = true;
         }
      }

      if(var9) {
         if(var1) {
            at.a(this, (Runnable)this.ag);
         } else {
            this.ag.run();
         }
      }

   }

   private boolean a(float var1, float var2) {
      boolean var3;
      if((var1 >= (float)this.D || var2 <= 0.0F) && (var1 <= (float)(this.getWidth() - this.D) || var2 >= 0.0F)) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   // $FF: synthetic method
   static int b(ViewPager var0) {
      return var0.i;
   }

   private void b(boolean var1) {
      int var4 = this.getChildCount();

      for(int var2 = 0; var2 < var4; ++var2) {
         byte var3;
         if(var1) {
            var3 = 2;
         } else {
            var3 = 0;
         }

         at.a(this.getChildAt(var2), var3, (Paint)null);
      }

   }

   private boolean b(float var1) {
      boolean var6 = true;
      boolean var9 = false;
      boolean var8 = false;
      float var2 = this.F;
      this.F = var1;
      float var3 = (float)this.getScrollX() + (var2 - var1);
      int var7 = this.getClientWidth();
      var1 = (float)var7 * this.s;
      var2 = (float)var7;
      float var4 = this.t;
      bz var10 = (bz)this.e.get(0);
      bz var11 = (bz)this.e.get(this.e.size() - 1);
      boolean var5;
      if(var10.b != 0) {
         var1 = var10.e * (float)var7;
         var5 = false;
      } else {
         var5 = true;
      }

      if(var11.b != this.h.b() - 1) {
         var2 = var11.e * (float)var7;
         var6 = false;
      } else {
         var2 *= var4;
      }

      if(var3 < var1) {
         var2 = var1;
         if(var5) {
            var8 = this.Q.a(Math.abs(var1 - var3) / (float)var7);
            var2 = var1;
         }
      } else if(var3 > var2) {
         var8 = var9;
         if(var6) {
            var8 = this.R.a(Math.abs(var3 - var2) / (float)var7);
         }
      } else {
         var2 = var3;
      }

      this.F += var2 - (float)((int)var2);
      this.scrollTo((int)var2, this.getScrollY());
      this.d((int)var2);
      return var8;
   }

   private void c(boolean var1) {
      ViewParent var2 = this.getParent();
      if(var2 != null) {
         var2.requestDisallowInterceptTouchEvent(var1);
      }

   }

   private boolean d(int var1) {
      boolean var6 = false;
      if(this.e.size() == 0) {
         this.U = false;
         this.a(0, 0.0F, 0);
         if(!this.U) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
         }
      } else {
         bz var7 = this.i();
         int var4 = this.getClientWidth();
         int var5 = this.o;
         float var2 = (float)this.o / (float)var4;
         int var3 = var7.b;
         var2 = ((float)var1 / (float)var4 - var7.e) / (var7.d + var2);
         var1 = (int)((float)(var5 + var4) * var2);
         this.U = false;
         this.a(var3, var2, var1);
         if(!this.U) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
         }

         var6 = true;
      }

      return var6;
   }

   // $FF: synthetic method
   static int[] f() {
      return a;
   }

   private void g() {
      int var2;
      for(int var1 = 0; var1 < this.getChildCount(); var1 = var2 + 1) {
         var2 = var1;
         if(!((ca)this.getChildAt(var1).getLayoutParams()).a) {
            this.removeViewAt(var1);
            var2 = var1 - 1;
         }
      }

   }

   private int getClientWidth() {
      return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
   }

   private void h() {
      if(this.ad != 0) {
         if(this.ae == null) {
            this.ae = new ArrayList();
         } else {
            this.ae.clear();
         }

         int var2 = this.getChildCount();

         for(int var1 = 0; var1 < var2; ++var1) {
            View var3 = this.getChildAt(var1);
            this.ae.add(var3);
         }

         Collections.sort(this.ae, af);
      }

   }

   private bz i() {
      int var5 = this.getClientWidth();
      float var1;
      if(var5 > 0) {
         var1 = (float)this.getScrollX() / (float)var5;
      } else {
         var1 = 0.0F;
      }

      float var2;
      if(var5 > 0) {
         var2 = (float)this.o / (float)var5;
      } else {
         var2 = 0.0F;
      }

      float var4 = 0.0F;
      float var3 = 0.0F;
      int var7 = -1;
      var5 = 0;
      boolean var6 = true;
      bz var9 = null;

      bz var10;
      while(true) {
         var10 = var9;
         if(var5 >= this.e.size()) {
            break;
         }

         bz var8 = (bz)this.e.get(var5);
         if(!var6 && var8.b != var7 + 1) {
            var8 = this.f;
            var8.e = var4 + var3 + var2;
            var8.b = var7 + 1;
            var8.d = this.h.d(var8.b);
            --var5;
         }

         var3 = var8.e;
         var4 = var8.d;
         if(!var6) {
            var10 = var9;
            if(var1 < var3) {
               break;
            }
         }

         if(var1 < var4 + var3 + var2 || var5 == this.e.size() - 1) {
            var10 = var8;
            break;
         }

         var7 = var8.b;
         var4 = var8.d;
         var6 = false;
         ++var5;
         var9 = var8;
      }

      return var10;
   }

   private void j() {
      this.A = false;
      this.B = false;
      if(this.K != null) {
         this.K.recycle();
         this.K = null;
      }

   }

   private void setScrollState(int var1) {
      if(this.ah != var1) {
         this.ah = var1;
         if(this.ab != null) {
            boolean var2;
            if(var1 != 0) {
               var2 = true;
            } else {
               var2 = false;
            }

            this.b(var2);
         }

         if(this.W != null) {
            this.W.b(var1);
         }
      }

   }

   private void setScrollingCacheEnabled(boolean var1) {
      if(this.x != var1) {
         this.x = var1;
      }

   }

   float a(float var1) {
      return (float)Math.sin((double)((float)((double)(var1 - 0.5F) * 0.4712389167638204D)));
   }

   bz a(int var1, int var2) {
      bz var3 = new bz();
      var3.b = var1;
      var3.a = this.h.a((ViewGroup)this, var1);
      var3.d = this.h.d(var1);
      if(var2 >= 0 && var2 < this.e.size()) {
         this.e.add(var2, var3);
      } else {
         this.e.add(var3);
      }

      return var3;
   }

   bz a(View var1) {
      int var2 = 0;

      bz var4;
      while(true) {
         if(var2 >= this.e.size()) {
            var4 = null;
            break;
         }

         bz var3 = (bz)this.e.get(var2);
         if(this.h.a(var1, var3.a)) {
            var4 = var3;
            break;
         }

         ++var2;
      }

      return var4;
   }

   cd a(cd var1) {
      cd var2 = this.Z;
      this.Z = var1;
      return var2;
   }

   void a() {
      this.setWillNotDraw(false);
      this.setDescendantFocusability(262144);
      this.setFocusable(true);
      Context var2 = this.getContext();
      this.m = new Scroller(var2, d);
      ViewConfiguration var3 = ViewConfiguration.get(var2);
      float var1 = var2.getResources().getDisplayMetrics().density;
      this.E = bj.a(var3);
      this.L = (int)(400.0F * var1);
      this.M = var3.getScaledMaximumFlingVelocity();
      this.Q = new android.support.v4.widget.k(var2);
      this.R = new android.support.v4.widget.k(var2);
      this.N = (int)(25.0F * var1);
      this.O = (int)(2.0F * var1);
      this.C = (int)(16.0F * var1);
      at.a(this, (a)(new cb(this)));
      if(at.c(this) == 0) {
         at.c(this, 1);
      }

   }

   void a(int var1) {
      byte var6;
      bz var15;
      if(this.i != var1) {
         byte var5;
         if(this.i < var1) {
            var5 = 66;
         } else {
            var5 = 17;
         }

         var15 = this.b(this.i);
         this.i = var1;
         var6 = var5;
      } else {
         var15 = null;
         var6 = 2;
      }

      if(this.h == null) {
         this.h();
      } else if(this.y) {
         this.h();
      } else if(this.getWindowToken() != null) {
         this.h.a((ViewGroup)this);
         var1 = this.z;
         int var12 = Math.max(0, this.i - var1);
         int var10 = this.h.b();
         int var11 = Math.min(var10 - 1, var1 + this.i);
         if(var10 != this.b) {
            String var25;
            try {
               var25 = this.getResources().getResourceName(this.getId());
            } catch (NotFoundException var18) {
               var25 = Integer.toHexString(this.getId());
            }

            throw new IllegalStateException("The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + var10 + " Pager id: " + var25 + " Pager class: " + this.getClass() + " Problematic adapter: " + this.h.getClass());
         }

         bz var14;
         label216: {
            for(var1 = 0; var1 < this.e.size(); ++var1) {
               var14 = (bz)this.e.get(var1);
               if(var14.b >= this.i) {
                  if(var14.b == this.i) {
                     break label216;
                  }
                  break;
               }
            }

            var14 = null;
         }

         bz var16;
         if(var14 == null && var10 > 0) {
            var16 = this.a(this.i, var1);
         } else {
            var16 = var14;
         }

         int var19;
         if(var16 != null) {
            int var9 = var1 - 1;
            if(var9 >= 0) {
               var14 = (bz)this.e.get(var9);
            } else {
               var14 = null;
            }

            int var13 = this.getClientWidth();
            float var3;
            if(var13 <= 0) {
               var3 = 0.0F;
            } else {
               var3 = 2.0F - var16.d + (float)this.getPaddingLeft() / (float)var13;
            }

            var19 = this.i;
            float var4 = 0.0F;
            int var8 = var19 - 1;
            int var7 = var1;

            float var2;
            for(bz var17 = var14; var8 >= 0; var7 = var19) {
               if(var4 >= var3 && var8 < var12) {
                  if(var17 == null) {
                     break;
                  }

                  var14 = var17;
                  var1 = var9;
                  var2 = var4;
                  var19 = var7;
                  if(var8 == var17.b) {
                     var14 = var17;
                     var1 = var9;
                     var2 = var4;
                     var19 = var7;
                     if(!var17.c) {
                        this.e.remove(var9);
                        this.h.a((ViewGroup)this, var8, var17.a);
                        var1 = var9 - 1;
                        var19 = var7 - 1;
                        if(var1 >= 0) {
                           var14 = (bz)this.e.get(var1);
                           var2 = var4;
                        } else {
                           var14 = null;
                           var2 = var4;
                        }
                     }
                  }
               } else if(var17 != null && var8 == var17.b) {
                  var2 = var4 + var17.d;
                  var1 = var9 - 1;
                  if(var1 >= 0) {
                     var14 = (bz)this.e.get(var1);
                     var19 = var7;
                  } else {
                     var14 = null;
                     var19 = var7;
                  }
               } else {
                  var2 = var4 + this.a(var8, var9 + 1).d;
                  var19 = var7 + 1;
                  if(var9 >= 0) {
                     var14 = (bz)this.e.get(var9);
                     var1 = var9;
                  } else {
                     var14 = null;
                     var1 = var9;
                  }
               }

               --var8;
               var17 = var14;
               var9 = var1;
               var4 = var2;
            }

            var2 = var16.d;
            var1 = var7 + 1;
            if(var2 < 2.0F) {
               if(var1 < this.e.size()) {
                  var14 = (bz)this.e.get(var1);
               } else {
                  var14 = null;
               }

               if(var13 <= 0) {
                  var3 = 0.0F;
               } else {
                  var3 = (float)this.getPaddingRight() / (float)var13 + 2.0F;
               }

               var19 = this.i;
               ++var19;

               for(; var19 < var10; ++var19) {
                  if(var2 >= var3 && var19 > var11) {
                     if(var14 == null) {
                        break;
                     }

                     if(var19 == var14.b && !var14.c) {
                        this.e.remove(var1);
                        this.h.a((ViewGroup)this, var19, var14.a);
                        if(var1 < this.e.size()) {
                           var14 = (bz)this.e.get(var1);
                        } else {
                           var14 = null;
                        }
                     }
                  } else if(var14 != null && var19 == var14.b) {
                     var4 = var14.d;
                     ++var1;
                     if(var1 < this.e.size()) {
                        var14 = (bz)this.e.get(var1);
                     } else {
                        var14 = null;
                     }

                     var2 += var4;
                  } else {
                     var14 = this.a(var19, var1);
                     ++var1;
                     var4 = var14.d;
                     if(var1 < this.e.size()) {
                        var14 = (bz)this.e.get(var1);
                     } else {
                        var14 = null;
                     }

                     var2 += var4;
                  }
               }
            }

            this.a(var16, var7, var15);
         }

         ae var20 = this.h;
         var1 = this.i;
         Object var22;
         if(var16 != null) {
            var22 = var16.a;
         } else {
            var22 = null;
         }

         var20.b((ViewGroup)this, var1, var22);
         this.h.b((ViewGroup)this);
         var19 = this.getChildCount();

         View var21;
         for(var1 = 0; var1 < var19; ++var1) {
            var21 = this.getChildAt(var1);
            ca var23 = (ca)var21.getLayoutParams();
            var23.f = var1;
            if(!var23.a && var23.c == 0.0F) {
               var15 = this.a(var21);
               if(var15 != null) {
                  var23.c = var15.d;
                  var23.e = var15.b;
               }
            }
         }

         this.h();
         if(this.hasFocus()) {
            View var24 = this.findFocus();
            if(var24 != null) {
               var14 = this.b(var24);
            } else {
               var14 = null;
            }

            if(var14 == null || var14.b != this.i) {
               for(var1 = 0; var1 < this.getChildCount(); ++var1) {
                  var21 = this.getChildAt(var1);
                  var14 = this.a(var21);
                  if(var14 != null && var14.b == this.i && var21.requestFocus(var6)) {
                     break;
                  }
               }
            }
         }
      }

   }

   protected void a(int var1, float var2, int var3) {
      int var4;
      View var13;
      if(this.V > 0) {
         int var11 = this.getScrollX();
         var4 = this.getPaddingLeft();
         int var5 = this.getPaddingRight();
         int var10 = this.getWidth();
         int var9 = this.getChildCount();

         int var6;
         for(int var8 = 0; var8 < var9; var5 = var6) {
            var13 = this.getChildAt(var8);
            ca var14 = (ca)var13.getLayoutParams();
            int var7;
            if(!var14.a) {
               var7 = var4;
               var6 = var5;
            } else {
               int var12;
               switch(var14.b & 7) {
               case 1:
                  var6 = Math.max((var10 - var13.getMeasuredWidth()) / 2, var4);
                  var7 = var4;
                  var4 = var5;
                  var5 = var7;
                  break;
               case 2:
               case 4:
               default:
                  var6 = var4;
                  var7 = var4;
                  var4 = var5;
                  var5 = var7;
                  break;
               case 3:
                  var6 = var13.getWidth();
                  var7 = var6 + var4;
                  var6 = var4;
                  var4 = var5;
                  var5 = var7;
                  break;
               case 5:
                  var6 = var10 - var5 - var13.getMeasuredWidth();
                  var12 = var13.getMeasuredWidth();
                  var7 = var4;
                  var4 = var5 + var12;
                  var5 = var7;
               }

               var12 = var6 + var11 - var13.getLeft();
               var6 = var4;
               var7 = var5;
               if(var12 != 0) {
                  var13.offsetLeftAndRight(var12);
                  var6 = var4;
                  var7 = var5;
               }
            }

            ++var8;
            var4 = var7;
         }
      }

      if(this.W != null) {
         this.W.a(var1, var2, var3);
      }

      if(this.Z != null) {
         this.Z.a(var1, var2, var3);
      }

      if(this.ab != null) {
         var4 = this.getScrollX();
         var3 = this.getChildCount();

         for(var1 = 0; var1 < var3; ++var1) {
            var13 = this.getChildAt(var1);
            if(!((ca)var13.getLayoutParams()).a) {
               var2 = (float)(var13.getLeft() - var4) / (float)this.getClientWidth();
               this.ab.a(var13, var2);
            }
         }
      }

      this.U = true;
   }

   void a(int var1, int var2, int var3) {
      if(this.getChildCount() == 0) {
         this.setScrollingCacheEnabled(false);
      } else {
         int var8 = this.getScrollX();
         int var7 = this.getScrollY();
         int var9 = var1 - var8;
         var2 -= var7;
         if(var9 == 0 && var2 == 0) {
            this.a(false);
            this.c();
            this.setScrollState(0);
         } else {
            this.setScrollingCacheEnabled(true);
            this.setScrollState(2);
            var1 = this.getClientWidth();
            int var10 = var1 / 2;
            float var6 = Math.min(1.0F, (float)Math.abs(var9) * 1.0F / (float)var1);
            float var4 = (float)var10;
            float var5 = (float)var10;
            var6 = this.a(var6);
            var3 = Math.abs(var3);
            if(var3 > 0) {
               var1 = Math.round(1000.0F * Math.abs((var5 * var6 + var4) / (float)var3)) * 4;
            } else {
               var5 = (float)var1;
               var4 = this.h.d(this.i);
               var1 = (int)(((float)Math.abs(var9) / (var5 * var4 + (float)this.o) + 1.0F) * 100.0F);
            }

            var1 = Math.min(var1, 600);
            this.m.startScroll(var8, var7, var9, var2, var1);
            at.b(this);
         }
      }

   }

   public void a(int var1, boolean var2) {
      this.y = false;
      this.a(var1, var2, false);
   }

   void a(int var1, boolean var2, boolean var3) {
      this.a(var1, var2, var3, 0);
   }

   void a(int var1, boolean var2, boolean var3, int var4) {
      boolean var6 = false;
      if(this.h != null && this.h.b() > 0) {
         if(!var3 && this.i == var1 && this.e.size() != 0) {
            this.setScrollingCacheEnabled(false);
         } else {
            int var5;
            if(var1 < 0) {
               var5 = 0;
            } else {
               var5 = var1;
               if(var1 >= this.h.b()) {
                  var5 = this.h.b() - 1;
               }
            }

            var1 = this.z;
            if(var5 > this.i + var1 || var5 < this.i - var1) {
               for(var1 = 0; var1 < this.e.size(); ++var1) {
                  ((bz)this.e.get(var1)).c = true;
               }
            }

            var3 = var6;
            if(this.i != var5) {
               var3 = true;
            }

            if(this.S) {
               this.i = var5;
               if(var3 && this.W != null) {
                  this.W.a(var5);
               }

               if(var3 && this.Z != null) {
                  this.Z.a(var5);
               }

               this.requestLayout();
            } else {
               this.a(var5);
               this.a(var5, var2, var4, var3);
            }
         }
      } else {
         this.setScrollingCacheEnabled(false);
      }

   }

   public boolean a(KeyEvent var1) {
      boolean var3 = false;
      boolean var2 = var3;
      if(var1.getAction() == 0) {
         switch(var1.getKeyCode()) {
         case 21:
            var2 = this.c(17);
            break;
         case 22:
            var2 = this.c(66);
            break;
         case 61:
            var2 = var3;
            if(VERSION.SDK_INT >= 11) {
               if(s.a(var1)) {
                  var2 = this.c(2);
               } else {
                  var2 = var3;
                  if(s.a(var1, 1)) {
                     var2 = this.c(1);
                  }
               }
            }
            break;
         default:
            var2 = var3;
         }
      }

      return var2;
   }

   protected boolean a(View var1, boolean var2, int var3, int var4, int var5) {
      boolean var9 = true;
      if(var1 instanceof ViewGroup) {
         ViewGroup var11 = (ViewGroup)var1;
         int var7 = var1.getScrollX();
         int var8 = var1.getScrollY();

         for(int var6 = var11.getChildCount() - 1; var6 >= 0; --var6) {
            View var10 = var11.getChildAt(var6);
            if(var4 + var7 >= var10.getLeft() && var4 + var7 < var10.getRight() && var5 + var8 >= var10.getTop() && var5 + var8 < var10.getBottom() && this.a(var10, true, var3, var4 + var7 - var10.getLeft(), var5 + var8 - var10.getTop())) {
               var2 = var9;
               return var2;
            }
         }
      }

      if(var2) {
         var2 = var9;
         if(at.a(var1, -var3)) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   public void addFocusables(ArrayList var1, int var2, int var3) {
      int var5 = var1.size();
      int var6 = this.getDescendantFocusability();
      if(var6 != 393216) {
         for(int var4 = 0; var4 < this.getChildCount(); ++var4) {
            View var7 = this.getChildAt(var4);
            if(var7.getVisibility() == 0) {
               bz var8 = this.a(var7);
               if(var8 != null && var8.b == this.i) {
                  var7.addFocusables(var1, var2, var3);
               }
            }
         }
      }

      if((var6 != 262144 || var5 == var1.size()) && this.isFocusable() && ((var3 & 1) != 1 || !this.isInTouchMode() || this.isFocusableInTouchMode()) && var1 != null) {
         var1.add(this);
      }

   }

   public void addTouchables(ArrayList var1) {
      for(int var2 = 0; var2 < this.getChildCount(); ++var2) {
         View var3 = this.getChildAt(var2);
         if(var3.getVisibility() == 0) {
            bz var4 = this.a(var3);
            if(var4 != null && var4.b == this.i) {
               var3.addTouchables(var1);
            }
         }
      }

   }

   public void addView(View var1, int var2, LayoutParams var3) {
      if(!this.checkLayoutParams(var3)) {
         var3 = this.generateLayoutParams(var3);
      }

      ca var4 = (ca)var3;
      var4.a |= var1 instanceof by;
      if(this.w) {
         if(var4 != null && var4.a) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
         }

         var4.d = true;
         this.addViewInLayout(var1, var2, var3);
      } else {
         super.addView(var1, var2, var3);
      }

   }

   bz b(int var1) {
      int var2 = 0;

      bz var3;
      while(true) {
         if(var2 >= this.e.size()) {
            var3 = null;
            break;
         }

         var3 = (bz)this.e.get(var2);
         if(var3.b == var1) {
            break;
         }

         ++var2;
      }

      return var3;
   }

   bz b(View var1) {
      while(true) {
         ViewParent var2 = var1.getParent();
         bz var3;
         if(var2 != this) {
            if(var2 != null && var2 instanceof View) {
               var1 = (View)var2;
               continue;
            }

            var3 = null;
         } else {
            var3 = this.a(var1);
         }

         return var3;
      }
   }

   void b() {
      int var7 = this.h.b();
      this.b = var7;
      boolean var1;
      if(this.e.size() < this.z * 2 + 1 && this.e.size() < var7) {
         var1 = true;
      } else {
         var1 = false;
      }

      int var2 = this.i;
      boolean var3 = false;
      byte var5 = 0;
      boolean var4 = var1;
      int var9 = var2;
      boolean var10 = var3;

      int var11;
      for(var11 = var5; var11 < this.e.size(); var4 = var3) {
         bz var8 = (bz)this.e.get(var11);
         int var13 = this.h.a(var8.a);
         int var12;
         if(var13 == -1) {
            var3 = var4;
            var2 = var9;
            var1 = var10;
            var12 = var11;
         } else if(var13 == -2) {
            this.e.remove(var11);
            var12 = var11 - 1;
            var3 = var10;
            if(!var10) {
               this.h.a((ViewGroup)this);
               var3 = true;
            }

            this.h.a((ViewGroup)this, var8.b, var8.a);
            if(this.i == var8.b) {
               var2 = Math.max(0, Math.min(this.i, var7 - 1));
               var1 = var3;
               var3 = true;
            } else {
               var2 = var9;
               boolean var14 = true;
               var1 = var3;
               var3 = var14;
            }
         } else if(var8.b != var13) {
            if(var8.b == this.i) {
               var9 = var13;
            }

            var8.b = var13;
            boolean var6 = true;
            var12 = var11;
            var1 = var10;
            var2 = var9;
            var3 = var6;
         } else {
            var12 = var11;
            var1 = var10;
            var2 = var9;
            var3 = var4;
         }

         var11 = var12 + 1;
         var10 = var1;
         var9 = var2;
      }

      if(var10) {
         this.h.b((ViewGroup)this);
      }

      Collections.sort(this.e, c);
      if(var4) {
         var11 = this.getChildCount();

         for(var2 = 0; var2 < var11; ++var2) {
            ca var16 = (ca)this.getChildAt(var2).getLayoutParams();
            if(!var16.a) {
               var16.c = 0.0F;
            }
         }

         this.a(var9, false, true);
         this.requestLayout();
      }

   }

   void c() {
      this.a(this.i);
   }

   public boolean c(int var1) {
      View var6 = this.findFocus();
      View var5;
      if(var6 == this) {
         var5 = null;
      } else {
         label86: {
            if(var6 != null) {
               ViewParent var9 = var6.getParent();

               boolean var2;
               while(true) {
                  if(!(var9 instanceof ViewGroup)) {
                     var2 = false;
                     break;
                  }

                  if(var9 == this) {
                     var2 = true;
                     break;
                  }

                  var9 = var9.getParent();
               }

               if(!var2) {
                  StringBuilder var7 = new StringBuilder();
                  var7.append(var6.getClass().getSimpleName());

                  for(var9 = var6.getParent(); var9 instanceof ViewGroup; var9 = var9.getParent()) {
                     var7.append(" => ").append(var9.getClass().getSimpleName());
                  }

                  Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + var7.toString());
                  var5 = null;
                  break label86;
               }
            }

            var5 = var6;
         }
      }

      boolean var4;
      label95: {
         var6 = FocusFinder.getInstance().findNextFocus(this, var5, var1);
         if(var6 != null && var6 != var5) {
            int var3;
            int var8;
            if(var1 == 17) {
               var8 = this.a(this.g, var6).left;
               var3 = this.a(this.g, var5).left;
               if(var5 != null && var8 >= var3) {
                  var4 = this.d();
               } else {
                  var4 = var6.requestFocus();
               }
               break label95;
            }

            if(var1 == 66) {
               var3 = this.a(this.g, var6).left;
               var8 = this.a(this.g, var5).left;
               if(var5 != null && var3 <= var8) {
                  var4 = this.e();
               } else {
                  var4 = var6.requestFocus();
               }
               break label95;
            }
         } else {
            if(var1 == 17 || var1 == 1) {
               var4 = this.d();
               break label95;
            }

            if(var1 == 66 || var1 == 2) {
               var4 = this.e();
               break label95;
            }
         }

         var4 = false;
      }

      if(var4) {
         this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(var1));
      }

      return var4;
   }

   public boolean canScrollHorizontally(int var1) {
      boolean var5 = true;
      boolean var6 = true;
      boolean var4 = false;
      if(this.h != null) {
         int var2 = this.getClientWidth();
         int var3 = this.getScrollX();
         if(var1 < 0) {
            if(var3 > (int)((float)var2 * this.s)) {
               var4 = var6;
            } else {
               var4 = false;
            }
         } else if(var1 > 0) {
            if(var3 < (int)((float)var2 * this.t)) {
               var4 = var5;
            } else {
               var4 = false;
            }
         }
      }

      return var4;
   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      boolean var2;
      if(var1 instanceof ca && super.checkLayoutParams(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void computeScroll() {
      if(!this.m.isFinished() && this.m.computeScrollOffset()) {
         int var4 = this.getScrollX();
         int var1 = this.getScrollY();
         int var2 = this.m.getCurrX();
         int var3 = this.m.getCurrY();
         if(var4 != var2 || var1 != var3) {
            this.scrollTo(var2, var3);
            if(!this.d(var2)) {
               this.m.abortAnimation();
               this.scrollTo(0, var3);
            }
         }

         at.b(this);
      } else {
         this.a(true);
      }

   }

   boolean d() {
      boolean var1 = true;
      if(this.i > 0) {
         this.a(this.i - 1, true);
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean dispatchKeyEvent(KeyEvent var1) {
      boolean var2;
      if(!super.dispatchKeyEvent(var1) && !this.a(var1)) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent var1) {
      boolean var5 = false;
      boolean var4;
      if(var1.getEventType() == 4096) {
         var4 = super.dispatchPopulateAccessibilityEvent(var1);
      } else {
         int var3 = this.getChildCount();
         int var2 = 0;

         while(true) {
            var4 = var5;
            if(var2 >= var3) {
               break;
            }

            View var6 = this.getChildAt(var2);
            if(var6.getVisibility() == 0) {
               bz var7 = this.a(var6);
               if(var7 != null && var7.b == this.i && var6.dispatchPopulateAccessibilityEvent(var1)) {
                  var4 = true;
                  break;
               }
            }

            ++var2;
         }
      }

      return var4;
   }

   public void draw(Canvas var1) {
      super.draw(var1);
      boolean var3 = false;
      boolean var2 = false;
      int var4 = at.a(this);
      if(var4 != 0 && (var4 != 1 || this.h == null || this.h.b() <= 1)) {
         this.Q.b();
         this.R.b();
      } else {
         int var9;
         if(!this.Q.a()) {
            var9 = var1.save();
            int var8 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
            var4 = this.getWidth();
            var1.rotate(270.0F);
            var1.translate((float)(-var8 + this.getPaddingTop()), this.s * (float)var4);
            this.Q.a(var8, var4);
            var2 = false | this.Q.a(var1);
            var1.restoreToCount(var9);
         }

         var3 = var2;
         if(!this.R.a()) {
            var4 = var1.save();
            int var7 = this.getWidth();
            int var6 = this.getHeight();
            var9 = this.getPaddingTop();
            int var5 = this.getPaddingBottom();
            var1.rotate(90.0F);
            var1.translate((float)(-this.getPaddingTop()), -(this.t + 1.0F) * (float)var7);
            this.R.a(var6 - var9 - var5, var7);
            var3 = var2 | this.R.a(var1);
            var1.restoreToCount(var4);
         }
      }

      if(var3) {
         at.b(this);
      }

   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      Drawable var1 = this.p;
      if(var1 != null && var1.isStateful()) {
         var1.setState(this.getDrawableState());
      }

   }

   boolean e() {
      boolean var1 = true;
      if(this.h != null && this.i < this.h.b() - 1) {
         this.a(this.i + 1, true);
      } else {
         var1 = false;
      }

      return var1;
   }

   protected LayoutParams generateDefaultLayoutParams() {
      return new ca();
   }

   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return new ca(this.getContext(), var1);
   }

   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      return this.generateDefaultLayoutParams();
   }

   public ae getAdapter() {
      return this.h;
   }

   protected int getChildDrawingOrder(int var1, int var2) {
      int var3 = var2;
      if(this.ad == 2) {
         var3 = var1 - 1 - var2;
      }

      return ((ca)((View)this.ae.get(var3)).getLayoutParams()).f;
   }

   public int getCurrentItem() {
      return this.i;
   }

   public int getOffscreenPageLimit() {
      return this.z;
   }

   public int getPageMargin() {
      return this.o;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.S = true;
   }

   protected void onDetachedFromWindow() {
      this.removeCallbacks(this.ag);
      super.onDetachedFromWindow();
   }

   protected void onDraw(Canvas var1) {
      super.onDraw(var1);
      if(this.o > 0 && this.p != null && this.e.size() > 0 && this.h != null) {
         int var9 = this.getScrollX();
         int var8 = this.getWidth();
         float var4 = (float)this.o / (float)var8;
         bz var12 = (bz)this.e.get(0);
         float var2 = var12.e;
         int var11 = this.e.size();
         int var6 = var12.b;
         int var10 = ((bz)this.e.get(var11 - 1)).b;

         for(int var7 = 0; var6 < var10; ++var6) {
            while(var6 > var12.b && var7 < var11) {
               ArrayList var13 = this.e;
               ++var7;
               var12 = (bz)var13.get(var7);
            }

            float var3;
            if(var6 == var12.b) {
               var3 = (var12.e + var12.d) * (float)var8;
               var2 = var12.e + var12.d + var4;
            } else {
               float var5 = this.h.d(var6);
               var3 = (var2 + var5) * (float)var8;
               var2 += var5 + var4;
            }

            if((float)this.o + var3 > (float)var9) {
               this.p.setBounds((int)var3, this.q, (int)((float)this.o + var3 + 0.5F), this.r);
               this.p.draw(var1);
            }

            if(var3 > (float)(var9 + var8)) {
               break;
            }
         }
      }

   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var9 = false;
      int var7 = var1.getAction() & 255;
      boolean var8;
      if(var7 != 3 && var7 != 1) {
         if(var7 != 0) {
            if(this.A) {
               var8 = true;
               return var8;
            }

            var8 = var9;
            if(this.B) {
               return var8;
            }
         }

         float var2;
         switch(var7) {
         case 0:
            var2 = var1.getX();
            this.H = var2;
            this.F = var2;
            var2 = var1.getY();
            this.I = var2;
            this.G = var2;
            this.J = z.b(var1, 0);
            this.B = false;
            this.m.computeScrollOffset();
            if(this.ah == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O) {
               this.m.abortAnimation();
               this.y = false;
               this.c();
               this.A = true;
               this.c(true);
               this.setScrollState(1);
            } else {
               this.a(false);
               this.A = false;
            }
            break;
         case 2:
            var7 = this.J;
            if(var7 != -1) {
               var7 = z.a(var1, var7);
               float var4 = z.c(var1, var7);
               float var6 = var4 - this.F;
               float var5 = Math.abs(var6);
               float var3 = z.d(var1, var7);
               var2 = Math.abs(var3 - this.I);
               if(var6 != 0.0F && !this.a(this.F, var6) && this.a(this, false, (int)var6, (int)var4, (int)var3)) {
                  this.F = var4;
                  this.G = var3;
                  this.B = true;
                  var8 = var9;
                  return var8;
               }

               if(var5 > (float)this.E && 0.5F * var5 > var2) {
                  this.A = true;
                  this.c(true);
                  this.setScrollState(1);
                  if(var6 > 0.0F) {
                     var2 = this.H + (float)this.E;
                  } else {
                     var2 = this.H - (float)this.E;
                  }

                  this.F = var2;
                  this.G = var3;
                  this.setScrollingCacheEnabled(true);
               } else if(var2 > (float)this.E) {
                  this.B = true;
               }

               if(this.A && this.b(var4)) {
                  at.b(this);
               }
            }
            break;
         case 6:
            this.a(var1);
         }

         if(this.K == null) {
            this.K = VelocityTracker.obtain();
         }

         this.K.addMovement(var1);
         var8 = this.A;
      } else {
         this.A = false;
         this.B = false;
         this.J = -1;
         var8 = var9;
         if(this.K != null) {
            this.K.recycle();
            this.K = null;
            var8 = var9;
         }
      }

      return var8;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      int var12 = this.getChildCount();
      int var14 = var4 - var2;
      int var13 = var5 - var3;
      var3 = this.getPaddingLeft();
      var2 = this.getPaddingTop();
      int var7 = this.getPaddingRight();
      var4 = this.getPaddingBottom();
      int var15 = this.getScrollX();
      int var8 = 0;

      int var9;
      View var17;
      ca var18;
      for(int var10 = 0; var10 < var12; var3 = var9) {
         label53: {
            var17 = this.getChildAt(var10);
            if(var17.getVisibility() != 8) {
               var18 = (ca)var17.getLayoutParams();
               if(var18.a) {
                  var5 = var18.b;
                  int var16 = var18.b;
                  int var11;
                  switch(var5 & 7) {
                  case 1:
                     var5 = Math.max((var14 - var17.getMeasuredWidth()) / 2, var3);
                     var9 = var3;
                     break;
                  case 2:
                  case 4:
                  default:
                     var5 = var3;
                     var9 = var3;
                     break;
                  case 3:
                     var9 = var17.getMeasuredWidth();
                     var5 = var3;
                     var9 += var3;
                     break;
                  case 5:
                     var9 = var17.getMeasuredWidth();
                     var5 = var7 + var17.getMeasuredWidth();
                     var11 = var14 - var7 - var9;
                     var7 = var5;
                     var9 = var3;
                     var5 = var11;
                  }

                  switch(var16 & 112) {
                  case 16:
                     var11 = Math.max((var13 - var17.getMeasuredHeight()) / 2, var2);
                     var3 = var2;
                     var2 = var4;
                     var4 = var11;
                     break;
                  case 48:
                     var11 = var17.getMeasuredHeight();
                     var3 = var4;
                     var11 += var2;
                     var4 = var2;
                     var2 = var3;
                     var3 = var11;
                     break;
                  case 80:
                     var11 = var13 - var4 - var17.getMeasuredHeight();
                     var16 = var17.getMeasuredHeight();
                     var3 = var2;
                     var2 = var4 + var16;
                     var4 = var11;
                     break;
                  default:
                     var11 = var2;
                     var3 = var2;
                     var2 = var4;
                     var4 = var11;
                  }

                  var5 += var15;
                  var17.layout(var5, var4, var17.getMeasuredWidth() + var5, var17.getMeasuredHeight() + var4);
                  ++var8;
                  var5 = var7;
                  var4 = var9;
                  var7 = var2;
                  var2 = var8;
                  break label53;
               }
            }

            var5 = var8;
            var8 = var2;
            var9 = var3;
            var2 = var5;
            var5 = var7;
            var7 = var4;
            var3 = var8;
            var4 = var9;
         }

         ++var10;
         var9 = var4;
         var8 = var2;
         var2 = var3;
         var4 = var7;
         var7 = var5;
      }

      var7 = var14 - var3 - var7;

      for(var5 = 0; var5 < var12; ++var5) {
         var17 = this.getChildAt(var5);
         if(var17.getVisibility() != 8) {
            var18 = (ca)var17.getLayoutParams();
            if(!var18.a) {
               bz var19 = this.a(var17);
               if(var19 != null) {
                  float var6 = (float)var7;
                  var9 = (int)(var19.e * var6) + var3;
                  if(var18.d) {
                     var18.d = false;
                     var6 = (float)var7;
                     var17.measure(MeasureSpec.makeMeasureSpec((int)(var18.c * var6), 1073741824), MeasureSpec.makeMeasureSpec(var13 - var2 - var4, 1073741824));
                  }

                  var17.layout(var9, var2, var17.getMeasuredWidth() + var9, var17.getMeasuredHeight() + var2);
               }
            }
         }
      }

      this.q = var2;
      this.r = var13 - var4;
      this.V = var8;
      if(this.S) {
         this.a(this.i, false, 0, false);
      }

      this.S = false;
   }

   protected void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(getDefaultSize(0, var1), getDefaultSize(0, var2));
      var1 = this.getMeasuredWidth();
      this.D = Math.min(var1 / 10, this.C);
      var1 = var1 - this.getPaddingLeft() - this.getPaddingRight();
      var2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
      int var12 = this.getChildCount();

      int var4;
      View var13;
      ca var14;
      for(int var6 = 0; var6 < var12; var2 = var4) {
         var13 = this.getChildAt(var6);
         int var5 = var1;
         var4 = var2;
         if(var13.getVisibility() != 8) {
            var14 = (ca)var13.getLayoutParams();
            var5 = var1;
            var4 = var2;
            if(var14 != null) {
               var5 = var1;
               var4 = var2;
               if(var14.a) {
                  var4 = var14.b & 7;
                  int var7 = var14.b & 112;
                  int var9 = Integer.MIN_VALUE;
                  var5 = Integer.MIN_VALUE;
                  boolean var15;
                  if(var7 != 48 && var7 != 80) {
                     var15 = false;
                  } else {
                     var15 = true;
                  }

                  boolean var8;
                  if(var4 != 3 && var4 != 5) {
                     var8 = false;
                  } else {
                     var8 = true;
                  }

                  if(var15) {
                     var4 = 1073741824;
                  } else {
                     var4 = var9;
                     if(var8) {
                        var5 = 1073741824;
                        var4 = var9;
                     }
                  }

                  if(var14.width != -2) {
                     var9 = 1073741824;
                     if(var14.width != -1) {
                        var4 = var14.width;
                     } else {
                        var4 = var1;
                     }
                  } else {
                     var9 = var4;
                     var4 = var1;
                  }

                  int var10;
                  label72: {
                     if(var14.height != -2) {
                        var10 = 1073741824;
                        var5 = var10;
                        if(var14.height != -1) {
                           int var11 = var14.height;
                           var5 = var10;
                           var10 = var11;
                           break label72;
                        }
                     }

                     var10 = var2;
                  }

                  var13.measure(MeasureSpec.makeMeasureSpec(var4, var9), MeasureSpec.makeMeasureSpec(var10, var5));
                  if(var15) {
                     var4 = var2 - var13.getMeasuredHeight();
                     var5 = var1;
                  } else {
                     var5 = var1;
                     var4 = var2;
                     if(var8) {
                        var5 = var1 - var13.getMeasuredWidth();
                        var4 = var2;
                     }
                  }
               }
            }
         }

         ++var6;
         var1 = var5;
      }

      this.u = MeasureSpec.makeMeasureSpec(var1, 1073741824);
      this.v = MeasureSpec.makeMeasureSpec(var2, 1073741824);
      this.w = true;
      this.c();
      this.w = false;
      var4 = this.getChildCount();

      for(var2 = 0; var2 < var4; ++var2) {
         var13 = this.getChildAt(var2);
         if(var13.getVisibility() != 8) {
            var14 = (ca)var13.getLayoutParams();
            if(var14 == null || !var14.a) {
               float var3 = (float)var1;
               var13.measure(MeasureSpec.makeMeasureSpec((int)(var14.c * var3), 1073741824), this.v);
            }
         }
      }

   }

   protected boolean onRequestFocusInDescendants(int var1, Rect var2) {
      boolean var6 = true;
      byte var5 = -1;
      int var4 = this.getChildCount();
      int var3;
      if((var1 & 2) != 0) {
         var5 = 1;
         var3 = 0;
      } else {
         var3 = var4 - 1;
         var4 = -1;
      }

      while(true) {
         if(var3 == var4) {
            var6 = false;
            break;
         }

         View var7 = this.getChildAt(var3);
         if(var7.getVisibility() == 0) {
            bz var8 = this.a(var7);
            if(var8 != null && var8.b == this.i && var7.requestFocus(var1, var2)) {
               break;
            }
         }

         var3 += var5;
      }

      return var6;
   }

   public void onRestoreInstanceState(Parcelable var1) {
      if(!(var1 instanceof ViewPager$SavedState)) {
         super.onRestoreInstanceState(var1);
      } else {
         ViewPager$SavedState var2 = (ViewPager$SavedState)var1;
         super.onRestoreInstanceState(var2.getSuperState());
         if(this.h != null) {
            this.h.a(var2.b, var2.c);
            this.a(var2.a, false, true);
         } else {
            this.j = var2.a;
            this.k = var2.b;
            this.l = var2.c;
         }
      }

   }

   public Parcelable onSaveInstanceState() {
      ViewPager$SavedState var1 = new ViewPager$SavedState(super.onSaveInstanceState());
      var1.a = this.i;
      if(this.h != null) {
         var1.b = this.h.a();
      }

      return var1;
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      if(var1 != var3) {
         this.a(var1, var3, this.o, this.o);
      }

   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var7 = false;
      boolean var9;
      if(this.P) {
         var9 = true;
      } else if(var1.getAction() == 0 && var1.getEdgeFlags() != 0) {
         var9 = false;
      } else if(this.h != null && this.h.b() != 0) {
         if(this.K == null) {
            this.K = VelocityTracker.obtain();
         }

         this.K.addMovement(var1);
         boolean var6 = var7;
         float var2;
         int var11;
         switch(var1.getAction() & 255) {
         case 0:
            this.m.abortAnimation();
            this.y = false;
            this.c();
            var2 = var1.getX();
            this.H = var2;
            this.F = var2;
            var2 = var1.getY();
            this.I = var2;
            this.G = var2;
            this.J = z.b(var1, 0);
            var6 = var7;
            break;
         case 1:
            var6 = var7;
            if(this.A) {
               VelocityTracker var13 = this.K;
               var13.computeCurrentVelocity(1000, (float)this.M);
               int var12 = (int)ao.a(var13, this.J);
               this.y = true;
               var11 = this.getClientWidth();
               int var8 = this.getScrollX();
               bz var14 = this.i();
               this.a(this.a(var14.b, ((float)var8 / (float)var11 - var14.e) / var14.d, var12, (int)(z.c(var1, z.a(var1, this.J)) - this.H)), true, true, var12);
               this.J = -1;
               this.j();
               var9 = this.Q.c();
               var6 = this.R.c() | var9;
            }
            break;
         case 2:
            if(!this.A) {
               var11 = z.a(var1, this.J);
               float var4 = z.c(var1, var11);
               var2 = Math.abs(var4 - this.F);
               float var3 = z.d(var1, var11);
               float var5 = Math.abs(var3 - this.G);
               if(var2 > (float)this.E && var2 > var5) {
                  this.A = true;
                  this.c(true);
                  if(var4 - this.H > 0.0F) {
                     var2 = this.H + (float)this.E;
                  } else {
                     var2 = this.H - (float)this.E;
                  }

                  this.F = var2;
                  this.G = var3;
                  this.setScrollState(1);
                  this.setScrollingCacheEnabled(true);
                  ViewParent var10 = this.getParent();
                  if(var10 != null) {
                     var10.requestDisallowInterceptTouchEvent(true);
                  }
               }
            }

            var6 = var7;
            if(this.A) {
               var6 = false | this.b(z.c(var1, z.a(var1, this.J)));
            }
            break;
         case 3:
            var6 = var7;
            if(this.A) {
               this.a(this.i, true, 0, false);
               this.J = -1;
               this.j();
               var9 = this.Q.c();
               var6 = this.R.c() | var9;
            }
         case 4:
            break;
         case 5:
            var11 = z.b(var1);
            this.F = z.c(var1, var11);
            this.J = z.b(var1, var11);
            var6 = var7;
            break;
         case 6:
            this.a(var1);
            this.F = z.c(var1, z.a(var1, this.J));
            var6 = var7;
            break;
         default:
            var6 = var7;
         }

         if(var6) {
            at.b(this);
         }

         var9 = true;
      } else {
         var9 = false;
      }

      return var9;
   }

   public void removeView(View var1) {
      if(this.w) {
         this.removeViewInLayout(var1);
      } else {
         super.removeView(var1);
      }

   }

   public void setAdapter(ae var1) {
      if(this.h != null) {
         this.h.b((DataSetObserver)this.n);
         this.h.a((ViewGroup)this);

         for(int var2 = 0; var2 < this.e.size(); ++var2) {
            bz var4 = (bz)this.e.get(var2);
            this.h.a((ViewGroup)this, var4.b, var4.a);
         }

         this.h.b((ViewGroup)this);
         this.e.clear();
         this.g();
         this.i = 0;
         this.scrollTo(0, 0);
      }

      ae var5 = this.h;
      this.h = var1;
      this.b = 0;
      if(this.h != null) {
         if(this.n == null) {
            this.n = new cf(this, (bv)null);
         }

         this.h.a((DataSetObserver)this.n);
         this.y = false;
         boolean var3 = this.S;
         this.S = true;
         this.b = this.h.b();
         if(this.j >= 0) {
            this.h.a(this.k, this.l);
            this.a(this.j, false, true);
            this.j = -1;
            this.k = null;
            this.l = null;
         } else if(!var3) {
            this.c();
         } else {
            this.requestLayout();
         }
      }

      if(this.aa != null && var5 != var1) {
         this.aa.a(var5, var1);
      }

   }

   void setChildrenDrawingOrderEnabledCompat(boolean var1) {
      if(VERSION.SDK_INT >= 7) {
         if(this.ac == null) {
            try {
               this.ac = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException var4) {
               Log.e("ViewPager", "Can\'t find setChildrenDrawingOrderEnabled", var4);
            }
         }

         try {
            this.ac.invoke(this, new Object[]{Boolean.valueOf(var1)});
         } catch (Exception var3) {
            Log.e("ViewPager", "Error changing children drawing order", var3);
         }
      }

   }

   public void setCurrentItem(int var1) {
      this.y = false;
      boolean var2;
      if(!this.S) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.a(var1, var2, false);
   }

   public void setOffscreenPageLimit(int var1) {
      int var2 = var1;
      if(var1 < 1) {
         Log.w("ViewPager", "Requested offscreen page limit " + var1 + " too small; defaulting to " + 1);
         var2 = 1;
      }

      if(var2 != this.z) {
         this.z = var2;
         this.c();
      }

   }

   void setOnAdapterChangeListener(cc var1) {
      this.aa = var1;
   }

   public void setOnPageChangeListener(cd var1) {
      this.W = var1;
   }

   public void setPageMargin(int var1) {
      int var2 = this.o;
      this.o = var1;
      int var3 = this.getWidth();
      this.a(var3, var3, var1, var2);
      this.requestLayout();
   }

   public void setPageMarginDrawable(int var1) {
      this.setPageMarginDrawable(this.getContext().getResources().getDrawable(var1));
   }

   public void setPageMarginDrawable(Drawable var1) {
      this.p = var1;
      if(var1 != null) {
         this.refreshDrawableState();
      }

      boolean var2;
      if(var1 == null) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.setWillNotDraw(var2);
      this.invalidate();
   }

   protected boolean verifyDrawable(Drawable var1) {
      boolean var2;
      if(!super.verifyDrawable(var1) && var1 != this.p) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }
}

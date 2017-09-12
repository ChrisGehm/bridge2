package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.v4.view.at;
import android.support.v4.widget.ag;
import android.support.v4.widget.ah;
import android.support.v4.widget.ai;
import android.support.v4.widget.aj;
import android.support.v4.widget.ak;
import android.support.v4.widget.al;
import android.support.v4.widget.am;
import android.support.v4.widget.ao;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Animation.AnimationListener;
import android.widget.AbsListView;

public class SwipeRefreshLayout extends ViewGroup {
   private static final String a = SwipeRefreshLayout.class.getSimpleName();
   private static final int[] v = new int[]{16842766};
   private final Runnable A;
   private final Runnable B;
   private ag b;
   private View c;
   private int d;
   private ao e;
   private int f;
   private boolean g;
   private int h;
   private float i;
   private int j;
   private float k;
   private float l;
   private int m;
   private int n;
   private float o;
   private float p;
   private boolean q;
   private int r;
   private boolean s;
   private final DecelerateInterpolator t;
   private final AccelerateInterpolator u;
   private final Animation w;
   private Animation x;
   private final AnimationListener y;
   private final AnimationListener z;

   public SwipeRefreshLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public SwipeRefreshLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.g = false;
      this.i = -1.0F;
      this.k = 0.0F;
      this.l = 0.0F;
      this.r = -1;
      this.w = new ah(this);
      this.x = new ai(this);
      this.y = new aj(this);
      this.z = new ak(this);
      this.A = new al(this);
      this.B = new am(this);
      this.h = ViewConfiguration.get(var1).getScaledTouchSlop();
      this.j = this.getResources().getInteger(17694721);
      this.setWillNotDraw(false);
      this.b = new ag(this);
      this.m = (int)(this.getResources().getDisplayMetrics().density * 4.0F);
      this.t = new DecelerateInterpolator(2.0F);
      this.u = new AccelerateInterpolator(1.5F);
      TypedArray var3 = var1.obtainStyledAttributes(var2, v);
      this.setEnabled(var3.getBoolean(0, true));
      var3.recycle();
   }

   // $FF: synthetic method
   static float a(SwipeRefreshLayout var0, float var1) {
      var0.l = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(SwipeRefreshLayout var0) {
      return var0.f;
   }

   private void a(int var1) {
      int var3 = this.c.getTop();
      int var2;
      if((float)var1 > this.i) {
         var2 = (int)this.i;
      } else {
         var2 = var1;
         if(var1 < 0) {
            var2 = 0;
         }
      }

      this.setTargetOffsetTopAndBottom(var2 - var3);
   }

   private void a(int var1, AnimationListener var2) {
      this.f = var1;
      this.w.reset();
      this.w.setDuration((long)this.j);
      this.w.setAnimationListener(var2);
      this.w.setInterpolator(this.t);
      this.c.startAnimation(this.w);
   }

   // $FF: synthetic method
   static void a(SwipeRefreshLayout var0, int var1) {
      var0.setTargetOffsetTopAndBottom(var1);
   }

   // $FF: synthetic method
   static void a(SwipeRefreshLayout var0, int var1, AnimationListener var2) {
      var0.a(var1, var2);
   }

   private void a(MotionEvent var1) {
      int var2 = android.support.v4.view.z.b(var1);
      if(android.support.v4.view.z.b(var1, var2) == this.r) {
         byte var3;
         if(var2 == 0) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.p = android.support.v4.view.z.d(var1, var3);
         this.r = android.support.v4.view.z.b(var1, var3);
      }

   }

   // $FF: synthetic method
   static boolean a(SwipeRefreshLayout var0, boolean var1) {
      var0.s = var1;
      return var1;
   }

   // $FF: synthetic method
   static float b(SwipeRefreshLayout var0, float var1) {
      var0.k = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SwipeRefreshLayout var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static int b(SwipeRefreshLayout var0, int var1) {
      var0.n = var1;
      return var1;
   }

   private void b() {
      if(this.c == null) {
         if(this.getChildCount() > 1 && !this.isInEditMode()) {
            throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
         }

         this.c = this.getChildAt(0);
         this.d = this.c.getTop() + this.getPaddingTop();
      }

      if(this.i == -1.0F && this.getParent() != null && ((View)this.getParent()).getHeight() > 0) {
         DisplayMetrics var1 = this.getResources().getDisplayMetrics();
         this.i = (float)((int)Math.min((float)((View)this.getParent()).getHeight() * 0.6F, var1.density * 120.0F));
      }

   }

   // $FF: synthetic method
   static View c(SwipeRefreshLayout var0) {
      return var0.c;
   }

   private void c() {
      this.removeCallbacks(this.B);
      this.A.run();
      this.setRefreshing(true);
      this.e.a();
   }

   // $FF: synthetic method
   static float d(SwipeRefreshLayout var0) {
      return var0.k;
   }

   private void d() {
      this.removeCallbacks(this.B);
      this.postDelayed(this.B, 300L);
   }

   // $FF: synthetic method
   static ag e(SwipeRefreshLayout var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static int f(SwipeRefreshLayout var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static AnimationListener g(SwipeRefreshLayout var0) {
      return var0.y;
   }

   // $FF: synthetic method
   static float h(SwipeRefreshLayout var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static int i(SwipeRefreshLayout var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static Animation j(SwipeRefreshLayout var0) {
      return var0.x;
   }

   // $FF: synthetic method
   static AnimationListener k(SwipeRefreshLayout var0) {
      return var0.z;
   }

   // $FF: synthetic method
   static DecelerateInterpolator l(SwipeRefreshLayout var0) {
      return var0.t;
   }

   private void setTargetOffsetTopAndBottom(int var1) {
      this.c.offsetTopAndBottom(var1);
      this.n = this.c.getTop();
   }

   private void setTriggerPercentage(float var1) {
      if(var1 == 0.0F) {
         this.l = 0.0F;
      } else {
         this.l = var1;
         this.b.a(var1);
      }

   }

   public boolean a() {
      boolean var1 = true;
      if(VERSION.SDK_INT < 14) {
         if(this.c instanceof AbsListView) {
            AbsListView var2 = (AbsListView)this.c;
            if(var2.getChildCount() <= 0 || var2.getFirstVisiblePosition() <= 0 && var2.getChildAt(0).getTop() >= var2.getPaddingTop()) {
               var1 = false;
            } else {
               var1 = true;
            }
         } else if(this.c.getScrollY() <= 0) {
            var1 = false;
         }
      } else {
         var1 = at.b(this.c, -1);
      }

      return var1;
   }

   public void draw(Canvas var1) {
      super.draw(var1);
      this.b.a(var1);
   }

   public void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.removeCallbacks(this.B);
      this.removeCallbacks(this.A);
   }

   public void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.removeCallbacks(this.A);
      this.removeCallbacks(this.B);
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var5 = false;
      this.b();
      int var3 = android.support.v4.view.z.a(var1);
      if(this.s && var3 == 0) {
         this.s = false;
      }

      boolean var4 = var5;
      if(this.isEnabled()) {
         var4 = var5;
         if(!this.s) {
            if(this.a()) {
               var4 = var5;
            } else {
               float var2;
               switch(var3) {
               case 0:
                  var2 = var1.getY();
                  this.o = var2;
                  this.p = var2;
                  this.r = android.support.v4.view.z.b(var1, 0);
                  this.q = false;
                  this.l = 0.0F;
                  break;
               case 1:
               case 3:
                  this.q = false;
                  this.l = 0.0F;
                  this.r = -1;
                  break;
               case 2:
                  if(this.r == -1) {
                     Log.e(a, "Got ACTION_MOVE event but don\'t have an active pointer id.");
                     var4 = var5;
                     return var4;
                  }

                  var3 = android.support.v4.view.z.a(var1, this.r);
                  if(var3 < 0) {
                     Log.e(a, "Got ACTION_MOVE event but have an invalid active pointer id.");
                     var4 = var5;
                     return var4;
                  }

                  var2 = android.support.v4.view.z.d(var1, var3);
                  if(var2 - this.o > (float)this.h) {
                     this.p = var2;
                     this.q = true;
                  }
               case 4:
               case 5:
               default:
                  break;
               case 6:
                  this.a(var1);
               }

               var4 = this.q;
            }
         }
      }

      return var4;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var2 = this.getMeasuredWidth();
      var3 = this.getMeasuredHeight();
      this.b.a(0, 0, var2, this.m);
      if(this.getChildCount() != 0) {
         View var6 = this.getChildAt(0);
         var4 = this.getPaddingLeft();
         var5 = this.n + this.getPaddingTop();
         var6.layout(var4, var5, var2 - this.getPaddingLeft() - this.getPaddingRight() + var4, var3 - this.getPaddingTop() - this.getPaddingBottom() + var5);
      }

   }

   public void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      if(this.getChildCount() > 1 && !this.isInEditMode()) {
         throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
      } else {
         if(this.getChildCount() > 0) {
            this.getChildAt(0).measure(MeasureSpec.makeMeasureSpec(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), 1073741824));
         }

      }
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var6 = false;
      int var4 = android.support.v4.view.z.a(var1);
      if(this.s && var4 == 0) {
         this.s = false;
      }

      boolean var5 = var6;
      if(this.isEnabled()) {
         var5 = var6;
         if(!this.s) {
            if(this.a()) {
               var5 = var6;
            } else {
               float var2;
               switch(var4) {
               case 0:
                  var2 = var1.getY();
                  this.o = var2;
                  this.p = var2;
                  this.r = android.support.v4.view.z.b(var1, 0);
                  this.q = false;
                  this.l = 0.0F;
                  break;
               case 1:
               case 3:
                  this.q = false;
                  this.l = 0.0F;
                  this.r = -1;
                  var5 = var6;
                  return var5;
               case 2:
                  var4 = android.support.v4.view.z.a(var1, this.r);
                  if(var4 < 0) {
                     Log.e(a, "Got ACTION_MOVE event but have an invalid active pointer id.");
                     var5 = var6;
                     return var5;
                  }

                  float var3 = android.support.v4.view.z.d(var1, var4);
                  var2 = var3 - this.o;
                  if(!this.q && var2 > (float)this.h) {
                     this.q = true;
                  }

                  if(this.q) {
                     if(var2 > this.i) {
                        this.c();
                     } else {
                        this.setTriggerPercentage(this.u.getInterpolation(var2 / this.i));
                        this.a((int)var2);
                        if(this.p > var3 && this.c.getTop() == this.getPaddingTop()) {
                           this.removeCallbacks(this.B);
                        } else {
                           this.d();
                        }
                     }

                     this.p = var3;
                  }
               case 4:
               default:
                  break;
               case 5:
                  var4 = android.support.v4.view.z.b(var1);
                  this.p = android.support.v4.view.z.d(var1, var4);
                  this.r = android.support.v4.view.z.b(var1, var4);
                  break;
               case 6:
                  this.a(var1);
               }

               var5 = true;
            }
         }
      }

      return var5;
   }

   public void requestDisallowInterceptTouchEvent(boolean var1) {
   }

   public void setOnRefreshListener(ao var1) {
      this.e = var1;
   }

   public void setRefreshing(boolean var1) {
      if(this.g != var1) {
         this.b();
         this.l = 0.0F;
         this.g = var1;
         if(this.g) {
            this.b.a();
         } else {
            this.b.b();
         }
      }

   }
}

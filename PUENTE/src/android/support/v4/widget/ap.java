package android.support.v4.widget;

import android.content.Context;
import android.support.v4.widget.aq;
import android.support.v4.widget.ar;
import android.support.v4.widget.as;
import android.support.v4.widget.p;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

public class ap {
   private static final Interpolator v = new aq();
   private int a;
   private int b;
   private int c = -1;
   private float[] d;
   private float[] e;
   private float[] f;
   private float[] g;
   private int[] h;
   private int[] i;
   private int[] j;
   private int k;
   private VelocityTracker l;
   private float m;
   private float n;
   private int o;
   private int p;
   private p q;
   private final as r;
   private View s;
   private boolean t;
   private final ViewGroup u;
   private final Runnable w = new ar(this);

   private ap(Context var1, ViewGroup var2, as var3) {
      if(var2 == null) {
         throw new IllegalArgumentException("Parent view may not be null");
      } else if(var3 == null) {
         throw new IllegalArgumentException("Callback may not be null");
      } else {
         this.u = var2;
         this.r = var3;
         ViewConfiguration var4 = ViewConfiguration.get(var1);
         this.o = (int)(var1.getResources().getDisplayMetrics().density * 20.0F + 0.5F);
         this.b = var4.getScaledTouchSlop();
         this.m = (float)var4.getScaledMaximumFlingVelocity();
         this.n = (float)var4.getScaledMinimumFlingVelocity();
         this.q = p.a(var1, v);
      }
   }

   private float a(float var1, float var2, float var3) {
      float var4 = Math.abs(var1);
      if(var4 < var2) {
         var2 = 0.0F;
      } else if(var4 > var3) {
         var2 = var3;
         if(var1 <= 0.0F) {
            var2 = -var3;
         }
      } else {
         var2 = var1;
      }

      return var2;
   }

   private int a(int var1, int var2, int var3) {
      if(var1 == 0) {
         var1 = 0;
      } else {
         int var7 = this.u.getWidth();
         int var8 = var7 / 2;
         float var6 = Math.min(1.0F, (float)Math.abs(var1) / (float)var7);
         float var4 = (float)var8;
         float var5 = (float)var8;
         var6 = this.b(var6);
         var2 = Math.abs(var2);
         if(var2 > 0) {
            var1 = Math.round(Math.abs((var6 * var5 + var4) / (float)var2) * 1000.0F) * 4;
         } else {
            var1 = (int)(((float)Math.abs(var1) / (float)var3 + 1.0F) * 256.0F);
         }

         var1 = Math.min(var1, 600);
      }

      return var1;
   }

   private int a(View var1, int var2, int var3, int var4, int var5) {
      int var9 = this.b(var4, (int)this.n, (int)this.m);
      var4 = this.b(var5, (int)this.n, (int)this.m);
      int var11 = Math.abs(var2);
      var5 = Math.abs(var3);
      int var10 = Math.abs(var9);
      int var14 = Math.abs(var4);
      int var12 = var10 + var14;
      int var13 = var11 + var5;
      float var6;
      if(var9 != 0) {
         var6 = (float)var10 / (float)var12;
      } else {
         var6 = (float)var11 / (float)var13;
      }

      float var7;
      if(var4 != 0) {
         var7 = (float)var14 / (float)var12;
      } else {
         var7 = (float)var5 / (float)var13;
      }

      var2 = this.a(var2, var9, this.r.a(var1));
      var3 = this.a(var3, var4, this.r.b(var1));
      float var8 = (float)var2;
      return (int)(var7 * (float)var3 + var6 * var8);
   }

   public static ap a(ViewGroup var0, float var1, as var2) {
      ap var3 = a(var0, var2);
      var3.b = (int)((float)var3.b * (1.0F / var1));
      return var3;
   }

   public static ap a(ViewGroup var0, as var1) {
      return new ap(var0.getContext(), var0, var1);
   }

   private void a(float var1, float var2) {
      this.t = true;
      this.r.a(this.s, var1, var2);
      this.t = false;
      if(this.a == 1) {
         this.c(0);
      }

   }

   private void a(float var1, float var2, int var3) {
      this.f(var3);
      float[] var4 = this.d;
      this.f[var3] = var1;
      var4[var3] = var1;
      var4 = this.e;
      this.g[var3] = var2;
      var4[var3] = var2;
      this.h[var3] = this.e((int)var1, (int)var2);
      this.k |= 1 << var3;
   }

   private boolean a(float var1, float var2, int var3, int var4) {
      boolean var6 = false;
      var1 = Math.abs(var1);
      var2 = Math.abs(var2);
      boolean var5 = var6;
      if((this.h[var3] & var4) == var4) {
         var5 = var6;
         if((this.p & var4) != 0) {
            var5 = var6;
            if((this.j[var3] & var4) != var4) {
               var5 = var6;
               if((this.i[var3] & var4) != var4) {
                  if(var1 <= (float)this.b && var2 <= (float)this.b) {
                     var5 = var6;
                  } else if(var1 < var2 * 0.5F && this.r.b(var4)) {
                     int[] var7 = this.j;
                     var7[var3] |= var4;
                     var5 = var6;
                  } else {
                     var5 = var6;
                     if((this.i[var3] & var4) == 0) {
                        var5 = var6;
                        if(var1 > (float)this.b) {
                           var5 = true;
                        }
                     }
                  }
               }
            }
         }
      }

      return var5;
   }

   private boolean a(int var1, int var2, int var3, int var4) {
      boolean var7 = false;
      int var6 = this.s.getLeft();
      int var5 = this.s.getTop();
      var1 -= var6;
      var2 -= var5;
      if(var1 == 0 && var2 == 0) {
         this.q.g();
         this.c(0);
      } else {
         var3 = this.a(this.s, var1, var2, var3, var4);
         this.q.a(var6, var5, var1, var2, var3);
         this.c(2);
         var7 = true;
      }

      return var7;
   }

   private boolean a(View var1, float var2, float var3) {
      boolean var6 = true;
      if(var1 == null) {
         var6 = false;
      } else {
         boolean var4;
         if(this.r.a(var1) > 0) {
            var4 = true;
         } else {
            var4 = false;
         }

         boolean var5;
         if(this.r.b(var1) > 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         if(var4 && var5) {
            if(var2 * var2 + var3 * var3 <= (float)(this.b * this.b)) {
               var6 = false;
            }
         } else if(var4) {
            if(Math.abs(var2) <= (float)this.b) {
               var6 = false;
            }
         } else if(var5) {
            if(Math.abs(var3) <= (float)this.b) {
               var6 = false;
            }
         } else {
            var6 = false;
         }
      }

      return var6;
   }

   private float b(float var1) {
      return (float)Math.sin((double)((float)((double)(var1 - 0.5F) * 0.4712389167638204D)));
   }

   private int b(int var1, int var2, int var3) {
      int var4 = Math.abs(var1);
      if(var4 < var2) {
         var2 = 0;
      } else if(var4 > var3) {
         var2 = var3;
         if(var1 <= 0) {
            var2 = -var3;
         }
      } else {
         var2 = var1;
      }

      return var2;
   }

   private void b(float var1, float var2, int var3) {
      byte var4 = 1;
      if(!this.a(var1, var2, var3, 1)) {
         var4 = 0;
      }

      int var5 = var4;
      if(this.a(var2, var1, var3, 4)) {
         var5 = var4 | 4;
      }

      int var7 = var5;
      if(this.a(var1, var2, var3, 2)) {
         var7 = var5 | 2;
      }

      var5 = var7;
      if(this.a(var2, var1, var3, 8)) {
         var5 = var7 | 8;
      }

      if(var5 != 0) {
         int[] var6 = this.i;
         var6[var3] |= var5;
         this.r.b(var5, var3);
      }

   }

   private void b(int var1, int var2, int var3, int var4) {
      int var5 = this.s.getLeft();
      int var6 = this.s.getTop();
      if(var3 != 0) {
         var1 = this.r.a(this.s, var1, var3);
         this.s.offsetLeftAndRight(var1 - var5);
      }

      if(var4 != 0) {
         var2 = this.r.b(this.s, var2, var4);
         this.s.offsetTopAndBottom(var2 - var6);
      }

      if(var3 != 0 || var4 != 0) {
         this.r.a(this.s, var1, var2, var1 - var5, var2 - var6);
      }

   }

   private void c(MotionEvent var1) {
      int var5 = android.support.v4.view.z.c(var1);

      for(int var4 = 0; var4 < var5; ++var4) {
         int var6 = android.support.v4.view.z.b(var1, var4);
         float var2 = android.support.v4.view.z.c(var1, var4);
         float var3 = android.support.v4.view.z.d(var1, var4);
         this.f[var6] = var2;
         this.g[var6] = var3;
      }

   }

   private int e(int var1, int var2) {
      byte var3 = 0;
      if(var1 < this.u.getLeft() + this.o) {
         var3 = 1;
      }

      int var4 = var3;
      if(var2 < this.u.getTop() + this.o) {
         var4 = var3 | 4;
      }

      int var5 = var4;
      if(var1 > this.u.getRight() - this.o) {
         var5 = var4 | 2;
      }

      var1 = var5;
      if(var2 > this.u.getBottom() - this.o) {
         var1 = var5 | 8;
      }

      return var1;
   }

   private void e(int var1) {
      if(this.d != null) {
         this.d[var1] = 0.0F;
         this.e[var1] = 0.0F;
         this.f[var1] = 0.0F;
         this.g[var1] = 0.0F;
         this.h[var1] = 0;
         this.i[var1] = 0;
         this.j[var1] = 0;
         this.k &= ~(1 << var1);
      }

   }

   private void f(int var1) {
      if(this.d == null || this.d.length <= var1) {
         float[] var4 = new float[var1 + 1];
         float[] var7 = new float[var1 + 1];
         float[] var2 = new float[var1 + 1];
         float[] var8 = new float[var1 + 1];
         int[] var3 = new int[var1 + 1];
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];
         if(this.d != null) {
            System.arraycopy(this.d, 0, var4, 0, this.d.length);
            System.arraycopy(this.e, 0, var7, 0, this.e.length);
            System.arraycopy(this.f, 0, var2, 0, this.f.length);
            System.arraycopy(this.g, 0, var8, 0, this.g.length);
            System.arraycopy(this.h, 0, var3, 0, this.h.length);
            System.arraycopy(this.i, 0, var5, 0, this.i.length);
            System.arraycopy(this.j, 0, var6, 0, this.j.length);
         }

         this.d = var4;
         this.e = var7;
         this.f = var2;
         this.g = var8;
         this.h = var3;
         this.i = var5;
         this.j = var6;
      }

   }

   private void g() {
      if(this.d != null) {
         Arrays.fill(this.d, 0.0F);
         Arrays.fill(this.e, 0.0F);
         Arrays.fill(this.f, 0.0F);
         Arrays.fill(this.g, 0.0F);
         Arrays.fill(this.h, 0);
         Arrays.fill(this.i, 0);
         Arrays.fill(this.j, 0);
         this.k = 0;
      }

   }

   private void h() {
      this.l.computeCurrentVelocity(1000, this.m);
      this.a(this.a(android.support.v4.view.ao.a(this.l, this.c), this.n, this.m), this.a(android.support.v4.view.ao.b(this.l, this.c), this.n, this.m));
   }

   public int a() {
      return this.a;
   }

   public void a(float var1) {
      this.n = var1;
   }

   public void a(int var1) {
      this.p = var1;
   }

   public void a(View var1, int var2) {
      if(var1.getParent() != this.u) {
         throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (" + this.u + ")");
      } else {
         this.s = var1;
         this.c = var2;
         this.r.b(var1, var2);
         this.c(1);
      }
   }

   public boolean a(int var1, int var2) {
      if(!this.t) {
         throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
      } else {
         return this.a(var1, var2, (int)android.support.v4.view.ao.a(this.l, this.c), (int)android.support.v4.view.ao.b(this.l, this.c));
      }
   }

   public boolean a(MotionEvent var1) {
      boolean var9 = true;
      int var7 = android.support.v4.view.z.a(var1);
      int var6 = android.support.v4.view.z.b(var1);
      if(var7 == 0) {
         this.e();
      }

      if(this.l == null) {
         this.l = VelocityTracker.obtain();
      }

      this.l.addMovement(var1);
      float var2;
      float var3;
      View var11;
      switch(var7) {
      case 0:
         var2 = var1.getX();
         var3 = var1.getY();
         var6 = android.support.v4.view.z.b(var1, 0);
         this.a(var2, var3, var6);
         var11 = this.d((int)var2, (int)var3);
         if(var11 == this.s && this.a == 2) {
            this.b(var11, var6);
         }

         var7 = this.h[var6];
         if((this.p & var7) != 0) {
            this.r.a(var7 & this.p, var6);
         }
         break;
      case 1:
      case 3:
         this.e();
         break;
      case 2:
         var7 = android.support.v4.view.z.c(var1);

         for(var6 = 0; var6 < var7; ++var6) {
            int var8 = android.support.v4.view.z.b(var1, var6);
            var2 = android.support.v4.view.z.c(var1, var6);
            float var5 = android.support.v4.view.z.d(var1, var6);
            float var4 = var2 - this.d[var8];
            var3 = var5 - this.e[var8];
            this.b(var4, var3, var8);
            if(this.a == 1) {
               break;
            }

            View var10 = this.d((int)var2, (int)var5);
            if(var10 != null && this.a(var10, var4, var3) && this.b(var10, var8)) {
               break;
            }
         }

         this.c(var1);
      case 4:
      default:
         break;
      case 5:
         var7 = android.support.v4.view.z.b(var1, var6);
         var3 = android.support.v4.view.z.c(var1, var6);
         var2 = android.support.v4.view.z.d(var1, var6);
         this.a(var3, var2, var7);
         if(this.a == 0) {
            var6 = this.h[var7];
            if((this.p & var6) != 0) {
               this.r.a(var6 & this.p, var7);
            }
         } else if(this.a == 2) {
            var11 = this.d((int)var3, (int)var2);
            if(var11 == this.s) {
               this.b(var11, var7);
            }
         }
         break;
      case 6:
         this.e(android.support.v4.view.z.b(var1, var6));
      }

      if(this.a != 1) {
         var9 = false;
      }

      return var9;
   }

   public boolean a(View var1, int var2, int var3) {
      this.s = var1;
      this.c = -1;
      return this.a(var2, var3, 0, 0);
   }

   public boolean a(boolean var1) {
      if(this.a == 2) {
         boolean var6 = this.q.f();
         int var5 = this.q.b();
         int var4 = this.q.c();
         int var3 = var5 - this.s.getLeft();
         int var2 = var4 - this.s.getTop();
         if(var3 != 0) {
            this.s.offsetLeftAndRight(var3);
         }

         if(var2 != 0) {
            this.s.offsetTopAndBottom(var2);
         }

         if(var3 != 0 || var2 != 0) {
            this.r.a(this.s, var5, var4, var3, var2);
         }

         if(var6 && var5 == this.q.d() && var4 == this.q.e()) {
            this.q.g();
            var6 = this.q.a();
         }

         if(!var6) {
            if(var1) {
               this.u.post(this.w);
            } else {
               this.c(0);
            }
         }
      }

      if(this.a == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int b() {
      return this.o;
   }

   public void b(MotionEvent var1) {
      int var6 = 0;
      byte var7 = 0;
      int var9 = android.support.v4.view.z.a(var1);
      int var8 = android.support.v4.view.z.b(var1);
      if(var9 == 0) {
         this.e();
      }

      if(this.l == null) {
         this.l = VelocityTracker.obtain();
      }

      this.l.addMovement(var1);
      float var2;
      float var3;
      int var12;
      switch(var9) {
      case 0:
         var3 = var1.getX();
         var2 = var1.getY();
         var6 = android.support.v4.view.z.b(var1, 0);
         View var11 = this.d((int)var3, (int)var2);
         this.a(var3, var2, var6);
         this.b(var11, var6);
         var12 = this.h[var6];
         if((this.p & var12) != 0) {
            this.r.a(var12 & this.p, var6);
         }
         break;
      case 1:
         if(this.a == 1) {
            this.h();
         }

         this.e();
         break;
      case 2:
         if(this.a == 1) {
            var6 = android.support.v4.view.z.a(var1, this.c);
            var3 = android.support.v4.view.z.c(var1, var6);
            var2 = android.support.v4.view.z.d(var1, var6);
            var12 = (int)(var3 - this.f[this.c]);
            var6 = (int)(var2 - this.g[this.c]);
            this.b(this.s.getLeft() + var12, this.s.getTop() + var6, var12, var6);
            this.c(var1);
         } else {
            var8 = android.support.v4.view.z.c(var1);

            for(var6 = var7; var6 < var8; ++var6) {
               var12 = android.support.v4.view.z.b(var1, var6);
               float var4 = android.support.v4.view.z.c(var1, var6);
               float var5 = android.support.v4.view.z.d(var1, var6);
               var3 = var4 - this.d[var12];
               var2 = var5 - this.e[var12];
               this.b(var3, var2, var12);
               if(this.a == 1) {
                  break;
               }

               View var10 = this.d((int)var4, (int)var5);
               if(this.a(var10, var3, var2) && this.b(var10, var12)) {
                  break;
               }
            }

            this.c(var1);
         }
         break;
      case 3:
         if(this.a == 1) {
            this.a(0.0F, 0.0F);
         }

         this.e();
      case 4:
      default:
         break;
      case 5:
         var6 = android.support.v4.view.z.b(var1, var8);
         var2 = android.support.v4.view.z.c(var1, var8);
         var3 = android.support.v4.view.z.d(var1, var8);
         this.a(var2, var3, var6);
         if(this.a == 0) {
            this.b(this.d((int)var2, (int)var3), var6);
            var12 = this.h[var6];
            if((this.p & var12) != 0) {
               this.r.a(var12 & this.p, var6);
            }
         } else if(this.c((int)var2, (int)var3)) {
            this.b(this.s, var6);
         }
         break;
      case 6:
         var12 = android.support.v4.view.z.b(var1, var8);
         if(this.a == 1 && var12 == this.c) {
            var8 = android.support.v4.view.z.c(var1);

            while(true) {
               if(var6 >= var8) {
                  var6 = -1;
                  break;
               }

               var9 = android.support.v4.view.z.b(var1, var6);
               if(var9 != this.c) {
                  var2 = android.support.v4.view.z.c(var1, var6);
                  var3 = android.support.v4.view.z.d(var1, var6);
                  if(this.d((int)var2, (int)var3) == this.s && this.b(this.s, var9)) {
                     var6 = this.c;
                     break;
                  }
               }

               ++var6;
            }

            if(var6 == -1) {
               this.h();
            }
         }

         this.e(var12);
      }

   }

   public boolean b(int var1) {
      boolean var2 = true;
      if((this.k & 1 << var1) == 0) {
         var2 = false;
      }

      return var2;
   }

   public boolean b(int var1, int var2) {
      boolean var6 = true;
      if(!this.b(var2)) {
         var6 = false;
      } else {
         boolean var5;
         if((var1 & 1) == 1) {
            var5 = true;
         } else {
            var5 = false;
         }

         boolean var7;
         if((var1 & 2) == 2) {
            var7 = true;
         } else {
            var7 = false;
         }

         float var3 = this.f[var2] - this.d[var2];
         float var4 = this.g[var2] - this.e[var2];
         if(var5 && var7) {
            if(var3 * var3 + var4 * var4 <= (float)(this.b * this.b)) {
               var6 = false;
            }
         } else if(var5) {
            if(Math.abs(var3) <= (float)this.b) {
               var6 = false;
            }
         } else if(var7) {
            if(Math.abs(var4) <= (float)this.b) {
               var6 = false;
            }
         } else {
            var6 = false;
         }
      }

      return var6;
   }

   boolean b(View var1, int var2) {
      boolean var3 = true;
      if(var1 != this.s || this.c != var2) {
         if(var1 != null && this.r.a(var1, var2)) {
            this.c = var2;
            this.a(var1, var2);
         } else {
            var3 = false;
         }
      }

      return var3;
   }

   public boolean b(View var1, int var2, int var3) {
      boolean var5 = false;
      boolean var4;
      if(var1 == null) {
         var4 = var5;
      } else {
         var4 = var5;
         if(var2 >= var1.getLeft()) {
            var4 = var5;
            if(var2 < var1.getRight()) {
               var4 = var5;
               if(var3 >= var1.getTop()) {
                  var4 = var5;
                  if(var3 < var1.getBottom()) {
                     var4 = true;
                  }
               }
            }
         }
      }

      return var4;
   }

   public View c() {
      return this.s;
   }

   void c(int var1) {
      if(this.a != var1) {
         this.a = var1;
         this.r.a(var1);
         if(var1 == 0) {
            this.s = null;
         }
      }

   }

   public boolean c(int var1, int var2) {
      return this.b(this.s, var1, var2);
   }

   public int d() {
      return this.b;
   }

   public View d(int var1, int var2) {
      int var3 = this.u.getChildCount() - 1;

      View var4;
      while(true) {
         if(var3 < 0) {
            var4 = null;
            break;
         }

         var4 = this.u.getChildAt(this.r.c(var3));
         if(var1 >= var4.getLeft() && var1 < var4.getRight() && var2 >= var4.getTop() && var2 < var4.getBottom()) {
            break;
         }

         --var3;
      }

      return var4;
   }

   public boolean d(int var1) {
      boolean var5 = false;
      int var3 = this.d.length;
      int var2 = 0;

      boolean var4;
      while(true) {
         var4 = var5;
         if(var2 >= var3) {
            break;
         }

         if(this.b(var1, var2)) {
            var4 = true;
            break;
         }

         ++var2;
      }

      return var4;
   }

   public void e() {
      this.c = -1;
      this.g();
      if(this.l != null) {
         this.l.recycle();
         this.l = null;
      }

   }

   public void f() {
      this.e();
      if(this.a == 2) {
         int var1 = this.q.b();
         int var3 = this.q.c();
         this.q.g();
         int var2 = this.q.b();
         int var4 = this.q.c();
         this.r.a(this.s, var2, var4, var2 - var1, var4 - var3);
      }

      this.c(0);
   }
}

package com.puentenet.smandroid.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import com.puentenet.smandroid.widget.a;
import com.puentenet.smandroid.widget.b;
import com.puentenet.smandroid.widget.c;

public class RearrangeableListView extends ListView {
   final Rect a = new Rect();
   final Runnable b = new a(this);
   private int c = -1;
   private boolean d = false;
   private c e;
   private int f = 0;

   public RearrangeableListView(Context var1) {
      super(var1);
   }

   public RearrangeableListView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public RearrangeableListView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   // $FF: synthetic method
   static int a(RearrangeableListView var0) {
      return var0.f;
   }

   private void a() {
      View var1 = this.getChildAt(this.c - this.getFirstVisiblePosition());
      if(var1 instanceof b) {
         ((b)var1).a();
      }

      this.e.a();
      this.c = -1;
   }

   private void a(int var1) {
      this.c = var1;
      this.e.a(var1);
   }

   private boolean a(int var1, int var2) {
      int var3 = this.b(var1, var2);
      boolean var4;
      if(var3 >= 0) {
         View var6 = this.getChildAt(var3 - this.getFirstVisiblePosition());
         if(var6 instanceof b) {
            boolean var5 = ((b)var6).a(var1 - var6.getLeft(), var2 - var6.getTop());
            var4 = var5;
            if(var5) {
               this.a(var3);
               var4 = var5;
            }
         } else {
            this.a(var3);
            var4 = true;
         }
      } else {
         var4 = false;
      }

      return var4;
   }

   // $FF: synthetic method
   static boolean a(RearrangeableListView var0, int var1) {
      return var0.b(var1);
   }

   private int b(int var1, int var2) {
      Rect var5 = this.a;
      int var4 = this.getChildCount();
      int var3 = 0;

      while(true) {
         if(var3 >= var4) {
            var1 = -1;
            break;
         }

         this.getChildAt(var3).getHitRect(var5);
         if(var5.contains(var1, var2)) {
            var1 = var3 + this.getFirstVisiblePosition();
            break;
         }

         ++var3;
      }

      return var1;
   }

   // $FF: synthetic method
   static int b(RearrangeableListView var0) {
      return var0.c;
   }

   private boolean b(int var1) {
      boolean var2 = this.e.a(this.c, var1);
      if(var2) {
         this.c = var1;
      }

      return var2;
   }

   private void setAutoScroll(int var1) {
      if(this.f != var1) {
         if(this.f == 0) {
            this.f = var1;
            this.b.run();
         } else {
            this.f = var1;
            if(this.f == 0) {
               this.removeCallbacks(this.b);
            }
         }
      }

   }

   public c getRearrangeListener() {
      return this.e;
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2;
      if(this.e != null && this.d && (var1.getAction() & 255) == 0 && this.a((int)var1.getX(), (int)var1.getY())) {
         var2 = true;
      } else {
         var2 = super.onInterceptTouchEvent(var1);
      }

      return var2;
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var5 = true;
      boolean var4;
      if(this.e != null && this.d && this.c >= 0) {
         switch(var1.getAction() & 255) {
         case 1:
            this.a();
            this.setAutoScroll(0);
            var4 = var5;
            break;
         case 2:
            int var3 = (int)var1.getX();
            int var2 = (int)var1.getY();
            var3 = this.b(var3, var2);
            var4 = var5;
            if(var3 >= 0) {
               View var6 = this.getChildAt(this.c - this.getFirstVisiblePosition());
               if(var3 != this.c) {
                  this.b(var3);
                  var4 = var5;
               } else if(this.c == this.getFirstVisiblePosition() && var2 < var6.getHeight() / 2) {
                  this.setAutoScroll(-1);
                  var4 = var5;
               } else if(this.c == this.getLastVisiblePosition() && var2 > this.getHeight() - var6.getHeight() / 2) {
                  this.setAutoScroll(1);
                  var4 = var5;
               } else {
                  this.setAutoScroll(0);
                  var4 = var5;
               }
            }
            break;
         default:
            var4 = var5;
         }
      } else {
         var4 = super.onTouchEvent(var1);
      }

      return var4;
   }

   public void setRearrangeEnabled(boolean var1) {
      this.d = var1;
   }

   public void setRearrangeListener(c var1) {
      this.e = var1;
   }
}

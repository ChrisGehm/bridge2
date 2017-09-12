package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ae;
import android.support.v4.view.ah;
import android.support.v4.view.ai;
import android.support.v4.view.aj;
import android.support.v4.view.ak;
import android.support.v4.view.al;
import android.support.v4.view.by;
import android.support.v4.view.cc;
import android.support.v4.view.cd;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class PagerTitleStrip extends ViewGroup implements by {
   private static final int[] n = new int[]{16842804, 16842901, 16842904, 16842927};
   private static final int[] o = new int[]{16843660};
   private static final aj q;
   ViewPager a;
   TextView b;
   TextView c;
   TextView d;
   int e;
   private int f;
   private float g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private final ai l;
   private WeakReference m;
   private int p;

   static {
      if(VERSION.SDK_INT >= 14) {
         q = new al();
      } else {
         q = new ak();
      }

   }

   public PagerTitleStrip(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public PagerTitleStrip(Context var1, AttributeSet var2) {
      boolean var5 = false;
      super(var1, var2);
      this.f = -1;
      this.g = -1.0F;
      this.l = new ai(this, (ah)null);
      TextView var6 = new TextView(var1);
      this.b = var6;
      this.addView(var6);
      var6 = new TextView(var1);
      this.c = var6;
      this.addView(var6);
      var6 = new TextView(var1);
      this.d = var6;
      this.addView(var6);
      TypedArray var7 = var1.obtainStyledAttributes(var2, n);
      int var3 = var7.getResourceId(0, 0);
      if(var3 != 0) {
         this.b.setTextAppearance(var1, var3);
         this.c.setTextAppearance(var1, var3);
         this.d.setTextAppearance(var1, var3);
      }

      int var4 = var7.getDimensionPixelSize(1, 0);
      if(var4 != 0) {
         this.a(0, (float)var4);
      }

      if(var7.hasValue(2)) {
         var4 = var7.getColor(2, 0);
         this.b.setTextColor(var4);
         this.c.setTextColor(var4);
         this.d.setTextColor(var4);
      }

      this.i = var7.getInteger(3, 80);
      var7.recycle();
      this.e = this.c.getTextColors().getDefaultColor();
      this.setNonPrimaryAlpha(0.6F);
      this.b.setEllipsize(TruncateAt.END);
      this.c.setEllipsize(TruncateAt.END);
      this.d.setEllipsize(TruncateAt.END);
      if(var3 != 0) {
         var7 = var1.obtainStyledAttributes(var3, o);
         var5 = var7.getBoolean(0, false);
         var7.recycle();
      }

      if(var5) {
         setSingleLineAllCaps(this.b);
         setSingleLineAllCaps(this.c);
         setSingleLineAllCaps(this.d);
      } else {
         this.b.setSingleLine();
         this.c.setSingleLine();
         this.d.setSingleLine();
      }

      this.h = (int)(var1.getResources().getDisplayMetrics().density * 16.0F);
   }

   // $FF: synthetic method
   static float a(PagerTitleStrip var0) {
      return var0.g;
   }

   private static void setSingleLineAllCaps(TextView var0) {
      q.a(var0);
   }

   public void a(int var1, float var2) {
      this.b.setTextSize(var1, var2);
      this.c.setTextSize(var1, var2);
      this.d.setTextSize(var1, var2);
   }

   void a(int var1, float var2, boolean var3) {
      if(var1 != this.f) {
         this.a(var1, this.a.getAdapter());
      } else if(!var3 && var2 == this.g) {
         return;
      }

      this.k = true;
      int var9 = this.b.getMeasuredWidth();
      int var14 = this.c.getMeasuredWidth();
      int var8 = this.d.getMeasuredWidth();
      int var15 = var14 / 2;
      int var11 = this.getWidth();
      int var6 = this.getHeight();
      int var12 = this.getPaddingLeft();
      int var10 = this.getPaddingRight();
      var1 = this.getPaddingTop();
      int var7 = this.getPaddingBottom();
      int var13 = var10 + var15;
      float var5 = 0.5F + var2;
      float var4 = var5;
      if(var5 > 1.0F) {
         var4 = var5 - 1.0F;
      }

      var13 = var11 - var13 - (int)(var4 * (float)(var11 - (var12 + var15) - var13)) - var14 / 2;
      var14 += var13;
      int var17 = this.b.getBaseline();
      int var16 = this.c.getBaseline();
      var15 = this.d.getBaseline();
      int var18 = Math.max(Math.max(var17, var16), var15);
      var17 = var18 - var17;
      var16 = var18 - var16;
      var15 = var18 - var15;
      int var19 = this.b.getMeasuredHeight();
      int var20 = this.c.getMeasuredHeight();
      var18 = this.d.getMeasuredHeight();
      var18 = Math.max(Math.max(var19 + var17, var20 + var16), var18 + var15);
      switch(this.i & 112) {
      case 16:
         var1 = (var6 - var1 - var7 - var18) / 2;
         var6 = var1 + var17;
         var7 = var16 + var1;
         var1 += var15;
         break;
      case 80:
         var1 = var6 - var7 - var18;
         var6 = var1 + var17;
         var7 = var16 + var1;
         var1 += var15;
         break;
      default:
         var6 = var1 + var17;
         var7 = var16 + var1;
         var1 += var15;
      }

      this.c.layout(var13, var7, var14, this.c.getMeasuredHeight() + var7);
      var7 = Math.min(var12, var13 - this.h - var9);
      this.b.layout(var7, var6, var9 + var7, this.b.getMeasuredHeight() + var6);
      var6 = Math.max(var11 - var10 - var8, this.h + var14);
      this.d.layout(var6, var1, var6 + var8, this.d.getMeasuredHeight() + var1);
      this.g = var2;
      this.k = false;
   }

   void a(int var1, ae var2) {
      Object var10 = null;
      int var3;
      if(var2 != null) {
         var3 = var2.b();
      } else {
         var3 = 0;
      }

      this.j = true;
      CharSequence var9;
      if(var1 >= 1 && var2 != null) {
         var9 = var2.c(var1 - 1);
      } else {
         var9 = null;
      }

      this.b.setText(var9);
      TextView var11 = this.c;
      if(var2 != null && var1 < var3) {
         var9 = var2.c(var1);
      } else {
         var9 = null;
      }

      var11.setText(var9);
      var9 = (CharSequence)var10;
      if(var1 + 1 < var3) {
         var9 = (CharSequence)var10;
         if(var2 != null) {
            var9 = var2.c(var1 + 1);
         }
      }

      this.d.setText(var9);
      int var6 = this.getWidth();
      int var8 = this.getPaddingLeft();
      int var7 = this.getPaddingRight();
      int var5 = this.getHeight();
      int var4 = this.getPaddingTop();
      var3 = this.getPaddingBottom();
      var6 = MeasureSpec.makeMeasureSpec((int)((float)(var6 - var8 - var7) * 0.8F), Integer.MIN_VALUE);
      var3 = MeasureSpec.makeMeasureSpec(var5 - var4 - var3, Integer.MIN_VALUE);
      this.b.measure(var6, var3);
      this.c.measure(var6, var3);
      this.d.measure(var6, var3);
      this.f = var1;
      if(!this.k) {
         this.a(var1, this.g, false);
      }

      this.j = false;
   }

   void a(ae var1, ae var2) {
      if(var1 != null) {
         var1.b((DataSetObserver)this.l);
         this.m = null;
      }

      if(var2 != null) {
         var2.a((DataSetObserver)this.l);
         this.m = new WeakReference(var2);
      }

      if(this.a != null) {
         this.f = -1;
         this.g = -1.0F;
         this.a(this.a.getCurrentItem(), var2);
         this.requestLayout();
      }

   }

   int getMinHeight() {
      int var1 = 0;
      Drawable var2 = this.getBackground();
      if(var2 != null) {
         var1 = var2.getIntrinsicHeight();
      }

      return var1;
   }

   public int getTextSpacing() {
      return this.h;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      ViewParent var1 = this.getParent();
      if(!(var1 instanceof ViewPager)) {
         throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
      } else {
         ViewPager var3 = (ViewPager)var1;
         ae var2 = var3.getAdapter();
         var3.a((cd)this.l);
         var3.setOnAdapterChangeListener(this.l);
         this.a = var3;
         ae var4;
         if(this.m != null) {
            var4 = (ae)this.m.get();
         } else {
            var4 = null;
         }

         this.a(var4, var2);
      }
   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      if(this.a != null) {
         this.a(this.a.getAdapter(), (ae)null);
         this.a.a((cd)null);
         this.a.setOnAdapterChangeListener((cc)null);
         this.a = null;
      }

   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      float var6 = 0.0F;
      if(this.a != null) {
         if(this.g >= 0.0F) {
            var6 = this.g;
         }

         this.a(this.f, var6, true);
      }

   }

   protected void onMeasure(int var1, int var2) {
      int var4 = MeasureSpec.getMode(var1);
      int var3 = MeasureSpec.getMode(var2);
      var1 = MeasureSpec.getSize(var1);
      var2 = MeasureSpec.getSize(var2);
      if(var4 != 1073741824) {
         throw new IllegalStateException("Must measure with an exact width");
      } else {
         int var5 = this.getMinHeight();
         int var7 = this.getPaddingTop() + this.getPaddingBottom();
         var4 = MeasureSpec.makeMeasureSpec((int)((float)var1 * 0.8F), Integer.MIN_VALUE);
         int var6 = MeasureSpec.makeMeasureSpec(var2 - var7, Integer.MIN_VALUE);
         this.b.measure(var4, var6);
         this.c.measure(var4, var6);
         this.d.measure(var4, var6);
         if(var3 == 1073741824) {
            this.setMeasuredDimension(var1, var2);
         } else {
            this.setMeasuredDimension(var1, Math.max(var5, this.c.getMeasuredHeight() + var7));
         }

      }
   }

   public void requestLayout() {
      if(!this.j) {
         super.requestLayout();
      }

   }

   public void setGravity(int var1) {
      this.i = var1;
      this.requestLayout();
   }

   public void setNonPrimaryAlpha(float var1) {
      this.p = (int)(255.0F * var1) & 255;
      int var2 = this.p << 24 | this.e & 16777215;
      this.b.setTextColor(var2);
      this.d.setTextColor(var2);
   }

   public void setTextColor(int var1) {
      this.e = var1;
      this.c.setTextColor(var1);
      var1 = this.p << 24 | this.e & 16777215;
      this.b.setTextColor(var1);
      this.d.setTextColor(var1);
   }

   public void setTextSpacing(int var1) {
      this.h = var1;
      this.requestLayout();
   }
}

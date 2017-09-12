package android.support.v4.widget;

import android.content.Context;
import android.support.v4.widget.b;
import android.support.v4.widget.c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {
   private long a;
   private boolean b;
   private boolean c;
   private boolean d;
   private final Runnable e;
   private final Runnable f;

   public ContentLoadingProgressBar(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ContentLoadingProgressBar(Context var1, AttributeSet var2) {
      super(var1, var2, 0);
      this.a = -1L;
      this.b = false;
      this.c = false;
      this.d = false;
      this.e = new b(this);
      this.f = new c(this);
   }

   // $FF: synthetic method
   static long a(ContentLoadingProgressBar var0, long var1) {
      var0.a = var1;
      return var1;
   }

   private void a() {
      this.removeCallbacks(this.e);
      this.removeCallbacks(this.f);
   }

   // $FF: synthetic method
   static boolean a(ContentLoadingProgressBar var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static boolean a(ContentLoadingProgressBar var0, boolean var1) {
      var0.b = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b(ContentLoadingProgressBar var0, boolean var1) {
      var0.c = var1;
      return var1;
   }

   public void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.a();
   }

   public void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.a();
   }
}

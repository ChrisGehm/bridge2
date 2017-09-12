package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.a.b;
import android.support.v4.view.a.c;
import android.support.v4.view.a.d;
import android.support.v4.view.a.e;
import android.support.v4.view.a.f;
import android.support.v4.view.a.g;
import android.view.View;

public class a {
   private static final c a;
   private final Object b;

   static {
      if(VERSION.SDK_INT >= 19) {
         a = new f();
      } else if(VERSION.SDK_INT >= 18) {
         a = new e();
      } else if(VERSION.SDK_INT >= 16) {
         a = new d();
      } else if(VERSION.SDK_INT >= 14) {
         a = new b();
      } else {
         a = new g();
      }

   }

   public a(Object var1) {
      this.b = var1;
   }

   public static a a(a var0) {
      return a(a.a(var0.b));
   }

   static a a(Object var0) {
      a var1;
      if(var0 != null) {
         var1 = new a(var0);
      } else {
         var1 = null;
      }

      return var1;
   }

   private static String c(int var0) {
      String var1;
      switch(var0) {
      case 1:
         var1 = "ACTION_FOCUS";
         break;
      case 2:
         var1 = "ACTION_CLEAR_FOCUS";
         break;
      case 4:
         var1 = "ACTION_SELECT";
         break;
      case 8:
         var1 = "ACTION_CLEAR_SELECTION";
         break;
      case 16:
         var1 = "ACTION_CLICK";
         break;
      case 32:
         var1 = "ACTION_LONG_CLICK";
         break;
      case 64:
         var1 = "ACTION_ACCESSIBILITY_FOCUS";
         break;
      case 128:
         var1 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
         break;
      case 256:
         var1 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
         break;
      case 512:
         var1 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
         break;
      case 1024:
         var1 = "ACTION_NEXT_HTML_ELEMENT";
         break;
      case 2048:
         var1 = "ACTION_PREVIOUS_HTML_ELEMENT";
         break;
      case 4096:
         var1 = "ACTION_SCROLL_FORWARD";
         break;
      case 8192:
         var1 = "ACTION_SCROLL_BACKWARD";
         break;
      case 16384:
         var1 = "ACTION_COPY";
         break;
      case 32768:
         var1 = "ACTION_PASTE";
         break;
      case 65536:
         var1 = "ACTION_CUT";
         break;
      case 131072:
         var1 = "ACTION_SET_SELECTION";
         break;
      default:
         var1 = "ACTION_UNKNOWN";
      }

      return var1;
   }

   public Object a() {
      return this.b;
   }

   public void a(int var1) {
      a.a(this.b, var1);
   }

   public void a(Rect var1) {
      a.a(this.b, var1);
   }

   public void a(View var1) {
      a.c(this.b, var1);
   }

   public void a(CharSequence var1) {
      a.c(this.b, var1);
   }

   public void a(boolean var1) {
      a.c(this.b, var1);
   }

   public int b() {
      return a.b(this.b);
   }

   public void b(int var1) {
      a.b(this.b, var1);
   }

   public void b(Rect var1) {
      a.c(this.b, var1);
   }

   public void b(View var1) {
      a.a(this.b, var1);
   }

   public void b(CharSequence var1) {
      a.a(this.b, var1);
   }

   public void b(boolean var1) {
      a.d(this.b, var1);
   }

   public int c() {
      return a.r(this.b);
   }

   public void c(Rect var1) {
      a.b(this.b, var1);
   }

   public void c(View var1) {
      a.b(this.b, var1);
   }

   public void c(CharSequence var1) {
      a.b(this.b, var1);
   }

   public void c(boolean var1) {
      a.h(this.b, var1);
   }

   public void d(Rect var1) {
      a.d(this.b, var1);
   }

   public void d(boolean var1) {
      a.i(this.b, var1);
   }

   public boolean d() {
      return a.g(this.b);
   }

   public void e(boolean var1) {
      a.g(this.b, var1);
   }

   public boolean e() {
      return a.h(this.b);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if(this != var1) {
         if(var1 == null) {
            var2 = false;
         } else if(this.getClass() != var1.getClass()) {
            var2 = false;
         } else {
            a var3 = (a)var1;
            if(this.b == null) {
               if(var3.b != null) {
                  var2 = false;
               }
            } else if(!this.b.equals(var3.b)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public void f(boolean var1) {
      a.a(this.b, var1);
   }

   public boolean f() {
      return a.k(this.b);
   }

   public void g(boolean var1) {
      a.e(this.b, var1);
   }

   public boolean g() {
      return a.l(this.b);
   }

   public void h(boolean var1) {
      a.b(this.b, var1);
   }

   public boolean h() {
      return a.s(this.b);
   }

   public int hashCode() {
      int var1;
      if(this.b == null) {
         var1 = 0;
      } else {
         var1 = this.b.hashCode();
      }

      return var1;
   }

   public void i(boolean var1) {
      a.f(this.b, var1);
   }

   public boolean i() {
      return a.t(this.b);
   }

   public boolean j() {
      return a.p(this.b);
   }

   public boolean k() {
      return a.i(this.b);
   }

   public boolean l() {
      return a.m(this.b);
   }

   public boolean m() {
      return a.j(this.b);
   }

   public boolean n() {
      return a.n(this.b);
   }

   public boolean o() {
      return a.o(this.b);
   }

   public CharSequence p() {
      return a.e(this.b);
   }

   public CharSequence q() {
      return a.c(this.b);
   }

   public CharSequence r() {
      return a.f(this.b);
   }

   public CharSequence s() {
      return a.d(this.b);
   }

   public void t() {
      a.q(this.b);
   }

   public String toString() {
      StringBuilder var5 = new StringBuilder();
      var5.append(super.toString());
      Rect var4 = new Rect();
      this.a(var4);
      var5.append("; boundsInParent: " + var4);
      this.c(var4);
      var5.append("; boundsInScreen: " + var4);
      var5.append("; packageName: ").append(this.p());
      var5.append("; className: ").append(this.q());
      var5.append("; text: ").append(this.r());
      var5.append("; contentDescription: ").append(this.s());
      var5.append("; viewId: ").append(this.u());
      var5.append("; checkable: ").append(this.d());
      var5.append("; checked: ").append(this.e());
      var5.append("; focusable: ").append(this.f());
      var5.append("; focused: ").append(this.g());
      var5.append("; selected: ").append(this.j());
      var5.append("; clickable: ").append(this.k());
      var5.append("; longClickable: ").append(this.l());
      var5.append("; enabled: ").append(this.m());
      var5.append("; password: ").append(this.n());
      var5.append("; scrollable: " + this.o());
      var5.append("; [");
      int var1 = this.b();

      while(var1 != 0) {
         int var3 = 1 << Integer.numberOfTrailingZeros(var1);
         int var2 = var1 & ~var3;
         var5.append(c(var3));
         var1 = var2;
         if(var2 != 0) {
            var5.append(", ");
            var1 = var2;
         }
      }

      var5.append("]");
      return var5.toString();
   }

   public String u() {
      return a.u(this.b);
   }
}

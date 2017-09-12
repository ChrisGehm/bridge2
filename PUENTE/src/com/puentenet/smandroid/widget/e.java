package com.puentenet.smandroid.widget;

import com.puentenet.smandroid.widget.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class e {
   // $FF: synthetic field
   final d a;
   private Object b;
   private List c;

   private e(d var1, Object var2) {
      this.a = var1;
      this.b = var2;
      this.c = new ArrayList();
   }

   // $FF: synthetic method
   e(d var1, Object var2, e var3) {
      this(var1, var2);
   }

   private Object a() {
      return this.b;
   }

   // $FF: synthetic method
   static List a(e var0) {
      return var0.b();
   }

   // $FF: synthetic method
   static void a(e var0, Collection var1) {
      var0.a(var1);
   }

   private void a(Collection var1) {
      this.c.addAll(var1);
   }

   // $FF: synthetic method
   static Object b(e var0) {
      return var0.a();
   }

   private List b() {
      return this.c;
   }
}

package android.support.v4.view.a;

import android.os.Bundle;
import android.os.Build.VERSION;
import android.support.v4.view.a.a;
import android.support.v4.view.a.l;
import android.support.v4.view.a.m;
import android.support.v4.view.a.o;
import android.support.v4.view.a.q;
import java.util.List;

public class k {
   private static final l a;
   private final Object b;

   static {
      if(VERSION.SDK_INT >= 19) {
         a = new o();
      } else if(VERSION.SDK_INT >= 16) {
         a = new m();
      } else {
         a = new q();
      }

   }

   public k() {
      this.b = a.a(this);
   }

   public k(Object var1) {
      this.b = var1;
   }

   public a a(int var1) {
      return null;
   }

   public Object a() {
      return this.b;
   }

   public List a(String var1, int var2) {
      return null;
   }

   public boolean a(int var1, int var2, Bundle var3) {
      return false;
   }

   public a b(int var1) {
      return null;
   }
}

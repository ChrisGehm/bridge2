package android.support.v4.b;

import android.support.v4.b.h;
import android.support.v4.b.i;
import android.support.v4.b.k;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class f {
   h b;
   i c;
   k d;

   public static boolean a(Map var0, Collection var1) {
      Iterator var3 = var1.iterator();

      boolean var2;
      while(true) {
         if(var3.hasNext()) {
            if(var0.containsKey(var3.next())) {
               continue;
            }

            var2 = false;
            break;
         }

         var2 = true;
         break;
      }

      return var2;
   }

   public static boolean a(Set var0, Object var1) {
      boolean var3 = true;
      boolean var4 = false;
      boolean var2;
      if(var0 == var1) {
         var2 = true;
      } else {
         var2 = var4;
         if(var1 instanceof Set) {
            Set var7 = (Set)var1;

            label26: {
               try {
                  if(var0.size() != var7.size()) {
                     break label26;
                  }

                  var2 = var0.containsAll(var7);
               } catch (NullPointerException var5) {
                  var2 = var4;
                  return var2;
               } catch (ClassCastException var6) {
                  var2 = var4;
                  return var2;
               }

               if(var2) {
                  var2 = var3;
                  return var2;
               }
            }

            var2 = false;
         }
      }

      return var2;
   }

   public static boolean b(Map var0, Collection var1) {
      int var2 = var0.size();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         var0.remove(var4.next());
      }

      boolean var3;
      if(var2 != var0.size()) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public static boolean c(Map var0, Collection var1) {
      int var2 = var0.size();
      Iterator var4 = var0.keySet().iterator();

      while(var4.hasNext()) {
         if(!var1.contains(var4.next())) {
            var4.remove();
         }
      }

      boolean var3;
      if(var2 != var0.size()) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   protected abstract int a();

   protected abstract int a(Object var1);

   protected abstract Object a(int var1, int var2);

   protected abstract Object a(int var1, Object var2);

   protected abstract void a(int var1);

   protected abstract void a(Object var1, Object var2);

   public Object[] a(Object[] var1, int var2) {
      int var4 = this.a();
      if(var1.length < var4) {
         var1 = (Object[])((Object[])Array.newInstance(var1.getClass().getComponentType(), var4));
      }

      for(int var3 = 0; var3 < var4; ++var3) {
         var1[var3] = this.a(var3, var2);
      }

      if(var1.length > var4) {
         var1[var4] = null;
      }

      return var1;
   }

   protected abstract int b(Object var1);

   protected abstract Map b();

   public Object[] b(int var1) {
      int var3 = this.a();
      Object[] var4 = new Object[var3];

      for(int var2 = 0; var2 < var3; ++var2) {
         var4[var2] = this.a(var2, var1);
      }

      return var4;
   }

   protected abstract void c();

   public Set d() {
      if(this.b == null) {
         this.b = new h(this);
      }

      return this.b;
   }

   public Set e() {
      if(this.c == null) {
         this.c = new i(this);
      }

      return this.c;
   }

   public Collection f() {
      if(this.d == null) {
         this.d = new k(this);
      }

      return this.d;
   }
}

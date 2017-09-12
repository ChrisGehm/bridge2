package android.support.v4.b;

import android.support.v4.b.f;
import android.support.v4.b.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class i implements Set {
   // $FF: synthetic field
   final f a;

   i(f var1) {
      this.a = var1;
   }

   public boolean add(Object var1) {
      throw new UnsupportedOperationException();
   }

   public boolean addAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public void clear() {
      this.a.c();
   }

   public boolean contains(Object var1) {
      boolean var2;
      if(this.a.a(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean containsAll(Collection var1) {
      return f.a(this.a.b(), var1);
   }

   public boolean equals(Object var1) {
      return f.a((Set)this, (Object)var1);
   }

   public int hashCode() {
      int var1 = this.a.a() - 1;

      int var2;
      for(var2 = 0; var1 >= 0; --var1) {
         Object var4 = this.a.a(var1, 0);
         int var3;
         if(var4 == null) {
            var3 = 0;
         } else {
            var3 = var4.hashCode();
         }

         var2 += var3;
      }

      return var2;
   }

   public boolean isEmpty() {
      boolean var1;
      if(this.a.a() == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public Iterator iterator() {
      return new g(this.a, 0);
   }

   public boolean remove(Object var1) {
      int var2 = this.a.a(var1);
      boolean var3;
      if(var2 >= 0) {
         this.a.a(var2);
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public boolean removeAll(Collection var1) {
      return f.b(this.a.b(), var1);
   }

   public boolean retainAll(Collection var1) {
      return f.c(this.a.b(), var1);
   }

   public int size() {
      return this.a.a();
   }

   public Object[] toArray() {
      return this.a.b(0);
   }

   public Object[] toArray(Object[] var1) {
      return this.a.a(var1, 0);
   }
}

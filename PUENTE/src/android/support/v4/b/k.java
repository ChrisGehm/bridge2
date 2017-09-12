package android.support.v4.b;

import android.support.v4.b.f;
import android.support.v4.b.g;
import java.util.Collection;
import java.util.Iterator;

final class k implements Collection {
   // $FF: synthetic field
   final f a;

   k(f var1) {
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
      if(this.a.b(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean containsAll(Collection var1) {
      Iterator var3 = var1.iterator();

      boolean var2;
      while(true) {
         if(var3.hasNext()) {
            if(this.contains(var3.next())) {
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
      return new g(this.a, 1);
   }

   public boolean remove(Object var1) {
      int var2 = this.a.b(var1);
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
      int var2 = 0;
      int var4 = this.a.a();

      int var3;
      boolean var6;
      for(var6 = false; var2 < var4; var4 = var3) {
         int var5 = var2;
         var3 = var4;
         if(var1.contains(this.a.a(var2, 1))) {
            this.a.a(var2);
            var5 = var2 - 1;
            var3 = var4 - 1;
            var6 = true;
         }

         var2 = var5 + 1;
      }

      return var6;
   }

   public boolean retainAll(Collection var1) {
      int var2 = 0;
      int var4 = this.a.a();

      int var3;
      boolean var6;
      for(var6 = false; var2 < var4; var4 = var3) {
         int var5 = var2;
         var3 = var4;
         if(!var1.contains(this.a.a(var2, 1))) {
            this.a.a(var2);
            var5 = var2 - 1;
            var3 = var4 - 1;
            var6 = true;
         }

         var2 = var5 + 1;
      }

      return var6;
   }

   public int size() {
      return this.a.a();
   }

   public Object[] toArray() {
      return this.a.b(1);
   }

   public Object[] toArray(Object[] var1) {
      return this.a.a(var1, 1);
   }
}

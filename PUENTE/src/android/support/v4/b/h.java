package android.support.v4.b;

import android.support.v4.b.c;
import android.support.v4.b.f;
import android.support.v4.b.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

final class h implements Set {
   // $FF: synthetic field
   final f a;

   h(f var1) {
      this.a = var1;
   }

   public boolean a(Entry var1) {
      throw new UnsupportedOperationException();
   }

   // $FF: synthetic method
   public boolean add(Object var1) {
      return this.a((Entry)var1);
   }

   public boolean addAll(Collection var1) {
      int var2 = this.a.a();
      Iterator var5 = var1.iterator();

      while(var5.hasNext()) {
         Entry var4 = (Entry)var5.next();
         this.a.a(var4.getKey(), var4.getValue());
      }

      boolean var3;
      if(var2 != this.a.a()) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public void clear() {
      this.a.c();
   }

   public boolean contains(Object var1) {
      boolean var3 = false;
      if(var1 instanceof Entry) {
         Entry var4 = (Entry)var1;
         int var2 = this.a.a(var4.getKey());
         if(var2 >= 0) {
            var3 = c.a(this.a.a(var2, 1), var4.getValue());
         }
      }

      return var3;
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

   public boolean equals(Object var1) {
      return f.a((Set)this, (Object)var1);
   }

   public int hashCode() {
      int var2 = this.a.a() - 1;

      int var1;
      int var3;
      int var4;
      for(var1 = 0; var2 >= 0; var1 += var4 ^ var3) {
         Object var5 = this.a.a(var2, 0);
         Object var6 = this.a.a(var2, 1);
         if(var5 == null) {
            var3 = 0;
         } else {
            var3 = var5.hashCode();
         }

         if(var6 == null) {
            var4 = 0;
         } else {
            var4 = var6.hashCode();
         }

         --var2;
      }

      return var1;
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
      return new j(this.a);
   }

   public boolean remove(Object var1) {
      throw new UnsupportedOperationException();
   }

   public boolean removeAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public boolean retainAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public int size() {
      return this.a.a();
   }

   public Object[] toArray() {
      throw new UnsupportedOperationException();
   }

   public Object[] toArray(Object[] var1) {
      throw new UnsupportedOperationException();
   }
}

package android.support.v4.b;

import android.support.v4.b.c;
import android.support.v4.b.f;
import java.util.Iterator;
import java.util.Map.Entry;

final class j implements Iterator, Entry {
   int a;
   int b;
   boolean c;
   // $FF: synthetic field
   final f d;

   j(f var1) {
      this.d = var1;
      this.c = false;
      this.a = var1.a() - 1;
      this.b = -1;
   }

   public Entry a() {
      ++this.b;
      this.c = true;
      return this;
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      boolean var3 = false;
      if(!this.c) {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      } else {
         if(!(var1 instanceof Entry)) {
            var2 = var3;
         } else {
            Entry var4 = (Entry)var1;
            if(!c.a(var4.getKey(), this.d.a(this.b, 0)) || !c.a(var4.getValue(), this.d.a(this.b, 1))) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public Object getKey() {
      if(!this.c) {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      } else {
         return this.d.a(this.b, 0);
      }
   }

   public Object getValue() {
      if(!this.c) {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      } else {
         return this.d.a(this.b, 1);
      }
   }

   public boolean hasNext() {
      boolean var1;
      if(this.b < this.a) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final int hashCode() {
      int var2 = 0;
      if(!this.c) {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      } else {
         Object var4 = this.d.a(this.b, 0);
         Object var3 = this.d.a(this.b, 1);
         int var1;
         if(var4 == null) {
            var1 = 0;
         } else {
            var1 = var4.hashCode();
         }

         if(var3 != null) {
            var2 = var3.hashCode();
         }

         return var2 ^ var1;
      }
   }

   // $FF: synthetic method
   public Object next() {
      return this.a();
   }

   public void remove() {
      if(!this.c) {
         throw new IllegalStateException();
      } else {
         this.d.a(this.b);
         --this.b;
         --this.a;
         this.c = false;
      }
   }

   public Object setValue(Object var1) {
      if(!this.c) {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      } else {
         return this.d.a(this.b, var1);
      }
   }

   public final String toString() {
      return this.getKey() + "=" + this.getValue();
   }
}

package android.support.v4.b;

import android.support.v4.b.f;
import java.util.Iterator;

final class g implements Iterator {
   final int a;
   int b;
   int c;
   boolean d;
   // $FF: synthetic field
   final f e;

   g(f var1, int var2) {
      this.e = var1;
      this.d = false;
      this.a = var2;
      this.b = var1.a();
   }

   public boolean hasNext() {
      boolean var1;
      if(this.c < this.b) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public Object next() {
      Object var1 = this.e.a(this.c, this.a);
      ++this.c;
      this.d = true;
      return var1;
   }

   public void remove() {
      if(!this.d) {
         throw new IllegalStateException();
      } else {
         --this.c;
         --this.b;
         this.d = false;
         this.e.a(this.c);
      }
   }
}

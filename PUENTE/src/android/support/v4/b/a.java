package android.support.v4.b;

import android.support.v4.b.b;
import android.support.v4.b.f;
import android.support.v4.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class a extends l implements Map {
   f a;

   private f b() {
      if(this.a == null) {
         this.a = new b(this);
      }

      return this.a;
   }

   public Set entrySet() {
      return this.b().d();
   }

   public Set keySet() {
      return this.b().e();
   }

   public void putAll(Map var1) {
      this.a(this.h + var1.size());
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         this.put(var3.getKey(), var3.getValue());
      }

   }

   public Collection values() {
      return this.b().f();
   }
}

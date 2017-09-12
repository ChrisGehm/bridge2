package com.puentenet.smandroid.widget.tab;

import java.util.HashMap;
import java.util.Map;

public abstract class e {
   private Map a = new HashMap();
   private Map b = new HashMap();

   protected int a(Object var1) {
      return ((Integer)this.b.get(var1)).intValue();
   }

   protected abstract void a(int var1, int var2);

   public void a(int var1, Object var2) {
      this.a.put(Integer.valueOf(var1), var2);
      this.b.put(var2, Integer.valueOf(var1));
   }

   public void b(int var1, int var2) {
      if(!this.a.containsKey(Integer.valueOf(var2))) {
         throw new IllegalArgumentException("No tab with id " + var2 + " found.");
      } else {
         this.a(var1, var2);
      }
   }

   public Object c(int var1) {
      return this.a.get(Integer.valueOf(var1));
   }
}

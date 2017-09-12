package com.puentenet.a.e;

import com.puentenet.a.c.k;
import java.util.Hashtable;
import java.util.Vector;

public class e {
   public static final String[] a = new String[]{"MERVAL", "DOW JONES", "BOVESPA", "IBEX", "FTSE100"};
   private String b;
   private Hashtable c;
   private Vector d;
   private boolean e = true;

   public e() {
      this.b = "Puente";
      this.c = new Hashtable();
      this.d = new Vector();

      for(int var1 = 0; var1 < a.length; ++var1) {
         this.d.addElement(a[var1]);
      }

   }

   public e(String var1) {
      this.b = var1;
      this.c = new Hashtable();
      this.d = new Vector();
   }

   public e(String var1, Vector var2) {
      this.b = var1;
      this.d = var2;
      this.c = new Hashtable();
   }

   public Vector a() {
      return this.d;
   }

   public void a(Vector var1) {
      this.d = var1;
   }

   public boolean a(String var1) {
      boolean var2;
      if(this.d.contains(var1)) {
         var2 = false;
      } else {
         this.d.addElement(var1);
         var2 = true;
      }

      return var2;
   }

   public String b() {
      return this.b;
   }

   public void b(String var1) {
      this.d.removeElement(var1);
      this.c.remove(var1);
   }

   public void b(Vector var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         k var3 = (k)var1.elementAt(var2);
         this.c.put(var3.a(), var3);
      }

   }

   public k c(String var1) {
      return (k)this.c.get(var1);
   }

   public void d(String var1) {
      this.b = var1;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if(this != var1) {
         if(var1 == null) {
            var2 = false;
         } else if(this.getClass() != var1.getClass()) {
            var2 = false;
         } else {
            e var3 = (e)var1;
            if(this.b == null) {
               if(var3.b != null) {
                  var2 = false;
               }
            } else if(!this.b.equals(var3.b)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public int hashCode() {
      int var1;
      if(this.b == null) {
         var1 = 0;
      } else {
         var1 = this.b.hashCode();
      }

      return var1 + 31;
   }

   public String toString() {
      return this.b;
   }
}

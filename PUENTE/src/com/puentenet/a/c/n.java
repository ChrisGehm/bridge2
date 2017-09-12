package com.puentenet.a.c;

import com.puentenet.a.c.m;
import java.util.Hashtable;
import java.util.Vector;

public class n {
   private static String[] a = new String[]{"Monedas", "Bonos", "Lebacs", "FCIs", "Cheques", "Obligaciones Negociables", "Fideicomisos Financieros", "Acciones", "Acciones Extranjeras", "ETFs", "Opciones", "Pases", "Valores a Acreditar", "Cauciones", "Futuros"};
   private Hashtable b = new Hashtable();

   public n(com.puentenet.b.d.a.a var1) {
      for(int var2 = 0; var2 < var1.a(); ++var2) {
         m var5 = new m(var1.b(var2));
         Vector var4 = (Vector)this.b.get(var5.b());
         Vector var3 = var4;
         if(var4 == null) {
            var3 = new Vector();
            this.b.put(var5.b(), var3);
         }

         var3.addElement(var5);
      }

   }

   public Hashtable a() {
      return this.b;
   }

   public String[] b() {
      return a;
   }
}

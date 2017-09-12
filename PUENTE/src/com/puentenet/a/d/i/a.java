package com.puentenet.a.d.i;

import com.puentenet.a.d.i.b;
import java.util.Hashtable;
import java.util.Vector;

public class a {
   private Hashtable a;
   private Vector b;

   public a(Vector var1) {
      this.b = var1;
      this.a = new Hashtable();

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         b var8 = (b)var1.elementAt(var2);
         String[] var6 = this.a(var8);

         for(int var3 = 0; var3 < var6.length; ++var3) {
            String var7 = var6[var3];
            Vector var5 = (Vector)this.a.get(var7);
            Vector var4 = var5;
            if(var5 == null) {
               var4 = new Vector();
               this.a.put(var7, var4);
            }

            var4.addElement(var8);
         }
      }

   }

   private String[] a(b var1) {
      String var2;
      String[] var3;
      if(var1.b().equals("ACCION")) {
         var2 = var1.c();
         if(var2.substring(var2.length() - 4, var2.length()).equals("BCBA")) {
            var3 = new String[]{"Acciones", "Opciones"};
         } else {
            var3 = new String[]{"Acciones Ext."};
         }
      } else if(var1.b().equals("BONO")) {
         var2 = var1.c();
         if(var2.substring(var2.length() - 4, var2.length()).equals("BCBA")) {
            var3 = new String[]{"Bonos", "Opciones"};
         } else {
            var3 = new String[]{"Bonos"};
         }
      } else if(var1.b().equals("ETF")) {
         var3 = new String[]{"ETFs"};
      } else {
         var3 = new String[0];
      }

      return var3;
   }

   public Vector a(String var1) {
      return (Vector)this.a.get(var1);
   }
}

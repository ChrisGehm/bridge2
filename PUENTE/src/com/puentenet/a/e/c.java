package com.puentenet.a.e;

import com.puentenet.a.e.a;
import java.util.Hashtable;
import java.util.Vector;

public class c {
   private static Hashtable a = new Hashtable();
   private static Hashtable b = new Hashtable();

   private static Integer a(int var0) {
      switch(var0) {
      case 0:
      case 1:
         return new Integer(var0);
      default:
         throw new RuntimeException("Change type " + var0 + " not supported");
      }
   }

   public static void a(int var0, Object var1) {
      Integer var2 = a(var0);
      Vector var3 = (Vector)b.get(var2);
      if(var3 != null) {
         for(var0 = 0; var0 < var3.size(); ++var0) {
            ((a)a.get(var3.elementAt(var0))).a(var1);
         }
      }

   }
}

package com.puentenet.b.e;

import java.util.Calendar;
import java.util.Date;

public class b {
   private static String a = "day";
   private static String b = "hour";
   private static String c = "minute";
   private static String d = "second";

   public static String a(int var0) {
      String var1 = null;
      switch(var0) {
      case 0:
         var1 = "Ene";
         break;
      case 1:
         var1 = "Feb";
         break;
      case 2:
         var1 = "Mar";
         break;
      case 3:
         var1 = "Abr";
         break;
      case 4:
         var1 = "May";
         break;
      case 5:
         var1 = "Jun";
         break;
      case 6:
         var1 = "Jul";
         break;
      case 7:
         var1 = "Ago";
         break;
      case 8:
         var1 = "Sep";
         break;
      case 9:
         var1 = "Oct";
         break;
      case 10:
         var1 = "Nov";
         break;
      case 11:
         var1 = "Dic";
      }

      return var1;
   }

   public static void a(String var0, String var1, String var2, String var3) {
      a = var0;
      b = var1;
      c = var2;
      d = var3;
   }

   public static boolean a(Date var0) {
      boolean var1;
      if(c(var0) == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public static boolean b(Date var0) {
      boolean var1 = true;
      if(1 != c(var0)) {
         var1 = false;
      }

      return var1;
   }

   private static int c(Date var0) {
      byte var1 = 0;
      Calendar var4 = Calendar.getInstance();
      Calendar var3 = Calendar.getInstance();
      Calendar var5 = Calendar.getInstance();
      Calendar var2 = Calendar.getInstance();
      var4.setTime(new Date());
      var2.setTime(var0);
      var3.set(1, var4.get(1));
      var3.set(2, var4.get(2));
      var3.set(5, var4.get(5));
      var3.set(11, 23);
      var3.set(12, 59);
      var3.set(13, 59);
      var5.set(1, var4.get(1));
      var5.set(2, var4.get(2));
      var5.set(5, var4.get(5));
      var5.set(11, 0);
      var5.set(12, 0);
      var5.set(13, 1);
      if(!var2.before(var3) || !var2.after(var5)) {
         if(var2.before(var5)) {
            var1 = -1;
         } else {
            var1 = 1;
         }
      }

      return var1;
   }
}

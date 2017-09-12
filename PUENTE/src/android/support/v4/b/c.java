package android.support.v4.b;

class c {
   static final int[] a = new int[0];
   static final long[] b = new long[0];
   static final Object[] c = new Object[0];

   public static int a(int var0) {
      return b(var0 * 4) / 4;
   }

   static int a(int[] var0, int var1, int var2) {
      byte var4 = 0;
      int var3 = var1 - 1;
      var1 = var4;

      while(true) {
         if(var1 <= var3) {
            int var6 = var1 + var3 >>> 1;
            int var5 = var0[var6];
            if(var5 < var2) {
               var1 = var6 + 1;
               continue;
            }

            if(var5 > var2) {
               var3 = var6 - 1;
               continue;
            }

            var1 = var6;
            break;
         }

         var1 = ~var1;
         break;
      }

      return var1;
   }

   public static boolean a(Object var0, Object var1) {
      boolean var2;
      if(var0 != var1 && (var0 == null || !var0.equals(var1))) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public static int b(int var0) {
      int var2 = 4;

      int var1;
      while(true) {
         var1 = var0;
         if(var2 >= 32) {
            break;
         }

         if(var0 <= (1 << var2) - 12) {
            var1 = (1 << var2) - 12;
            break;
         }

         ++var2;
      }

      return var1;
   }
}

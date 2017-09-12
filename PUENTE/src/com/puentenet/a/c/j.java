package com.puentenet.a.c;

public class j {
   public static final String[] a = new String[]{"C", "V", "CC", "CT", "FS", "TR", "DE"};
   public static final String[] b = new String[]{"COMPRAR", "VENDER", "CAU. COLOC", "CAU. TOM", "FID. SUSCR", "TRANSFERENCIA RETIRO", "TRANSFERENCIA DEPOSITO"};
   public static final String[] c = new String[]{"LI", "ME", "SL"};
   public static final String[] d = new String[]{"Limite", "Mercado", "Stop loss"};
   public static final String[] e = new String[]{"P", "PF", "EC", "EP", "PC", "PIP", "PAP", "A", "E", "FP", "R", "V", "C", "CP"};
   public static final String[] f = new String[]{"Pendiente de Ejecución", "Pendiente de Firmas", "En Curso", "Ejecutada Parcial", "Pendiente de Cancelación", "Pendiente Información Precio Cliente", "Pendiente Aprobación Precio Cliente", "Aprobada", "Ejecutada", "Finalizada Parcial", "Rechazada", "Vencida", "Cancelada", "Cancelada Parcial"};

   public static String a(String var0) {
      return a(var0, a, b);
   }

   private static String a(String var0, String[] var1, String[] var2) {
      int var3 = 0;

      while(true) {
         if(var3 >= var1.length) {
            var0 = "";
            break;
         }

         if(var0.equals(var1[var3])) {
            var0 = var2[var3];
            break;
         }

         ++var3;
      }

      return var0;
   }

   public static String b(String var0) {
      return a(var0, c, d);
   }

   public static String c(String var0) {
      return a(var0, e, f);
   }
}

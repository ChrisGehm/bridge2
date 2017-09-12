package com.puentenet.b.d.a;

import com.puentenet.b.d.a.a;
import com.puentenet.b.d.a.b;
import com.puentenet.b.d.a.d;
import com.puentenet.b.d.a.e;
import com.puentenet.b.d.a.f;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class c {
   public static final Object a = new d((d)null);
   private Hashtable b;

   public c() {
      this.b = new Hashtable();
   }

   public c(f var1) {
      this();
      if(var1.d() != 123) {
         throw var1.a("A JSONObject text must begin with \'{\'");
      } else {
         while(true) {
            switch(var1.d()) {
            case '\u0000':
               throw var1.a("A JSONObject text must end with \'}\'");
            default:
               var1.a();
               String var3 = var1.e().toString();
               char var2 = var1.d();
               if(var2 == 61) {
                  if(var1.c() != 62) {
                     var1.a();
                  }
               } else if(var2 != 58) {
                  throw var1.a("Expected a \':\' after a key");
               }

               this.a(var3, var1.e());
               switch(var1.d()) {
               case ',':
               case ';':
                  if(var1.d() != 125) {
                     var1.a();
                     continue;
                  }
               case '}':
                  break;
               default:
                  throw var1.a("Expected a \',\' or \'}\'");
               }
            case '}':
               return;
            }
         }
      }
   }

   public c(Hashtable var1) {
      if(var1 == null) {
         this.b = new Hashtable();
      } else {
         this.b = new Hashtable(var1.size());
         Enumeration var2 = var1.keys();

         while(var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            this.b.put(var3, var1.get(var3));
         }
      }

   }

   public static String a(Object var0) {
      if(var0 == null) {
         throw new b("Null pointer");
      } else {
         b(var0);
         return h(var0.toString());
      }
   }

   static void b(Object var0) {
      if(var0 != null) {
         if(var0 instanceof Double) {
            if(((Double)var0).isInfinite() || ((Double)var0).isNaN()) {
               throw new b("JSON does not allow non-finite numbers");
            }
         } else if(var0 instanceof Float && (((Float)var0).isInfinite() || ((Float)var0).isNaN())) {
            throw new b("JSON does not allow non-finite numbers.");
         }
      }

   }

   static String c(Object var0) {
      String var2;
      if(var0 != null && !var0.equals((Object)null)) {
         if(var0 instanceof e) {
            try {
               var2 = ((e)var0).a();
            } catch (Exception var1) {
               throw new b(var1);
            }

            if(!(var2 instanceof String)) {
               throw new b("Bad value from toJSONString: " + var2);
            }

            var2 = (String)var2;
         } else if(!(var0 instanceof Float) && !(var0 instanceof Double) && !(var0 instanceof Byte) && !(var0 instanceof Short) && !(var0 instanceof Integer) && !(var0 instanceof Long)) {
            if(!(var0 instanceof Boolean) && !(var0 instanceof c) && !(var0 instanceof a)) {
               var2 = p(var0.toString());
            } else {
               var2 = var0.toString();
            }
         } else {
            var2 = a(var0);
         }
      } else {
         var2 = "null";
      }

      return var2;
   }

   public static String h(String var0) {
      String var1 = var0;
      if(var0.indexOf(46) > 0) {
         var1 = var0;
         if(var0.indexOf(101) < 0) {
            var1 = var0;
            if(var0.indexOf(69) < 0) {
               while(var0.endsWith("0")) {
                  var0 = var0.substring(0, var0.length() - 1);
               }

               var1 = var0;
               if(var0.endsWith(".")) {
                  var1 = var0.substring(0, var0.length() - 1);
               }
            }
         }
      }

      return var1;
   }

   public static String p(String var0) {
      int var3 = 0;
      if(var0 != null && var0.length() != 0) {
         int var4 = var0.length();
         StringBuffer var5 = new StringBuffer(var4 + 4);
         var5.append('\"');

         char var1;
         for(char var2 = 0; var3 < var4; var2 = var1) {
            var1 = var0.charAt(var3);
            switch(var1) {
            case '\b':
               var5.append("\\b");
               break;
            case '\t':
               var5.append("\\t");
               break;
            case '\n':
               var5.append("\\n");
               break;
            case '\f':
               var5.append("\\f");
               break;
            case '\r':
               var5.append("\\r");
               break;
            case '\"':
            case '\\':
               var5.append('\\');
               var5.append(var1);
               break;
            case '/':
               if(var2 == 60) {
                  var5.append('\\');
               }

               var5.append(var1);
               break;
            default:
               if(var1 < 32) {
                  String var6 = "000" + Integer.toHexString(var1);
                  var5.append("\\u" + var6.substring(var6.length() - 4));
               } else {
                  var5.append(var1);
               }
            }

            ++var3;
         }

         var5.append('\"');
         var0 = var5.toString();
      } else {
         var0 = "\"\"";
      }

      return var0;
   }

   public double a(String var1, double var2) {
      double var4;
      try {
         var4 = Double.parseDouble(this.i(var1).toString());
      } catch (Exception var6) {
         return var2;
      }

      var2 = var4;
      return var2;
   }

   public long a(String var1, long var2) {
      long var4;
      try {
         var4 = this.f(var1);
      } catch (Exception var6) {
         return var2;
      }

      var2 = var4;
      return var2;
   }

   public c a(String var1, Object var2) {
      if(var1 == null) {
         throw new b("Null key.");
      } else {
         if(var2 != null) {
            b(var2);
            this.b.put(var1, var2);
         } else {
            this.q(var1);
         }

         return this;
      }
   }

   public c a(String var1, Vector var2) {
      this.a(var1, (Object)(new a(var2)));
      return this;
   }

   public Object a(String var1) {
      Object var2 = this.i(var1);
      if(var2 == null) {
         throw new b("JSONObject[" + p(var1) + "] not found.");
      } else {
         return var2;
      }
   }

   public String a(String var1, String var2) {
      Object var3 = this.i(var1);
      if(var3 != null) {
         var2 = var3.toString();
      }

      return var2;
   }

   public Enumeration a() {
      return this.b.keys();
   }

   public c b(String var1, long var2) {
      this.a(var1, (Object)(new Long(var2)));
      return this;
   }

   public boolean b(String var1) {
      Object var3 = this.a(var1);
      boolean var2;
      if(!var3.equals(Boolean.FALSE) && (!(var3 instanceof String) || !((String)var3).equalsIgnoreCase("false"))) {
         if(!var3.equals(Boolean.TRUE) && (!(var3 instanceof String) || !((String)var3).equalsIgnoreCase("true"))) {
            throw new b("JSONObject[" + p(var1) + "] is not a Boolean.");
         }

         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public double c(String var1) {
      Object var4 = this.a(var1);
      double var2;
      if(var4 instanceof Byte) {
         var2 = (double)((Byte)var4).byteValue();
      } else if(var4 instanceof Short) {
         var2 = (double)((Short)var4).shortValue();
      } else if(var4 instanceof Integer) {
         var2 = (double)((Integer)var4).intValue();
      } else if(var4 instanceof Long) {
         var2 = (double)((Long)var4).longValue();
      } else if(var4 instanceof Float) {
         var2 = (double)((Float)var4).floatValue();
      } else if(var4 instanceof Double) {
         var2 = ((Double)var4).doubleValue();
      } else {
         if(!(var4 instanceof String)) {
            throw new b("JSONObject[" + p(var1) + "] is not a number.");
         }

         try {
            var2 = Double.valueOf((String)var4).doubleValue();
         } catch (Exception var5) {
            throw new b("JSONObject[" + p(var1) + "] is not a number.");
         }
      }

      return var2;
   }

   public a d(String var1) {
      Object var2 = this.a(var1);
      if(var2 instanceof a) {
         return (a)var2;
      } else {
         throw new b("JSONObject[" + p(var1) + "] is not a JSONArray.");
      }
   }

   public c e(String var1) {
      Object var2 = this.a(var1);
      if(var2 instanceof c) {
         return (c)var2;
      } else {
         throw new b("JSONObject[" + p(var1) + "] is not a JSONObject.");
      }
   }

   public long f(String var1) {
      Object var4 = this.a(var1);
      long var2;
      if(var4 instanceof Byte) {
         var2 = (long)((Byte)var4).byteValue();
      } else if(var4 instanceof Short) {
         var2 = (long)((Short)var4).shortValue();
      } else if(var4 instanceof Integer) {
         var2 = (long)((Integer)var4).intValue();
      } else if(var4 instanceof Long) {
         var2 = ((Long)var4).longValue();
      } else if(var4 instanceof Float) {
         var2 = (long)((Float)var4).floatValue();
      } else if(var4 instanceof Double) {
         var2 = (long)((Double)var4).doubleValue();
      } else {
         if(!(var4 instanceof String)) {
            throw new b("JSONObject[" + p(var1) + "] is not a number.");
         }

         var2 = (long)this.c(var1);
      }

      return var2;
   }

   public String g(String var1) {
      return this.a(var1).toString();
   }

   public Object i(String var1) {
      Object var2;
      if(var1 == null) {
         var2 = null;
      } else {
         var2 = this.b.get(var1);
      }

      return var2;
   }

   public Float j(String var1) {
      Float var3;
      try {
         var3 = Float.valueOf(this.i(var1).toString());
      } catch (Exception var2) {
         var3 = null;
      }

      return var3;
   }

   public double k(String var1) {
      return this.a(var1, Double.NaN);
   }

   public a l(String var1) {
      Object var2 = this.i(var1);
      a var3;
      if(var2 instanceof a) {
         var3 = (a)var2;
      } else {
         var3 = null;
      }

      return var3;
   }

   public long m(String var1) {
      return this.a(var1, 0L);
   }

   public Integer n(String var1) {
      Integer var3;
      try {
         var3 = Integer.valueOf(this.i(var1).toString());
      } catch (Exception var2) {
         var3 = null;
      }

      return var3;
   }

   public String o(String var1) {
      return this.a(var1, "");
   }

   public Object q(String var1) {
      return this.b.remove(var1);
   }

   public String toString() {
      // $FF: Couldn't be decompiled
   }
}

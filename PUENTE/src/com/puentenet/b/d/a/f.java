package com.puentenet.b.d.a;

import com.puentenet.b.d.a.a;
import com.puentenet.b.d.a.b;
import com.puentenet.b.d.a.c;

public class f {
   private int a = 0;
   private String b;

   public f(String var1) {
      this.b = var1;
   }

   public b a(String var1) {
      return new b(var1 + this.toString());
   }

   public String a(char var1) {
      StringBuffer var3 = new StringBuffer();

      while(true) {
         char var2 = this.c();
         switch(var2) {
         case '\u0000':
         case '\n':
         case '\r':
            throw this.a("Unterminated string");
         case '\\':
            var2 = this.c();
            switch(var2) {
            case 'b':
               var3.append('\b');
               continue;
            case 'f':
               var3.append('\f');
               continue;
            case 'n':
               var3.append('\n');
               continue;
            case 'r':
               var3.append('\r');
               continue;
            case 't':
               var3.append('\t');
               continue;
            case 'u':
               var3.append((char)Integer.parseInt(this.a((int)4), 16));
               continue;
            case 'x':
               var3.append((char)Integer.parseInt(this.a((int)2), 16));
               continue;
            default:
               var3.append(var2);
               continue;
            }
         default:
            if(var2 == var1) {
               return var3.toString();
            }

            var3.append(var2);
         }
      }
   }

   public String a(int var1) {
      int var3 = this.a;
      int var2 = var3 + var1;
      if(var2 >= this.b.length()) {
         throw this.a("Substring bounds error");
      } else {
         this.a += var1;
         return this.b.substring(var3, var2);
      }
   }

   public void a() {
      if(this.a > 0) {
         --this.a;
      }

   }

   public boolean b() {
      boolean var1;
      if(this.a < this.b.length()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public char c() {
      char var1;
      if(this.b()) {
         var1 = this.b.charAt(this.a);
         ++this.a;
      } else {
         var1 = 0;
      }

      return var1;
   }

   public char d() {
      byte var2 = 47;

      label53:
      while(true) {
         char var1 = this.c();
         char var3;
         if(var1 == 47) {
            switch(this.c()) {
            case '*':
               while(true) {
                  var3 = this.c();
                  if(var3 == 0) {
                     throw this.a("Unclosed comment.");
                  }

                  if(var3 == 42) {
                     if(this.c() == 47) {
                        continue label53;
                     }

                     this.a();
                  }
               }
            case '/':
               while(true) {
                  var3 = this.c();
                  if(var3 == 10 || var3 == 13 || var3 == 0) {
                     continue label53;
                  }
               }
            default:
               this.a();
               var1 = (char)var2;
               return var1;
            }
         } else if(var1 == 35) {
            while(true) {
               var3 = this.c();
               if(var3 == 10 || var3 == 13 || var3 == 0) {
                  break;
               }
            }
         } else if(var1 == 0 || var1 > 32) {
            return var1;
         }
      }
   }

   public Object e() {
      char var2 = this.d();
      Object var3;
      switch(var2) {
      case '\"':
      case '\'':
         var3 = this.a(var2);
         break;
      case '[':
         this.a();
         var3 = new a(this);
         break;
      case '{':
         this.a();
         var3 = new c(this);
         break;
      default:
         StringBuffer var10 = new StringBuffer();

         for(char var1 = var2; var1 >= 32 && ",:]}/\\\"[{;=#".indexOf(var1) < 0; var1 = this.c()) {
            var10.append(var1);
         }

         this.a();
         var3 = var10.toString().trim();
         if(((String)var3).equals("")) {
            throw this.a("Missing value.");
         }

         if(((String)var3).equalsIgnoreCase("true")) {
            var3 = Boolean.TRUE;
         } else if(((String)var3).equalsIgnoreCase("false")) {
            var3 = Boolean.FALSE;
         } else if(((String)var3).equalsIgnoreCase("null")) {
            var3 = c.a;
         } else if(var2 >= 48 && var2 <= 57 || var2 == 46 || var2 == 45 || var2 == 43) {
            Integer var4;
            if(var2 == 48) {
               label119: {
                  if(((String)var3).length() > 2 && (((String)var3).charAt(1) == 120 || ((String)var3).charAt(1) == 88)) {
                     try {
                        var4 = new Integer(Integer.parseInt(((String)var3).substring(2), 16));
                     } catch (Exception var9) {
                        break label119;
                     }

                     var3 = var4;
                  } else {
                     try {
                        var4 = new Integer(Integer.parseInt((String)var3, 8));
                     } catch (Exception var8) {
                        break label119;
                     }

                     var3 = var4;
                  }

                  return var3;
               }
            }

            try {
               var4 = Integer.valueOf((String)var3);
            } catch (Exception var7) {
               Long var12;
               try {
                  var12 = new Long(Long.parseLong((String)var3));
               } catch (Exception var6) {
                  Double var11;
                  try {
                     var11 = Double.valueOf((String)var3);
                  } catch (Exception var5) {
                     return var3;
                  }

                  var3 = var11;
                  return var3;
               }

               var3 = var12;
               return var3;
            }

            var3 = var4;
         }
      }

      return var3;
   }

   public String toString() {
      return " at character " + this.a + " of " + this.b;
   }
}

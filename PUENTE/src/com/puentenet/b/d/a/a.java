package com.puentenet.b.d.a;

import com.puentenet.b.d.a.b;
import com.puentenet.b.d.a.c;
import com.puentenet.b.d.a.f;
import java.util.Vector;

public class a {
   private Vector a;

   public a() {
      this.a = new Vector();
   }

   public a(f var1) {
      this();
      if(var1.d() != 91) {
         throw var1.a("A JSONArray text must start with \'[\'");
      } else if(var1.d() != 93) {
         var1.a();

         while(true) {
            if(var1.d() == 44) {
               var1.a();
               this.a.addElement((Object)null);
            } else {
               var1.a();
               this.a.addElement(var1.e());
            }

            switch(var1.d()) {
            case ',':
            case ';':
               if(var1.d() != 93) {
                  var1.a();
                  break;
               }

               return;
            case ']':
               return;
            default:
               throw var1.a("Expected a \',\' or \']\'");
            }
         }
      }
   }

   public a(Vector var1) {
      if(var1 == null) {
         this.a = new Vector();
      } else {
         int var3 = var1.size();
         this.a = new Vector(var3);

         for(int var2 = 0; var2 < var3; ++var2) {
            this.a.addElement(var1.elementAt(var2));
         }
      }

   }

   public int a() {
      return this.a.size();
   }

   public Object a(int var1) {
      Object var2 = this.d(var1);
      if(var2 == null) {
         throw new b("JSONArray[" + var1 + "] not found.");
      } else {
         return var2;
      }
   }

   public String a(String var1) {
      int var3 = this.a();
      StringBuffer var4 = new StringBuffer();

      for(int var2 = 0; var2 < var3; ++var2) {
         if(var2 > 0) {
            var4.append(var1);
         }

         var4.append(c.c(this.a.elementAt(var2)));
      }

      return var4.toString();
   }

   public c b(int var1) {
      Object var2 = this.a(var1);
      if(var2 instanceof c) {
         return (c)var2;
      } else {
         throw new b("JSONArray[" + var1 + "] is not a JSONObject.");
      }
   }

   public String c(int var1) {
      return this.a(var1).toString();
   }

   public Object d(int var1) {
      Object var2;
      if(var1 >= 0 && var1 < this.a()) {
         var2 = this.a.elementAt(var1);
      } else {
         var2 = null;
      }

      return var2;
   }

   public String toString() {
      String var1;
      try {
         StringBuilder var3 = new StringBuilder(String.valueOf('['));
         var1 = var3.append(this.a(",")).append(']').toString();
      } catch (Exception var2) {
         var1 = null;
      }

      return var1;
   }
}

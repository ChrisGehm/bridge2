package android.support.v4.b;

import android.support.v4.b.c;

public class l {
   static Object[] b;
   static int c;
   static Object[] d;
   static int e;
   int[] f;
   Object[] g;
   int h;

   public l() {
      this.f = c.a;
      this.g = c.c;
      this.h = 0;
   }

   private static void a(int[] param0, Object[] param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private void e(int param1) {
      // $FF: Couldn't be decompiled
   }

   int a() {
      int var4 = this.h;
      int var1;
      if(var4 == 0) {
         var1 = -1;
      } else {
         int var3 = c.a(this.f, var4, 0);
         var1 = var3;
         if(var3 >= 0) {
            var1 = var3;
            if(this.g[var3 << 1] != null) {
               int var2;
               for(var2 = var3 + 1; var2 < var4 && this.f[var2] == 0; ++var2) {
                  if(this.g[var2 << 1] == null) {
                     var1 = var2;
                     return var1;
                  }
               }

               --var3;

               while(var3 >= 0 && this.f[var3] == 0) {
                  var1 = var3;
                  if(this.g[var3 << 1] == null) {
                     return var1;
                  }

                  --var3;
               }

               var1 = ~var2;
            }
         }
      }

      return var1;
   }

   int a(Object var1) {
      int var2 = 1;
      byte var3 = 1;
      int var4 = this.h * 2;
      Object[] var5 = this.g;
      if(var1 == null) {
         for(var2 = var3; var2 < var4; var2 += 2) {
            if(var5[var2] == null) {
               var2 >>= 1;
               return var2;
            }
         }
      } else {
         while(var2 < var4) {
            if(var1.equals(var5[var2])) {
               var2 >>= 1;
               return var2;
            }

            var2 += 2;
         }
      }

      var2 = -1;
      return var2;
   }

   int a(Object var1, int var2) {
      int var6 = this.h;
      int var3;
      if(var6 == 0) {
         var3 = -1;
      } else {
         int var5 = c.a(this.f, var6, var2);
         var3 = var5;
         if(var5 >= 0) {
            var3 = var5;
            if(!var1.equals(this.g[var5 << 1])) {
               int var4;
               for(var4 = var5 + 1; var4 < var6 && this.f[var4] == var2; ++var4) {
                  if(var1.equals(this.g[var4 << 1])) {
                     var3 = var4;
                     return var3;
                  }
               }

               --var5;

               while(var5 >= 0 && this.f[var5] == var2) {
                  var3 = var5;
                  if(var1.equals(this.g[var5 << 1])) {
                     return var3;
                  }

                  --var5;
               }

               var3 = ~var4;
            }
         }
      }

      return var3;
   }

   public Object a(int var1, Object var2) {
      var1 = (var1 << 1) + 1;
      Object var3 = this.g[var1];
      this.g[var1] = var2;
      return var3;
   }

   public void a(int var1) {
      if(this.f.length < var1) {
         int[] var2 = this.f;
         Object[] var3 = this.g;
         this.e(var1);
         if(this.h > 0) {
            System.arraycopy(var2, 0, this.f, 0, this.h);
            System.arraycopy(var3, 0, this.g, 0, this.h << 1);
         }

         a(var2, var3, this.h);
      }

   }

   public Object b(int var1) {
      return this.g[var1 << 1];
   }

   public Object c(int var1) {
      return this.g[(var1 << 1) + 1];
   }

   public void clear() {
      if(this.h != 0) {
         a(this.f, this.g, this.h);
         this.f = c.a;
         this.g = c.c;
         this.h = 0;
      }

   }

   public boolean containsKey(Object var1) {
      boolean var2 = true;
      if(var1 == null) {
         if(this.a() < 0) {
            var2 = false;
         }
      } else if(this.a(var1, var1.hashCode()) < 0) {
         var2 = false;
      }

      return var2;
   }

   public boolean containsValue(Object var1) {
      boolean var2;
      if(this.a(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public Object d(int var1) {
      int var2 = 8;
      Object var5 = this.g[(var1 << 1) + 1];
      if(this.h <= 1) {
         a(this.f, this.g, this.h);
         this.f = c.a;
         this.g = c.c;
         this.h = 0;
      } else if(this.f.length > 8 && this.h < this.f.length / 3) {
         if(this.h > 8) {
            var2 = this.h + (this.h >> 1);
         }

         int[] var4 = this.f;
         Object[] var3 = this.g;
         this.e(var2);
         --this.h;
         if(var1 > 0) {
            System.arraycopy(var4, 0, this.f, 0, var1);
            System.arraycopy(var3, 0, this.g, 0, var1 << 1);
         }

         if(var1 < this.h) {
            System.arraycopy(var4, var1 + 1, this.f, var1, this.h - var1);
            System.arraycopy(var3, var1 + 1 << 1, this.g, var1 << 1, this.h - var1 << 1);
         }
      } else {
         --this.h;
         if(var1 < this.h) {
            System.arraycopy(this.f, var1 + 1, this.f, var1, this.h - var1);
            System.arraycopy(this.g, var1 + 1 << 1, this.g, var1 << 1, this.h - var1 << 1);
         }

         this.g[this.h << 1] = null;
         this.g[(this.h << 1) + 1] = null;
      }

      return var5;
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public Object get(Object var1) {
      int var2;
      if(var1 == null) {
         var2 = this.a();
      } else {
         var2 = this.a(var1, var1.hashCode());
      }

      if(var2 >= 0) {
         var1 = this.g[(var2 << 1) + 1];
      } else {
         var1 = null;
      }

      return var1;
   }

   public int hashCode() {
      int[] var8 = this.f;
      Object[] var7 = this.g;
      int var5 = this.h;
      int var1 = 1;
      int var3 = 0;

      int var2;
      for(var2 = 0; var3 < var5; var1 += 2) {
         Object var9 = var7[var1];
         int var6 = var8[var3];
         int var4;
         if(var9 == null) {
            var4 = 0;
         } else {
            var4 = var9.hashCode();
         }

         var2 += var4 ^ var6;
         ++var3;
      }

      return var2;
   }

   public boolean isEmpty() {
      boolean var1;
      if(this.h <= 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public Object put(Object var1, Object var2) {
      byte var5 = 8;
      int var3;
      int var4;
      if(var1 == null) {
         var3 = this.a();
         var4 = 0;
      } else {
         var4 = var1.hashCode();
         var3 = this.a(var1, var4);
      }

      if(var3 >= 0) {
         var3 = (var3 << 1) + 1;
         var1 = this.g[var3];
         this.g[var3] = var2;
      } else {
         int var6 = ~var3;
         if(this.h >= this.f.length) {
            if(this.h >= 8) {
               var3 = this.h + (this.h >> 1);
            } else {
               var3 = var5;
               if(this.h < 4) {
                  var3 = 4;
               }
            }

            int[] var8 = this.f;
            Object[] var7 = this.g;
            this.e(var3);
            if(this.f.length > 0) {
               System.arraycopy(var8, 0, this.f, 0, var8.length);
               System.arraycopy(var7, 0, this.g, 0, var7.length);
            }

            a(var8, var7, this.h);
         }

         if(var6 < this.h) {
            System.arraycopy(this.f, var6, this.f, var6 + 1, this.h - var6);
            System.arraycopy(this.g, var6 << 1, this.g, var6 + 1 << 1, this.h - var6 << 1);
         }

         this.f[var6] = var4;
         this.g[var6 << 1] = var1;
         this.g[(var6 << 1) + 1] = var2;
         ++this.h;
         var1 = null;
      }

      return var1;
   }

   public Object remove(Object var1) {
      int var2;
      if(var1 == null) {
         var2 = this.a();
      } else {
         var2 = this.a(var1, var1.hashCode());
      }

      if(var2 >= 0) {
         var1 = this.d(var2);
      } else {
         var1 = null;
      }

      return var1;
   }

   public int size() {
      return this.h;
   }

   public String toString() {
      String var2;
      if(this.isEmpty()) {
         var2 = "{}";
      } else {
         StringBuilder var4 = new StringBuilder(this.h * 28);
         var4.append('{');

         for(int var1 = 0; var1 < this.h; ++var1) {
            if(var1 > 0) {
               var4.append(", ");
            }

            Object var3 = this.b(var1);
            if(var3 != this) {
               var4.append(var3);
            } else {
               var4.append("(this Map)");
            }

            var4.append('=');
            var3 = this.c(var1);
            if(var3 != this) {
               var4.append(var3);
            } else {
               var4.append("(this Map)");
            }
         }

         var4.append('}');
         var2 = var4.toString();
      }

      return var2;
   }
}

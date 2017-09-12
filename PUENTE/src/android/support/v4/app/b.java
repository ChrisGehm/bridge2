package android.support.v4.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.c;
import android.support.v4.app.o;
import android.support.v4.app.y;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class b extends y implements Runnable {
   final o a;
   c b;
   c c;
   int d;
   int e;
   int f;
   int g;
   int h;
   int i;
   int j;
   boolean k;
   boolean l = true;
   String m;
   boolean n;
   int o = -1;
   int p;
   CharSequence q;
   int r;
   CharSequence s;

   public b(o var1) {
      this.a = var1;
   }

   private void a(int var1, Fragment var2, String var3, int var4) {
      var2.B = this.a;
      if(var3 != null) {
         if(var2.H != null && !var3.equals(var2.H)) {
            throw new IllegalStateException("Can\'t change tag of fragment " + var2 + ": was " + var2.H + " now " + var3);
         }

         var2.H = var3;
      }

      if(var1 != 0) {
         if(var2.F != 0 && var2.F != var1) {
            throw new IllegalStateException("Can\'t change container ID of fragment " + var2 + ": was " + var2.F + " now " + var1);
         }

         var2.F = var1;
         var2.G = var1;
      }

      c var5 = new c();
      var5.c = var4;
      var5.d = var2;
      this.a(var5);
   }

   public int a() {
      return this.a(false);
   }

   int a(boolean var1) {
      if(this.n) {
         throw new IllegalStateException("commit already called");
      } else {
         if(o.a) {
            Log.v("FragmentManager", "Commit: " + this);
            this.a("  ", (FileDescriptor)null, new PrintWriter(new android.support.v4.b.e("FragmentManager")), (String[])null);
         }

         this.n = true;
         if(this.k) {
            this.o = this.a.a(this);
         } else {
            this.o = -1;
         }

         this.a.a((Runnable)this, var1);
         return this.o;
      }
   }

   public y a(int var1, Fragment var2) {
      this.a(var1, var2, (String)null, 1);
      return this;
   }

   public y a(int var1, Fragment var2, String var3) {
      this.a(var1, var2, var3, 1);
      return this;
   }

   public y a(Fragment var1) {
      c var2 = new c();
      var2.c = 3;
      var2.d = var1;
      this.a(var2);
      return this;
   }

   public y a(Fragment var1, String var2) {
      this.a(0, var1, var2, 1);
      return this;
   }

   public y a(String var1) {
      if(!this.l) {
         throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
      } else {
         this.k = true;
         this.m = var1;
         return this;
      }
   }

   void a(int var1) {
      if(this.k) {
         if(o.a) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + var1);
         }

         for(c var3 = this.b; var3 != null; var3 = var3.a) {
            Fragment var4;
            if(var3.d != null) {
               var4 = var3.d;
               var4.A += var1;
               if(o.a) {
                  Log.v("FragmentManager", "Bump nesting of " + var3.d + " to " + var3.d.A);
               }
            }

            if(var3.i != null) {
               for(int var2 = var3.i.size() - 1; var2 >= 0; --var2) {
                  var4 = (Fragment)var3.i.get(var2);
                  var4.A += var1;
                  if(o.a) {
                     Log.v("FragmentManager", "Bump nesting of " + var4 + " to " + var4.A);
                  }
               }
            }
         }
      }

   }

   void a(c var1) {
      if(this.b == null) {
         this.c = var1;
         this.b = var1;
      } else {
         var1.b = this.c;
         this.c.a = var1;
         this.c = var1;
      }

      var1.e = this.e;
      var1.f = this.f;
      var1.g = this.g;
      var1.h = this.h;
      ++this.d;
   }

   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      this.a(var1, var3, true);
   }

   public void a(String var1, PrintWriter var2, boolean var3) {
      if(var3) {
         var2.print(var1);
         var2.print("mName=");
         var2.print(this.m);
         var2.print(" mIndex=");
         var2.print(this.o);
         var2.print(" mCommitted=");
         var2.println(this.n);
         if(this.i != 0) {
            var2.print(var1);
            var2.print("mTransition=#");
            var2.print(Integer.toHexString(this.i));
            var2.print(" mTransitionStyle=#");
            var2.println(Integer.toHexString(this.j));
         }

         if(this.e != 0 || this.f != 0) {
            var2.print(var1);
            var2.print("mEnterAnim=#");
            var2.print(Integer.toHexString(this.e));
            var2.print(" mExitAnim=#");
            var2.println(Integer.toHexString(this.f));
         }

         if(this.g != 0 || this.h != 0) {
            var2.print(var1);
            var2.print("mPopEnterAnim=#");
            var2.print(Integer.toHexString(this.g));
            var2.print(" mPopExitAnim=#");
            var2.println(Integer.toHexString(this.h));
         }

         if(this.p != 0 || this.q != null) {
            var2.print(var1);
            var2.print("mBreadCrumbTitleRes=#");
            var2.print(Integer.toHexString(this.p));
            var2.print(" mBreadCrumbTitleText=");
            var2.println(this.q);
         }

         if(this.r != 0 || this.s != null) {
            var2.print(var1);
            var2.print("mBreadCrumbShortTitleRes=#");
            var2.print(Integer.toHexString(this.r));
            var2.print(" mBreadCrumbShortTitleText=");
            var2.println(this.s);
         }
      }

      if(this.b != null) {
         var2.print(var1);
         var2.println("Operations:");
         String var8 = var1 + "    ";
         c var7 = this.b;

         for(int var4 = 0; var7 != null; ++var4) {
            String var6;
            switch(var7.c) {
            case 0:
               var6 = "NULL";
               break;
            case 1:
               var6 = "ADD";
               break;
            case 2:
               var6 = "REPLACE";
               break;
            case 3:
               var6 = "REMOVE";
               break;
            case 4:
               var6 = "HIDE";
               break;
            case 5:
               var6 = "SHOW";
               break;
            case 6:
               var6 = "DETACH";
               break;
            case 7:
               var6 = "ATTACH";
               break;
            default:
               var6 = "cmd=" + var7.c;
            }

            var2.print(var1);
            var2.print("  Op #");
            var2.print(var4);
            var2.print(": ");
            var2.print(var6);
            var2.print(" ");
            var2.println(var7.d);
            if(var3) {
               if(var7.e != 0 || var7.f != 0) {
                  var2.print(var1);
                  var2.print("enterAnim=#");
                  var2.print(Integer.toHexString(var7.e));
                  var2.print(" exitAnim=#");
                  var2.println(Integer.toHexString(var7.f));
               }

               if(var7.g != 0 || var7.h != 0) {
                  var2.print(var1);
                  var2.print("popEnterAnim=#");
                  var2.print(Integer.toHexString(var7.g));
                  var2.print(" popExitAnim=#");
                  var2.println(Integer.toHexString(var7.h));
               }
            }

            if(var7.i != null && var7.i.size() > 0) {
               for(int var5 = 0; var5 < var7.i.size(); ++var5) {
                  var2.print(var8);
                  if(var7.i.size() == 1) {
                     var2.print("Removed: ");
                  } else {
                     if(var5 == 0) {
                        var2.println("Removed:");
                     }

                     var2.print(var8);
                     var2.print("  #");
                     var2.print(var5);
                     var2.print(": ");
                  }

                  var2.println(var7.i.get(var5));
               }
            }

            var7 = var7.a;
         }
      }

   }

   public int b() {
      return this.a(true);
   }

   public y b(int var1, Fragment var2) {
      return this.b(var1, var2, (String)null);
   }

   public y b(int var1, Fragment var2, String var3) {
      if(var1 == 0) {
         throw new IllegalArgumentException("Must use non-zero containerViewId");
      } else {
         this.a(var1, var2, var3, 2);
         return this;
      }
   }

   public y b(Fragment var1) {
      c var2 = new c();
      var2.c = 6;
      var2.d = var1;
      this.a(var2);
      return this;
   }

   public void b(boolean var1) {
      if(o.a) {
         Log.v("FragmentManager", "popFromBackStack: " + this);
         this.a("  ", (FileDescriptor)null, new PrintWriter(new android.support.v4.b.e("FragmentManager")), (String[])null);
      }

      this.a(-1);

      for(c var3 = this.c; var3 != null; var3 = var3.b) {
         Fragment var4;
         switch(var3.c) {
         case 1:
            var4 = var3.d;
            var4.P = var3.h;
            this.a.a(var4, o.c(this.i), this.j);
            break;
         case 2:
            var4 = var3.d;
            if(var4 != null) {
               var4.P = var3.h;
               this.a.a(var4, o.c(this.i), this.j);
            }

            if(var3.i != null) {
               for(int var2 = 0; var2 < var3.i.size(); ++var2) {
                  var4 = (Fragment)var3.i.get(var2);
                  var4.P = var3.g;
                  this.a.a(var4, false);
               }
            }
            break;
         case 3:
            var4 = var3.d;
            var4.P = var3.g;
            this.a.a(var4, false);
            break;
         case 4:
            var4 = var3.d;
            var4.P = var3.g;
            this.a.c(var4, o.c(this.i), this.j);
            break;
         case 5:
            var4 = var3.d;
            var4.P = var3.h;
            this.a.b(var4, o.c(this.i), this.j);
            break;
         case 6:
            var4 = var3.d;
            var4.P = var3.g;
            this.a.e(var4, o.c(this.i), this.j);
            break;
         case 7:
            var4 = var3.d;
            var4.P = var3.g;
            this.a.d(var4, o.c(this.i), this.j);
            break;
         default:
            throw new IllegalArgumentException("Unknown cmd: " + var3.c);
         }
      }

      if(var1) {
         this.a.a(this.a.n, o.c(this.i), this.j, true);
      }

      if(this.o >= 0) {
         this.a.b(this.o);
         this.o = -1;
      }

   }

   public y c(Fragment var1) {
      c var2 = new c();
      var2.c = 7;
      var2.d = var1;
      this.a(var2);
      return this;
   }

   public String c() {
      return this.m;
   }

   public void run() {
      if(o.a) {
         Log.v("FragmentManager", "Run: " + this);
      }

      if(this.k && this.o < 0) {
         throw new IllegalStateException("addToBackStack() called after commit()");
      } else {
         this.a(1);

         for(c var3 = this.b; var3 != null; var3 = var3.a) {
            Fragment var2;
            switch(var3.c) {
            case 1:
               var2 = var3.d;
               var2.P = var3.e;
               this.a.a(var2, false);
               break;
            case 2:
               var2 = var3.d;
               Fragment var4;
               if(this.a.g == null) {
                  var4 = var2;
               } else {
                  int var1 = 0;

                  while(true) {
                     var4 = var2;
                     if(var1 >= this.a.g.size()) {
                        break;
                     }

                     Fragment var5 = (Fragment)this.a.g.get(var1);
                     if(o.a) {
                        Log.v("FragmentManager", "OP_REPLACE: adding=" + var2 + " old=" + var5);
                     }

                     label67: {
                        if(var2 != null) {
                           var4 = var2;
                           if(var5.G != var2.G) {
                              break label67;
                           }
                        }

                        if(var5 == var2) {
                           var4 = null;
                           var3.d = null;
                        } else {
                           if(var3.i == null) {
                              var3.i = new ArrayList();
                           }

                           var3.i.add(var5);
                           var5.P = var3.f;
                           if(this.k) {
                              ++var5.A;
                              if(o.a) {
                                 Log.v("FragmentManager", "Bump nesting of " + var5 + " to " + var5.A);
                              }
                           }

                           this.a.a(var5, this.i, this.j);
                           var4 = var2;
                        }
                     }

                     ++var1;
                     var2 = var4;
                  }
               }

               if(var4 != null) {
                  var4.P = var3.e;
                  this.a.a(var4, false);
               }
               break;
            case 3:
               var2 = var3.d;
               var2.P = var3.f;
               this.a.a(var2, this.i, this.j);
               break;
            case 4:
               var2 = var3.d;
               var2.P = var3.f;
               this.a.b(var2, this.i, this.j);
               break;
            case 5:
               var2 = var3.d;
               var2.P = var3.e;
               this.a.c(var2, this.i, this.j);
               break;
            case 6:
               var2 = var3.d;
               var2.P = var3.f;
               this.a.d(var2, this.i, this.j);
               break;
            case 7:
               var2 = var3.d;
               var2.P = var3.e;
               this.a.e(var2, this.i, this.j);
               break;
            default:
               throw new IllegalArgumentException("Unknown cmd: " + var3.c);
            }
         }

         this.a.a(this.a.n, this.i, this.j, true);
         if(this.k) {
            this.a.b(this);
         }

      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("BackStackEntry{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      if(this.o >= 0) {
         var1.append(" #");
         var1.append(this.o);
      }

      if(this.m != null) {
         var1.append(" ");
         var1.append(this.m);
      }

      var1.append("}");
      return var1.toString();
   }
}

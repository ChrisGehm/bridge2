package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.support.v4.app.BackStackState;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.support.v4.app.af;
import android.support.v4.app.ag;
import android.support.v4.app.b;
import android.support.v4.app.l;
import android.support.v4.app.m;
import android.support.v4.app.n;
import android.support.v4.app.p;
import android.support.v4.app.q;
import android.support.v4.app.r;
import android.support.v4.app.y;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class o extends m {
   static final Interpolator A;
   static final Interpolator B;
   static final Interpolator C;
   static boolean a;
   static final boolean b;
   static final Interpolator z;
   ArrayList c;
   Runnable[] d;
   boolean e;
   ArrayList f;
   ArrayList g;
   ArrayList h;
   ArrayList i;
   ArrayList j;
   ArrayList k;
   ArrayList l;
   ArrayList m;
   int n = 0;
   FragmentActivity o;
   l p;
   Fragment q;
   boolean r;
   boolean s;
   boolean t;
   String u;
   boolean v;
   Bundle w = null;
   SparseArray x = null;
   Runnable y = new p(this);

   static {
      boolean var0 = false;
      a = false;
      if(VERSION.SDK_INT >= 11) {
         var0 = true;
      }

      b = var0;
      z = new DecelerateInterpolator(2.5F);
      A = new DecelerateInterpolator(1.5F);
      B = new AccelerateInterpolator(2.5F);
      C = new AccelerateInterpolator(1.5F);
   }

   static Animation a(Context var0, float var1, float var2) {
      AlphaAnimation var3 = new AlphaAnimation(var1, var2);
      var3.setInterpolator(A);
      var3.setDuration(220L);
      return var3;
   }

   static Animation a(Context var0, float var1, float var2, float var3, float var4) {
      AnimationSet var7 = new AnimationSet(false);
      ScaleAnimation var5 = new ScaleAnimation(var1, var2, var1, var2, 1, 0.5F, 1, 0.5F);
      var5.setInterpolator(z);
      var5.setDuration(220L);
      var7.addAnimation(var5);
      AlphaAnimation var6 = new AlphaAnimation(var3, var4);
      var6.setInterpolator(A);
      var6.setDuration(220L);
      var7.addAnimation(var6);
      return var7;
   }

   private void a(RuntimeException var1) {
      Log.e("FragmentManager", var1.getMessage());
      Log.e("FragmentManager", "Activity state:");
      PrintWriter var2 = new PrintWriter(new android.support.v4.b.e("FragmentManager"));
      if(this.o != null) {
         try {
            this.o.dump("  ", (FileDescriptor)null, var2, new String[0]);
         } catch (Exception var4) {
            Log.e("FragmentManager", "Failed dumping state", var4);
         }
      } else {
         try {
            this.a("  ", (FileDescriptor)null, var2, new String[0]);
         } catch (Exception var3) {
            Log.e("FragmentManager", "Failed dumping state", var3);
         }
      }

      throw var1;
   }

   public static int b(int var0, boolean var1) {
      byte var2 = -1;
      byte var3;
      switch(var0) {
      case 4097:
         if(var1) {
            var3 = 1;
         } else {
            var3 = 2;
         }
         break;
      case 4099:
         if(var1) {
            var3 = 5;
         } else {
            var3 = 6;
         }
         break;
      case 8194:
         if(var1) {
            var3 = 3;
         } else {
            var3 = 4;
         }
         break;
      default:
         var3 = var2;
      }

      return var3;
   }

   public static int c(int var0) {
      byte var1 = 0;
      short var2;
      switch(var0) {
      case 4097:
         var2 = 8194;
         break;
      case 4099:
         var2 = 4099;
         break;
      case 8194:
         var2 = 4097;
         break;
      default:
         var2 = var1;
      }

      return var2;
   }

   private void t() {
      if(this.s) {
         throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
      } else if(this.u != null) {
         throw new IllegalStateException("Can not perform this action inside of " + this.u);
      }
   }

   public int a(b param1) {
      // $FF: Couldn't be decompiled
   }

   public Fragment a(int var1) {
      int var2;
      Fragment var3;
      if(this.g != null) {
         for(var2 = this.g.size() - 1; var2 >= 0; --var2) {
            var3 = (Fragment)this.g.get(var2);
            if(var3 != null && var3.F == var1) {
               return var3;
            }
         }
      }

      if(this.f != null) {
         for(var2 = this.f.size() - 1; var2 >= 0; --var2) {
            Fragment var4 = (Fragment)this.f.get(var2);
            if(var4 != null) {
               var3 = var4;
               if(var4.F == var1) {
                  return var3;
               }
            }
         }
      }

      var3 = null;
      return var3;
   }

   public Fragment a(Bundle var1, String var2) {
      int var3 = var1.getInt(var2, -1);
      Fragment var5;
      if(var3 == -1) {
         var5 = null;
      } else {
         if(var3 >= this.f.size()) {
            this.a((RuntimeException)(new IllegalStateException("Fragment no longer exists for key " + var2 + ": index " + var3)));
         }

         Fragment var4 = (Fragment)this.f.get(var3);
         var5 = var4;
         if(var4 == null) {
            this.a((RuntimeException)(new IllegalStateException("Fragment no longer exists for key " + var2 + ": index " + var3)));
            var5 = var4;
         }
      }

      return var5;
   }

   public Fragment a(String var1) {
      int var2;
      Fragment var3;
      if(this.g != null && var1 != null) {
         for(var2 = this.g.size() - 1; var2 >= 0; --var2) {
            var3 = (Fragment)this.g.get(var2);
            if(var3 != null && var1.equals(var3.H)) {
               return var3;
            }
         }
      }

      if(this.f != null && var1 != null) {
         for(var2 = this.f.size() - 1; var2 >= 0; --var2) {
            Fragment var4 = (Fragment)this.f.get(var2);
            if(var4 != null) {
               var3 = var4;
               if(var1.equals(var4.H)) {
                  return var3;
               }
            }
         }
      }

      var3 = null;
      return var3;
   }

   public y a() {
      return new b(this);
   }

   Animation a(Fragment var1, int var2, boolean var3, int var4) {
      Animation var5 = var1.a(var2, var3, var1.P);
      Animation var6;
      if(var5 != null) {
         var6 = var5;
      } else {
         if(var1.P != 0) {
            var5 = AnimationUtils.loadAnimation(this.o, var1.P);
            var6 = var5;
            if(var5 != null) {
               return var6;
            }
         }

         if(var2 == 0) {
            var6 = null;
         } else {
            var2 = b(var2, var3);
            if(var2 < 0) {
               var6 = null;
            } else {
               switch(var2) {
               case 1:
                  var6 = a(this.o, 1.125F, 1.0F, 0.0F, 1.0F);
                  break;
               case 2:
                  var6 = a(this.o, 1.0F, 0.975F, 1.0F, 0.0F);
                  break;
               case 3:
                  var6 = a(this.o, 0.975F, 1.0F, 0.0F, 1.0F);
                  break;
               case 4:
                  var6 = a(this.o, 1.0F, 1.075F, 1.0F, 0.0F);
                  break;
               case 5:
                  var6 = a(this.o, 0.0F, 1.0F);
                  break;
               case 6:
                  var6 = a(this.o, 1.0F, 0.0F);
                  break;
               default:
                  var2 = var4;
                  if(var4 == 0) {
                     var2 = var4;
                     if(this.o.getWindow() != null) {
                        var2 = this.o.getWindow().getAttributes().windowAnimations;
                     }
                  }

                  if(var2 == 0) {
                     var6 = null;
                  } else {
                     var6 = null;
                  }
               }
            }
         }
      }

      return var6;
   }

   public void a(int var1, int var2) {
      if(var1 < 0) {
         throw new IllegalArgumentException("Bad id: " + var1);
      } else {
         this.a((Runnable)(new q(this, var1, var2)), false);
      }
   }

   void a(int var1, int var2, int var3, boolean var4) {
      if(this.o == null && var1 != 0) {
         throw new IllegalStateException("No activity");
      } else {
         if(var4 || this.n != var1) {
            this.n = var1;
            if(this.f != null) {
               int var6 = 0;

               boolean var5;
               for(var5 = false; var6 < this.f.size(); ++var6) {
                  Fragment var7 = (Fragment)this.f.get(var6);
                  if(var7 != null) {
                     this.a(var7, var1, var2, var3, false);
                     if(var7.V != null) {
                        var5 |= var7.V.a();
                     }
                  }
               }

               if(!var5) {
                  this.d();
               }

               if(this.r && this.o != null && this.n == 5) {
                  this.o.c();
                  this.r = false;
               }
            }
         }

      }
   }

   public void a(int param1, b param2) {
      // $FF: Couldn't be decompiled
   }

   void a(int var1, boolean var2) {
      this.a(var1, 0, 0, var2);
   }

   public void a(Configuration var1) {
      if(this.g != null) {
         for(int var2 = 0; var2 < this.g.size(); ++var2) {
            Fragment var3 = (Fragment)this.g.get(var2);
            if(var3 != null) {
               var3.a(var1);
            }
         }
      }

   }

   public void a(Bundle var1, String var2, Fragment var3) {
      if(var3.o < 0) {
         this.a((RuntimeException)(new IllegalStateException("Fragment " + var3 + " is not currently in the FragmentManager")));
      }

      var1.putInt(var2, var3.o);
   }

   void a(Parcelable var1, ArrayList var2) {
      if(var1 != null) {
         FragmentManagerState var6 = (FragmentManagerState)var1;
         if(var6.a != null) {
            int var3;
            Fragment var4;
            FragmentState var5;
            if(var2 != null) {
               for(var3 = 0; var3 < var2.size(); ++var3) {
                  var4 = (Fragment)var2.get(var3);
                  if(a) {
                     Log.v("FragmentManager", "restoreAllState: re-attaching retained " + var4);
                  }

                  var5 = var6.a[var4.o];
                  var5.k = var4;
                  var4.n = null;
                  var4.A = 0;
                  var4.y = false;
                  var4.u = false;
                  var4.r = null;
                  if(var5.j != null) {
                     var5.j.setClassLoader(this.o.getClassLoader());
                     var4.n = var5.j.getSparseParcelableArray("android:view_state");
                  }
               }
            }

            this.f = new ArrayList(var6.a.length);
            if(this.h != null) {
               this.h.clear();
            }

            for(var3 = 0; var3 < var6.a.length; ++var3) {
               var5 = var6.a[var3];
               if(var5 != null) {
                  var4 = var5.a(this.o, this.q);
                  if(a) {
                     Log.v("FragmentManager", "restoreAllState: active #" + var3 + ": " + var4);
                  }

                  this.f.add(var4);
                  var5.k = null;
               } else {
                  this.f.add((Object)null);
                  if(this.h == null) {
                     this.h = new ArrayList();
                  }

                  if(a) {
                     Log.v("FragmentManager", "restoreAllState: avail #" + var3);
                  }

                  this.h.add(Integer.valueOf(var3));
               }
            }

            if(var2 != null) {
               for(var3 = 0; var3 < var2.size(); ++var3) {
                  var4 = (Fragment)var2.get(var3);
                  if(var4.s >= 0) {
                     if(var4.s < this.f.size()) {
                        var4.r = (Fragment)this.f.get(var4.s);
                     } else {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + var4 + " target no longer exists: " + var4.s);
                        var4.r = null;
                     }
                  }
               }
            }

            if(var6.b != null) {
               this.g = new ArrayList(var6.b.length);

               for(var3 = 0; var3 < var6.b.length; ++var3) {
                  Fragment var7 = (Fragment)this.f.get(var6.b[var3]);
                  if(var7 == null) {
                     this.a((RuntimeException)(new IllegalStateException("No instantiated fragment for index #" + var6.b[var3])));
                  }

                  var7.u = true;
                  if(a) {
                     Log.v("FragmentManager", "restoreAllState: added #" + var3 + ": " + var7);
                  }

                  if(this.g.contains(var7)) {
                     throw new IllegalStateException("Already added!");
                  }

                  this.g.add(var7);
               }
            } else {
               this.g = null;
            }

            if(var6.c != null) {
               this.i = new ArrayList(var6.c.length);

               for(var3 = 0; var3 < var6.c.length; ++var3) {
                  b var8 = var6.c[var3].a(this);
                  if(a) {
                     Log.v("FragmentManager", "restoreAllState: back stack #" + var3 + " (index " + var8.o + "): " + var8);
                     var8.a("  ", new PrintWriter(new android.support.v4.b.e("FragmentManager")), false);
                  }

                  this.i.add(var8);
                  if(var8.o >= 0) {
                     this.a(var8.o, var8);
                  }
               }
            } else {
               this.i = null;
            }
         }
      }

   }

   public void a(Fragment var1) {
      if(var1.T) {
         if(this.e) {
            this.v = true;
         } else {
            var1.T = false;
            this.a(var1, this.n, 0, 0, false);
         }
      }

   }

   public void a(Fragment var1, int var2, int var3) {
      if(a) {
         Log.v("FragmentManager", "remove: " + var1 + " nesting=" + var1.A);
      }

      boolean var4;
      if(!var1.h()) {
         var4 = true;
      } else {
         var4 = false;
      }

      if(!var1.J || var4) {
         if(this.g != null) {
            this.g.remove(var1);
         }

         if(var1.M && var1.N) {
            this.r = true;
         }

         var1.u = false;
         var1.v = true;
         byte var5;
         if(var4) {
            var5 = 0;
         } else {
            var5 = 1;
         }

         this.a(var1, var5, var2, var3, false);
      }

   }

   void a(Fragment var1, int var2, int var3, int var4, boolean var5) {
      int var6;
      label234: {
         if(var1.u) {
            var6 = var2;
            if(!var1.J) {
               break label234;
            }
         }

         var6 = var2;
         if(var2 > 1) {
            var6 = 1;
         }
      }

      int var7 = var6;
      if(var1.v) {
         var7 = var6;
         if(var6 > var1.j) {
            var7 = var1.j;
         }
      }

      var2 = var7;
      if(var1.T) {
         var2 = var7;
         if(var1.j < 4) {
            var2 = var7;
            if(var7 > 3) {
               var2 = 3;
            }
         }
      }

      if(var1.j < var2) {
         if(var1.x && !var1.y) {
            return;
         }

         if(var1.k != null) {
            var1.k = null;
            this.a(var1, var1.l, 0, 0, true);
         }

         var6 = var2;
         int var8 = var2;
         var7 = var2;
         switch(var1.j) {
         case 0:
            if(a) {
               Log.v("FragmentManager", "moveto CREATED: " + var1);
            }

            var7 = var2;
            if(var1.m != null) {
               var1.n = var1.m.getSparseParcelableArray("android:view_state");
               var1.r = this.a(var1.m, "android:target_state");
               if(var1.r != null) {
                  var1.t = var1.m.getInt("android:target_req_state", 0);
               }

               var1.U = var1.m.getBoolean("android:user_visible_hint", true);
               var7 = var2;
               if(!var1.U) {
                  var1.T = true;
                  var7 = var2;
                  if(var2 > 3) {
                     var7 = 3;
                  }
               }
            }

            var1.C = this.o;
            var1.E = this.q;
            o var9;
            if(this.q != null) {
               var9 = this.q.D;
            } else {
               var9 = this.o.b;
            }

            var1.B = var9;
            var1.O = false;
            var1.a((Activity)this.o);
            if(!var1.O) {
               throw new ag("Fragment " + var1 + " did not call through to super.onAttach()");
            }

            if(var1.E == null) {
               this.o.a(var1);
            }

            if(!var1.L) {
               var1.i(var1.m);
            }

            var1.L = false;
            var6 = var7;
            if(var1.x) {
               var1.R = var1.b(var1.b(var1.m), (ViewGroup)null, var1.m);
               if(var1.R != null) {
                  var1.S = var1.R;
                  var1.R = af.a(var1.R);
                  if(var1.I) {
                     var1.R.setVisibility(8);
                  }

                  var1.a(var1.R, var1.m);
                  var6 = var7;
               } else {
                  var1.S = null;
                  var6 = var7;
               }
            }
         case 1:
            var8 = var6;
            if(var6 > 1) {
               if(a) {
                  Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + var1);
               }

               if(!var1.x) {
                  ViewGroup var11;
                  if(var1.G != 0) {
                     ViewGroup var10 = (ViewGroup)this.p.a(var1.G);
                     var11 = var10;
                     if(var10 == null) {
                        var11 = var10;
                        if(!var1.z) {
                           this.a((RuntimeException)(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(var1.G) + " (" + var1.l().getResourceName(var1.G) + ") for fragment " + var1)));
                           var11 = var10;
                        }
                     }
                  } else {
                     var11 = null;
                  }

                  var1.Q = var11;
                  var1.R = var1.b(var1.b(var1.m), var11, var1.m);
                  if(var1.R != null) {
                     var1.S = var1.R;
                     var1.R = af.a(var1.R);
                     if(var11 != null) {
                        Animation var12 = this.a(var1, var3, true, var4);
                        if(var12 != null) {
                           var1.R.startAnimation(var12);
                        }

                        var11.addView(var1.R);
                     }

                     if(var1.I) {
                        var1.R.setVisibility(8);
                     }

                     var1.a(var1.R, var1.m);
                  } else {
                     var1.S = null;
                  }
               }

               var1.j(var1.m);
               if(var1.R != null) {
                  var1.f(var1.m);
               }

               var1.m = null;
               var8 = var6;
            }
         case 2:
         case 3:
            var7 = var8;
            if(var8 > 3) {
               if(a) {
                  Log.v("FragmentManager", "moveto STARTED: " + var1);
               }

               var1.x();
               var7 = var8;
            }
         case 4:
            var6 = var7;
            if(var7 > 4) {
               if(a) {
                  Log.v("FragmentManager", "moveto RESUMED: " + var1);
               }

               var1.w = true;
               var1.y();
               var1.m = null;
               var1.n = null;
               var6 = var7;
            }
            break;
         default:
            var6 = var2;
         }
      } else {
         var6 = var2;
         if(var1.j > var2) {
            switch(var1.j) {
            case 5:
               if(var2 < 5) {
                  if(a) {
                     Log.v("FragmentManager", "movefrom RESUMED: " + var1);
                  }

                  var1.A();
                  var1.w = false;
               }
            case 4:
               if(var2 < 4) {
                  if(a) {
                     Log.v("FragmentManager", "movefrom STARTED: " + var1);
                  }

                  var1.B();
               }
            case 3:
               if(var2 < 3) {
                  if(a) {
                     Log.v("FragmentManager", "movefrom STOPPED: " + var1);
                  }

                  var1.C();
               }
            case 2:
               if(var2 < 2) {
                  if(a) {
                     Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + var1);
                  }

                  if(var1.R != null && !this.o.isFinishing() && var1.n == null) {
                     this.e(var1);
                  }

                  var1.D();
                  if(var1.R != null && var1.Q != null) {
                     Animation var13;
                     if(this.n > 0 && !this.t) {
                        var13 = this.a(var1, var3, false, var4);
                     } else {
                        var13 = null;
                     }

                     if(var13 != null) {
                        var1.k = var1.R;
                        var1.l = var2;
                        var13.setAnimationListener(new r(this, var1));
                        var1.R.startAnimation(var13);
                     }

                     var1.Q.removeView(var1.R);
                  }

                  var1.Q = null;
                  var1.R = null;
                  var1.S = null;
               }
            case 1:
               var6 = var2;
               if(var2 < 1) {
                  if(this.t && var1.k != null) {
                     View var14 = var1.k;
                     var1.k = null;
                     var14.clearAnimation();
                  }

                  if(var1.k != null) {
                     var1.l = var2;
                     var6 = 1;
                  } else {
                     if(a) {
                        Log.v("FragmentManager", "movefrom CREATED: " + var1);
                     }

                     if(!var1.L) {
                        var1.E();
                     }

                     var1.O = false;
                     var1.d();
                     if(!var1.O) {
                        throw new ag("Fragment " + var1 + " did not call through to super.onDetach()");
                     }

                     var6 = var2;
                     if(!var5) {
                        if(!var1.L) {
                           this.d(var1);
                           var6 = var2;
                        } else {
                           var1.C = null;
                           var1.E = null;
                           var1.B = null;
                           var1.D = null;
                           var6 = var2;
                        }
                     }
                  }
               }
               break;
            default:
               var6 = var2;
            }
         }
      }

      var1.j = var6;
   }

   public void a(Fragment var1, boolean var2) {
      if(this.g == null) {
         this.g = new ArrayList();
      }

      if(a) {
         Log.v("FragmentManager", "add: " + var1);
      }

      this.c(var1);
      if(!var1.J) {
         if(this.g.contains(var1)) {
            throw new IllegalStateException("Fragment already added: " + var1);
         }

         this.g.add(var1);
         var1.u = true;
         var1.v = false;
         if(var1.M && var1.N) {
            this.r = true;
         }

         if(var2) {
            this.b(var1);
         }
      }

   }

   public void a(FragmentActivity var1, l var2, Fragment var3) {
      if(this.o != null) {
         throw new IllegalStateException("Already attached");
      } else {
         this.o = var1;
         this.p = var2;
         this.q = var3;
      }
   }

   public void a(Runnable param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(String param1, FileDescriptor param2, PrintWriter param3, String[] param4) {
      // $FF: Couldn't be decompiled
   }

   boolean a(Handler var1, String var2, int var3, int var4) {
      boolean var8 = false;
      boolean var7;
      if(this.i == null) {
         var7 = var8;
      } else {
         if(var2 == null && var3 < 0 && (var4 & 1) == 0) {
            var3 = this.i.size() - 1;
            var7 = var8;
            if(var3 < 0) {
               return var7;
            }

            ((b)this.i.remove(var3)).b(true);
            this.f();
         } else {
            int var5 = -1;
            if(var2 != null || var3 >= 0) {
               int var6;
               b var9;
               for(var6 = this.i.size() - 1; var6 >= 0; --var6) {
                  var9 = (b)this.i.get(var6);
                  if(var2 != null && var2.equals(var9.c()) || var3 >= 0 && var3 == var9.o) {
                     break;
                  }
               }

               var7 = var8;
               if(var6 < 0) {
                  return var7;
               }

               var5 = var6;
               if((var4 & 1) != 0) {
                  var4 = var6 - 1;

                  while(true) {
                     var5 = var4;
                     if(var4 < 0) {
                        break;
                     }

                     var9 = (b)this.i.get(var4);
                     if(var2 == null || !var2.equals(var9.c())) {
                        var5 = var4;
                        if(var3 < 0) {
                           break;
                        }

                        var5 = var4;
                        if(var3 != var9.o) {
                           break;
                        }
                     }

                     --var4;
                  }
               }
            }

            var7 = var8;
            if(var5 == this.i.size() - 1) {
               return var7;
            }

            ArrayList var10 = new ArrayList();

            for(var3 = this.i.size() - 1; var3 > var5; --var3) {
               var10.add(this.i.remove(var3));
            }

            var4 = var10.size() - 1;

            for(var3 = 0; var3 <= var4; ++var3) {
               if(a) {
                  Log.v("FragmentManager", "Popping back stack state: " + var10.get(var3));
               }

               b var11 = (b)var10.get(var3);
               if(var3 == var4) {
                  var7 = true;
               } else {
                  var7 = false;
               }

               var11.b(var7);
            }

            this.f();
         }

         var7 = true;
      }

      return var7;
   }

   public boolean a(Menu var1) {
      boolean var4;
      if(this.g != null) {
         int var2 = 0;
         boolean var3 = false;

         while(true) {
            var4 = var3;
            if(var2 >= this.g.size()) {
               break;
            }

            Fragment var5 = (Fragment)this.g.get(var2);
            var4 = var3;
            if(var5 != null) {
               var4 = var3;
               if(var5.c(var1)) {
                  var4 = true;
               }
            }

            ++var2;
            var3 = var4;
         }
      } else {
         var4 = false;
      }

      return var4;
   }

   public boolean a(Menu var1, MenuInflater var2) {
      byte var4 = 0;
      ArrayList var8 = null;
      ArrayList var7 = null;
      int var3;
      boolean var6;
      if(this.g != null) {
         var3 = 0;
         boolean var5 = false;

         while(true) {
            var8 = var7;
            var6 = var5;
            if(var3 >= this.g.size()) {
               break;
            }

            Fragment var9 = (Fragment)this.g.get(var3);
            var8 = var7;
            var6 = var5;
            if(var9 != null) {
               var8 = var7;
               var6 = var5;
               if(var9.b(var1, var2)) {
                  var6 = true;
                  var8 = var7;
                  if(var7 == null) {
                     var8 = new ArrayList();
                  }

                  var8.add(var9);
               }
            }

            ++var3;
            var5 = var6;
            var7 = var8;
         }
      } else {
         var6 = false;
      }

      if(this.j != null) {
         for(var3 = var4; var3 < this.j.size(); ++var3) {
            Fragment var10 = (Fragment)this.j.get(var3);
            if(var8 == null || !var8.contains(var10)) {
               var10.v();
            }
         }
      }

      this.j = var8;
      return var6;
   }

   public boolean a(MenuItem var1) {
      boolean var4 = false;
      boolean var3 = var4;
      if(this.g != null) {
         int var2 = 0;

         while(true) {
            var3 = var4;
            if(var2 >= this.g.size()) {
               break;
            }

            Fragment var5 = (Fragment)this.g.get(var2);
            if(var5 != null && var5.c(var1)) {
               var3 = true;
               break;
            }

            ++var2;
         }
      }

      return var3;
   }

   public void b(int param1) {
      // $FF: Couldn't be decompiled
   }

   void b(Fragment var1) {
      this.a(var1, this.n, 0, 0, false);
   }

   public void b(Fragment var1, int var2, int var3) {
      if(a) {
         Log.v("FragmentManager", "hide: " + var1);
      }

      if(!var1.I) {
         var1.I = true;
         if(var1.R != null) {
            Animation var4 = this.a(var1, var2, false, var3);
            if(var4 != null) {
               var1.R.startAnimation(var4);
            }

            var1.R.setVisibility(8);
         }

         if(var1.u && var1.M && var1.N) {
            this.r = true;
         }

         var1.b(true);
      }

   }

   void b(b var1) {
      if(this.i == null) {
         this.i = new ArrayList();
      }

      this.i.add(var1);
      this.f();
   }

   public void b(Menu var1) {
      if(this.g != null) {
         for(int var2 = 0; var2 < this.g.size(); ++var2) {
            Fragment var3 = (Fragment)this.g.get(var2);
            if(var3 != null) {
               var3.d(var1);
            }
         }
      }

   }

   public boolean b() {
      return this.e();
   }

   public boolean b(MenuItem var1) {
      boolean var4 = false;
      boolean var3 = var4;
      if(this.g != null) {
         int var2 = 0;

         while(true) {
            var3 = var4;
            if(var2 >= this.g.size()) {
               break;
            }

            Fragment var5 = (Fragment)this.g.get(var2);
            if(var5 != null && var5.d(var1)) {
               var3 = true;
               break;
            }

            ++var2;
         }
      }

      return var3;
   }

   void c(Fragment var1) {
      if(var1.o < 0) {
         if(this.h != null && this.h.size() > 0) {
            var1.a(((Integer)this.h.remove(this.h.size() - 1)).intValue(), this.q);
            this.f.set(var1.o, var1);
         } else {
            if(this.f == null) {
               this.f = new ArrayList();
            }

            var1.a(this.f.size(), this.q);
            this.f.add(var1);
         }

         if(a) {
            Log.v("FragmentManager", "Allocated fragment index " + var1);
         }
      }

   }

   public void c(Fragment var1, int var2, int var3) {
      if(a) {
         Log.v("FragmentManager", "show: " + var1);
      }

      if(var1.I) {
         var1.I = false;
         if(var1.R != null) {
            Animation var4 = this.a(var1, var2, true, var3);
            if(var4 != null) {
               var1.R.startAnimation(var4);
            }

            var1.R.setVisibility(0);
         }

         if(var1.u && var1.M && var1.N) {
            this.r = true;
         }

         var1.b(false);
      }

   }

   public boolean c() {
      this.t();
      this.b();
      return this.a(this.o.a, (String)null, -1, 0);
   }

   void d() {
      if(this.f != null) {
         for(int var1 = 0; var1 < this.f.size(); ++var1) {
            Fragment var2 = (Fragment)this.f.get(var1);
            if(var2 != null) {
               this.a(var2);
            }
         }
      }

   }

   void d(Fragment var1) {
      if(var1.o >= 0) {
         if(a) {
            Log.v("FragmentManager", "Freeing fragment index " + var1);
         }

         this.f.set(var1.o, (Object)null);
         if(this.h == null) {
            this.h = new ArrayList();
         }

         this.h.add(Integer.valueOf(var1.o));
         this.o.a(var1.p);
         var1.u();
      }

   }

   public void d(Fragment var1, int var2, int var3) {
      if(a) {
         Log.v("FragmentManager", "detach: " + var1);
      }

      if(!var1.J) {
         var1.J = true;
         if(var1.u) {
            if(this.g != null) {
               if(a) {
                  Log.v("FragmentManager", "remove from detach: " + var1);
               }

               this.g.remove(var1);
            }

            if(var1.M && var1.N) {
               this.r = true;
            }

            var1.u = false;
            this.a(var1, 1, var2, var3, false);
         }
      }

   }

   void e(Fragment var1) {
      if(var1.S != null) {
         if(this.x == null) {
            this.x = new SparseArray();
         } else {
            this.x.clear();
         }

         var1.S.saveHierarchyState(this.x);
         if(this.x.size() > 0) {
            var1.n = this.x;
            this.x = null;
         }
      }

   }

   public void e(Fragment var1, int var2, int var3) {
      if(a) {
         Log.v("FragmentManager", "attach: " + var1);
      }

      if(var1.J) {
         var1.J = false;
         if(!var1.u) {
            if(this.g == null) {
               this.g = new ArrayList();
            }

            if(this.g.contains(var1)) {
               throw new IllegalStateException("Fragment already added: " + var1);
            }

            if(a) {
               Log.v("FragmentManager", "add from attach: " + var1);
            }

            this.g.add(var1);
            var1.u = true;
            if(var1.M && var1.N) {
               this.r = true;
            }

            this.a(var1, this.n, var2, var3, false);
         }
      }

   }

   public boolean e() {
      // $FF: Couldn't be decompiled
   }

   Bundle f(Fragment var1) {
      if(this.w == null) {
         this.w = new Bundle();
      }

      var1.k(this.w);
      Bundle var3;
      if(!this.w.isEmpty()) {
         var3 = this.w;
         this.w = null;
      } else {
         var3 = null;
      }

      if(var1.R != null) {
         this.e(var1);
      }

      Bundle var2 = var3;
      if(var1.n != null) {
         var2 = var3;
         if(var3 == null) {
            var2 = new Bundle();
         }

         var2.putSparseParcelableArray("android:view_state", var1.n);
      }

      var3 = var2;
      if(!var1.U) {
         var3 = var2;
         if(var2 == null) {
            var3 = new Bundle();
         }

         var3.putBoolean("android:user_visible_hint", var1.U);
      }

      return var3;
   }

   void f() {
      if(this.m != null) {
         for(int var1 = 0; var1 < this.m.size(); ++var1) {
            ((n)this.m.get(var1)).a();
         }
      }

   }

   ArrayList g() {
      ArrayList var4 = null;
      ArrayList var3 = null;
      if(this.f != null) {
         int var1 = 0;

         while(true) {
            var4 = var3;
            if(var1 >= this.f.size()) {
               break;
            }

            Fragment var6 = (Fragment)this.f.get(var1);
            ArrayList var5 = var3;
            if(var6 != null) {
               var5 = var3;
               if(var6.K) {
                  var4 = var3;
                  if(var3 == null) {
                     var4 = new ArrayList();
                  }

                  var4.add(var6);
                  var6.L = true;
                  int var2;
                  if(var6.r != null) {
                     var2 = var6.r.o;
                  } else {
                     var2 = -1;
                  }

                  var6.s = var2;
                  var5 = var4;
                  if(a) {
                     Log.v("FragmentManager", "retainNonConfig: keeping retained " + var6);
                     var5 = var4;
                  }
               }
            }

            ++var1;
            var3 = var5;
         }
      }

      return var4;
   }

   Parcelable h() {
      BackStackState[] var6 = null;
      BackStackState[] var5 = null;
      this.e();
      if(b) {
         this.s = true;
      }

      FragmentManagerState var4 = var5;
      if(this.f != null) {
         if(this.f.size() <= 0) {
            var4 = var5;
         } else {
            int var3 = this.f.size();
            FragmentState[] var7 = new FragmentState[var3];
            int var2 = 0;

            boolean var1;
            for(var1 = false; var2 < var3; ++var2) {
               Fragment var10 = (Fragment)this.f.get(var2);
               if(var10 != null) {
                  if(var10.o < 0) {
                     this.a((RuntimeException)(new IllegalStateException("Failure saving state: active " + var10 + " has cleared index: " + var10.o)));
                  }

                  FragmentState var8 = new FragmentState(var10);
                  var7[var2] = var8;
                  if(var10.j > 0 && var8.j == null) {
                     var8.j = this.f(var10);
                     if(var10.r != null) {
                        if(var10.r.o < 0) {
                           this.a((RuntimeException)(new IllegalStateException("Failure saving state: " + var10 + " has target not in fragment manager: " + var10.r)));
                        }

                        if(var8.j == null) {
                           var8.j = new Bundle();
                        }

                        this.a(var8.j, "android:target_state", var10.r);
                        if(var10.t != 0) {
                           var8.j.putInt("android:target_req_state", var10.t);
                        }
                     }
                  } else {
                     var8.j = var10.m;
                  }

                  if(a) {
                     Log.v("FragmentManager", "Saved state of " + var10 + ": " + var8.j);
                  }

                  var1 = true;
               }
            }

            if(!var1) {
               var4 = var5;
               if(a) {
                  Log.v("FragmentManager", "saveAllState: no fragments!");
                  var4 = var5;
               }
            } else {
               int var9;
               int[] var12;
               label84: {
                  if(this.g != null) {
                     var2 = this.g.size();
                     if(var2 > 0) {
                        int[] var11 = new int[var2];
                        var9 = 0;

                        while(true) {
                           var12 = var11;
                           if(var9 >= var2) {
                              break label84;
                           }

                           var11[var9] = ((Fragment)this.g.get(var9)).o;
                           if(var11[var9] < 0) {
                              this.a((RuntimeException)(new IllegalStateException("Failure saving state: active " + this.g.get(var9) + " has cleared index: " + var11[var9])));
                           }

                           if(a) {
                              Log.v("FragmentManager", "saveAllState: adding fragment #" + var9 + ": " + this.g.get(var9));
                           }

                           ++var9;
                        }
                     }
                  }

                  var12 = null;
               }

               var5 = var6;
               if(this.i != null) {
                  var2 = this.i.size();
                  var5 = var6;
                  if(var2 > 0) {
                     var6 = new BackStackState[var2];
                     var9 = 0;

                     while(true) {
                        var5 = var6;
                        if(var9 >= var2) {
                           break;
                        }

                        var6[var9] = new BackStackState(this, (b)this.i.get(var9));
                        if(a) {
                           Log.v("FragmentManager", "saveAllState: adding back stack #" + var9 + ": " + this.i.get(var9));
                        }

                        ++var9;
                     }
                  }
               }

               FragmentManagerState var13 = new FragmentManagerState();
               var13.a = var7;
               var13.b = var12;
               var13.c = var5;
               var4 = var13;
            }
         }
      }

      return var4;
   }

   public void i() {
      this.s = false;
   }

   public void j() {
      this.s = false;
      this.a(1, false);
   }

   public void k() {
      this.s = false;
      this.a(2, false);
   }

   public void l() {
      this.s = false;
      this.a(4, false);
   }

   public void m() {
      this.s = false;
      this.a(5, false);
   }

   public void n() {
      this.a(4, false);
   }

   public void o() {
      this.s = true;
      this.a(3, false);
   }

   public void p() {
      this.a(2, false);
   }

   public void q() {
      this.a(1, false);
   }

   public void r() {
      this.t = true;
      this.e();
      this.a(0, false);
      this.o = null;
      this.p = null;
      this.q = null;
   }

   public void s() {
      if(this.g != null) {
         for(int var1 = 0; var1 < this.g.size(); ++var1) {
            Fragment var2 = (Fragment)this.g.get(var1);
            if(var2 != null) {
               var2.z();
            }
         }
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("FragmentManager{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" in ");
      if(this.q != null) {
         android.support.v4.b.d.a(this.q, var1);
      } else {
         android.support.v4.b.d.a(this.o, var1);
      }

      var1.append("}}");
      return var1.toString();
   }
}

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.support.v4.app.Fragment;
import android.support.v4.app.a;
import android.support.v4.app.ad;
import android.support.v4.app.h;
import android.support.v4.app.i;
import android.support.v4.app.j;
import android.support.v4.app.k;
import android.support.v4.app.l;
import android.support.v4.app.m;
import android.support.v4.app.o;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FragmentActivity extends Activity {
   final Handler a = new h(this);
   final o b = new o();
   final l c = new i(this);
   boolean d;
   boolean e;
   boolean f;
   boolean g;
   boolean h;
   boolean i;
   boolean j;
   boolean k;
   android.support.v4.b.l l;
   ad m;

   private static String a(View param0) {
      // $FF: Couldn't be decompiled
   }

   private void a(String var1, PrintWriter var2, View var3) {
      var2.print(var1);
      if(var3 == null) {
         var2.println("null");
      } else {
         var2.println(a(var3));
         if(var3 instanceof ViewGroup) {
            ViewGroup var6 = (ViewGroup)var3;
            int var5 = var6.getChildCount();
            if(var5 > 0) {
               var1 = var1 + "  ";

               for(int var4 = 0; var4 < var5; ++var4) {
                  this.a(var1, var2, var6.getChildAt(var4));
               }
            }
         }
      }

   }

   ad a(String var1, boolean var2, boolean var3) {
      if(this.l == null) {
         this.l = new android.support.v4.b.l();
      }

      ad var4 = (ad)this.l.get(var1);
      if(var4 == null) {
         if(var3) {
            var4 = new ad(var1, this, var2);
            this.l.put(var1, var4);
         }
      } else {
         var4.a(this);
      }

      return var4;
   }

   protected void a() {
      this.b.m();
   }

   public void a(Fragment var1) {
   }

   public void a(Fragment var1, Intent var2, int var3) {
      if(var3 == -1) {
         super.startActivityForResult(var2, -1);
      } else {
         if((-65536 & var3) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
         }

         super.startActivityForResult(var2, (var1.o + 1 << 16) + ('\uffff' & var3));
      }

   }

   void a(String var1) {
      if(this.l != null) {
         ad var2 = (ad)this.l.get(var1);
         if(var2 != null && !var2.g) {
            var2.h();
            this.l.remove(var1);
         }
      }

   }

   void a(boolean var1) {
      if(!this.g) {
         this.g = true;
         this.h = var1;
         this.a.removeMessages(1);
         this.d();
      }

   }

   protected boolean a(View var1, Menu var2) {
      return super.onPreparePanel(0, var1, var2);
   }

   public Object b() {
      return null;
   }

   public void c() {
      if(VERSION.SDK_INT >= 11) {
         a.a(this);
      } else {
         this.i = true;
      }

   }

   void d() {
      if(this.k) {
         this.k = false;
         if(this.m != null) {
            if(!this.h) {
               this.m.c();
            } else {
               this.m.d();
            }
         }
      }

      this.b.p();
   }

   public void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      if(VERSION.SDK_INT >= 11) {
         ;
      }

      var3.print(var1);
      var3.print("Local FragmentActivity ");
      var3.print(Integer.toHexString(System.identityHashCode(this)));
      var3.println(" State:");
      String var5 = var1 + "  ";
      var3.print(var5);
      var3.print("mCreated=");
      var3.print(this.d);
      var3.print("mResumed=");
      var3.print(this.e);
      var3.print(" mStopped=");
      var3.print(this.f);
      var3.print(" mReallyStopped=");
      var3.println(this.g);
      var3.print(var5);
      var3.print("mLoadersStarted=");
      var3.println(this.k);
      if(this.m != null) {
         var3.print(var1);
         var3.print("Loader Manager ");
         var3.print(Integer.toHexString(System.identityHashCode(this.m)));
         var3.println(":");
         this.m.a(var1 + "  ", var2, var3, var4);
      }

      this.b.a(var1, var2, var3, var4);
      var3.print(var1);
      var3.println("View Hierarchy:");
      this.a(var1 + "  ", var3, this.getWindow().getDecorView());
   }

   public m e() {
      return this.b;
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      this.b.i();
      int var4 = var1 >> 16;
      if(var4 != 0) {
         --var4;
         if(this.b.f != null && var4 >= 0 && var4 < this.b.f.size()) {
            Fragment var5 = (Fragment)this.b.f.get(var4);
            if(var5 == null) {
               Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(var1));
            } else {
               var5.a('\uffff' & var1, var2, var3);
            }
         } else {
            Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(var1));
         }
      } else {
         super.onActivityResult(var1, var2, var3);
      }

   }

   public void onBackPressed() {
      if(!this.b.c()) {
         this.finish();
      }

   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      this.b.a(var1);
   }

   protected void onCreate(Bundle var1) {
      this.b.a((FragmentActivity)this, (l)this.c, (Fragment)null);
      if(this.getLayoutInflater().getFactory() == null) {
         this.getLayoutInflater().setFactory(this);
      }

      super.onCreate(var1);
      k var4 = (k)this.getLastNonConfigurationInstance();
      if(var4 != null) {
         this.l = var4.e;
      }

      if(var1 != null) {
         Parcelable var3 = var1.getParcelable("android:support:fragments");
         o var2 = this.b;
         ArrayList var5;
         if(var4 != null) {
            var5 = var4.d;
         } else {
            var5 = null;
         }

         var2.a(var3, var5);
      }

      this.b.j();
   }

   public boolean onCreatePanelMenu(int var1, Menu var2) {
      boolean var3;
      if(var1 == 0) {
         var3 = super.onCreatePanelMenu(var1, var2) | this.b.a(var2, this.getMenuInflater());
         if(VERSION.SDK_INT < 11) {
            var3 = true;
         }
      } else {
         var3 = super.onCreatePanelMenu(var1, var2);
      }

      return var3;
   }

   public View onCreateView(String var1, Context var2, AttributeSet var3) {
      Object var7 = null;
      View var10;
      if(!"fragment".equals(var1)) {
         var10 = super.onCreateView(var1, var2, var3);
      } else {
         String var8 = var3.getAttributeValue((String)null, "class");
         TypedArray var9 = var2.obtainStyledAttributes(var3, j.a);
         String var6 = var8;
         if(var8 == null) {
            var6 = var9.getString(0);
         }

         int var5 = var9.getResourceId(1, -1);
         var8 = var9.getString(2);
         var9.recycle();
         if(!Fragment.b((Context)this, (String)var6)) {
            var10 = super.onCreateView(var1, var2, var3);
         } else {
            if(false) {
               throw new NullPointerException();
            }

            if(-1 == 0 && var5 == -1 && var8 == null) {
               throw new IllegalArgumentException(var3.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + var6);
            }

            Fragment var12 = (Fragment)var7;
            if(var5 != -1) {
               var12 = this.b.a(var5);
            }

            Fragment var11 = var12;
            if(var12 == null) {
               var11 = var12;
               if(var8 != null) {
                  var11 = this.b.a(var8);
               }
            }

            var12 = var11;
            if(var11 == null) {
               var12 = var11;
               if(-1 != 0) {
                  var12 = this.b.a(0);
               }
            }

            if(o.a) {
               Log.v("FragmentActivity", "onCreateView: id=0x" + Integer.toHexString(var5) + " fname=" + var6 + " existing=" + var12);
            }

            if(var12 == null) {
               var11 = Fragment.a((Context)this, (String)var6);
               var11.x = true;
               int var4;
               if(var5 != 0) {
                  var4 = var5;
               } else {
                  var4 = 0;
               }

               var11.F = var4;
               var11.G = 0;
               var11.H = var8;
               var11.y = true;
               var11.B = this.b;
               var11.a((Activity)this, (AttributeSet)var3, var11.m);
               this.b.a(var11, true);
            } else {
               if(var12.y) {
                  throw new IllegalArgumentException(var3.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(var5) + ", tag " + var8 + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + var6);
               }

               var12.y = true;
               if(!var12.L) {
                  var12.a((Activity)this, (AttributeSet)var3, var12.m);
               }

               this.b.b(var12);
               var11 = var12;
            }

            if(var11.R == null) {
               throw new IllegalStateException("Fragment " + var6 + " did not create a view.");
            }

            if(var5 != 0) {
               var11.R.setId(var5);
            }

            if(var11.R.getTag() == null) {
               var11.R.setTag(var8);
            }

            var10 = var11.R;
         }
      }

      return var10;
   }

   protected void onDestroy() {
      super.onDestroy();
      this.a(false);
      this.b.r();
      if(this.m != null) {
         this.m.h();
      }

   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3;
      if(VERSION.SDK_INT < 5 && var1 == 4 && var2.getRepeatCount() == 0) {
         this.onBackPressed();
         var3 = true;
      } else {
         var3 = super.onKeyDown(var1, var2);
      }

      return var3;
   }

   public void onLowMemory() {
      super.onLowMemory();
      this.b.s();
   }

   public boolean onMenuItemSelected(int var1, MenuItem var2) {
      boolean var3;
      if(super.onMenuItemSelected(var1, var2)) {
         var3 = true;
      } else {
         switch(var1) {
         case 0:
            var3 = this.b.a(var2);
            break;
         case 6:
            var3 = this.b.b(var2);
            break;
         default:
            var3 = false;
         }
      }

      return var3;
   }

   protected void onNewIntent(Intent var1) {
      super.onNewIntent(var1);
      this.b.i();
   }

   public void onPanelClosed(int var1, Menu var2) {
      switch(var1) {
      case 0:
         this.b.b(var2);
      default:
         super.onPanelClosed(var1, var2);
      }
   }

   protected void onPause() {
      super.onPause();
      this.e = false;
      if(this.a.hasMessages(2)) {
         this.a.removeMessages(2);
         this.a();
      }

      this.b.n();
   }

   protected void onPostResume() {
      super.onPostResume();
      this.a.removeMessages(2);
      this.a();
      this.b.e();
   }

   public boolean onPreparePanel(int var1, View var2, Menu var3) {
      boolean var4;
      if(var1 == 0 && var3 != null) {
         if(this.i) {
            this.i = false;
            var3.clear();
            this.onCreatePanelMenu(var1, var3);
         }

         var4 = this.a(var2, var3) | this.b.a(var3);
      } else {
         var4 = super.onPreparePanel(var1, var2, var3);
      }

      return var4;
   }

   protected void onResume() {
      super.onResume();
      this.a.sendEmptyMessage(2);
      this.e = true;
      this.b.e();
   }

   public final Object onRetainNonConfigurationInstance() {
      int var2 = 0;
      if(this.f) {
         this.a(true);
      }

      Object var6 = this.b();
      ArrayList var7 = this.b.g();
      boolean var3;
      if(this.l != null) {
         int var4 = this.l.size();
         ad[] var5 = new ad[var4];

         for(int var1 = var4 - 1; var1 >= 0; --var1) {
            var5[var1] = (ad)this.l.c(var1);
         }

         boolean var9 = false;

         while(true) {
            var3 = var9;
            if(var2 >= var4) {
               break;
            }

            ad var8 = var5[var2];
            if(var8.g) {
               var9 = true;
            } else {
               var8.h();
               this.l.remove(var8.d);
            }

            ++var2;
         }
      } else {
         var3 = false;
      }

      k var10;
      if(var7 == null && !var3 && var6 == null) {
         var10 = null;
      } else {
         var10 = new k();
         var10.a = null;
         var10.b = var6;
         var10.c = null;
         var10.d = var7;
         var10.e = this.l;
      }

      return var10;
   }

   protected void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      Parcelable var2 = this.b.h();
      if(var2 != null) {
         var1.putParcelable("android:support:fragments", var2);
      }

   }

   protected void onStart() {
      super.onStart();
      this.f = false;
      this.g = false;
      this.a.removeMessages(1);
      if(!this.d) {
         this.d = true;
         this.b.k();
      }

      this.b.i();
      this.b.e();
      if(!this.k) {
         this.k = true;
         if(this.m != null) {
            this.m.b();
         } else if(!this.j) {
            this.m = this.a("(root)", this.k, false);
            if(this.m != null && !this.m.f) {
               this.m.b();
            }
         }

         this.j = true;
      }

      this.b.l();
      if(this.l != null) {
         int var2 = this.l.size();
         ad[] var3 = new ad[var2];

         int var1;
         for(var1 = var2 - 1; var1 >= 0; --var1) {
            var3[var1] = (ad)this.l.c(var1);
         }

         for(var1 = 0; var1 < var2; ++var1) {
            ad var4 = var3[var1];
            var4.e();
            var4.g();
         }
      }

   }

   protected void onStop() {
      super.onStop();
      this.f = true;
      this.a.sendEmptyMessage(1);
      this.b.o();
   }

   public void startActivityForResult(Intent var1, int var2) {
      if(var2 != -1 && (-65536 & var2) != 0) {
         throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
      } else {
         super.startActivityForResult(var1, var2);
      }
   }
}

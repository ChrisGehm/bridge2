package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ad;
import android.support.v4.app.ag;
import android.support.v4.app.e;
import android.support.v4.app.l;
import android.support.v4.app.m;
import android.support.v4.app.o;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnCreateContextMenuListener;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener {
   private static final android.support.v4.b.l a = new android.support.v4.b.l();
   int A;
   o B;
   FragmentActivity C;
   o D;
   Fragment E;
   int F;
   int G;
   String H;
   boolean I;
   boolean J;
   boolean K;
   boolean L;
   boolean M;
   boolean N = true;
   boolean O;
   int P;
   ViewGroup Q;
   View R;
   View S;
   boolean T;
   boolean U = true;
   ad V;
   boolean W;
   boolean X;
   int j = 0;
   View k;
   int l;
   Bundle m;
   SparseArray n;
   int o = -1;
   String p;
   Bundle q;
   Fragment r;
   int s = -1;
   int t;
   boolean u;
   boolean v;
   boolean w;
   boolean x;
   boolean y;
   boolean z;

   public static Fragment a(Context var0, String var1) {
      return a((Context)var0, (String)var1, (Bundle)null);
   }

   public static Fragment a(Context param0, String param1, Bundle param2) {
      // $FF: Couldn't be decompiled
   }

   static boolean b(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   void A() {
      if(this.D != null) {
         this.D.n();
      }

      this.O = false;
      this.s();
      if(!this.O) {
         throw new ag("Fragment " + this + " did not call through to super.onPause()");
      }
   }

   void B() {
      if(this.D != null) {
         this.D.o();
      }

      this.O = false;
      this.f();
      if(!this.O) {
         throw new ag("Fragment " + this + " did not call through to super.onStop()");
      }
   }

   void C() {
      if(this.D != null) {
         this.D.p();
      }

      if(this.W) {
         this.W = false;
         if(!this.X) {
            this.X = true;
            this.V = this.C.a(this.p, this.W, false);
         }

         if(this.V != null) {
            if(!this.C.h) {
               this.V.c();
            } else {
               this.V.d();
            }
         }
      }

   }

   void D() {
      if(this.D != null) {
         this.D.q();
      }

      this.O = false;
      this.g();
      if(!this.O) {
         throw new ag("Fragment " + this + " did not call through to super.onDestroyView()");
      } else {
         if(this.V != null) {
            this.V.f();
         }

      }
   }

   void E() {
      if(this.D != null) {
         this.D.r();
      }

      this.O = false;
      this.t();
      if(!this.O) {
         throw new ag("Fragment " + this + " did not call through to super.onDestroy()");
      }
   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return null;
   }

   public Animation a(int var1, boolean var2, int var3) {
      return null;
   }

   public final String a(int var1) {
      return this.l().getString(var1);
   }

   public void a(int var1, int var2, Intent var3) {
   }

   final void a(int var1, Fragment var2) {
      this.o = var1;
      if(var2 != null) {
         this.p = var2.p + ":" + this.o;
      } else {
         this.p = "android:fragment:" + this.o;
      }

   }

   public void a(Activity var1) {
      this.O = true;
   }

   public void a(Activity var1, AttributeSet var2, Bundle var3) {
      this.O = true;
   }

   public void a(Intent var1) {
      if(this.C == null) {
         throw new IllegalStateException("Fragment " + this + " not attached to Activity");
      } else {
         this.C.a(this, var1, -1);
      }
   }

   void a(Configuration var1) {
      this.onConfigurationChanged(var1);
      if(this.D != null) {
         this.D.a(var1);
      }

   }

   public void a(Bundle var1) {
      this.O = true;
   }

   public void a(Fragment var1, int var2) {
      this.r = var1;
      this.t = var2;
   }

   public void a(Menu var1) {
   }

   public void a(Menu var1, MenuInflater var2) {
   }

   public void a(View var1) {
      var1.setOnCreateContextMenuListener(this);
   }

   public void a(View var1, Bundle var2) {
   }

   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mFragmentId=#");
      var3.print(Integer.toHexString(this.F));
      var3.print(" mContainerId=#");
      var3.print(Integer.toHexString(this.G));
      var3.print(" mTag=");
      var3.println(this.H);
      var3.print(var1);
      var3.print("mState=");
      var3.print(this.j);
      var3.print(" mIndex=");
      var3.print(this.o);
      var3.print(" mWho=");
      var3.print(this.p);
      var3.print(" mBackStackNesting=");
      var3.println(this.A);
      var3.print(var1);
      var3.print("mAdded=");
      var3.print(this.u);
      var3.print(" mRemoving=");
      var3.print(this.v);
      var3.print(" mResumed=");
      var3.print(this.w);
      var3.print(" mFromLayout=");
      var3.print(this.x);
      var3.print(" mInLayout=");
      var3.println(this.y);
      var3.print(var1);
      var3.print("mHidden=");
      var3.print(this.I);
      var3.print(" mDetached=");
      var3.print(this.J);
      var3.print(" mMenuVisible=");
      var3.print(this.N);
      var3.print(" mHasMenu=");
      var3.println(this.M);
      var3.print(var1);
      var3.print("mRetainInstance=");
      var3.print(this.K);
      var3.print(" mRetaining=");
      var3.print(this.L);
      var3.print(" mUserVisibleHint=");
      var3.println(this.U);
      if(this.B != null) {
         var3.print(var1);
         var3.print("mFragmentManager=");
         var3.println(this.B);
      }

      if(this.C != null) {
         var3.print(var1);
         var3.print("mActivity=");
         var3.println(this.C);
      }

      if(this.E != null) {
         var3.print(var1);
         var3.print("mParentFragment=");
         var3.println(this.E);
      }

      if(this.q != null) {
         var3.print(var1);
         var3.print("mArguments=");
         var3.println(this.q);
      }

      if(this.m != null) {
         var3.print(var1);
         var3.print("mSavedFragmentState=");
         var3.println(this.m);
      }

      if(this.n != null) {
         var3.print(var1);
         var3.print("mSavedViewState=");
         var3.println(this.n);
      }

      if(this.r != null) {
         var3.print(var1);
         var3.print("mTarget=");
         var3.print(this.r);
         var3.print(" mTargetRequestCode=");
         var3.println(this.t);
      }

      if(this.P != 0) {
         var3.print(var1);
         var3.print("mNextAnim=");
         var3.println(this.P);
      }

      if(this.Q != null) {
         var3.print(var1);
         var3.print("mContainer=");
         var3.println(this.Q);
      }

      if(this.R != null) {
         var3.print(var1);
         var3.print("mView=");
         var3.println(this.R);
      }

      if(this.S != null) {
         var3.print(var1);
         var3.print("mInnerView=");
         var3.println(this.R);
      }

      if(this.k != null) {
         var3.print(var1);
         var3.print("mAnimatingAway=");
         var3.println(this.k);
         var3.print(var1);
         var3.print("mStateAfterAnimating=");
         var3.println(this.l);
      }

      if(this.V != null) {
         var3.print(var1);
         var3.println("Loader Manager:");
         this.V.a(var1 + "  ", var2, var3, var4);
      }

      if(this.D != null) {
         var3.print(var1);
         var3.println("Child " + this.D + ":");
         this.D.a(var1 + "  ", var2, var3, var4);
      }

   }

   public boolean a(MenuItem var1) {
      return false;
   }

   public LayoutInflater b(Bundle var1) {
      return this.C.getLayoutInflater();
   }

   View b(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      if(this.D != null) {
         this.D.i();
      }

      return this.a(var1, var2, var3);
   }

   public void b(Menu var1) {
   }

   public void b(boolean var1) {
   }

   boolean b(Menu var1, MenuInflater var2) {
      boolean var3 = false;
      boolean var5 = false;
      if(!this.I) {
         boolean var4 = var5;
         if(this.M) {
            var4 = var5;
            if(this.N) {
               var4 = true;
               this.a(var1, var2);
            }
         }

         var3 = var4;
         if(this.D != null) {
            var3 = var4 | this.D.a(var1, var2);
         }
      }

      return var3;
   }

   public boolean b(MenuItem var1) {
      return false;
   }

   public void c(boolean var1) {
      if(var1 && this.E != null) {
         throw new IllegalStateException("Can\'t retain fragements that are nested in other fragments");
      } else {
         this.K = var1;
      }
   }

   boolean c(Menu var1) {
      boolean var3 = false;
      boolean var4 = false;
      if(!this.I) {
         boolean var2 = var4;
         if(this.M) {
            var2 = var4;
            if(this.N) {
               var2 = true;
               this.a(var1);
            }
         }

         var3 = var2;
         if(this.D != null) {
            var3 = var2 | this.D.a(var1);
         }
      }

      return var3;
   }

   boolean c(MenuItem var1) {
      boolean var2 = true;
      if(this.I || (!this.M || !this.N || !this.a(var1)) && (this.D == null || !this.D.a(var1))) {
         var2 = false;
      }

      return var2;
   }

   public void d() {
      this.O = true;
   }

   public void d(Bundle var1) {
      this.O = true;
   }

   void d(Menu var1) {
      if(!this.I) {
         if(this.M && this.N) {
            this.b(var1);
         }

         if(this.D != null) {
            this.D.b(var1);
         }
      }

   }

   public void d(boolean var1) {
      if(this.N != var1) {
         this.N = var1;
         if(this.M && this.n() && !this.p()) {
            this.C.c();
         }
      }

   }

   boolean d(MenuItem var1) {
      boolean var2 = true;
      if(this.I || !this.b(var1) && (this.D == null || !this.D.b(var1))) {
         var2 = false;
      }

      return var2;
   }

   public void e() {
      this.O = true;
      if(!this.W) {
         this.W = true;
         if(!this.X) {
            this.X = true;
            this.V = this.C.a(this.p, this.W, false);
         }

         if(this.V != null) {
            this.V.b();
         }
      }

   }

   public void e(Bundle var1) {
   }

   public void e(boolean var1) {
      if(!this.U && var1 && this.j < 4) {
         this.B.a(this);
      }

      this.U = var1;
      if(!var1) {
         var1 = true;
      } else {
         var1 = false;
      }

      this.T = var1;
   }

   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   public void f() {
      this.O = true;
   }

   final void f(Bundle var1) {
      if(this.n != null) {
         this.S.restoreHierarchyState(this.n);
         this.n = null;
      }

      this.O = false;
      this.h(var1);
      if(!this.O) {
         throw new ag("Fragment " + this + " did not call through to super.onViewStateRestored()");
      }
   }

   public void g() {
      this.O = true;
   }

   public void g(Bundle var1) {
      if(this.o >= 0) {
         throw new IllegalStateException("Fragment already active");
      } else {
         this.q = var1;
      }
   }

   public void h(Bundle var1) {
      this.O = true;
   }

   final boolean h() {
      boolean var1;
      if(this.A > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final int hashCode() {
      return super.hashCode();
   }

   public final Bundle i() {
      return this.q;
   }

   void i(Bundle var1) {
      if(this.D != null) {
         this.D.i();
      }

      this.O = false;
      this.a(var1);
      if(!this.O) {
         throw new ag("Fragment " + this + " did not call through to super.onCreate()");
      } else {
         if(var1 != null) {
            Parcelable var2 = var1.getParcelable("android:support:fragments");
            if(var2 != null) {
               if(this.D == null) {
                  this.w();
               }

               this.D.a((Parcelable)var2, (ArrayList)null);
               this.D.j();
            }
         }

      }
   }

   public final Fragment j() {
      return this.r;
   }

   void j(Bundle var1) {
      if(this.D != null) {
         this.D.i();
      }

      this.O = false;
      this.d(var1);
      if(!this.O) {
         throw new ag("Fragment " + this + " did not call through to super.onActivityCreated()");
      } else {
         if(this.D != null) {
            this.D.k();
         }

      }
   }

   public final FragmentActivity k() {
      return this.C;
   }

   void k(Bundle var1) {
      this.e(var1);
      if(this.D != null) {
         Parcelable var2 = this.D.h();
         if(var2 != null) {
            var1.putParcelable("android:support:fragments", var2);
         }
      }

   }

   public final Resources l() {
      if(this.C == null) {
         throw new IllegalStateException("Fragment " + this + " not attached to Activity");
      } else {
         return this.C.getResources();
      }
   }

   public final m m() {
      return this.B;
   }

   public final boolean n() {
      boolean var1;
      if(this.C != null && this.u) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean o() {
      return this.J;
   }

   public void onConfigurationChanged(Configuration var1) {
      this.O = true;
   }

   public void onCreateContextMenu(ContextMenu var1, View var2, ContextMenuInfo var3) {
      this.k().onCreateContextMenu(var1, var2, var3);
   }

   public void onLowMemory() {
      this.O = true;
   }

   public final boolean p() {
      return this.I;
   }

   public View q() {
      return this.R;
   }

   public void r() {
      this.O = true;
   }

   public void s() {
      this.O = true;
   }

   public void t() {
      this.O = true;
      if(!this.X) {
         this.X = true;
         this.V = this.C.a(this.p, this.W, false);
      }

      if(this.V != null) {
         this.V.h();
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      android.support.v4.b.d.a(this, var1);
      if(this.o >= 0) {
         var1.append(" #");
         var1.append(this.o);
      }

      if(this.F != 0) {
         var1.append(" id=0x");
         var1.append(Integer.toHexString(this.F));
      }

      if(this.H != null) {
         var1.append(" ");
         var1.append(this.H);
      }

      var1.append('}');
      return var1.toString();
   }

   void u() {
      this.o = -1;
      this.p = null;
      this.u = false;
      this.v = false;
      this.w = false;
      this.x = false;
      this.y = false;
      this.z = false;
      this.A = 0;
      this.B = null;
      this.D = null;
      this.C = null;
      this.F = 0;
      this.G = 0;
      this.H = null;
      this.I = false;
      this.J = false;
      this.L = false;
      this.V = null;
      this.W = false;
      this.X = false;
   }

   public void v() {
   }

   void w() {
      this.D = new o();
      this.D.a((FragmentActivity)this.C, (l)(new e(this)), this);
   }

   void x() {
      if(this.D != null) {
         this.D.i();
         this.D.e();
      }

      this.O = false;
      this.e();
      if(!this.O) {
         throw new ag("Fragment " + this + " did not call through to super.onStart()");
      } else {
         if(this.D != null) {
            this.D.l();
         }

         if(this.V != null) {
            this.V.g();
         }

      }
   }

   void y() {
      if(this.D != null) {
         this.D.i();
         this.D.e();
      }

      this.O = false;
      this.r();
      if(!this.O) {
         throw new ag("Fragment " + this + " did not call through to super.onResume()");
      } else {
         if(this.D != null) {
            this.D.m();
            this.D.e();
         }

      }
   }

   void z() {
      this.onLowMemory();
      if(this.D != null) {
         this.D.s();
      }

   }
}

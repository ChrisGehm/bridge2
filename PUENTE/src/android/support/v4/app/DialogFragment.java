package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.y;
import android.view.LayoutInflater;
import android.view.View;

public class DialogFragment extends Fragment implements OnCancelListener, OnDismissListener {
   int a = 0;
   int b = 0;
   boolean c = true;
   boolean d = true;
   int e = -1;
   Dialog f;
   boolean g;
   boolean h;
   boolean i;

   public void a() {
      this.a(false);
   }

   public void a(Activity var1) {
      super.a(var1);
      if(!this.i) {
         this.h = false;
      }

   }

   public void a(Bundle var1) {
      super.a(var1);
      boolean var2;
      if(this.G == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.d = var2;
      if(var1 != null) {
         this.a = var1.getInt("android:style", 0);
         this.b = var1.getInt("android:theme", 0);
         this.c = var1.getBoolean("android:cancelable", true);
         this.d = var1.getBoolean("android:showsDialog", this.d);
         this.e = var1.getInt("android:backStackId", -1);
      }

   }

   public void a(m var1, String var2) {
      this.h = false;
      this.i = true;
      y var3 = var1.a();
      var3.a(this, var2);
      var3.a();
   }

   void a(boolean var1) {
      if(!this.h) {
         this.h = true;
         this.i = false;
         if(this.f != null) {
            this.f.dismiss();
            this.f = null;
         }

         this.g = true;
         if(this.e >= 0) {
            this.m().a(this.e, 1);
            this.e = -1;
         } else {
            y var2 = this.m().a();
            var2.a((Fragment)this);
            if(var1) {
               var2.b();
            } else {
               var2.a();
            }
         }
      }

   }

   public Dialog b() {
      return this.f;
   }

   public LayoutInflater b(Bundle var1) {
      LayoutInflater var2;
      if(!this.d) {
         var2 = super.b(var1);
      } else {
         this.f = this.c(var1);
         switch(this.a) {
         case 3:
            this.f.getWindow().addFlags(24);
         case 1:
         case 2:
            this.f.requestWindowFeature(1);
         default:
            if(this.f != null) {
               var2 = (LayoutInflater)this.f.getContext().getSystemService("layout_inflater");
            } else {
               var2 = (LayoutInflater)this.C.getSystemService("layout_inflater");
            }
         }
      }

      return var2;
   }

   public int c() {
      return this.b;
   }

   public Dialog c(Bundle var1) {
      return new Dialog(this.k(), this.c());
   }

   public void d() {
      super.d();
      if(!this.i && !this.h) {
         this.h = true;
      }

   }

   public void d(Bundle var1) {
      super.d(var1);
      if(this.d) {
         View var2 = this.q();
         if(var2 != null) {
            if(var2.getParent() != null) {
               throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }

            this.f.setContentView(var2);
         }

         this.f.setOwnerActivity(this.k());
         this.f.setCancelable(this.c);
         this.f.setOnCancelListener(this);
         this.f.setOnDismissListener(this);
         if(var1 != null) {
            var1 = var1.getBundle("android:savedDialogState");
            if(var1 != null) {
               this.f.onRestoreInstanceState(var1);
            }
         }
      }

   }

   public void e() {
      super.e();
      if(this.f != null) {
         this.g = false;
         this.f.show();
      }

   }

   public void e(Bundle var1) {
      super.e(var1);
      if(this.f != null) {
         Bundle var2 = this.f.onSaveInstanceState();
         if(var2 != null) {
            var1.putBundle("android:savedDialogState", var2);
         }
      }

      if(this.a != 0) {
         var1.putInt("android:style", this.a);
      }

      if(this.b != 0) {
         var1.putInt("android:theme", this.b);
      }

      if(!this.c) {
         var1.putBoolean("android:cancelable", this.c);
      }

      if(!this.d) {
         var1.putBoolean("android:showsDialog", this.d);
      }

      if(this.e != -1) {
         var1.putInt("android:backStackId", this.e);
      }

   }

   public void f() {
      super.f();
      if(this.f != null) {
         this.f.hide();
      }

   }

   public void g() {
      super.g();
      if(this.f != null) {
         this.g = true;
         this.f.dismiss();
         this.f = null;
      }

   }

   public void onCancel(DialogInterface var1) {
   }

   public void onDismiss(DialogInterface var1) {
      if(!this.g) {
         this.a(true);
      }

   }
}

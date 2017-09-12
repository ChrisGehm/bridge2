package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.o;
import android.support.v4.app.u;
import android.util.Log;

final class FragmentState implements Parcelable {
   public static final Creator CREATOR = new u();
   final String a;
   final int b;
   final boolean c;
   final int d;
   final int e;
   final String f;
   final boolean g;
   final boolean h;
   final Bundle i;
   Bundle j;
   Fragment k;

   public FragmentState(Parcel var1) {
      boolean var3 = true;
      super();
      this.a = var1.readString();
      this.b = var1.readInt();
      boolean var2;
      if(var1.readInt() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.c = var2;
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readString();
      if(var1.readInt() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.g = var2;
      if(var1.readInt() != 0) {
         var2 = var3;
      } else {
         var2 = false;
      }

      this.h = var2;
      this.i = var1.readBundle();
      this.j = var1.readBundle();
   }

   public FragmentState(Fragment var1) {
      this.a = var1.getClass().getName();
      this.b = var1.o;
      this.c = var1.x;
      this.d = var1.F;
      this.e = var1.G;
      this.f = var1.H;
      this.g = var1.K;
      this.h = var1.J;
      this.i = var1.q;
   }

   public Fragment a(FragmentActivity var1, Fragment var2) {
      Fragment var3;
      if(this.k != null) {
         var3 = this.k;
      } else {
         if(this.i != null) {
            this.i.setClassLoader(var1.getClassLoader());
         }

         this.k = Fragment.a((Context)var1, (String)this.a, this.i);
         if(this.j != null) {
            this.j.setClassLoader(var1.getClassLoader());
            this.k.m = this.j;
         }

         this.k.a(this.b, var2);
         this.k.x = this.c;
         this.k.z = true;
         this.k.F = this.d;
         this.k.G = this.e;
         this.k.H = this.f;
         this.k.K = this.g;
         this.k.J = this.h;
         this.k.B = var1.b;
         if(o.a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.k);
         }

         var3 = this.k;
      }

      return var3;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      byte var3 = 1;
      var1.writeString(this.a);
      var1.writeInt(this.b);
      byte var4;
      if(this.c) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeString(this.f);
      if(this.g) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      if(this.h) {
         var4 = var3;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      var1.writeBundle(this.i);
      var1.writeBundle(this.j);
   }
}

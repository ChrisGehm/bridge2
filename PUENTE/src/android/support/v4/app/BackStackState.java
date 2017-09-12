package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.Fragment;
import android.support.v4.app.b;
import android.support.v4.app.c;
import android.support.v4.app.d;
import android.support.v4.app.o;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
   public static final Creator CREATOR = new d();
   final int[] a;
   final int b;
   final int c;
   final String d;
   final int e;
   final int f;
   final CharSequence g;
   final int h;
   final CharSequence i;

   public BackStackState(Parcel var1) {
      this.a = var1.createIntArray();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readString();
      this.e = var1.readInt();
      this.f = var1.readInt();
      this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
      this.h = var1.readInt();
      this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
   }

   public BackStackState(o var1, b var2) {
      c var7 = var2.b;

      int var3;
      int var4;
      for(var3 = 0; var7 != null; var3 = var4) {
         var4 = var3;
         if(var7.i != null) {
            var4 = var3 + var7.i.size();
         }

         var7 = var7.a;
      }

      this.a = new int[var3 + var2.d * 7];
      if(!var2.k) {
         throw new IllegalStateException("Not on back stack");
      } else {
         var7 = var2.b;

         for(var3 = 0; var7 != null; var7 = var7.a) {
            int[] var6 = this.a;
            var4 = var3 + 1;
            var6[var3] = var7.c;
            var6 = this.a;
            int var5 = var4 + 1;
            if(var7.d != null) {
               var3 = var7.d.o;
            } else {
               var3 = -1;
            }

            var6[var4] = var3;
            var6 = this.a;
            var3 = var5 + 1;
            var6[var5] = var7.e;
            var6 = this.a;
            var4 = var3 + 1;
            var6[var3] = var7.f;
            var6 = this.a;
            var3 = var4 + 1;
            var6[var4] = var7.g;
            var6 = this.a;
            var4 = var3 + 1;
            var6[var3] = var7.h;
            if(var7.i != null) {
               var5 = var7.i.size();
               var6 = this.a;
               var3 = var4 + 1;
               var6[var4] = var5;

               for(var4 = 0; var4 < var5; ++var3) {
                  this.a[var3] = ((Fragment)var7.i.get(var4)).o;
                  ++var4;
               }
            } else {
               var6 = this.a;
               var3 = var4 + 1;
               var6[var4] = 0;
            }
         }

         this.b = var2.i;
         this.c = var2.j;
         this.d = var2.m;
         this.e = var2.o;
         this.f = var2.p;
         this.g = var2.q;
         this.h = var2.r;
         this.i = var2.s;
      }
   }

   public b a(o var1) {
      b var8 = new b(var1);
      int var4 = 0;

      for(int var2 = 0; var2 < this.a.length; ++var4) {
         c var7 = new c();
         int[] var9 = this.a;
         int var3 = var2 + 1;
         var7.c = var9[var2];
         if(o.a) {
            Log.v("FragmentManager", "Instantiate " + var8 + " op #" + var4 + " base fragment #" + this.a[var3]);
         }

         var9 = this.a;
         var2 = var3 + 1;
         var3 = var9[var3];
         if(var3 >= 0) {
            var7.d = (Fragment)var1.f.get(var3);
         } else {
            var7.d = null;
         }

         var9 = this.a;
         var3 = var2 + 1;
         var7.e = var9[var2];
         var9 = this.a;
         int var5 = var3 + 1;
         var7.f = var9[var3];
         var9 = this.a;
         var2 = var5 + 1;
         var7.g = var9[var5];
         var9 = this.a;
         var5 = var2 + 1;
         var7.h = var9[var2];
         var9 = this.a;
         var3 = var5 + 1;
         int var6 = var9[var5];
         var2 = var3;
         if(var6 > 0) {
            var7.i = new ArrayList(var6);
            var5 = 0;

            while(true) {
               var2 = var3;
               if(var5 >= var6) {
                  break;
               }

               if(o.a) {
                  Log.v("FragmentManager", "Instantiate " + var8 + " set remove fragment #" + this.a[var3]);
               }

               Fragment var10 = (Fragment)var1.f.get(this.a[var3]);
               var7.i.add(var10);
               ++var5;
               ++var3;
            }
         }

         var8.a(var7);
      }

      var8.i = this.b;
      var8.j = this.c;
      var8.m = this.d;
      var8.o = this.e;
      var8.k = true;
      var8.p = this.f;
      var8.q = this.g;
      var8.r = this.h;
      var8.s = this.i;
      var8.a(1);
      return var8;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeIntArray(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeString(this.d);
      var1.writeInt(this.e);
      var1.writeInt(this.f);
      TextUtils.writeToParcel(this.g, var1, 0);
      var1.writeInt(this.h);
      TextUtils.writeToParcel(this.i, var1, 0);
   }
}

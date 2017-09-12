package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.support.v4.a.c;

class d implements ClassLoaderCreator {
   private final c a;

   public d(c var1) {
      this.a = var1;
   }

   public Object createFromParcel(Parcel var1) {
      return this.a.a(var1, (ClassLoader)null);
   }

   public Object createFromParcel(Parcel var1, ClassLoader var2) {
      return this.a.a(var1, var2);
   }

   public Object[] newArray(int var1) {
      return this.a.a(var1);
   }
}

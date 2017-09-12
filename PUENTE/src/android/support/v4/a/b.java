package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.a.c;

class b implements Creator {
   final c a;

   public b(c var1) {
      this.a = var1;
   }

   public Object createFromParcel(Parcel var1) {
      return this.a.a(var1, (ClassLoader)null);
   }

   public Object[] newArray(int var1) {
      return this.a.a(var1);
   }
}

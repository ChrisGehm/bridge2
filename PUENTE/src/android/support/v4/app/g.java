package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.Fragment$SavedState;

final class g implements Creator {
   public Fragment$SavedState a(Parcel var1) {
      return new Fragment$SavedState(var1, (ClassLoader)null);
   }

   public Fragment$SavedState[] a(int var1) {
      return new Fragment$SavedState[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.a(var1);
   }
}

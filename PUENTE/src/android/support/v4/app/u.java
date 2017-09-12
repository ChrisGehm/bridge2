package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentState;

final class u implements Creator {
   public FragmentState a(Parcel var1) {
      return new FragmentState(var1);
   }

   public FragmentState[] a(int var1) {
      return new FragmentState[var1];
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

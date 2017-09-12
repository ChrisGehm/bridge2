package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentManagerState;

final class s implements Creator {
   public FragmentManagerState a(Parcel var1) {
      return new FragmentManagerState(var1);
   }

   public FragmentManagerState[] a(int var1) {
      return new FragmentManagerState[var1];
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

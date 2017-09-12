package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.FragmentTabHost$SavedState;
import android.support.v4.app.v;

final class w implements Creator {
   public FragmentTabHost$SavedState a(Parcel var1) {
      return new FragmentTabHost$SavedState(var1, (v)null);
   }

   public FragmentTabHost$SavedState[] a(int var1) {
      return new FragmentTabHost$SavedState[var1];
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

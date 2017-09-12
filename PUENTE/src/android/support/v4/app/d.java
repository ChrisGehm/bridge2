package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.BackStackState;

final class d implements Creator {
   public BackStackState a(Parcel var1) {
      return new BackStackState(var1);
   }

   public BackStackState[] a(int var1) {
      return new BackStackState[var1];
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

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.BackStackState;
import android.support.v4.app.FragmentState;
import android.support.v4.app.s;

final class FragmentManagerState implements Parcelable {
   public static final Creator CREATOR = new s();
   FragmentState[] a;
   int[] b;
   BackStackState[] c;

   public FragmentManagerState() {
   }

   public FragmentManagerState(Parcel var1) {
      this.a = (FragmentState[])var1.createTypedArray(FragmentState.CREATOR);
      this.b = var1.createIntArray();
      this.c = (BackStackState[])var1.createTypedArray(BackStackState.CREATOR);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeTypedArray(this.a, var2);
      var1.writeIntArray(this.b);
      var1.writeTypedArray(this.c, var2);
   }
}

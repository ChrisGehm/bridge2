package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.widget.DrawerLayout$SavedState;

final class h implements Creator {
   public DrawerLayout$SavedState a(Parcel var1) {
      return new DrawerLayout$SavedState(var1);
   }

   public DrawerLayout$SavedState[] a(int var1) {
      return new DrawerLayout$SavedState[var1];
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

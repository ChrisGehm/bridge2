package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.widget.SlidingPaneLayout$SavedState;
import android.support.v4.widget.v;

final class ab implements Creator {
   public SlidingPaneLayout$SavedState a(Parcel var1) {
      return new SlidingPaneLayout$SavedState(var1, (v)null);
   }

   public SlidingPaneLayout$SavedState[] a(int var1) {
      return new SlidingPaneLayout$SavedState[var1];
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

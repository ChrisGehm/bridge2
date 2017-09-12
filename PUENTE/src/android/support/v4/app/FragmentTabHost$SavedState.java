package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.v;
import android.support.v4.app.w;
import android.view.View.BaseSavedState;

class FragmentTabHost$SavedState extends BaseSavedState {
   public static final Creator CREATOR = new w();
   String a;

   private FragmentTabHost$SavedState(Parcel var1) {
      super(var1);
      this.a = var1.readString();
   }

   // $FF: synthetic method
   FragmentTabHost$SavedState(Parcel var1, v var2) {
      this(var1);
   }

   FragmentTabHost$SavedState(Parcelable var1) {
      super(var1);
   }

   public String toString() {
      return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.a + "}";
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeString(this.a);
   }
}

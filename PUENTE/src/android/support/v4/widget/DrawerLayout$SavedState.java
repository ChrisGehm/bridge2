package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.widget.h;
import android.view.View.BaseSavedState;

public class DrawerLayout$SavedState extends BaseSavedState {
   public static final Creator CREATOR = new h();
   int a = 0;
   int b = 0;
   int c = 0;

   public DrawerLayout$SavedState(Parcel var1) {
      super(var1);
      this.a = var1.readInt();
   }

   public DrawerLayout$SavedState(Parcelable var1) {
      super(var1);
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a);
   }
}

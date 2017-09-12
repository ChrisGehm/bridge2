package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.cg;
import android.view.View.BaseSavedState;

public class ViewPager$SavedState extends BaseSavedState {
   public static final Creator CREATOR = android.support.v4.a.a.a(new cg());
   int a;
   Parcelable b;
   ClassLoader c;

   ViewPager$SavedState(Parcel var1, ClassLoader var2) {
      super(var1);
      ClassLoader var3 = var2;
      if(var2 == null) {
         var3 = this.getClass().getClassLoader();
      }

      this.a = var1.readInt();
      this.b = var1.readParcelable(var3);
      this.c = var3;
   }

   public ViewPager$SavedState(Parcelable var1) {
      super(var1);
   }

   public String toString() {
      return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a);
      var1.writeParcelable(this.b, var2);
   }
}

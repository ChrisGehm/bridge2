package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.g;

public class Fragment$SavedState implements Parcelable {
   public static final Creator CREATOR = new g();
   final Bundle a;

   Fragment$SavedState(Parcel var1, ClassLoader var2) {
      this.a = var1.readBundle();
      if(var2 != null && this.a != null) {
         this.a.setClassLoader(var2);
      }

   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeBundle(this.a);
   }
}

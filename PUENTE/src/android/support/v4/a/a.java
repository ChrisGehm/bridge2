package android.support.v4.a;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;
import android.support.v4.a.b;
import android.support.v4.a.c;
import android.support.v4.a.e;

public class a {
   public static Creator a(c var0) {
      if(VERSION.SDK_INT >= 13) {
         e.a(var0);
      }

      return new b(var0);
   }
}

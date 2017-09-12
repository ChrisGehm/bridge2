package android.support.v4.view;

import android.support.v4.view.ac;
import android.view.MotionEvent;

class aa implements ac {
   public int a(MotionEvent var1) {
      return 1;
   }

   public int a(MotionEvent var1, int var2) {
      byte var3;
      if(var2 == 0) {
         var3 = 0;
      } else {
         var3 = -1;
      }

      return var3;
   }

   public int b(MotionEvent var1, int var2) {
      if(var2 == 0) {
         return 0;
      } else {
         throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
      }
   }

   public float c(MotionEvent var1, int var2) {
      if(var2 == 0) {
         return var1.getX();
      } else {
         throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
      }
   }

   public float d(MotionEvent var1, int var2) {
      if(var2 == 0) {
         return var1.getY();
      } else {
         throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
      }
   }
}

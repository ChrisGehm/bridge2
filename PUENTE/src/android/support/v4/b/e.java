package android.support.v4.b;

import android.util.Log;
import java.io.Writer;

public class e extends Writer {
   private final String a;
   private StringBuilder b = new StringBuilder(128);

   public e(String var1) {
      this.a = var1;
   }

   private void a() {
      if(this.b.length() > 0) {
         Log.d(this.a, this.b.toString());
         this.b.delete(0, this.b.length());
      }

   }

   public void close() {
      this.a();
   }

   public void flush() {
      this.a();
   }

   public void write(char[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         char var4 = var1[var2 + var5];
         if(var4 == 10) {
            this.a();
         } else {
            this.b.append(var4);
         }
      }

   }
}

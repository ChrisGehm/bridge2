package android.support.v4.content;

import android.net.Uri;
import android.support.v4.content.a;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

class b implements a {
   private final String a;
   private final HashMap b = new HashMap();

   public b(String var1) {
      this.a = var1;
   }

   public File a(Uri var1) {
      String var4 = var1.getEncodedPath();
      int var2 = var4.indexOf(47, 1);
      String var3 = Uri.decode(var4.substring(1, var2));
      var4 = Uri.decode(var4.substring(var2 + 1));
      File var7 = (File)this.b.get(var3);
      if(var7 == null) {
         throw new IllegalArgumentException("Unable to find configured root for " + var1);
      } else {
         File var6 = new File(var7, var4);

         File var8;
         try {
            var8 = var6.getCanonicalFile();
         } catch (IOException var5) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + var6);
         }

         if(!var8.getPath().startsWith(var7.getPath())) {
            throw new SecurityException("Resolved path jumped beyond configured root");
         } else {
            return var8;
         }
      }
   }

   public void a(String var1, File var2) {
      if(TextUtils.isEmpty(var1)) {
         throw new IllegalArgumentException("Name must not be empty");
      } else {
         File var3;
         try {
            var3 = var2.getCanonicalFile();
         } catch (IOException var4) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + var2, var4);
         }

         this.b.put(var1, var3);
      }
   }
}

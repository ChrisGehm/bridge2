package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.v4.content.a;
import android.support.v4.content.b;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.HashMap;

public class FileProvider extends ContentProvider {
   private static final String[] a = new String[]{"_display_name", "_size"};
   private static final File b = new File("/");
   private static HashMap c = new HashMap();
   private a d;

   private static int a(String var0) {
      int var1;
      if("r".equals(var0)) {
         var1 = 268435456;
      } else if(!"w".equals(var0) && !"wt".equals(var0)) {
         if("wa".equals(var0)) {
            var1 = 704643072;
         } else if("rw".equals(var0)) {
            var1 = 939524096;
         } else {
            if(!"rwt".equals(var0)) {
               throw new IllegalArgumentException("Invalid mode: " + var0);
            }

            var1 = 1006632960;
         }
      } else {
         var1 = 738197504;
      }

      return var1;
   }

   private static a a(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   private static File a(File var0, String... var1) {
      int var3 = var1.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         String var4 = var1[var2];
         if(var4 != null) {
            var0 = new File(var0, var4);
         }
      }

      return var0;
   }

   private static Object[] a(Object[] var0, int var1) {
      Object[] var2 = new Object[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   private static String[] a(String[] var0, int var1) {
      String[] var2 = new String[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   private static a b(Context var0, String var1) {
      b var3 = new b(var1);
      XmlResourceParser var4 = var0.getPackageManager().resolveContentProvider(var1, 128).loadXmlMetaData(var0.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
      if(var4 == null) {
         throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
      } else {
         while(true) {
            int var2 = var4.next();
            if(var2 == 1) {
               return var3;
            }

            if(var2 == 2) {
               var1 = var4.getName();
               String var5 = var4.getAttributeValue((String)null, "name");
               String var6 = var4.getAttributeValue((String)null, "path");
               File var7;
               if("root-path".equals(var1)) {
                  var7 = a(b, new String[]{var6});
               } else if("files-path".equals(var1)) {
                  var7 = a(var0.getFilesDir(), new String[]{var6});
               } else if("cache-path".equals(var1)) {
                  var7 = a(var0.getCacheDir(), new String[]{var6});
               } else if("external-path".equals(var1)) {
                  var7 = a(Environment.getExternalStorageDirectory(), new String[]{var6});
               } else {
                  var7 = null;
               }

               if(var7 != null) {
                  var3.a(var5, var7);
               }
            }
         }
      }
   }

   public void attachInfo(Context var1, ProviderInfo var2) {
      super.attachInfo(var1, var2);
      if(var2.exported) {
         throw new SecurityException("Provider must not be exported");
      } else if(!var2.grantUriPermissions) {
         throw new SecurityException("Provider must grant uri permissions");
      } else {
         this.d = a(var1, var2.authority);
      }
   }

   public int delete(Uri var1, String var2, String[] var3) {
      byte var4;
      if(this.d.a(var1).delete()) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      return var4;
   }

   public String getType(Uri var1) {
      File var3 = this.d.a(var1);
      int var2 = var3.getName().lastIndexOf(46);
      String var4;
      if(var2 >= 0) {
         var4 = var3.getName().substring(var2 + 1);
         var4 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(var4);
         if(var4 != null) {
            return var4;
         }
      }

      var4 = "application/octet-stream";
      return var4;
   }

   public Uri insert(Uri var1, ContentValues var2) {
      throw new UnsupportedOperationException("No external inserts");
   }

   public boolean onCreate() {
      return true;
   }

   public ParcelFileDescriptor openFile(Uri var1, String var2) {
      return ParcelFileDescriptor.open(this.d.a(var1), a(var2));
   }

   public Cursor query(Uri var1, String[] var2, String var3, String[] var4, String var5) {
      File var14 = this.d.a(var1);
      String[] var10 = var2;
      if(var2 == null) {
         var10 = a;
      }

      var4 = new String[var10.length];
      Object[] var11 = new Object[var10.length];
      int var9 = var10.length;
      int var7 = 0;

      int var6;
      for(var6 = 0; var7 < var9; ++var7) {
         var5 = var10[var7];
         int var8;
         if("_display_name".equals(var5)) {
            var4[var6] = "_display_name";
            var8 = var6 + 1;
            var11[var6] = var14.getName();
            var6 = var8;
         } else if("_size".equals(var5)) {
            var4[var6] = "_size";
            var8 = var6 + 1;
            var11[var6] = Long.valueOf(var14.length());
            var6 = var8;
         }
      }

      String[] var15 = a(var4, var6);
      Object[] var12 = a(var11, var6);
      MatrixCursor var13 = new MatrixCursor(var15, 1);
      var13.addRow(var12);
      return var13;
   }

   public int update(Uri var1, ContentValues var2, String var3, String[] var4) {
      throw new UnsupportedOperationException("No external updates");
   }
}

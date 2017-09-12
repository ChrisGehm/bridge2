package android.support.v4.content;

import android.support.v4.content.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class c {
   int a;
   d b;
   boolean c;
   boolean d;
   boolean e;
   boolean f;
   boolean g;

   public String a(Object var1) {
      StringBuilder var2 = new StringBuilder(64);
      android.support.v4.b.d.a(var1, var2);
      var2.append("}");
      return var2.toString();
   }

   public final void a() {
      this.c = true;
      this.e = false;
      this.d = false;
      this.b();
   }

   public void a(int var1, d var2) {
      if(this.b != null) {
         throw new IllegalStateException("There is already a listener registered");
      } else {
         this.b = var2;
         this.a = var1;
      }
   }

   public void a(d var1) {
      if(this.b == null) {
         throw new IllegalStateException("No listener register");
      } else if(this.b != var1) {
         throw new IllegalArgumentException("Attempting to unregister the wrong listener");
      } else {
         this.b = null;
      }
   }

   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mId=");
      var3.print(this.a);
      var3.print(" mListener=");
      var3.println(this.b);
      if(this.c || this.f || this.g) {
         var3.print(var1);
         var3.print("mStarted=");
         var3.print(this.c);
         var3.print(" mContentChanged=");
         var3.print(this.f);
         var3.print(" mProcessingChange=");
         var3.println(this.g);
      }

      if(this.d || this.e) {
         var3.print(var1);
         var3.print("mAbandoned=");
         var3.print(this.d);
         var3.print(" mReset=");
         var3.println(this.e);
      }

   }

   protected void b() {
   }

   public void c() {
      this.c = false;
      this.d();
   }

   protected void d() {
   }

   public void e() {
      this.f();
      this.e = true;
      this.c = false;
      this.d = false;
      this.f = false;
      this.g = false;
   }

   protected void f() {
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      android.support.v4.b.d.a(this, var1);
      var1.append(" id=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }
}

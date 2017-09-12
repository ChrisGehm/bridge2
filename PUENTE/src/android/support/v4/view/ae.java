package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class ae {
   private DataSetObservable a = new DataSetObservable();

   public int a(Object var1) {
      return -1;
   }

   public Parcelable a() {
      return null;
   }

   public Object a(View var1, int var2) {
      throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
   }

   public Object a(ViewGroup var1, int var2) {
      return this.a((View)var1, var2);
   }

   public void a(DataSetObserver var1) {
      this.a.registerObserver(var1);
   }

   public void a(Parcelable var1, ClassLoader var2) {
   }

   public void a(View var1) {
   }

   public void a(View var1, int var2, Object var3) {
      throw new UnsupportedOperationException("Required method destroyItem was not overridden");
   }

   public void a(ViewGroup var1) {
      this.a((View)var1);
   }

   public void a(ViewGroup var1, int var2, Object var3) {
      this.a((View)var1, var2, var3);
   }

   public abstract boolean a(View var1, Object var2);

   public abstract int b();

   public void b(DataSetObserver var1) {
      this.a.unregisterObserver(var1);
   }

   public void b(View var1) {
   }

   public void b(View var1, int var2, Object var3) {
   }

   public void b(ViewGroup var1) {
      this.b((View)var1);
   }

   public void b(ViewGroup var1, int var2, Object var3) {
      this.b((View)var1, var2, var3);
   }

   public CharSequence c(int var1) {
      return null;
   }

   public float d(int var1) {
      return 1.0F;
   }
}

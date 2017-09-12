package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost$SavedState;
import android.support.v4.app.m;
import android.support.v4.app.x;
import android.support.v4.app.y;
import android.util.AttributeSet;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {
   private final ArrayList a = new ArrayList();
   private Context b;
   private m c;
   private int d;
   private OnTabChangeListener e;
   private x f;
   private boolean g;

   public FragmentTabHost(Context var1) {
      super(var1, (AttributeSet)null);
      this.a((Context)var1, (AttributeSet)null);
   }

   public FragmentTabHost(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1, var2);
   }

   private y a(String var1, y var2) {
      x var4 = null;

      for(int var3 = 0; var3 < this.a.size(); ++var3) {
         x var5 = (x)this.a.get(var3);
         if(x.b(var5).equals(var1)) {
            var4 = var5;
         }
      }

      if(var4 == null) {
         throw new IllegalStateException("No tab known for tag " + var1);
      } else {
         y var6 = var2;
         if(this.f != var4) {
            var6 = var2;
            if(var2 == null) {
               var6 = this.c.a();
            }

            if(this.f != null && x.a(this.f) != null) {
               var6.b(x.a(this.f));
            }

            if(var4 != null) {
               if(x.a(var4) == null) {
                  x.a(var4, Fragment.a(this.b, x.c(var4).getName(), x.d(var4)));
                  var6.a(this.d, x.a(var4), x.b(var4));
               } else {
                  var6.c(x.a(var4));
               }
            }

            this.f = var4;
         }

         return var6;
      }
   }

   private void a(Context var1, AttributeSet var2) {
      TypedArray var3 = var1.obtainStyledAttributes(var2, new int[]{16842995}, 0, 0);
      this.d = var3.getResourceId(0, 0);
      var3.recycle();
      super.setOnTabChangedListener(this);
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      String var4 = this.getCurrentTabTag();
      y var2 = null;

      y var3;
      for(int var1 = 0; var1 < this.a.size(); var2 = var3) {
         x var5 = (x)this.a.get(var1);
         x.a(var5, this.c.a(x.b(var5)));
         var3 = var2;
         if(x.a(var5) != null) {
            var3 = var2;
            if(!x.a(var5).o()) {
               if(x.b(var5).equals(var4)) {
                  this.f = var5;
                  var3 = var2;
               } else {
                  var3 = var2;
                  if(var2 == null) {
                     var3 = this.c.a();
                  }

                  var3.b(x.a(var5));
               }
            }
         }

         ++var1;
      }

      this.g = true;
      var2 = this.a(var4, var2);
      if(var2 != null) {
         var2.a();
         this.c.b();
      }

   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.g = false;
   }

   protected void onRestoreInstanceState(Parcelable var1) {
      FragmentTabHost$SavedState var2 = (FragmentTabHost$SavedState)var1;
      super.onRestoreInstanceState(var2.getSuperState());
      this.setCurrentTabByTag(var2.a);
   }

   protected Parcelable onSaveInstanceState() {
      FragmentTabHost$SavedState var1 = new FragmentTabHost$SavedState(super.onSaveInstanceState());
      var1.a = this.getCurrentTabTag();
      return var1;
   }

   public void onTabChanged(String var1) {
      if(this.g) {
         y var2 = this.a((String)var1, (y)null);
         if(var2 != null) {
            var2.a();
         }
      }

      if(this.e != null) {
         this.e.onTabChanged(var1);
      }

   }

   public void setOnTabChangedListener(OnTabChangeListener var1) {
      this.e = var1;
   }

   public void setup() {
      throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
   }
}

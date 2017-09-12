package android.support.v4.app;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.aa;
import android.support.v4.app.z;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout.LayoutParams;

public class ListFragment extends Fragment {
   private final Runnable Y = new z(this);
   private final OnItemClickListener Z = new aa(this);
   ListAdapter a;
   ListView b;
   View c;
   TextView d;
   View e;
   View f;
   CharSequence g;
   boolean h;
   private final Handler i = new Handler();

   private void a(boolean var1, boolean var2) {
      this.b();
      if(this.e == null) {
         throw new IllegalStateException("Can\'t be used with a custom content view");
      } else {
         if(this.h != var1) {
            this.h = var1;
            if(var1) {
               if(var2) {
                  this.e.startAnimation(AnimationUtils.loadAnimation(this.k(), 17432577));
                  this.f.startAnimation(AnimationUtils.loadAnimation(this.k(), 17432576));
               } else {
                  this.e.clearAnimation();
                  this.f.clearAnimation();
               }

               this.e.setVisibility(8);
               this.f.setVisibility(0);
            } else {
               if(var2) {
                  this.e.startAnimation(AnimationUtils.loadAnimation(this.k(), 17432576));
                  this.f.startAnimation(AnimationUtils.loadAnimation(this.k(), 17432577));
               } else {
                  this.e.clearAnimation();
                  this.f.clearAnimation();
               }

               this.e.setVisibility(0);
               this.f.setVisibility(8);
            }
         }

      }
   }

   private void b() {
      if(this.b == null) {
         View var1 = this.q();
         if(var1 == null) {
            throw new IllegalStateException("Content view not yet created");
         }

         if(var1 instanceof ListView) {
            this.b = (ListView)var1;
         } else {
            this.d = (TextView)var1.findViewById(16711681);
            if(this.d == null) {
               this.c = var1.findViewById(16908292);
            } else {
               this.d.setVisibility(8);
            }

            this.e = var1.findViewById(16711682);
            this.f = var1.findViewById(16711683);
            var1 = var1.findViewById(16908298);
            if(!(var1 instanceof ListView)) {
               if(var1 == null) {
                  throw new RuntimeException("Your content must have a ListView whose id attribute is \'android.R.id.list\'");
               }

               throw new RuntimeException("Content has view with id attribute \'android.R.id.list\' that is not a ListView class");
            }

            this.b = (ListView)var1;
            if(this.c != null) {
               this.b.setEmptyView(this.c);
            } else if(this.g != null) {
               this.d.setText(this.g);
               this.b.setEmptyView(this.d);
            }
         }

         this.h = true;
         this.b.setOnItemClickListener(this.Z);
         if(this.a != null) {
            ListAdapter var2 = this.a;
            this.a = null;
            this.a(var2);
         } else if(this.e != null) {
            this.a(false, false);
         }

         this.i.post(this.Y);
      }

   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      FragmentActivity var5 = this.k();
      FrameLayout var4 = new FrameLayout(var5);
      LinearLayout var7 = new LinearLayout(var5);
      var7.setId(16711682);
      var7.setOrientation(1);
      var7.setVisibility(8);
      var7.setGravity(17);
      var7.addView(new ProgressBar(var5, (AttributeSet)null, 16842874), new LayoutParams(-2, -2));
      var4.addView(var7, new LayoutParams(-1, -1));
      FrameLayout var6 = new FrameLayout(var5);
      var6.setId(16711683);
      TextView var8 = new TextView(this.k());
      var8.setId(16711681);
      var8.setGravity(17);
      var6.addView(var8, new LayoutParams(-1, -1));
      ListView var9 = new ListView(this.k());
      var9.setId(16908298);
      var9.setDrawSelectorOnTop(false);
      var6.addView(var9, new LayoutParams(-1, -1));
      var4.addView(var6, new LayoutParams(-1, -1));
      var4.setLayoutParams(new LayoutParams(-1, -1));
      return var4;
   }

   public ListView a() {
      this.b();
      return this.b;
   }

   public void a(View var1, Bundle var2) {
      super.a(var1, var2);
      this.b();
   }

   public void a(ListAdapter var1) {
      boolean var3 = false;
      boolean var2;
      if(this.a != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.a = var1;
      if(this.b != null) {
         this.b.setAdapter(var1);
         if(!this.h && !var2) {
            if(this.q().getWindowToken() != null) {
               var3 = true;
            }

            this.a(true, var3);
         }
      }

   }

   public void a(ListView var1, View var2, int var3, long var4) {
   }

   public void g() {
      this.i.removeCallbacks(this.Y);
      this.b = null;
      this.h = false;
      this.f = null;
      this.e = null;
      this.c = null;
      this.d = null;
      super.g();
   }
}

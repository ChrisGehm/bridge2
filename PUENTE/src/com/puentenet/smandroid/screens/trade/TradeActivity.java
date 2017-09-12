package com.puentenet.smandroid.screens.trade;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.puentenet.smandroid.MainFragmentActivity;
import com.puentenet.smandroid.screens.trade.OrdersFragment;
import com.puentenet.smandroid.screens.trade.TradeFragment;
import com.puentenet.smandroid.screens.trade.m;
import com.puentenet.smandroid.screens.trade.n;
import com.puentenet.smandroid.screens.trade.o;
import com.puentenet.smandroid.widget.FixedViewFlipper;
import com.puentenet.smandroid.widget.tab.TabBar;

public class TradeActivity extends MainFragmentActivity {
   private TabBar n;
   private boolean o = false;

   private Fragment b(int var1) {
      return this.e().a("android:switcher:2131361800:" + var1);
   }

   public void a(int var1) {
      FixedViewFlipper var2 = (FixedViewFlipper)this.findViewById(2131361840);
      switch(var1) {
      case 2131362094:
         var2.setDisplayedChild(0);
         break;
      case 2131362095:
         if(this.o) {
            var2.setDisplayedChild(2);
         } else {
            var2.setDisplayedChild(1);
         }
      }

   }

   public void a(com.puentenet.a.c.h var1) {
      this.o = true;
      this.a(2131362095);
      ((OrdersFragment)this.b(1)).a(var1);
   }

   public void b(boolean var1) {
      this.o = var1;
   }

   protected int g() {
      return this.n.getCurrentTabId();
   }

   public boolean h() {
      return this.o;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903085);
      int var2;
      if(var1 != null) {
         var2 = var1.getInt("skey");
         this.o = var1.getBoolean("isDetailMode");
      } else {
         var2 = 2131362094;
      }

      ViewPager var3 = (ViewPager)this.findViewById(2131361800);
      var3.setAdapter(new o(this, this.e()));
      this.n = (TabBar)this.findViewById(2131362093);
      this.n.setTabManager(new com.puentenet.smandroid.widget.tab.c(var3, this.n));
      this.n.a(2131362094, Integer.valueOf(0));
      this.n.a(2131362095, Integer.valueOf(1));
      this.n.a(var2);
      this.n.setOnCheckedChangeListener(new m(this));
      ((ImageView)this.findViewById(2131361799)).setOnClickListener(new n(this));
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3;
      if(var1 == 4 && this.o) {
         this.o = false;
         this.a(2131362095);
         ((OrdersFragment)this.b(1)).a(false);
         var3 = true;
      } else {
         var3 = super.onKeyDown(var1, var2);
      }

      return var3;
   }

   protected void onResume() {
      super.onResume();
      ViewSwitcher var1 = (ViewSwitcher)this.findViewById(2131361979);
      if(com.puentenet.a.e.b.a()) {
         ((TextView)this.findViewById(2131361980)).setText(this.getString(2131099681) + " " + com.puentenet.a.e.b.d().a());
         var1.setDisplayedChild(0);
      } else {
         var1.setDisplayedChild(1);
      }

      if(TradeFragment.b != null) {
         this.n.a(2131362094);
      }

   }

   protected void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      var1.putInt("skey", this.n.getCurrentTabId());
      var1.putBoolean("isDetailMode", this.o);
   }
}

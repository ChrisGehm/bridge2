package com.puentenet.smandroid.screens.account;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import com.puentenet.smandroid.MainFragmentActivity;
import com.puentenet.smandroid.screens.account.AccountResumenFragment;
import com.puentenet.smandroid.screens.account.AccountTenenciasFragment;
import com.puentenet.smandroid.screens.account.a;
import com.puentenet.smandroid.screens.account.b;
import com.puentenet.smandroid.screens.account.c;
import com.puentenet.smandroid.screens.account.d;
import com.puentenet.smandroid.widget.tab.TabBar;

public class AccountActivity extends MainFragmentActivity {
   private TabBar n;
   private long o;
   private final OnClickListener p = new a(this);

   private Fragment a(int var1) {
      return this.e().a("android:switcher:2131361800:" + var1);
   }

   private void a(com.puentenet.a.c.b var1) {
      AccountResumenFragment var2 = (AccountResumenFragment)this.a(0);
      AccountTenenciasFragment var3 = (AccountTenenciasFragment)this.a(1);
      var2.a(var1.a());
      var3.a(var1.b());
   }

   // $FF: synthetic method
   static void a(AccountActivity var0, com.puentenet.a.c.b var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(AccountActivity var0, boolean var1) {
      var0.b(var1);
   }

   private void b(boolean var1) {
      ViewFlipper var2 = (ViewFlipper)this.findViewById(2131361798);
      if(var1) {
         var2.setDisplayedChild(1);
      } else {
         var2.setDisplayedChild(2);
      }

   }

   public void g() {
      com.puentenet.a.d.a.b.a().a(this.o, new c(this));
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903040);
      ((ImageView)this.findViewById(2131361799)).setOnClickListener(new b(this));
      int var2;
      if(var1 != null) {
         var2 = var1.getInt("skey");
         ((ViewFlipper)this.findViewById(2131361798)).setDisplayedChild(var1.getInt("flipper"));
         this.o = var1.getLong("account");
      } else {
         var2 = 2131361796;
      }

      ViewPager var3 = (ViewPager)this.findViewById(2131361800);
      var3.setAdapter(new d(this, this.e()));
      this.n = (TabBar)this.findViewById(2131361795);
      this.n.setTabManager(new com.puentenet.smandroid.widget.tab.c(var3, this.n));
      this.n.a(2131361796, Integer.valueOf(0));
      this.n.a(2131361797, Integer.valueOf(1));
      this.n.a(var2);
      ((ImageButton)this.findViewById(2131361794)).setOnClickListener(this.p);
   }

   protected void onResume() {
      super.onResume();
      ViewFlipper var1 = (ViewFlipper)this.findViewById(2131361798);
      if(!com.puentenet.a.e.b.a() && this.o != -1L) {
         var1.setDisplayedChild(0);
         this.o = -1L;
      } else if(com.puentenet.a.e.b.a() && this.o != com.puentenet.a.e.b.d().a()) {
         this.o = com.puentenet.a.e.b.d().a();
         this.g();
      }

   }

   protected void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      var1.putInt("skey", this.n.getCurrentTabId());
      var1.putInt("flipper", ((ViewFlipper)this.findViewById(2131361798)).getDisplayedChild());
      var1.putLong("account", this.o);
   }
}

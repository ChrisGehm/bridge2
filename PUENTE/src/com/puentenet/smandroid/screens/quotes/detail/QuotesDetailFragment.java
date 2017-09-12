package com.puentenet.smandroid.screens.quotes.detail;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ViewSwitcher;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.puentenet.a.c.k;
import com.puentenet.smandroid.screens.quotes.detail.QuotesDetailTopBar;
import com.puentenet.smandroid.screens.quotes.detail.a;
import com.puentenet.smandroid.screens.quotes.detail.b;
import com.puentenet.smandroid.screens.quotes.detail.c;
import com.puentenet.smandroid.screens.quotes.detail.d;
import com.puentenet.smandroid.screens.quotes.detail.e;
import com.puentenet.smandroid.screens.quotes.detail.general.QuoteGeneralView;
import com.puentenet.smandroid.screens.quotes.detail.graph.HistoryPanel;
import com.puentenet.smandroid.widget.tab.TabBar;

public class QuotesDetailFragment extends Fragment {
   private OnCheckedChangeListener Y = new b(this);
   QuoteGeneralView a;
   HistoryPanel b;
   final OnClickListener c = new c(this);
   private int d;
   private TabBar e;
   private com.puentenet.a.d.c.c f;
   private int g = 0;
   private k h;
   private OnCheckedChangeListener i = new a(this);

   public QuotesDetailFragment() {
      this.c(true);
      this.d = 2131361957;
   }

   private void F() {
      ((QuotesDetailTopBar)this.k().findViewById(2131361915)).a(this.h.t());
   }

   // $FF: synthetic method
   static k a(QuotesDetailFragment var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static void a(QuotesDetailFragment var0, int var1) {
      var0.g = var1;
   }

   // $FF: synthetic method
   static void a(QuotesDetailFragment var0, k var1) {
      var0.h = var1;
   }

   // $FF: synthetic method
   static void a(QuotesDetailFragment var0, com.puentenet.a.d.c.c var1) {
      var0.f = var1;
   }

   // $FF: synthetic method
   static int b(QuotesDetailFragment var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static com.puentenet.a.d.c.c c(QuotesDetailFragment var0) {
      return var0.f;
   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      super.a(var1, var2, var3);
      View var4 = var1.inflate(2130903069, var2, false);
      this.e = (TabBar)var4.findViewById(2131361956);
      this.e.setTabManager(new com.puentenet.smandroid.widget.tab.d((ViewSwitcher)var4.findViewById(2131361840)));
      this.e.a(2131361957, Integer.valueOf(0));
      this.e.a(2131361958, Integer.valueOf(1));
      this.e.a(this.d);
      this.e.setOnCheckedChangeListener(this.Y);
      TabBar var5 = (TabBar)var4.findViewById(2131361945);
      switch(this.g) {
      case 0:
         var5.check(2131361946);
         break;
      case 1:
         var5.check(2131361947);
         break;
      case 2:
         var5.check(2131361948);
         break;
      case 3:
         var5.check(2131361949);
         break;
      case 4:
         var5.check(2131361950);
         break;
      case 5:
         var5.check(2131361951);
      }

      var5.setOnCheckedChangeListener(this.i);
      if(var3 != null) {
         String var6 = var3.getString("ticker");
         if(var6 != null) {
            this.h = new k(var6, true);
         }
      }

      return var4;
   }

   public void a() {
      this.e.a(2131361957);
   }

   public void a(k var1) {
      if(var1 != null) {
         if(this.h != null && !this.h.a().equals(var1.a())) {
            this.f = null;
         }

         this.h = var1;
         this.a = (QuoteGeneralView)this.q().findViewById(2131361917);
         this.a.a(this.h);
         this.a.setButtonListener(this.c);
         this.F();
         this.b();
      }

   }

   public void b() {
      this.b = (HistoryPanel)this.q().findViewById(2131361944);
      boolean var1;
      if(this.g == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      if(var1) {
         this.f = null;
      } else if(this.f != null) {
         this.b.c();
         this.b.a(this.f, this.g);
         return;
      }

      com.puentenet.a.d.c.d.a().a(this.h.a(), new e(this, var1), var1);
   }

   public k c() {
      return this.h;
   }

   public void d() {
      super.d();
      this.d = this.e.getCurrentTabId();
   }

   public void e(Bundle var1) {
      if(this.h != null) {
         var1.putString("ticker", this.h.a());
      }

      super.e(var1);
   }

   public void r() {
      super.r();
      if(this.h != null) {
         if(this.h.m()) {
            com.puentenet.a.d.g.b.a().a(this.h.a(), new d(this));
         } else {
            this.a(this.h);
         }
      }

   }
}

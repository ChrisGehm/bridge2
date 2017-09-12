package com.puentenet.smandroid.screens.trade;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import android.widget.AdapterView.AdapterContextMenuInfo;
import com.puentenet.smandroid.customdialogs.CustomYesNoDialog;
import com.puentenet.smandroid.screens.trade.TradeActivity;
import com.puentenet.smandroid.screens.trade.b;
import com.puentenet.smandroid.screens.trade.c;
import com.puentenet.smandroid.screens.trade.d;
import com.puentenet.smandroid.screens.trade.e;
import com.puentenet.smandroid.screens.trade.f;
import com.puentenet.smandroid.screens.trade.g;
import com.puentenet.smandroid.screens.trade.h;
import com.puentenet.smandroid.screens.trade.i;
import com.puentenet.smandroid.screens.trade.j;
import com.puentenet.smandroid.widget.FixedViewFlipper;
import com.puentenet.smandroid.widget.tab.TabBar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

public class OrdersFragment extends ListFragment implements com.puentenet.smandroid.customdialogs.d {
   private static int[] ad = new int[]{2131362077, 2131362078, 2131362079, 2131362080, 2131362081, 2131362082};
   private com.puentenet.a.c.f Y;
   private long Z;
   private int aa;
   private int ab;
   private com.puentenet.a.d.f.b ac;
   private OnClickListener ae = new c(this);
   private OnClickListener af = new d(this);
   private com.puentenet.a.c.h i;

   public OrdersFragment() {
      this.c(true);
      this.Z = -1L;
      this.aa = 2131362077;
      this.ab = 0;
   }

   private void a(com.puentenet.a.c.f var1, com.puentenet.a.c.h var2) {
      ((TextView)this.q().findViewById(2131362032)).setText(var1.o());
      ((TextView)this.q().findViewById(2131362029)).setText(var1.n());
      String var3 = var2.k();
      if(!var3.equals("ME")) {
         ((TextView)this.q().findViewById(2131362035)).setText(String.valueOf(var2.n()));
         if(var3.equals("SL")) {
            ((TextView)this.q().findViewById(2131362039)).setText(String.valueOf(var2.o()));
         }
      }

      TextView var6 = (TextView)this.q().findViewById(2131362051);
      String var4 = String.valueOf(var1.p());
      var6.setText(var4.substring(0, var4.length() - 2));
      if(var1.q().isEmpty()) {
         ((FixedViewFlipper)this.q().findViewById(2131362053)).setDisplayedChild(2);
      } else {
         ((FixedViewFlipper)this.q().findViewById(2131362053)).setDisplayedChild(1);
         j var5 = new j(this);
         ((ListView)this.q().findViewById(2131362054)).setAdapter(var5);
         this.a(var5, var1.q());
      }

   }

   // $FF: synthetic method
   static void a(OrdersFragment var0) {
      var0.c();
   }

   // $FF: synthetic method
   static void a(OrdersFragment var0, int var1) {
      var0.aa = var1;
   }

   // $FF: synthetic method
   static void a(OrdersFragment var0, com.puentenet.a.c.f var1) {
      var0.Y = var1;
   }

   // $FF: synthetic method
   static void a(OrdersFragment var0, com.puentenet.a.c.f var1, com.puentenet.a.c.h var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(OrdersFragment var0, com.puentenet.a.d.f.b var1) {
      var0.ac = var1;
   }

   // $FF: synthetic method
   static void a(OrdersFragment var0, boolean var1) {
      var0.g(var1);
   }

   private void a(i var1, Vector var2) {
      var1.clear();
      if(var2.size() != 0) {
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            var1.add((com.puentenet.a.c.h)var3.next());
         }
      }

   }

   private void a(j var1, Vector var2) {
      var1.clear();
      if(var2.size() != 0) {
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            var1.add((com.puentenet.a.c.g)var3.next());
         }
      }

   }

   // $FF: synthetic method
   static com.puentenet.a.c.f b(OrdersFragment var0) {
      return var0.Y;
   }

   private void b(com.puentenet.a.c.h var1) {
      com.puentenet.a.d.b.b.a().a(var1.d(), new f(this));
   }

   private void c() {
      if(this.ac != null) {
         TabBar var3 = (TabBar)this.q().findViewById(2131362063);

         for(int var1 = 0; var1 < ad.length; ++var1) {
            int var2 = ad[var1];
            this.a((i)var3.getTabManager().c(var2), this.ac.a(var1));
         }
      }

   }

   private void c(int var1) {
      ((ViewSwitcher)this.q().findViewById(2131362061)).setDisplayedChild(var1);
      this.ab = var1;
   }

   private void c(com.puentenet.a.c.h var1) {
      TextView var3 = (TextView)this.q().findViewById(2131362027);
      StringBuilder var4 = new StringBuilder(String.valueOf(com.puentenet.a.c.j.a(var1.g())));
      String var2;
      if(var1.k() != "") {
         var2 = " - " + com.puentenet.a.c.j.b(var1.k());
      } else {
         var2 = "";
      }

      var3.setText(var4.append(var2).toString());
      GradientDrawable var5 = (GradientDrawable)this.l().getDrawable(2130837703);
      var5.setColor(b.a(var1.g()));
      var3.setBackgroundDrawable(var5);
      var3.postInvalidate();
      var3.setPadding(0, 0, 5, 0);
      ((TextView)this.q().findViewById(2131362028)).setText(var1.i());
      TextView var6 = (TextView)this.q().findViewById(2131362030);
      var6.setText(com.puentenet.a.c.j.c(var1.m()));
      var6.setTextColor(b.b(var1.m()));
      ((TextView)this.q().findViewById(2131362046)).setText(var1.f());
      ((TextView)this.q().findViewById(2131362031)).setText(var1.h());
      ((TextView)this.q().findViewById(2131362045)).setText((new SimpleDateFormat("dd MMM, yyyy hh:mm:ss")).format(new Date(var1.l())));
      ((TextView)this.q().findViewById(2131362040)).setText(String.valueOf(var1.j()));
      ((TextView)this.q().findViewById(2131362043)).setText((new SimpleDateFormat("dd MMM, yyyy hh:mm:ss")).format(new Date(var1.e())));
      ((TextView)this.q().findViewById(2131362029)).setText("-");
      ((TextView)this.q().findViewById(2131362035)).setText(" - ");
      ((TextView)this.q().findViewById(2131362039)).setText(" - ");
      ((TextView)this.q().findViewById(2131362051)).setText(" - ");
   }

   private void f(boolean var1) {
      ViewSwitcher var2 = (ViewSwitcher)this.q().findViewById(2131362061);
      if(var1) {
         var2.setVisibility(8);
      } else {
         var2.setVisibility(0);
      }

   }

   private void g(boolean var1) {
      ViewSwitcher var2 = (ViewSwitcher)this.q().findViewById(2131362064);
      if(var1) {
         var2.setDisplayedChild(0);
      } else {
         var2.setDisplayedChild(1);
      }

   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var4 = var1.inflate(2130903092, var2, false);
      this.a((View)((ListView)var4.findViewById(16908298)));
      return var4;
   }

   public void a(int var1, Integer var2) {
      switch(var1) {
      case 1:
         this.b((com.puentenet.a.c.h)this.a().getAdapter().getItem(var2.intValue()));
      default:
      }
   }

   public void a(View var1, Bundle var2) {
      super.a(var1, var2);
      TabBar var6 = (TabBar)var1.findViewById(2131362063);
      var6.setTabManager(new com.puentenet.smandroid.widget.tab.a(this.a()));
      var6.setOnCheckedChangeListener(new e(this));
      int[] var5 = ad;
      int var4 = var5.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         var6.a(var5[var3], new i(this));
      }

      var6.a(this.aa);
      this.c(this.ab);
      this.c();
      this.k().findViewById(2131361794).setOnClickListener(this.ae);
      this.k().findViewById(2131362092).setOnClickListener(this.af);
   }

   public void a(ListView var1, View var2, int var3, long var4) {
      super.a(var1, var2, var3, var4);
      com.puentenet.a.c.h var6 = (com.puentenet.a.c.h)this.a().getAdapter().getItem(var3);
      if(var6 != null) {
         ((TradeActivity)this.k()).a(var6);
      }

   }

   public void a(com.puentenet.a.c.h var1) {
      this.c(var1);
      this.i = var1;
      this.a(true);
      com.puentenet.a.d.e.b.a().a(String.valueOf(var1.d()), new h(this, var1));
   }

   public void a(boolean var1) {
      TradeActivity var2 = (TradeActivity)this.k();
      var2.b(var1);
      if(var1) {
         this.c(1);
      } else {
         this.c(0);
         if(var2.g() == 2131362095) {
            var2.a(2131362095);
         }
      }

   }

   public void b() {
      com.puentenet.a.d.f.c.a().a(new g(this));
   }

   public void b(int var1) {
      if(var1 < ad.length) {
         ((TabBar)this.q().findViewById(2131362063)).a(ad[var1]);
      }

   }

   public boolean b(MenuItem var1) {
      AdapterContextMenuInfo var3 = (AdapterContextMenuInfo)var1.getMenuInfo();
      com.puentenet.a.c.h var4 = (com.puentenet.a.c.h)this.a().getAdapter().getItem(var3.position);
      boolean var2;
      switch(var1.getItemId()) {
      case 0:
         ((TradeActivity)this.k()).a(var4);
         var2 = true;
         break;
      case 1:
         CustomYesNoDialog var5 = CustomYesNoDialog.a("¿Realmente quiere cancelar la orden # " + var4.d() + "?", 1, var3.position);
         var5.a(this, 0);
         var5.a(this.m(), "cancel_order");
         var2 = true;
         break;
      default:
         var2 = super.b(var1);
      }

      return var2;
   }

   public void e(Bundle var1) {
      var1.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
      super.e(var1);
   }

   public void onCreateContextMenu(ContextMenu var1, View var2, ContextMenuInfo var3) {
      super.onCreateContextMenu(var1, var2, var3);
      if(var2 == this.a()) {
         AdapterContextMenuInfo var5 = (AdapterContextMenuInfo)var3;
         com.puentenet.a.c.h var4 = (com.puentenet.a.c.h)((ListView)var2).getAdapter().getItem(var5.position);
         if(var4.m().equals("P") || var4.m().equals("EC") || var4.m().equals("EP")) {
            var1.add(0, 1, 0, "Cancelar orden");
         }

         var1.add(0, 0, 1, "Ver detalle");
      }

   }

   public void r() {
      super.r();
      if(!com.puentenet.a.e.b.a()) {
         this.f(true);
         this.Z = -1L;
      } else {
         this.f(false);
         if(((TradeActivity)this.k()).h()) {
            ((TradeActivity)this.k()).a(this.i);
         } else {
            if(this.Z != com.puentenet.a.e.b.d().a()) {
               this.Z = com.puentenet.a.e.b.d().a();
            }

            this.a(false);
         }

         this.b();
      }

   }
}

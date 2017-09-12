package com.puentenet.smandroid.screens.quotes;

import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import com.puentenet.smandroid.MainFragmentActivity;
import com.puentenet.smandroid.screens.quotes.QuotesMainFragment;
import com.puentenet.smandroid.screens.quotes.QuotesTopBar;
import com.puentenet.smandroid.screens.quotes.g;
import com.puentenet.smandroid.screens.quotes.h;
import com.puentenet.smandroid.screens.quotes.i;
import com.puentenet.smandroid.screens.quotes.j;
import com.puentenet.smandroid.screens.quotes.k;
import com.puentenet.smandroid.screens.quotes.l;
import com.puentenet.smandroid.screens.quotes.m;
import com.puentenet.smandroid.screens.quotes.n;
import com.puentenet.smandroid.screens.quotes.t;
import com.puentenet.smandroid.screens.quotes.detail.QuotesDetailFragment;
import com.puentenet.smandroid.screens.quotes.detail.QuotesDetailTopBar;
import com.puentenet.smandroid.screens.quotes.edit.QuotesEditTopBar;
import com.puentenet.smandroid.screens.quotes.edit.QuotesWatchlistEditPanel;
import com.puentenet.smandroid.screens.quotes.watchlist.QuotesWatchlistBar;
import com.puentenet.smandroid.widget.search.puentesearch.QuoteSearchPanel;

public class QuotesActivity extends MainFragmentActivity implements com.puentenet.smandroid.customdialogs.d {
   private com.puentenet.smandroid.screens.quotes.edit.c A = new l(this);
   private com.puentenet.smandroid.screens.quotes.edit.f B = new m(this);
   private ViewSwitcher n;
   private ViewSwitcher o;
   private com.puentenet.smandroid.screens.quotes.watchlist.d p;
   private int q;
   private boolean r;
   private boolean s;
   private QuoteSearchPanel t;
   private QuotesMainFragment u;
   private OnItemClickListener v = new g(this);
   private OnItemSelectedListener w = new h(this);
   private t x = new i(this);
   private com.puentenet.smandroid.screens.quotes.detail.h y = new j(this);
   private com.puentenet.smandroid.screens.quotes.watchlist.c z = new k(this);

   // $FF: synthetic method
   static ViewSwitcher a(QuotesActivity var0) {
      return var0.n;
   }

   private void a(int var1) {
      com.puentenet.a.e.b.a(var1);
      ((QuotesTopBar)this.findViewById(2131361905)).setText(com.puentenet.a.e.b.e().b());
      ((QuotesMainFragment)this.e().a(2131361912)).b();
   }

   // $FF: synthetic method
   static void a(QuotesActivity var0, int var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(QuotesActivity var0, boolean var1) {
      var0.b(var1);
   }

   // $FF: synthetic method
   static QuoteSearchPanel b(QuotesActivity var0) {
      return var0.t;
   }

   private void b(int var1, String var2) {
      switch(var1) {
      case 0:
         this.p.a(var2);
         break;
      case 1:
         this.p.b(var2);
         this.c(false);
      }

   }

   // $FF: synthetic method
   static void b(QuotesActivity var0, int var1) {
      var0.q = var1;
   }

   // $FF: synthetic method
   static void b(QuotesActivity var0, boolean var1) {
      var0.c(var1);
   }

   private void b(boolean var1) {
      this.s = var1;
      if(var1) {
         this.findViewById(2131361913).setVisibility(0);
         this.findViewById(2131361904).setVisibility(8);
         this.findViewById(2131361911).setVisibility(8);
      } else {
         this.findViewById(2131361913).setVisibility(8);
         this.findViewById(2131361904).setVisibility(0);
         this.findViewById(2131361911).setVisibility(0);
      }

   }

   // $FF: synthetic method
   static com.puentenet.smandroid.screens.quotes.watchlist.d c(QuotesActivity var0) {
      return var0.p;
   }

   private void c(boolean var1) {
      this.r = var1;
      ((QuotesMainFragment)this.e().a(2131361912)).a(var1);
      if(var1) {
         ((EditText)this.findViewById(2131361968)).setText(com.puentenet.a.e.b.e().b());
         this.o.setDisplayedChild(1);
      } else {
         this.o.setDisplayedChild(0);
      }

   }

   // $FF: synthetic method
   static void d(QuotesActivity var0) {
      var0.g();
   }

   private void g() {
      ((InputMethodManager)this.getSystemService("input_method")).hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), 2);
   }

   public void a(int var1, Integer var2) {
      switch(var1) {
      case 2:
         this.p.a();
         this.c(false);
      default:
      }
   }

   public void a(int var1, Object var2) {
      if(var2 instanceof String) {
         this.a(var1, (String)var2);
      } else if(var2 instanceof Integer) {
         this.a(var1, (Integer)var2);
      }

   }

   public void a(int var1, String var2) {
      if(!var2.equals("")) {
         if(com.puentenet.a.e.b.a(var2)) {
            this.b(var1, var2);
         } else {
            Toast.makeText(this, this.getString(2131099689), 0).show();
         }
      } else {
         Toast.makeText(this, this.getString(2131099688), 0).show();
      }

   }

   public void a(com.puentenet.a.c.k var1) {
      this.b(true);
      QuotesDetailFragment var2 = (QuotesDetailFragment)this.e().a(2131361914);
      var2.a(var1);
      com.puentenet.a.d.g.b.a().a(var1.a(), new n(this, var2));
   }

   public void b(String var1) {
      this.a(new com.puentenet.a.c.k(var1, false));
   }

   public void c(String var1) {
      this.u.a(var1);
   }

   public boolean onContextItemSelected(MenuItem var1) {
      AdapterContextMenuInfo var3 = (AdapterContextMenuInfo)var1.getMenuInfo();
      boolean var2;
      switch(var1.getItemId()) {
      case 2131362112:
         this.t.b();
         this.b(this.t.a(var3.position));
         this.g();
         var2 = true;
         break;
      case 2131362113:
         com.puentenet.a.e.b.e().a(this.t.a(var3.position));
         this.u.b();
         this.t.b();
         this.g();
         var2 = true;
         break;
      default:
         var2 = super.onContextItemSelected(var1);
      }

      return var2;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903068);
      if(com.puentenet.a.e.b.e() != null) {
         this.a(com.puentenet.a.e.b.f());
      }

      QuotesTopBar var3 = (QuotesTopBar)this.findViewById(2131361905);
      var3.setListener(this.x);
      ((QuotesWatchlistBar)this.findViewById(2131361907)).setListener(this.z);
      ((QuotesEditTopBar)this.findViewById(2131361909)).setListener(this.A);
      ((QuotesWatchlistEditPanel)this.findViewById(2131361910)).setListener(this.B);
      ArrayAdapter var2 = new ArrayAdapter(this, 17367048);
      var2.setDropDownViewResource(17367049);
      Spinner var4 = (Spinner)this.findViewById(2131361965);
      var4.setAdapter(var2);
      var4.setOnItemSelectedListener(this.w);
      this.p = new com.puentenet.smandroid.screens.quotes.watchlist.d(this, var2, var4);
      this.o = (ViewSwitcher)this.findViewById(2131361904);
      this.n = (ViewSwitcher)this.findViewById(2131361906);
      this.t = (QuoteSearchPanel)this.findViewById(2131361908);
      this.t.b(var1);
      this.t.a((ViewGroup)this.findViewById(2131361903), this.findViewById(2131361911));
      this.u = (QuotesMainFragment)this.e().a(2131361912);
      this.registerForContextMenu(this.t.getListView());
      this.t.getListView().setOnItemClickListener(this.v);
      ((QuotesDetailTopBar)this.findViewById(2131361915)).setListener(this.y);
      if(var1 != null) {
         this.q = var1.getInt("statekey");
         var3.setState(this.q);
         this.r = var1.getBoolean("editkey");
         if(this.r) {
            this.c(this.r);
         }

         this.s = var1.getBoolean("detailkey");
         if(this.s) {
            this.b(this.s);
         }
      }

      this.a(this.getPreferences(0).getInt("selected_watchlist", 0));
   }

   public void onCreateContextMenu(ContextMenu var1, View var2, ContextMenuInfo var3) {
      super.onCreateContextMenu(var1, var2, var3);
      if(var2 == this.t.getListView()) {
         this.getMenuInflater().inflate(2131296256, var1);
      }

   }

   protected void onDestroy() {
      super.onDestroy();
      this.p.d();
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3;
      if(var1 == 4) {
         if(this.r) {
            this.c(false);
            var3 = true;
            return var3;
         }

         if(this.s) {
            this.b(false);
            ((QuotesDetailFragment)this.e().a(2131361914)).a();
            var3 = true;
            return var3;
         }
      }

      var3 = super.onKeyDown(var1, var2);
      return var3;
   }

   protected void onPause() {
      super.onPause();
      this.p.c();
      Editor var1 = this.getPreferences(0).edit();
      var1.putInt("selected_watchlist", com.puentenet.a.e.b.f());
      var1.commit();
   }

   protected void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      var1.putInt("statekey", this.q);
      var1.putBoolean("editkey", this.r);
      var1.putBoolean("detailkey", this.s);
      this.t.a(var1);
   }
}

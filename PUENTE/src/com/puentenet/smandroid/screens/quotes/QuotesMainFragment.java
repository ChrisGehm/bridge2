package com.puentenet.smandroid.screens.quotes;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ListView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import com.puentenet.smandroid.MainActivity;
import com.puentenet.smandroid.customdialogs.CustomYesNoDialog;
import com.puentenet.smandroid.screens.quotes.QuotesActivity;
import com.puentenet.smandroid.screens.quotes.a;
import com.puentenet.smandroid.screens.quotes.p;
import com.puentenet.smandroid.screens.trade.TradeFragment;
import com.puentenet.smandroid.widget.RearrangeableListView;

public class QuotesMainFragment extends ListFragment implements com.puentenet.smandroid.customdialogs.d {
   private RearrangeableListView Y;
   private p Z;
   private a i;

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var6 = var1.inflate(2130903075, var2, false);
      this.Y = (RearrangeableListView)var6.findViewById(16908298);
      RearrangeableListView var5 = this.Y;
      a var4 = new a(this.k());
      this.i = var4;
      var5.setAdapter(var4);
      this.Y.setRearrangeListener(this.i.a());
      this.a(this.Y);
      return var6;
   }

   public void a(int var1, Integer var2) {
      switch(var1) {
      case 0:
         String var3 = (String)com.puentenet.a.e.b.e().a().elementAt(var2.intValue());
         this.Z.b(var3);
      default:
      }
   }

   public void a(ListView var1, View var2, int var3, long var4) {
      super.a(var1, var2, var3, var4);
      com.puentenet.a.c.k var6 = com.puentenet.a.e.b.e().c((String)this.i.getItem(var3));
      if(var6 != null) {
         ((QuotesActivity)this.k()).a(var6);
      }

   }

   public void a(String var1) {
      this.Z.a(var1);
   }

   public void a(boolean var1) {
      this.i.a(var1);
      this.Y.setRearrangeEnabled(var1);
   }

   public void b() {
      if(this.Z != null) {
         this.Z.c();
      }

   }

   public boolean b(MenuItem var1) {
      AdapterContextMenuInfo var3 = (AdapterContextMenuInfo)var1.getMenuInfo();
      boolean var2;
      switch(var1.getItemId()) {
      case 0:
         com.puentenet.a.c.k var6 = com.puentenet.a.e.b.e().c((String)this.i.getItem(var3.position));
         if(var6 != null) {
            ((QuotesActivity)this.k()).a(var6);
         }

         var2 = true;
         break;
      case 1:
         String var4 = (String)com.puentenet.a.e.b.e().a().elementAt(var3.position);
         CustomYesNoDialog var5 = CustomYesNoDialog.a("¿Realmente quieres borrar \'" + var4 + "\'?", 0, var3.position);
         var5.a(this, 0);
         var5.a(this.m(), "delete_ticker");
         var2 = true;
         break;
      case 2:
         TradeFragment.b = com.puentenet.a.e.b.e().c((String)this.i.getItem(var3.position));
         ((MainActivity)this.k().getParent()).a(3);
         var2 = true;
         break;
      default:
         var2 = super.b(var1);
      }

      return var2;
   }

   public void d(Bundle var1) {
      super.d(var1);
      this.Z = new p(this.i);
   }

   public void onCreateContextMenu(ContextMenu var1, View var2, ContextMenuInfo var3) {
      super.onCreateContextMenu(var1, var2, var3);
      if(var2 == this.Y) {
         AdapterContextMenuInfo var4 = (AdapterContextMenuInfo)var3;
         var1.add(0, 0, 0, "Ver detalle");
         var1.add(0, 1, 1, "Borrar");
         com.puentenet.a.c.k var5 = com.puentenet.a.e.b.e().c((String)this.i.getItem(var4.position));
         if(var5 != null && var5.t()) {
            var1.add(0, 2, 2, "Operar");
         }
      }

   }

   public void r() {
      super.r();
      if(!this.Z.a()) {
         this.Z.b();
      }

   }
}

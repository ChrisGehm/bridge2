package com.puentenet.smandroid.screens.trade;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.puentenet.smandroid.screens.trade.a;
import com.puentenet.smandroid.screens.trade.ac;
import com.puentenet.smandroid.screens.trade.k;
import com.puentenet.smandroid.widget.search.puentesearch.QuoteSearchPanel;
import com.puentenet.smandroid.widget.search.puentesearch.SearchResultLayout;

public class TradeSearchPanel extends QuoteSearchPanel {
   private Spinner f = (Spinner)this.findViewById(2131362084);
   private String g;
   private com.puentenet.a.c.k h;
   private a i;
   private boolean j;
   private final OnItemSelectedListener k = new ac(this);

   public TradeSearchPanel(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.f.setOnItemSelectedListener(this.k);
      this.j = false;
      this.findViewById(2131362085).setVisibility(8);
      ((k)this.b).b(this.getSelectedTypeInstrumento());
   }

   // $FF: synthetic method
   static com.puentenet.smandroid.widget.search.puentesearch.a a(TradeSearchPanel var0) {
      return var0.b;
   }

   private String a(String var1) {
      String[] var3 = this.getResources().getStringArray(2131165189);
      String var2 = null;
      if(var1.equals(var3[0])) {
         var2 = "Acciones";
      } else if(var1.equals(var3[1])) {
         var2 = "Acciones Ext.";
      } else if(var1.equals(var3[2])) {
         var2 = "Bonos";
      } else if(var1.equals(var3[3])) {
         var2 = "ETFs";
      } else if(var1.equals(var3[4])) {
         var2 = "Opciones";
      }

      return var2;
   }

   // $FF: synthetic method
   static void a(TradeSearchPanel var0, boolean var1) {
      var0.j = var1;
   }

   // $FF: synthetic method
   static boolean b(TradeSearchPanel var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static a c(TradeSearchPanel var0) {
      return var0.i;
   }

   protected com.puentenet.smandroid.widget.search.puentesearch.a a(Context var1, SearchResultLayout var2) {
      return new k(this.getContext(), var2);
   }

   public void a() {
      this.h = null;
      this.c();
      super.a();
   }

   protected void a(Context var1) {
      inflate(var1, 2130903095, this);
   }

   public void a(com.puentenet.a.c.k var1) {
      this.findViewById(2131362085).setVisibility(0);
      TextView var8 = (TextView)this.findViewById(2131362086);
      TextView var7 = (TextView)this.findViewById(2131362089);
      TextView var6 = (TextView)this.findViewById(2131362087);
      TextView var5 = (TextView)this.findViewById(2131362088);
      TextView var3 = (TextView)this.findViewById(2131362090);
      com.puentenet.smandroid.k var4 = new com.puentenet.smandroid.k(1, 6, 0, 2);
      String var2;
      if(var1.b() == null) {
         var2 = "---";
      } else {
         var2 = var1.b();
      }

      var8.setText(var2);
      if(var1.l() == null) {
         var2 = "---";
      } else {
         var2 = var4.format(var1.l());
      }

      var7.setText(var2);
      if(var1.k() == null) {
         var2 = "---";
      } else {
         var2 = var4.format(var1.k());
      }

      var6.setText(var2);
      if(var1.e() == null) {
         var2 = "---";
      } else {
         var2 = var4.format(var1.e());
      }

      var5.setText(var2);
      Float var10 = var1.i();
      String var9;
      if(var10 == null) {
         var9 = "---";
      } else {
         var9 = var4.format(var10) + "%";
      }

      var3.setText(var9);
      if(var10 != null) {
         if(var10.floatValue() < 0.0F) {
            var3.setTextColor(-47872);
         } else if(var10.floatValue() == 0.0F) {
            var3.setTextColor(-1);
         } else {
            var3.setTextColor(-12189952);
         }
      } else {
         var3.setTextColor(-1);
      }

      this.requestLayout();
   }

   public void a(boolean var1) {
      InputMethodManager var2 = (InputMethodManager)this.getContext().getSystemService("input_method");
      if(var1) {
         var2.hideSoftInputFromWindow(this.getWindowToken(), 2);
      } else {
         var2.hideSoftInputFromWindow(this.getWindowToken(), 3);
      }

   }

   public String b(com.puentenet.a.c.k var1) {
      String var4 = this.getSelectedTypeInstrumento();
      String var2;
      if(var1.d() == null) {
         var2 = "ACCION";
      } else {
         var2 = var1.d();
      }

      if(var2.equals("ACCION")) {
         var2 = "Acciones";
      } else if(var2.equals("BONO")) {
         var2 = "Bonos";
      } else if(var2.equals("ETF")) {
         var2 = "ETFs";
      } else {
         var2 = "Acciones";
      }

      String var3 = var2;
      if(!var1.a().contains(".BCBA")) {
         var3 = var2;
         if(var2.equals("Acciones")) {
            var3 = "Acciones Ext.";
         }
      }

      if(var1.d().equals("INDICE")) {
         var3 = "Acciones";
      }

      String var5 = var3;
      if(var4.equals("Opciones")) {
         var5 = var3;
         if(var3.equals("Acciones")) {
            var5 = "Opciones";
         }
      }

      this.setSelectedTypeInstrumento(var5);
      return var5;
   }

   public void b() {
      super.b();
   }

   public void c() {
      if(this.h == null) {
         this.findViewById(2131362085).setVisibility(8);
      }

   }

   public void d() {
      this.b(false);
      this.a(true);
      this.i.a(this.getSelectedTypeInstrumento());
   }

   public void e() {
      this.h = null;
      this.a.c();
      this.c();
      this.b(false);
      ((k)this.b).a();
   }

   public void f() {
      this.j = true;
   }

   public void g() {
      super.g();
      this.f.setOnItemSelectedListener((OnItemSelectedListener)null);
   }

   public com.puentenet.a.c.k getSelectedQuote() {
      return this.h;
   }

   public String getSelectedTypeInstrumento() {
      return this.a((String)this.f.getSelectedItem());
   }

   public String getSymbolType() {
      return this.g;
   }

   public void h() {
      super.h();
      this.f.setOnItemSelectedListener(this.k);
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
   }

   protected void onRestoreInstanceState(Parcelable var1) {
      if(var1 instanceof Bundle) {
         Bundle var2 = (Bundle)var1;
         this.g = var2.getString("symbolType");
         super.onRestoreInstanceState(var2.getParcelable("instanceState"));
      } else {
         super.onRestoreInstanceState(var1);
      }

   }

   protected Parcelable onSaveInstanceState() {
      Bundle var1 = new Bundle();
      var1.putParcelable("instanceState", super.onSaveInstanceState());
      var1.putString("symbolType", this.g);
      return var1;
   }

   public void setOnOptionsItemClickListener(a var1) {
      this.i = var1;
   }

   public void setSelectedTypeInstrumento(String var1) {
      byte var2 = 0;
      if("Acciones Ext.".equals(var1)) {
         var2 = 1;
      } else if("Bonos".equals(var1)) {
         var2 = 2;
      } else if("ETFs".equals(var1)) {
         var2 = 3;
      } else if("Opciones".equals(var1)) {
         var2 = 4;
      }

      this.f.setSelection(var2);
   }

   public void setValues(com.puentenet.a.c.k var1) {
      this.h = var1;
      this.a.setEditText(var1.a());
      this.g = var1.d();
   }

   public void setValues(String var1) {
      this.a.setEditText(var1);
   }
}

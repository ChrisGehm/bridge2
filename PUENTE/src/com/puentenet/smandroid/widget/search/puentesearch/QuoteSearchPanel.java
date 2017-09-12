package com.puentenet.smandroid.widget.search.puentesearch;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.puentenet.smandroid.widget.search.SearchEditText;
import com.puentenet.smandroid.widget.search.puentesearch.SearchResultLayout;
import com.puentenet.smandroid.widget.search.puentesearch.a;

public class QuoteSearchPanel extends LinearLayout implements com.puentenet.smandroid.widget.search.b {
   private static String f = "rlindex";
   protected SearchEditText a;
   protected a b;
   protected SearchResultLayout c;
   protected View d;
   protected ViewGroup e;

   public QuoteSearchPanel(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public QuoteSearchPanel(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1);
      this.c = new SearchResultLayout(var1);
      this.b = this.a(var1, this.c);
   }

   protected a a(Context var1, SearchResultLayout var2) {
      return new a(this.getContext(), var2);
   }

   public String a(int var1) {
      return this.b.a(var1);
   }

   public void a() {
      this.b(true);
   }

   protected void a(Context var1) {
      inflate(var1, 2130903079, this);
   }

   public void a(Bundle var1) {
      var1.putInt(f, this.c.getDisplayedChild());
   }

   public void a(ViewGroup var1, View var2) {
      this.e = var1;
      this.d = var2;
      this.a = (SearchEditText)this.findViewById(2131361971);
      this.a.setListener(this);
      this.a.setSearchChangeListener(this.b);
   }

   protected void a(ViewGroup var1, View var2, View var3) {
      var1.removeView(var2);
      var1.addView(var3);
   }

   public void b() {
      this.a.c();
      this.b(false);
   }

   public void b(Bundle var1) {
      if(var1 != null) {
         this.c.setDisplayedChild(var1.getInt(f));
      }

   }

   protected void b(boolean var1) {
      if(var1) {
         if(this.e.indexOfChild(this.d) != -1) {
            this.a(this.e, this.d, this.c);
         }
      } else if(this.e.indexOfChild(this.c) != -1) {
         this.a(this.e, this.c, this.d);
      }

   }

   public void g() {
      this.a.a();
   }

   public ListView getListView() {
      return this.c.getListView();
   }

   public String getText() {
      return this.a.getText().toString();
   }

   public void h() {
      this.a.b();
   }

   public boolean i() {
      return this.c.isShown();
   }
}

package com.puentenet.smandroid.screens.quotes;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import com.puentenet.smandroid.screens.quotes.QuoteItemView;
import com.puentenet.smandroid.screens.quotes.QuoteView;
import com.puentenet.smandroid.screens.quotes.b;
import com.puentenet.smandroid.screens.quotes.c;
import com.puentenet.smandroid.screens.quotes.d;
import com.puentenet.smandroid.screens.quotes.f;
import com.puentenet.smandroid.screens.quotes.o;
import com.puentenet.smandroid.screens.quotes.edit.EditModeQuoteView;

public class a extends ArrayAdapter {
   final OnClickListener a = new b(this);
   final f b = new c(this);
   final com.puentenet.smandroid.widget.c c = new d(this);
   private boolean d;
   private int e;
   private int f = -1;
   private o g;

   public a(Context var1) {
      super(var1, 0);
   }

   // $FF: synthetic method
   static o a(a var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static void a(a var0, int var1) {
      var0.e = var1;
   }

   // $FF: synthetic method
   static void b(a var0, int var1) {
      var0.f = var1;
   }

   public com.puentenet.smandroid.widget.c a() {
      return this.c;
   }

   public void a(boolean var1) {
      if(this.d != var1) {
         this.d = var1;
         this.notifyDataSetChanged();
      }

   }

   public int getItemViewType(int var1) {
      byte var2;
      if(this.d) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      return var2;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      String var4 = (String)this.getItem(var1);
      Object var5;
      if(var2 != null) {
         var5 = (QuoteView)var2;
      } else if(this.d) {
         var5 = new EditModeQuoteView(this.getContext());
      } else {
         var5 = new QuoteItemView(this.getContext());
      }

      com.puentenet.a.c.k var6 = com.puentenet.a.e.b.e().c(var4);
      if(var6 == null) {
         var6 = new com.puentenet.a.c.k(var4, true);
      }

      ((QuoteView)var5).setQuote(var6);
      if(this.d) {
         if(var1 == this.f) {
            var1 = 2130968583;
         } else {
            var1 = 17170445;
         }

         ((QuoteView)var5).setBackgroundResource(var1);
      } else {
         ((QuoteItemView)var5).setDisplayMode(this.e);
         ((QuoteItemView)var5).setListener(this.b);
      }

      return (View)var5;
   }

   public int getViewTypeCount() {
      return 2;
   }
}

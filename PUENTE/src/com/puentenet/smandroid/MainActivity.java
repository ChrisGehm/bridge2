package com.puentenet.smandroid;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import com.puentenet.smandroid.a;
import com.puentenet.smandroid.b;
import com.puentenet.smandroid.screens.account.AccountActivity;
import com.puentenet.smandroid.screens.configure.ConfigureActivity;
import com.puentenet.smandroid.screens.news.NewsActivity;
import com.puentenet.smandroid.screens.quotes.QuotesActivity;
import com.puentenet.smandroid.screens.trade.TradeActivity;

public class MainActivity extends TabActivity {
   private static final com.puentenet.smandroid.c.a[] a = new com.puentenet.smandroid.c.a[]{new com.puentenet.smandroid.c.a("quotes", "Cotización", 2130837689, QuotesActivity.class), new com.puentenet.smandroid.c.a("news", "Noticias", 2130837686, NewsActivity.class), new com.puentenet.smandroid.c.a("account", "Cuenta", 2130837680, AccountActivity.class), new com.puentenet.smandroid.c.a("trade", "Operar", 2130837693, TradeActivity.class), new com.puentenet.smandroid.c.a("configure", "Config.", 2130837683, ConfigureActivity.class)};

   public void a(int var1) {
      this.getTabHost().setCurrentTab(var1);
   }

   public void finish() {
      ((b)com.puentenet.a.b.b.a()).a();
      super.finish();
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903059);
      Resources var7 = this.getResources();
      TabHost var6 = this.getTabHost();
      com.puentenet.smandroid.c.a[] var5 = a;
      int var3 = var5.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         com.puentenet.smandroid.c.a var8 = var5[var2];
         Intent var4 = new Intent(this, var8.d);
         var6.addTab(var6.newTabSpec(var8.b).setIndicator(var8.c, var7.getDrawable(var8.a)).setContent(var4));
      }

      com.puentenet.a.b.b.a((com.puentenet.a.b.a)(new b(this.getApplicationContext())));
      com.puentenet.a.d.c.a((com.puentenet.a.d.a)(new a(this)));
      var6.setCurrentTab(0);
   }

   protected void onStart() {
      super.onStart();
   }
}

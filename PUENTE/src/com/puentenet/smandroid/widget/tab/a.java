package com.puentenet.smandroid.widget.tab;

import android.widget.ListAdapter;
import android.widget.ListView;
import com.puentenet.smandroid.widget.tab.e;

public class a extends e {
   private ListView a;

   public a(ListView var1) {
      this.a = var1;
   }

   protected void a(int var1, int var2) {
      ListAdapter var3 = (ListAdapter)this.c(var2);
      this.a.setAdapter(var3);
   }
}

package com.puentenet.smandroid.widget.search.puentesearch;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.puentenet.a.d.i.f;
import com.puentenet.smandroid.widget.search.puentesearch.SearchResultLayout;
import com.puentenet.smandroid.widget.search.puentesearch.b;
import com.puentenet.smandroid.widget.search.puentesearch.c;
import java.util.Iterator;
import java.util.Vector;

public class a implements com.puentenet.smandroid.widget.search.a {
   protected ArrayAdapter b;
   protected SearchResultLayout c;
   protected Vector d;

   public a(Context var1, SearchResultLayout var2) {
      this.c = var2;
      ListView var4 = (ListView)var2.findViewById(2131361976);
      b var3 = new b(this, var1, 0, var1);
      this.b = var3;
      var4.setAdapter(var3);
   }

   public String a(int var1) {
      return ((com.puentenet.a.d.i.b)this.b.getItem(var1)).c();
   }

   public void a(String var1) {
      f.a().a(var1, new c(this));
   }

   protected void a(Vector var1) {
      this.d = var1;
      boolean var2;
      if(this.d != null && this.d.size() != 0) {
         var2 = false;
      } else {
         var2 = true;
      }

      if(!var2) {
         this.b.clear();
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            com.puentenet.a.d.i.b var4 = (com.puentenet.a.d.i.b)var3.next();
            this.b.add(var4);
         }
      }

      this.c.a(false, var2);
   }
}

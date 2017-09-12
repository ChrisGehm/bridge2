package com.puentenet.smandroid.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.puentenet.smandroid.widget.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class d extends BaseAdapter {
   private List a = new ArrayList();
   private List b = new ArrayList();
   private Map c = new HashMap();

   private e a(Object var1) {
      e var2 = new e(this, var1, (e)null);
      this.b.add(var2);
      this.c.put(var1, var2);
      return var2;
   }

   public abstract View a(Object var1, View var2, ViewGroup var3);

   public void a() {
      this.a.clear();
      this.b.clear();
      this.c.clear();
   }

   public void a(Object var1, Collection var2) {
      e var4 = (e)this.c.get(var1);
      e var3 = var4;
      if(var4 == null) {
         var3 = this.a(var1);
      }

      e.a(var3, var2);
   }

   public abstract View b(Object var1, View var2, ViewGroup var3);

   public void b() {
      this.a.clear();
      Iterator var1 = this.b.iterator();

      while(var1.hasNext()) {
         e var2 = (e)var1.next();
         this.a.add(var2);
         this.a.addAll(e.a(var2));
      }

   }

   public int getCount() {
      return this.a.size();
   }

   public Object getItem(int var1) {
      return this.a.get(var1);
   }

   public long getItemId(int var1) {
      return (long)var1;
   }

   public int getItemViewType(int var1) {
      byte var2;
      if(this.getItem(var1) instanceof e) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      return var2;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      Object var4 = this.getItem(var1);
      if(this.getItemViewType(var1) == 0) {
         var2 = this.b(e.b((e)var4), var2, var3);
      } else {
         var2 = this.a(var4, var2, var3);
      }

      return var2;
   }

   public int getViewTypeCount() {
      return 2;
   }
}

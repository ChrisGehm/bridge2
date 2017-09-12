package com.puentenet.smandroid.screens.quotes.watchlist;

import android.content.Context;
import android.database.Cursor;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.puentenet.a.e.e;
import com.puentenet.smandroid.l;
import java.util.Iterator;
import java.util.Vector;

public class d {
   private ArrayAdapter a;
   private Spinner b;
   private l c;

   public d(Context var1, ArrayAdapter var2, Spinner var3) {
      this.a = var2;
      this.b = var3;
      this.c = new l(var1);
      this.c.b();
      this.e();
      this.b();
   }

   private void e() {
      if(com.puentenet.a.e.b.g().size() <= 0) {
         if(l.a()) {
            Iterator var2 = com.puentenet.a.e.d.a().iterator();

            while(var2.hasNext()) {
               com.puentenet.a.e.b.b((e)var2.next());
            }

            this.c();
         } else {
            Cursor var3 = this.c.d();

            while(var3.moveToNext()) {
               e var4 = new e(var3.getString(var3.getColumnIndexOrThrow("name")));
               int var1 = var3.getInt(var3.getColumnIndexOrThrow("_id"));
               Cursor var5 = this.c.a(var1);

               while(var5.moveToNext()) {
                  var4.a(var5.getString(var5.getColumnIndexOrThrow("name")));
               }

               com.puentenet.a.e.b.b(var4);
               var5.close();
            }

            var3.close();
         }
      }

   }

   public void a() {
      com.puentenet.a.e.b.g().removeElement(com.puentenet.a.e.b.e());
      com.puentenet.a.e.b.a(0);
      this.b();
   }

   public void a(String var1) {
      e var2 = new e(var1);
      com.puentenet.a.e.b.b(var2);
      com.puentenet.a.e.b.a(var2);
      this.a.setNotifyOnChange(false);
      this.a.add(var1);
      this.a.notifyDataSetChanged();
      this.b.setSelection(com.puentenet.a.e.b.f());
   }

   public void b() {
      Vector var2 = com.puentenet.a.e.b.g();
      this.a.setNotifyOnChange(false);
      this.a.clear();

      for(int var1 = 0; var1 < var2.size(); ++var1) {
         this.a.add(((e)var2.elementAt(var1)).b());
      }

      this.a.notifyDataSetChanged();
      this.b.setSelection(com.puentenet.a.e.b.f());
   }

   public void b(String var1) {
      e var4 = new e(var1);
      Vector var3 = com.puentenet.a.e.b.e().a();

      for(int var2 = 0; var2 < var3.size(); ++var2) {
         var4.a((String)var3.elementAt(var2));
      }

      com.puentenet.a.e.b.b(var4);
      com.puentenet.a.e.b.a(var4);
      this.a.setNotifyOnChange(false);
      this.a.add(var1);
      this.a.notifyDataSetChanged();
      this.b.setSelection(com.puentenet.a.e.b.f());
   }

   public void c() {
      this.c.a(com.puentenet.a.e.b.g());
   }

   public void d() {
      this.c.c();
   }
}

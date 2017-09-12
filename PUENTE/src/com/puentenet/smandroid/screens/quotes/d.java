package com.puentenet.smandroid.screens.quotes;

import com.puentenet.smandroid.screens.quotes.a;
import java.util.Vector;

class d implements com.puentenet.smandroid.widget.c {
   // $FF: synthetic field
   final a a;

   d(a var1) {
      this.a = var1;
   }

   public void a() {
      a.b(this.a, -1);
      this.a.notifyDataSetChanged();
   }

   public void a(int var1) {
      a.b(this.a, var1);
      this.a.notifyDataSetChanged();
   }

   public boolean a(int var1, int var2) {
      boolean var5 = false;
      byte var3 = 0;
      boolean var4 = var5;
      if(var2 >= 0) {
         var4 = var5;
         if(var2 < this.a.getCount()) {
            String var6 = (String)this.a.getItem(var1);
            this.a.remove(var6);
            this.a.insert(var6, var2);
            a.b(this.a, var2);
            Vector var7 = new Vector();

            for(var1 = var3; var1 < this.a.getCount(); ++var1) {
               var7.add((String)this.a.getItem(var1));
            }

            com.puentenet.a.e.b.a(var7);
            this.a.notifyDataSetChanged();
            var4 = true;
         }
      }

      return var4;
   }
}

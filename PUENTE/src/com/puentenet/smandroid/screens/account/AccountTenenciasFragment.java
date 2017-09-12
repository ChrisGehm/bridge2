package com.puentenet.smandroid.screens.account;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.puentenet.a.c.n;
import com.puentenet.smandroid.screens.account.f;
import java.util.Hashtable;
import java.util.Vector;

public class AccountTenenciasFragment extends ListFragment {
   private n Y;
   private f i;

   public AccountTenenciasFragment() {
      this.c(true);
   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return var1.inflate(2130903043, var2, false);
   }

   public void a(View var1, Bundle var2) {
      super.a(var1, var2);
      f var3 = new f(this);
      this.i = var3;
      this.a(var3);
      this.a(this.Y);
   }

   public void a(n var1) {
      this.Y = var1;
      if(var1 != null) {
         this.i.a();
         Hashtable var3 = var1.a();
         String[] var6 = var1.b();

         for(int var2 = 0; var2 < var6.length; ++var2) {
            String var5 = var6[var2];
            Vector var4 = (Vector)var3.get(var5);
            if(var4 != null) {
               this.i.a(var5, var4);
            }
         }

         this.i.b();
         this.i.notifyDataSetChanged();
      }

   }
}

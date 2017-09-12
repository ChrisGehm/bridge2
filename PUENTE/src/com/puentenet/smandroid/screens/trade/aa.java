package com.puentenet.smandroid.screens.trade;

import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.puentenet.smandroid.customdialogs.TradeOperationDialog;
import com.puentenet.smandroid.customdialogs.TradeOptionOperationDialog;
import com.puentenet.smandroid.screens.trade.TradeFragment;

class aa implements OnClickListener {
   // $FF: synthetic field
   final TradeFragment a;

   aa(TradeFragment var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      if(!com.puentenet.a.e.b.a()) {
         Toast.makeText(this.a.k(), this.a.a(2131099720), 0).show();
      } else {
         try {
            TradeFragment.a(this.a, TradeFragment.e(this.a));
         } catch (com.puentenet.a.c.a.b var2) {
            Toast.makeText(this.a.k(), this.a.a(2131099721), 0).show();
            TradeFragment.a((TradeFragment)this.a, (com.puentenet.a.d.j.b)null);
            return;
         }

         if(!TradeFragment.f(this.a).a()) {
            Toast.makeText(this.a.k(), this.a.a(2131099722), 0).show();
            TradeFragment.a((TradeFragment)this.a, (com.puentenet.a.d.j.b)null);
         } else {
            Object var3;
            if(this.a.a.equals("Opciones")) {
               var3 = TradeOptionOperationDialog.b((String)this.a.a(2131099723), (com.puentenet.a.d.j.b)TradeFragment.f(this.a), 0);
            } else {
               var3 = TradeOperationDialog.a((String)this.a.a(2131099723), (com.puentenet.a.d.j.b)TradeFragment.f(this.a), 0);
            }

            ((DialogFragment)var3).a(this.a, 0);
            ((DialogFragment)var3).a(this.a.m(), "confirm_trade");
         }
      }

   }
}

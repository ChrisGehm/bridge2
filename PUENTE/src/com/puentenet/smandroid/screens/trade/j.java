package com.puentenet.smandroid.screens.trade;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.puentenet.smandroid.screens.trade.OrdersFragment;
import java.text.SimpleDateFormat;
import java.util.Date;

class j extends ArrayAdapter {
   // $FF: synthetic field
   final OrdersFragment a;

   public j(OrdersFragment var1) {
      super(var1.k(), 0);
      this.a = var1;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      View var8 = var2;
      if(var2 == null) {
         var8 = LayoutInflater.from(this.a.k()).inflate(2130903091, (ViewGroup)null);
      }

      TextView var7 = (TextView)var8.findViewById(2131362057);
      TextView var5 = (TextView)var8.findViewById(2131362060);
      TextView var6 = (TextView)var8.findViewById(2131362055);
      TextView var4 = (TextView)var8.findViewById(2131362056);
      var7.setText(String.valueOf(((com.puentenet.a.c.g)this.getItem(var1)).a()));
      var5.setText(String.valueOf(((com.puentenet.a.c.g)this.getItem(var1)).c()));
      var6.setText((new SimpleDateFormat("dd-MM-yyyy")).format(new Date(((com.puentenet.a.c.g)this.getItem(var1)).b())));
      var4.setText((new SimpleDateFormat("hh:mm:ss")).format(new Date(((com.puentenet.a.c.g)this.getItem(var1)).b())));
      return var8;
   }
}

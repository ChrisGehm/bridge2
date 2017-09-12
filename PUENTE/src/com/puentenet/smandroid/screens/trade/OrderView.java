package com.puentenet.smandroid.screens.trade;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.puentenet.smandroid.screens.trade.b;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderView extends LinearLayout {
   public OrderView(Context var1) {
      super(var1);
      inflate(var1, 2130903093, this);
   }

   private int b(com.puentenet.a.c.h var1) {
      int var2 = -16777216;
      if(var1.m().equals("P") || var1.m().equals("PF") || var1.m().equals("EC") || var1.m().equals("EP") || var1.m().equals("PC") || var1.m().equals("PIP") || var1.m().equals("PAP") || var1.m().equals("FP") || var1.m().equals("CP")) {
         var2 = -7829368;
      }

      return var2;
   }

   public void a(com.puentenet.a.c.h var1) {
      int var2 = this.b(var1);
      int var3 = b.b(var1.m());
      GradientDrawable var4 = (GradientDrawable)this.getResources().getDrawable(2130837703);
      var4.setColor(b.a(var1.g()));
      TextView var7 = (TextView)this.findViewById(2131362066);
      var7.setBackgroundDrawable(var4);
      var7.postInvalidate();
      var7.setPadding(0, 0, 5, 0);
      TextView var9 = (TextView)this.findViewById(2131362067);
      var9.setTextColor(var3);
      TextView var11 = (TextView)this.findViewById(2131362068);
      var11.setTextColor(var2);
      TextView var10 = (TextView)this.findViewById(2131361992);
      TextView var13 = (TextView)this.findViewById(2131362072);
      var13.setTextColor(var2);
      TextView var12 = (TextView)this.findViewById(2131362073);
      var12.setTextColor(var2);
      TextView var5 = (TextView)this.findViewById(2131362075);
      var5.setTextColor(var2);
      TextView var6 = (TextView)this.findViewById(2131362076);
      var6.setTextColor(var3);
      String var14 = var1.b();
      StringBuilder var8 = new StringBuilder(String.valueOf(var1.a()));
      if(var14 != "") {
         var14 = " - " + var14;
      } else {
         var14 = "";
      }

      var7.setText(var8.append(var14).toString());
      var9.setText(var1.c());
      var11.setText(var1.i());
      var10.setText(String.valueOf(var1.j()));
      if(var1.k().equals("SL")) {
         var13.setText(String.valueOf(var1.o()));
         var13.setVisibility(0);
         this.findViewById(2131362069).setVisibility(0);
      } else {
         var13.setVisibility(8);
         this.findViewById(2131362069).setVisibility(8);
      }

      if(!var1.k().equals("ME")) {
         var12.setText(String.valueOf(var1.n()));
         var12.setVisibility(0);
         this.findViewById(2131362071).setVisibility(0);
      } else {
         var12.setVisibility(8);
         this.findViewById(2131362071).setVisibility(8);
      }

      var14 = (new SimpleDateFormat("dd-MM-yyyy")).format(new Date(var1.l()));
      if(var1.l() == -1L) {
         var14 = "- -";
      }

      var5.setText(String.valueOf(var14));
      var6.setText((new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss")).format(new Date(var1.e())));
   }
}

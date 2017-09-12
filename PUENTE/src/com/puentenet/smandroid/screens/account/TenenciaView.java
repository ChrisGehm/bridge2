package com.puentenet.smandroid.screens.account;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.puentenet.a.c.m;
import com.puentenet.smandroid.k;
import com.puentenet.smandroid.customlayouts.DividerLayout;

public class TenenciaView extends LinearLayout {
   private k a;

   public TenenciaView(Context var1) {
      super(var1);
      inflate(var1, 2130903044, this);
      DividerLayout var3 = (DividerLayout)this.findViewById(2131361817);
      DividerLayout var2 = (DividerLayout)this.findViewById(2131361819);
      DividerLayout var4 = (DividerLayout)this.findViewById(2131361821);
      var3.a(true);
      var2.a(true);
      var4.a(true);
      this.a = new k(1, 9, 2, 2);
   }

   public void a(m var1) {
      TextView var7 = (TextView)this.findViewById(2131361808);
      TextView var5 = (TextView)this.findViewById(2131361809);
      TextView var2 = (TextView)this.findViewById(2131361810);
      TextView var4 = (TextView)this.findViewById(2131361811);
      TextView var6 = (TextView)this.findViewById(2131361812);
      LinearLayout var8 = (LinearLayout)this.findViewById(2131361816);
      TextView var3 = (TextView)var8.findViewById(2131361823);
      TextView var15 = (TextView)var8.findViewById(2131361824);
      LinearLayout var10 = (LinearLayout)this.findViewById(2131361818);
      TextView var9 = (TextView)var10.findViewById(2131361823);
      TextView var11 = (TextView)var10.findViewById(2131361824);
      LinearLayout var12 = (LinearLayout)this.findViewById(2131361820);
      TextView var16 = (TextView)var12.findViewById(2131361823);
      TextView var13 = (TextView)var12.findViewById(2131361824);
      LinearLayout var14 = (LinearLayout)this.findViewById(2131361822);
      TextView var17 = (TextView)var14.findViewById(2131361823);
      TextView var18 = (TextView)var14.findViewById(2131361824);
      var7.setText(var1.c());
      var5.setText("$" + this.a.format(var1.i()));
      var2.setText(var1.a());
      if(var1.j() * 100.0D < 1.0D) {
         this.a.setMaximumFractionDigits(4);
      }

      this.a.setMaximumIntegerDigits(3);
      var4.setText(this.a.format(var1.j() * 100.0D) + "%");
      this.a.setMaximumFractionDigits(1);
      this.a.setMaximumIntegerDigits(1);
      this.a.setMinimumFractionDigits(2);
      var6.setText(this.a.format(var1.h()));
      this.a.setMaximumFractionDigits(2);
      this.a.setMaximumIntegerDigits(9);
      var3.setText(2131099736);
      this.a.setMinimumFractionDigits(0);
      var15.setText("$" + this.a.format(var1.g()));
      var9.setText(2131099737);
      var11.setText(this.a.format(var1.d()));
      var16.setText(2131099738);
      var13.setText(this.a.format(var1.e()));
      var17.setText(2131099739);
      var18.setText(this.a.format(var1.f()));
   }
}

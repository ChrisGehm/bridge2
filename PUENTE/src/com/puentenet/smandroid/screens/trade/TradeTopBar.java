package com.puentenet.smandroid.screens.trade;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.puentenet.smandroid.screens.trade.ad;
import com.puentenet.smandroid.screens.trade.ae;
import com.puentenet.smandroid.screens.trade.af;
import com.puentenet.smandroid.screens.trade.ag;

public class TradeTopBar extends LinearLayout {
   final OnClickListener a = new ad(this);
   final OnClickListener b = new ae(this);
   final OnClickListener c = new af(this);
   private ag d;
   private Button e;
   private Button f;
   private ImageButton g;

   public TradeTopBar(Context var1) {
      super(var1);
   }

   public TradeTopBar(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   // $FF: synthetic method
   static ag a(TradeTopBar var0) {
      return var0.d;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.e = (Button)this.findViewById(2131362091);
      if(this.e != null) {
         this.e.setOnClickListener(this.a);
      }

      this.f = (Button)this.findViewById(2131362092);
      if(this.f != null) {
         this.f.setOnClickListener(this.b);
      }

      this.g = (ImageButton)this.findViewById(2131361794);
      if(this.g != null) {
         this.g.setOnClickListener(this.c);
      }

   }

   public void setListener(ag var1) {
      this.d = var1;
   }
}

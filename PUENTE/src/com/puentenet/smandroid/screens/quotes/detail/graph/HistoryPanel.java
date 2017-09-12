package com.puentenet.smandroid.screens.quotes.detail.graph;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;
import com.puentenet.smandroid.screens.quotes.detail.graph.ChartView;
import com.puentenet.smandroid.screens.quotes.detail.graph.c;
import java.util.Vector;

public class HistoryPanel extends RelativeLayout {
   public HistoryPanel(Context var1) {
      super(var1);
   }

   public HistoryPanel(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public HistoryPanel(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   public void a() {
      ((ViewFlipper)this.findViewById(2131361952)).setDisplayedChild(0);
   }

   public void a(com.puentenet.a.d.c.c var1, int var2) {
      Vector var4 = c.a(var1.a(var2));
      if(var4.size() >= 1 && var4 != null) {
         ChartView var3 = (ChartView)this.findViewById(2131361953);
         var3.a(var4, var2);
         var3.invalidate();
      } else {
         this.a(true);
      }

   }

   public void a(boolean var1) {
      ViewFlipper var2 = (ViewFlipper)this.findViewById(2131361952);
      if(var1) {
         var2.setDisplayedChild(2);
      } else {
         var2.setDisplayedChild(1);
      }

   }

   public boolean b() {
      return ((ViewFlipper)this.findViewById(2131361952)).getChildAt(0).isShown();
   }

   public void c() {
      ((ViewFlipper)this.findViewById(2131361952)).setDisplayedChild(1);
   }
}

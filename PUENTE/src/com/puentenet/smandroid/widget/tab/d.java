package com.puentenet.smandroid.widget.tab;

import android.widget.ViewSwitcher;
import com.puentenet.smandroid.widget.tab.e;

public class d extends e {
   private ViewSwitcher a;

   public d(ViewSwitcher var1) {
      this.a = var1;
   }

   protected void a(int var1, int var2) {
      this.a.setDisplayedChild(((Integer)this.c(var2)).intValue());
   }
}

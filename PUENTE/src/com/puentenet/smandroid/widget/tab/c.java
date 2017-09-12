package com.puentenet.smandroid.widget.tab;

import android.support.v4.view.ViewPager;
import android.support.v4.view.cd;
import com.puentenet.smandroid.widget.tab.CheckableViewGroup;
import com.puentenet.smandroid.widget.tab.e;

public class c extends e implements cd {
   private ViewPager a;
   private CheckableViewGroup b;

   public c(ViewPager var1, CheckableViewGroup var2) {
      this.a = var1;
      this.b = var2;
      var1.setOnPageChangeListener(this);
   }

   public void a(int var1) {
      this.b.a(this.a(Integer.valueOf(var1)));
   }

   public void a(int var1, float var2, int var3) {
   }

   protected void a(int var1, int var2) {
      this.a.a(((Integer)this.c(var2)).intValue(), false);
   }

   public void b(int var1) {
   }
}

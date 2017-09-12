package com.puentenet.smandroid.widget.tab;

import android.content.Context;
import android.util.AttributeSet;
import com.puentenet.smandroid.widget.tab.CheckableViewGroup;
import com.puentenet.smandroid.widget.tab.e;

public class TabBar extends CheckableViewGroup {
   private e a;

   public TabBar(Context var1) {
      super(var1);
   }

   public TabBar(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   protected void a(int var1, int var2) {
      if(this.a != null) {
         this.a.b(var1, var2);
      }

   }

   public void a(int var1, Object var2) {
      this.a.a(var1, var2);
   }

   public e getTabManager() {
      return this.a;
   }

   public void setTabManager(e var1) {
      this.a = var1;
   }
}

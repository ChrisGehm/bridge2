package com.puentenet.smandroid.widget.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Checkable;
import android.widget.RadioGroup;
import com.puentenet.smandroid.widget.tab.b;

public class CheckableViewGroup extends RadioGroup {
   private int a = -1;
   private final OnClickListener b = new b(this);

   public CheckableViewGroup(Context var1) {
      super(var1);
   }

   public CheckableViewGroup(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   private void a(int var1, boolean var2) {
      View var3 = this.findViewById(var1);
      if(var3 != null && var3 instanceof Checkable) {
         ((Checkable)var3).setChecked(var2);
      }

   }

   private void a(View var1) {
      var1.setOnClickListener(this.b);
   }

   public void a(int var1) {
      this.check(var1);
   }

   protected void a(int var1, int var2) {
   }

   public void check(int var1) {
      if(var1 != this.a) {
         if(this.a != -1) {
            this.a(this.a, false);
         }

         if(var1 != -1) {
            this.a(var1, true);
         }

         this.a(this.a, var1);
         this.a = var1;
         super.check(var1);
      }

   }

   public int getCurrentTabId() {
      return this.a;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();

      for(int var1 = 0; var1 < this.getChildCount(); ++var1) {
         this.a(this.getChildAt(var1));
      }

   }
}

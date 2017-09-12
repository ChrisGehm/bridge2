package com.puentenet.smandroid.widget;

import com.puentenet.smandroid.widget.RearrangeableListView;

class a implements Runnable {
   // $FF: synthetic field
   final RearrangeableListView a;

   a(RearrangeableListView var1) {
      this.a = var1;
   }

   public void run() {
      if(RearrangeableListView.a(this.a) != 0 && RearrangeableListView.a(this.a, RearrangeableListView.b(this.a) + RearrangeableListView.a(this.a))) {
         if(RearrangeableListView.a(this.a) == -1) {
            this.a.setSelection(this.a.getFirstVisiblePosition() - 1);
         } else {
            this.a.setSelection(this.a.getFirstVisiblePosition() + 1);
         }

         this.a.postDelayed(this, 300L);
      }

   }
}

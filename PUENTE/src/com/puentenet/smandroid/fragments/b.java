package com.puentenet.smandroid.fragments;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.puentenet.smandroid.fragments.ContextMenuFragment;
import com.puentenet.smandroid.fragments.d;

class b implements OnItemClickListener {
   // $FF: synthetic field
   final ContextMenuFragment a;

   b(ContextMenuFragment var1) {
      this.a = var1;
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      this.a.a();
      ContextMenuFragment.b(this.a).a((d)ContextMenuFragment.a(this.a).get(var3));
   }
}

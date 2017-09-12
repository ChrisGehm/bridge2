package android.support.v4.app;

import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

class aa implements OnItemClickListener {
   // $FF: synthetic field
   final ListFragment a;

   aa(ListFragment var1) {
      this.a = var1;
   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      this.a.a((ListView)var1, var2, var3, var4);
   }
}

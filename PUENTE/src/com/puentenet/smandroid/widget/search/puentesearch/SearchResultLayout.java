package com.puentenet.smandroid.widget.search.puentesearch;

import android.content.Context;
import android.widget.ListView;
import com.puentenet.smandroid.widget.FixedViewFlipper;

public class SearchResultLayout extends FixedViewFlipper {
   public SearchResultLayout(Context var1) {
      super(var1);
      inflate(var1, 2130903081, this);
   }

   public void a(boolean var1, boolean var2) {
      if(var1) {
         this.setDisplayedChild(0);
      } else if(var2) {
         this.setDisplayedChild(2);
      } else {
         this.setDisplayedChild(1);
      }

   }

   public ListView getListView() {
      return (ListView)this.findViewById(2131361976);
   }
}

package com.puentenet.smandroid.fragments;

import android.support.v4.app.Fragment;
import com.puentenet.smandroid.StockManager;

public abstract class StockManagerFragment extends Fragment {
   public StockManager a() {
      return (StockManager)this.k().getApplication();
   }
}

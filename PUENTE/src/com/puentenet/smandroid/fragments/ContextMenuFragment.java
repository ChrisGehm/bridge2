package com.puentenet.smandroid.fragments;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.puentenet.smandroid.fragments.a;
import com.puentenet.smandroid.fragments.b;
import com.puentenet.smandroid.fragments.c;
import com.puentenet.smandroid.fragments.e;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ContextMenuFragment extends DialogFragment {
   private List Y = new LinkedList();
   private Map Z = new HashMap();
   private c aa;
   private e ab = new a(this);

   // $FF: synthetic method
   static List a(ContextMenuFragment var0) {
      return var0.Y;
   }

   // $FF: synthetic method
   static e b(ContextMenuFragment var0) {
      return var0.ab;
   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      this.b().getWindow().requestFeature(1);
      View var5 = var1.inflate(2130903051, var2, false);
      ListView var4 = (ListView)var5.findViewById(16908298);
      var4.setOnItemClickListener(new b(this));
      c var6 = new c(this, this.k());
      this.aa = var6;
      var4.setAdapter(var6);
      return var5;
   }
}

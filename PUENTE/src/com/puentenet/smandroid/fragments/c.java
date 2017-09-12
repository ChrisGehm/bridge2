package com.puentenet.smandroid.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.puentenet.smandroid.fragments.ContextMenuFragment;
import com.puentenet.smandroid.fragments.d;

public class c extends ArrayAdapter {
   // $FF: synthetic field
   final ContextMenuFragment a;

   public c(ContextMenuFragment var1, Context var2) {
      super(var2, 0, 0, ContextMenuFragment.a(var1));
      this.a = var1;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      d var5 = (d)this.getItem(var1);
      View var4 = var2;
      if(var2 == null) {
         var4 = LayoutInflater.from(this.getContext()).inflate(2130903052, var3, false);
      }

      TextView var7 = (TextView)var4.findViewById(2131361851);
      ImageView var6 = (ImageView)var4.findViewById(2131361850);
      var7.setText(var5.a);
      var6.setImageDrawable(var5.b);
      return var4;
   }
}

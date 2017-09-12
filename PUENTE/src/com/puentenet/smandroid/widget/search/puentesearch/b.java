package com.puentenet.smandroid.widget.search.puentesearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.puentenet.smandroid.widget.search.puentesearch.a;

class b extends ArrayAdapter {
   // $FF: synthetic field
   final a a;
   // $FF: synthetic field
   private final Context b;

   b(a var1, Context var2, int var3, Context var4) {
      super(var2, var3);
      this.a = var1;
      this.b = var4;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      View var8 = var2;
      if(var2 == null) {
         var8 = LayoutInflater.from(this.b).inflate(2130903080, (ViewGroup)null);
      }

      TextView var6 = (TextView)var8.findViewById(2131361972);
      TextView var4 = (TextView)var8.findViewById(2131361973);
      TextView var7 = (TextView)var8.findViewById(2131361974);
      com.puentenet.a.d.i.b var5 = (com.puentenet.a.d.i.b)this.getItem(var1);
      var6.setText(var5.c());
      var4.setText(var5.b());
      var7.setText(var5.a());
      return var8;
   }
}

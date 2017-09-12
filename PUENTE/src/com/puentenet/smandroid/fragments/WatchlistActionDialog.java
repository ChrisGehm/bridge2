package com.puentenet.smandroid.fragments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;
import com.puentenet.smandroid.fragments.f;
import com.puentenet.smandroid.fragments.g;
import com.puentenet.smandroid.fragments.h;

public class WatchlistActionDialog extends FrameLayout {
   final OnClickListener a = new f(this);
   private h b;
   private TextView c;
   private EditText d;
   private LinearLayout e;

   public WatchlistActionDialog(Context var1) {
      super(var1);
      this.a();
   }

   // $FF: synthetic method
   static h a(WatchlistActionDialog var0) {
      return var0.b;
   }

   private void a() {
      inflate(this.getContext(), 2130903099, this);
      this.c = (TextView)this.findViewById(2131362101);
      this.d = (EditText)this.findViewById(2131362102);
      this.e = (LinearLayout)this.findViewById(2131362103);
      this.a(1, "Cancel", true);
      this.setOnTouchListener(new g(this));
   }

   public void a(int var1, String var2) {
      this.a(var1, var2, false);
   }

   public void a(int var1, String var2, boolean var3) {
      Button var4 = new Button(this.getContext(), (AttributeSet)null, 2131230729);
      var4.setId(var1);
      var4.setText(var2);
      if(var3) {
         var1 = 2130837713;
      } else {
         var1 = 2130837712;
      }

      var4.setBackgroundResource(var1);
      var4.setGravity(17);
      var4.setPadding(2, 2, 2, 2);
      var4.setTextSize(1, 13.0F);
      LayoutParams var5 = new LayoutParams(0, -2, 1.0F);
      var5.setMargins(2, 0, 2, 0);
      var4.setOnClickListener(this.a);
      this.e.addView(var4, this.e.getChildCount() - 1, var5);
   }

   public String getText() {
      return this.d.getText().toString();
   }

   public void setCaption(String var1) {
      this.c.setText(var1);
   }

   public void setListener(h var1) {
      this.b = var1;
   }
}

package com.puentenet.smandroid.screens.quotes;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import com.puentenet.smandroid.screens.quotes.QuoteView;
import com.puentenet.smandroid.screens.quotes.e;
import com.puentenet.smandroid.screens.quotes.f;

public class QuoteItemView extends QuoteView {
   private TextView a;
   private TextView b;
   private TextView c;
   private TextView d;
   private TextView e;
   private TextView f;
   private TextView g;
   private TextView h;
   private TextView i;
   private Button j;
   private Float k;
   private int l;
   private f m;

   public QuoteItemView(Context var1) {
      super(var1);
      inflate(var1, 2130903066, this);
      this.a = (TextView)this.findViewById(2131361890);
      this.b = (TextView)this.findViewById(2131361891);
      this.c = (TextView)this.findViewById(2131361894);
      this.e = (TextView)this.findViewById(2131361897);
      this.d = (TextView)this.findViewById(2131361893);
      this.f = (TextView)this.findViewById(2131361896);
      this.g = (TextView)this.findViewById(2131361900);
      this.i = (TextView)this.findViewById(2131361895);
      this.h = (TextView)this.findViewById(2131361901);
      this.j = (Button)this.findViewById(2131361899);
      this.j.setOnClickListener(new e(this));
   }

   private void a(int var1) {
      com.puentenet.a.c.k var2 = this.getQuote();
      if(var2.b() != null) {
         if(var2.j().floatValue() < 0.0F) {
            this.g.setText("-");
            this.j.setBackgroundResource(2130837576);
         } else if(var2.j().floatValue() == 0.0F) {
            this.g.setText("=");
            this.j.setBackgroundResource(2130837577);
         } else {
            this.g.setText("+");
            this.j.setBackgroundResource(2130837578);
         }

         switch(var1) {
         case 0:
            this.h.setText(this.a(var2.j().floatValue()));
            break;
         case 1:
            this.h.setText(this.b(var2.i().floatValue()));
            break;
         case 2:
            this.h.setText(this.a(var2.j().floatValue()) + "\n" + this.b(var2.i().floatValue()));
            break;
         case 3:
            this.h.setText(this.a(var2.f()));
            this.g.setText("");
         }

         this.h.invalidate();
      }

   }

   public void a() {
      this.setDisplayMode((this.getDisplayMode() + 1) % 4);
   }

   public void a(com.puentenet.a.c.k var1) {
      this.a.setText(var1.a());
      if(this.b()) {
         this.b.setText(2131099684);
         this.findViewById(2131361892).setVisibility(8);
         this.findViewById(2131361898).setVisibility(8);
      } else {
         this.findViewById(2131361892).setVisibility(0);
         this.findViewById(2131361898).setVisibility(0);
         this.b.setText(var1.b());
         this.c.setText(this.a(var1.l()));
         if(var1.h() != null) {
            this.d.setText(this.a(var1.h()) + " x ");
         } else {
            this.d.setText("");
         }

         this.e.setText(this.a(var1.k()));
         if(var1.g() != null) {
            this.f.setText(this.a(var1.g()) + " x ");
         } else {
            this.f.setText("");
         }

         this.i.setText(this.a(var1.e()));
         this.a(this.getDisplayMode());
      }

   }

   public int getDisplayMode() {
      return this.l;
   }

   public void setDisplayMode(int var1) {
      if(this.k == null) {
         this.k = Float.valueOf(this.h.getTextSize());
      }

      if(var1 == 2) {
         this.h.setTextSize(0, this.k.floatValue() / 1.7F);
      } else {
         this.h.setTextSize(0, this.k.floatValue());
      }

      this.a(var1);
      int var2 = this.l;
      this.l = var1;
      if(this.m != null && this.l != var2) {
         this.m.a(var1, var2);
      }

   }

   public void setListener(f var1) {
      this.m = var1;
   }
}

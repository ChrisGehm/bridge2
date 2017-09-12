package com.puentenet.smandroid.screens.quotes.detail.general;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.puentenet.a.e.b;
import com.puentenet.smandroid.k;
import com.puentenet.smandroid.screens.quotes.detail.general.QuoteGeneral52WeeksView;
import java.util.Vector;

public class QuoteGeneralView extends RelativeLayout {
   private k a;
   private Drawable b;
   private Drawable c;
   private Drawable d;
   private TextView e;
   private TextView f;
   private TextView g;
   private TextView h;
   private TextView i;
   private TextView j;
   private TextView k;
   private TextView l;
   private TextView m;
   private TextView n;
   private TextView o;
   private TextView p;
   private TextView q;
   private TextView r;
   private TextView s;
   private ImageButton t;
   private boolean u;

   public QuoteGeneralView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a();
   }

   public QuoteGeneralView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a();
   }

   public void a() {
      this.a = new k(1, 9, 2, 2);
      this.b = this.getResources().getDrawable(2130837649);
      this.c = this.getResources().getDrawable(2130837648);
      this.d = this.getResources().getDrawable(2130837650);
   }

   public void a(com.puentenet.a.c.k var1) {
      int var2 = 0;
      View var5 = this.findViewById(2131361923);
      View var4 = this.findViewById(2131361942);
      this.t = (ImageButton)this.findViewById(2131361920);
      this.e = (TextView)this.findViewById(2131361919);
      this.f = (TextView)this.findViewById(2131361921);
      this.g = (TextView)this.findViewById(2131361922);
      this.h = (TextView)this.findViewById(2131361926);
      this.j = (TextView)this.findViewById(2131361925);
      this.m = (TextView)this.findViewById(2131361928);
      this.n = (TextView)this.findViewById(2131361929);
      this.o = (TextView)this.findViewById(2131361930);
      this.p = (TextView)this.findViewById(2131361931);
      this.i = (TextView)this.findViewById(2131361940);
      this.k = (TextView)this.findViewById(2131361943);
      this.l = (TextView)this.findViewById(2131361939);
      this.q = (TextView)this.findViewById(2131361934);
      this.r = (TextView)this.findViewById(2131361935);
      this.s = (TextView)this.findViewById(2131361936);
      QuoteGeneral52WeeksView var6 = (QuoteGeneral52WeeksView)this.findViewById(2131361938);
      this.e.setText(var1.a());
      this.f.setText(var1.b());
      this.g.setText(var1.d());
      this.h.setText(this.a.a(var1.e(), "---"));
      this.j.setText(var1.c());
      this.m.setText(this.a.a(var1.k(), "---"));
      this.n.setText(this.a.a(var1.l(), "---"));
      this.o.setText(this.a.a(var1.p(), "---"));
      this.p.setText(this.a.a(var1.o(), "---"));
      this.r.setText(this.a.a(var1.n(), "---"));
      this.a.setMinimumFractionDigits(0);
      this.q.setText(this.a.a(var1.f(), "---"));
      if(var1.h() != null && var1.g() != null) {
         String var7 = this.a.a(var1.h(), "---");
         String var8 = this.a.a(var1.g(), "---");
         this.s.setText(var8 + "x" + var7);
      } else {
         this.s.setText("---");
      }

      this.a.setMinimumFractionDigits(2);
      Float var11 = var1.j();
      Float var10 = var1.i();
      if(var11 != null && var10 != null) {
         if(var11.floatValue() < 0.0F) {
            this.l.setText("-");
            var5.setBackgroundDrawable(this.b);
            var4.setBackgroundColor(this.getResources().getColor(2130968587));
         } else if(var11.floatValue() == 0.0F) {
            this.l.setText("=");
            var5.setBackgroundDrawable(this.c);
            var4.setBackgroundColor(this.getResources().getColor(2130968589));
         } else {
            this.l.setText("+");
            var5.setBackgroundDrawable(this.d);
            var4.setBackgroundColor(this.getResources().getColor(2130968588));
         }

         this.i.setText(this.a.a(Float.valueOf(Math.abs(var11.floatValue())), "---"));
         this.k.setText(this.a.a(Float.valueOf(Math.abs(var10.floatValue())), "---"));
      } else {
         this.i.setText("---");
         this.k.setText("---");
         this.l.setText(" ");
         var5.setBackgroundDrawable(this.c);
         var4.setBackgroundColor(this.getResources().getColor(2130968589));
      }

      var6.a(var1.r(), var1.q(), var1.e());
      Vector var9 = b.e().a();
      this.u = false;
      this.t.setImageResource(2130837508);
      this.t.setBackgroundResource(2130837508);

      int var3;
      for(; var2 < var9.size(); var2 = var3 + 1) {
         var3 = var2;
         if(((String)var9.elementAt(var2)).equals(var1.a())) {
            this.t.setImageResource(2130837510);
            this.t.setBackgroundResource(2130837510);
            this.u = true;
            var3 = var9.size();
         }
      }

   }

   public void b() {
      if(!this.u) {
         this.u = true;
         this.t.setImageResource(2130837510);
         this.t.setBackgroundResource(2130837510);
      }

   }

   public boolean getAdded() {
      return this.u;
   }

   public String getTickerName() {
      return this.e.getText().toString();
   }

   public void setButtonListener(OnClickListener var1) {
      this.t.setOnClickListener(var1);
   }
}

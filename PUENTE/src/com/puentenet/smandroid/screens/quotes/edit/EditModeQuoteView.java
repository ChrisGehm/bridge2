package com.puentenet.smandroid.screens.quotes.edit;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.puentenet.a.c.k;
import com.puentenet.smandroid.screens.quotes.QuoteView;

public class EditModeQuoteView extends QuoteView implements com.puentenet.smandroid.widget.b {
   final Rect a;
   private TextView b;
   private TextView c;
   private ImageView d;

   public EditModeQuoteView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public EditModeQuoteView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a = new Rect();
      inflate(var1, 2130903067, this);
      this.b = (TextView)this.findViewById(2131361890);
      this.c = (TextView)this.findViewById(2131361891);
      this.d = (ImageView)this.findViewById(2131361902);
   }

   public void a() {
   }

   public void a(k var1) {
      this.b.setText(var1.a());
      String var2 = var1.b();
      String var3 = var2;
      if(var2 == null) {
         var3 = this.getContext().getString(2131099684);
      }

      this.c.setText(var3);
   }

   public boolean a(int var1, int var2) {
      Rect var3 = this.a;
      this.d.getHitRect(var3);
      return var3.contains(var1, var2);
   }
}

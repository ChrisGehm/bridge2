package com.puentenet.smandroid.widget.search;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.util.AttributeSet;
import android.widget.EditText;
import com.puentenet.smandroid.widget.search.a;
import com.puentenet.smandroid.widget.search.b;

public class SearchEditText extends EditText {
   private b a;
   private a b;
   private boolean c;
   private boolean d;

   public SearchEditText(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public SearchEditText(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.c = false;
      this.d = true;
      this.setCompoundDrawablesWithIntrinsicBounds(2130837666, 0, 0, 0);
   }

   public void a() {
      this.d = false;
   }

   public void b() {
      this.d = true;
   }

   public void c() {
      if(this.getTextSize() > 0.0F) {
         this.setEditText("");
      }

   }

   protected void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      super.onTextChanged(var1, var2, var3, var4);
      if(this.d) {
         if(this.a != null) {
            if(!this.c && var1.length() >= 2) {
               this.a.a();
               this.c = true;
            }

            if(this.c && var1.length() == 0) {
               this.a.b();
               this.c = false;
            }
         }

         if(this.b != null && var1.length() >= 2 && var3 != var4) {
            this.b.a(var1.toString());
         }
      }

   }

   public void setEditText(String var1) {
      this.a();
      this.setText(var1);
      this.c = false;
      this.b();
   }

   public void setListener(b var1) {
      this.a = var1;
   }

   public void setMaxCharacters(int var1) {
      this.setFilters(new InputFilter[]{new LengthFilter(var1)});
   }

   public void setSearchChangeListener(a var1) {
      this.b = var1;
   }
}

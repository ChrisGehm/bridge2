package com.puentenet.smandroid.screens.trade;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout.LayoutParams;
import com.puentenet.smandroid.screens.trade.TradeSearchPanel;
import com.puentenet.smandroid.screens.trade.a;
import com.puentenet.smandroid.screens.trade.aa;
import com.puentenet.smandroid.screens.trade.p;
import com.puentenet.smandroid.screens.trade.q;
import com.puentenet.smandroid.screens.trade.r;
import com.puentenet.smandroid.screens.trade.s;
import com.puentenet.smandroid.screens.trade.t;
import com.puentenet.smandroid.screens.trade.u;
import com.puentenet.smandroid.screens.trade.v;
import com.puentenet.smandroid.screens.trade.w;
import com.puentenet.smandroid.screens.trade.x;
import com.puentenet.smandroid.screens.trade.y;
import com.puentenet.smandroid.screens.trade.z;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TradeFragment extends Fragment implements com.puentenet.smandroid.customdialogs.d {
   public static com.puentenet.a.c.k b;
   private Spinner Y;
   private Spinner Z;
   String a;
   private int aa;
   private int ab;
   private int ac;
   private Date ad;
   private com.puentenet.a.d.j.b ae;
   private OnItemSelectedListener af = new p(this);
   private OnItemSelectedListener ag = new t(this);
   private OnItemSelectedListener ah = new u(this);
   private OnClickListener ai = new v(this);
   private OnClickListener aj = new w(this);
   private OnItemClickListener ak = new x(this);
   private OnClickListener al = new y(this);
   private TextWatcher am = new z(this);
   private OnClickListener an = new aa(this);
   private final a ao = new q(this);
   private Button c;
   private TextView d;
   private String e;
   private boolean f;
   private com.puentenet.smandroid.k g;
   private TradeSearchPanel h;
   private Spinner i;

   public TradeFragment() {
      this.c(true);
      this.f = true;
      this.aa = 0;
      this.ab = 0;
      this.ac = 0;
      this.g = new com.puentenet.smandroid.k(1, 12, 1, 2);
      this.e = "0.0";
      this.ad = new Date();
      this.a = "Acciones";
   }

   private void F() {
      double var3 = 0.0D;
      EditText var10 = (EditText)this.q().findViewById(2131361993);
      EditText var12 = (EditText)this.q().findViewById(2131361995);
      Spinner var11 = (Spinner)this.q().findViewById(2131361990);
      TextView var9 = (TextView)this.k().findViewById(2131362009);
      var10.removeTextChangedListener(this.am);
      var12.removeTextChangedListener(this.am);
      if(!var10.getText().toString().equals("") && b != null) {
         int var7 = Integer.parseInt(var10.getText().toString());
         double var1;
         double var5;
         if(var11.getSelectedItemPosition() == 1) {
            String var18;
            try {
               var18 = b.e().toString();
            } catch (Exception var15) {
               var18 = "0";
            }

            var1 = var3;
            if(!var18.equals("")) {
               if(var18 == null) {
                  var1 = var3;
               } else {
                  label71: {
                     boolean var8;
                     try {
                        var5 = Double.parseDouble(var18);
                        var8 = this.h.getSymbolType().equals("BONO");
                     } catch (Exception var16) {
                        var1 = var3;
                        break label71;
                     }

                     var1 = var5;
                     if(var8) {
                        var1 = var5 / 100.0D;
                     }
                  }
               }
            }
         } else {
            var1 = var3;
            if(!var12.getText().toString().equals("")) {
               try {
                  var1 = Double.parseDouble(var12.getText().toString());
               } catch (Exception var14) {
                  var1 = 0.0D;
               }

               if(this.h.getSymbolType().equals("BONO")) {
                  var1 /= 100.0D;
               } else if(this.a.equals("Opciones")) {
                  label74: {
                     try {
                        var5 = (double)b.s().floatValue();
                        var1 = Double.parseDouble(var12.getText().toString());
                        var9.setText(b.s().toString());
                     } catch (Exception var17) {
                        var9.setText("-");
                        var1 = var3;
                        break label74;
                     }

                     var1 = var5 * var1;
                  }
               }
            }
         }

         var3 = (double)var7;
         if(this.a.equals("Opciones") && var11.getSelectedItemPosition() == 1) {
            this.b("-");
         } else {
            this.b(Double.toString(var3 * var1));
         }
      }

      var10.addTextChangedListener(this.am);
      var12.addTextChangedListener(this.am);
   }

   private com.puentenet.a.d.j.b G() {
      EditText var5 = (EditText)this.q().findViewById(2131361993);
      EditText var4 = (EditText)this.q().findViewById(2131361995);
      EditText var3 = (EditText)this.q().findViewById(2131361997);
      if(this.h.getText().length() != 0 && var5.getText().length() != 0) {
         com.puentenet.a.d.j.b var2 = new com.puentenet.a.d.j.b();
         String var1;
         if(this.i.getSelectedItemPosition() == 0) {
            var1 = "C";
         } else {
            var1 = "V";
         }

         var2.a(var1);
         if(this.a.equals("Opciones")) {
            var2.b("OPCION");
         } else {
            var2.b(this.h.getSymbolType());
         }

         var2.c(this.h.getText());
         var2.a(new Long(Long.parseLong(var5.getText().toString())));
         switch(this.Y.getSelectedItemPosition()) {
         case 0:
            if(var4.getText().length() == 0) {
               throw new com.puentenet.a.c.a.b();
            }

            var2.e("LI");
            var2.b(new Double(Double.parseDouble(var4.getText().toString())));
            break;
         case 1:
            var2.e("ME");
            break;
         case 2:
            if(var4.getText().length() == 0 || var3.getText().length() == 0) {
               throw new com.puentenet.a.c.a.b();
            }

            var2.e("SL");
            var2.b(new Double(Double.parseDouble(var4.getText().toString())));
            var2.c(new Double(Double.parseDouble(var3.getText().toString())));
         }

         if(this.c.equals(this.l().getString(2131099714))) {
            var2.f("EN_EL_DIA");
         } else {
            var2.f("SELECCIONAR");
            var2.b(Long.valueOf(this.ad.getTime()));
         }

         if(this.a.equals("Opciones")) {
            Spinner var6 = (Spinner)this.q().findViewById(2131361985);
            Spinner var7 = (Spinner)this.q().findViewById(2131361986);
            var3 = (EditText)this.q().findViewById(2131361987);
            if(var3.getText().toString().length() == 0) {
               throw new com.puentenet.a.c.a.b();
            }

            com.puentenet.a.c.e var8 = (com.puentenet.a.c.e)var7.getSelectedItem();
            if(((String)var6.getSelectedItem()).equals("Call")) {
               var1 = "C";
            } else {
               var1 = "V";
            }

            var2.d(var1);
            var2.a(Integer.valueOf(var8.a()));
            var2.b(Integer.valueOf(var8.b()));
            var2.a(Double.valueOf(var3.getText().toString()));
            var2.g("");
         } else {
            switch(this.Z.getSelectedItemPosition()) {
            case 0:
               var2.g("72");
               break;
            case 1:
               var2.g("48");
               break;
            case 2:
               var2.g("24");
            }
         }

         return var2;
      } else {
         throw new com.puentenet.a.c.a.b();
      }
   }

   private void H() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void a(TradeFragment var0) {
      var0.F();
   }

   // $FF: synthetic method
   static void a(TradeFragment var0, int var1) {
      var0.aa = var1;
   }

   // $FF: synthetic method
   static void a(TradeFragment var0, com.puentenet.a.d.j.b var1) {
      var0.ae = var1;
   }

   // $FF: synthetic method
   static void a(TradeFragment var0, String var1) {
      var0.c(var1);
   }

   private void a(Date var1) {
      this.ad = var1;
      if(com.puentenet.b.e.b.a(this.ad)) {
         this.c.setText(2131099714);
      } else if(com.puentenet.b.e.b.b(this.ad)) {
         String var2 = (new SimpleDateFormat("dd-MM-yyyy")).format(this.ad);
         this.c.setText(var2);
      } else {
         this.c.setText(2131099714);
         this.ad.setTime((new Date()).getTime());
      }

   }

   // $FF: synthetic method
   static Date b(TradeFragment var0) {
      return var0.ad;
   }

   private void b() {
      EditText var2 = (EditText)this.q().findViewById(2131361993);
      EditText var3 = (EditText)this.q().findViewById(2131361995);
      EditText var4 = (EditText)this.q().findViewById(2131361997);
      EditText var1 = (EditText)this.q().findViewById(2131361987);
      TextView var5 = (TextView)this.k().findViewById(2131362009);
      this.h.setValues("");
      if(!this.h.i()) {
         var2.setText("");
         var3.setText("");
         var4.setText("");
         var1.setText("");
         var5.setText("-");
         this.c.setText(2131099714);
         this.ad.setTime((new Date()).getTime());
         this.b("0.0");
         this.d("-");
      }

      this.i.setSelection(0);
      this.Y.setSelection(0);
      this.Z.setSelection(0);
      this.aa = 0;
      this.ab = 0;
      this.ac = 0;
   }

   // $FF: synthetic method
   static void b(TradeFragment var0, int var1) {
      var0.ab = var1;
   }

   // $FF: synthetic method
   static void b(TradeFragment var0, String var1) {
      var0.b(var1);
   }

   private void b(String var1) {
      String var4 = var1;
      if(var1.length() == 0) {
         var4 = "0";
      }

      try {
         double var2 = Double.parseDouble(var4);
         this.d.setText(this.g.format(var2));
         this.e = var4;
      } catch (Exception var5) {
         this.d.setText(var4);
         this.e = "";
      }

   }

   // $FF: synthetic method
   static String c(TradeFragment var0) {
      return var0.e;
   }

   private void c() {
      this.a = this.h.b(b);
      this.h.setValues(b);
      this.h.a(b);
      this.d(b.c());
      this.F();
   }

   // $FF: synthetic method
   static void c(TradeFragment var0, int var1) {
      var0.ac = var1;
   }

   private void c(String var1) {
      this.a = var1;
      if(!this.h.i()) {
         if("Opciones".equals(var1)) {
            this.a(true);
            this.h(false);
            this.f(false);
            this.i(true);
         } else {
            this.a(false);
            if(this.i.getSelectedItemPosition() == 0) {
               this.h(false);
            } else {
               this.h(true);
            }

            this.f(true);
            this.i(false);
         }

         if("Acciones Ext.".equals(var1)) {
            this.g(false);
         } else {
            this.g(true);
         }
      }

   }

   // $FF: synthetic method
   static TradeSearchPanel d(TradeFragment var0) {
      return var0.h;
   }

   private void d(String var1) {
      ((TextView)this.k().findViewById(2131362007)).setText(var1);
   }

   // $FF: synthetic method
   static com.puentenet.a.d.j.b e(TradeFragment var0) {
      return var0.G();
   }

   // $FF: synthetic method
   static com.puentenet.a.d.j.b f(TradeFragment var0) {
      return var0.ae;
   }

   private void f(boolean var1) {
      View var7 = this.q().findViewById(2131362001);
      View var4 = this.q().findViewById(2131361999);
      LayoutParams var3 = (LayoutParams)var4.getLayoutParams();
      View var5 = this.q().findViewById(2131361932);
      LinearLayout var2 = (LinearLayout)this.q().findViewById(2131361998);
      LinearLayout var6 = (LinearLayout)this.q().findViewById(2131361991);
      if(var1) {
         var7.setVisibility(0);
         var4.clearFocus();
         ((ViewGroup)var4.getParent()).removeView(var4);
         var2.setVisibility(0);
         var2.addView(var4, 0);
         var3.weight = 0.5F;
         var5.setVisibility(0);
      } else {
         var7.setVisibility(8);
         var4.clearFocus();
         ((ViewGroup)var4.getParent()).removeView(var4);
         var2.setVisibility(8);
         var6.addView(var4);
         var3.weight = 2.0F;
         var5.setVisibility(8);
      }

   }

   // $FF: synthetic method
   static void g(TradeFragment var0) {
      var0.b();
   }

   private void g(boolean var1) {
      View var3 = this.q().findViewById(2131362001);
      android.view.ViewGroup.LayoutParams var2 = this.q().findViewById(2131362000).getLayoutParams();
      if(var1) {
         var3.setVisibility(0);
         var2.width = -1;
         var2.height = -2;
      } else {
         var3.setVisibility(8);
         var2.width = -2;
         var2.height = -2;
      }

   }

   // $FF: synthetic method
   static void h(TradeFragment var0) {
      var0.c();
   }

   private void h(boolean var1) {
      Resources var3 = this.l();
      Spinner var2 = (Spinner)this.q().findViewById(2131361990);
      String[] var4 = var3.getStringArray(2131165186);
      ArrayAdapter var5;
      if(var1) {
         var5 = new ArrayAdapter(this.q().getContext(), 17367048, var4);
         var5.setDropDownViewResource(17367049);
         var2.setAdapter(var5);
      } else {
         String var6 = var4[0];
         String var7 = var4[1];
         var5 = new ArrayAdapter(this.q().getContext(), 17367048, new String[]{var6, var7});
         var5.setDropDownViewResource(17367049);
         var2.setAdapter(var5);
      }

   }

   private void i(boolean var1) {
      View var3 = this.k().findViewById(2131362008);
      View var2 = this.k().findViewById(2131362009);
      if(var1) {
         var3.setVisibility(0);
         var2.setVisibility(0);
      } else {
         var3.setVisibility(8);
         var2.setVisibility(8);
      }

   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return var1.inflate(2130903087, var2, false);
   }

   public void a() {
      b = null;
      this.b();
      this.h.e();
   }

   public void a(int var1, Object var2) {
      String var3 = com.puentenet.a.b.b.a(this.a);
      switch(var1) {
      case 0:
         com.puentenet.a.d.j.c.a().a(this.ae, new r(this, var3));
         break;
      case 1:
         if(var2 instanceof String) {
            this.b((String)var2);
            this.H();
         }
         break;
      case 2:
         if(var2 instanceof Date) {
            this.a((Date)var2);
         }
      }

   }

   public void a(View var1, Bundle var2) {
      super.a(var1, var2);
      this.i = (Spinner)var1.findViewById(2131361989);
      this.i.setOnItemSelectedListener(this.af);
      this.i.setSelection(this.aa);
      this.Y = (Spinner)var1.findViewById(2131361990);
      this.Y.setOnItemSelectedListener(this.ag);
      this.Y.setSelection(this.ab);
      ((EditText)var1.findViewById(2131361993)).addTextChangedListener(this.am);
      ((EditText)var1.findViewById(2131361995)).addTextChangedListener(this.am);
      ((EditText)var1.findViewById(2131361997)).addTextChangedListener(this.am);
      this.Z = (Spinner)var1.findViewById(2131362002);
      this.Z.setOnItemSelectedListener(this.ah);
      this.Z.setSelection(this.ac);
      this.c = (Button)var1.findViewById(2131362000);
      this.c.setOnClickListener(this.ai);
      this.a(this.ad);
      this.d = (TextView)var1.findViewById(2131362004);
      this.b(this.e);
      ((Button)var1.findViewById(2131362005)).setOnClickListener(this.aj);
      Spinner var4 = (Spinner)var1.findViewById(2131361986);
      com.puentenet.a.c.e[] var3 = com.puentenet.a.c.h.p();
      ArrayAdapter var5 = new ArrayAdapter(var1.getContext(), 17367048, var3);
      var5.setDropDownViewResource(17367049);
      var4.setAdapter(var5);
      this.h = (TradeSearchPanel)var1.findViewById(2131361908);
      this.h.a((ViewGroup)var1.findViewById(2131361903), var1.findViewById(2131361983));
      this.h.getListView().setOnItemClickListener(this.ak);
      this.h.setOnOptionsItemClickListener(this.ao);
      if(!this.f) {
         this.h.g();
      }

      this.f = false;
      this.k().findViewById(2131362091).setOnClickListener(this.al);
      var1.findViewById(2131362011).setOnClickListener(this.an);
   }

   public void a(String var1) {
      this.h.setValues(var1);
      if(b != null && (b == null || b.a().equals(var1))) {
         this.c();
      } else {
         com.puentenet.a.d.g.b.a().a(var1, new s(this));
      }

   }

   public void a(boolean var1) {
      View var2 = this.q().findViewById(2131361984);
      View var3 = this.q().findViewById(2131361988);
      if(var1) {
         var2.setVisibility(0);
         var3.setVisibility(0);
      } else {
         var2.setVisibility(8);
         var3.setVisibility(8);
      }

   }

   public void b(int var1) {
      View var3 = this.q().findViewById(2131361992);
      View var2 = this.q().findViewById(2131361994);
      View var4 = this.q().findViewById(2131361996);
      switch(var1) {
      case 0:
         var3.setVisibility(0);
         var2.setVisibility(0);
         var4.setVisibility(8);
         break;
      case 1:
         var3.setVisibility(0);
         var2.setVisibility(8);
         var4.setVisibility(8);
         break;
      case 2:
         var3.setVisibility(0);
         var2.setVisibility(0);
         var4.setVisibility(0);
      }

   }

   public void e(Bundle var1) {
      var1.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
      super.e(var1);
   }

   public void r() {
      super.r();
      if(com.puentenet.a.e.b.a()) {
         if(this.k().findViewById(2131361983) != null) {
            if(b != null) {
               this.h.f();
               this.c();
            }

            this.h.setSelectedTypeInstrumento(this.a);
            this.c(this.a);
         } else {
            this.h.e();
         }
      }

      this.h.h();
   }
}

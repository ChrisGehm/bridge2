package com.puentenet.smandroid.screens.configure;

import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.puentenet.a.c.o;
import com.puentenet.smandroid.fragments.StockManagerFragment;
import com.puentenet.smandroid.screens.configure.a;
import com.puentenet.smandroid.screens.configure.b;
import com.puentenet.smandroid.screens.configure.d;
import com.puentenet.smandroid.screens.configure.e;
import com.puentenet.smandroid.screens.configure.f;
import com.puentenet.smandroid.screens.configure.g;
import com.puentenet.smandroid.screens.configure.h;
import java.util.Hashtable;
import java.util.Vector;

public class ConfigureMainFragment extends StockManagerFragment {
   private Button Y;
   private Button Z;
   final OnClickListener a = new a(this);
   private ViewSwitcher aa;
   private CheckBox ab;
   private Button ac;
   private Spinner ad;
   private Spinner ae;
   private Button af;
   final OnClickListener b = new b(this);
   final OnClickListener c = new d(this);
   final OnItemSelectedListener d = new e(this);
   final OnCheckedChangeListener e = new f(this);
   final OnClickListener f = new g(this);
   private TextView g;
   private TextView h;
   private TextView i;

   private void F() {
      Hashtable var1 = new Hashtable();
      var1.put("username", this.h.getText().toString());
      var1.put("password", this.i.getText().toString());
      var1.put("tipoDocumento", this.ad.getSelectedItem().toString());
      var1.put("numeroDocumento", this.g.getText().toString());
      com.puentenet.a.d.d.b.a().a(new h(this), var1);
   }

   private void G() {
      com.puentenet.a.e.b.a((com.puentenet.a.c.a)com.puentenet.a.e.b.b().b().elementAt(this.ae.getSelectedItemPosition()));
   }

   private void H() {
      Editor var1 = this.a().a().edit();
      var1.remove("numeroDocumento");
      var1.remove("tipoDocumento");
      var1.remove("username");
      var1.remove("password");
      var1.commit();
      com.puentenet.a.e.b.a((Hashtable)null);
   }

   private void a(o var1) {
      Vector var2 = var1.b();
      ArrayAdapter var3 = new ArrayAdapter(this.k(), 17367048, var2);
      var3.setDropDownViewResource(17367049);
      this.ae.setAdapter(var3);
      this.ae.setSelection(com.puentenet.a.e.b.c());
   }

   // $FF: synthetic method
   static void a(ConfigureMainFragment var0, o var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(ConfigureMainFragment var0, String var1, Integer var2, String var3, String var4) {
      var0.a(var1, var2, var3, var4);
   }

   private void a(String var1, Integer var2, String var3, String var4) {
      if(!var1.equals("") && !var3.equals("") && !var4.equals("")) {
         Editor var5 = this.a().a().edit();
         var5.putString("numeroDocumento", var1);
         var5.putInt("tipoDocumento", var2.intValue());
         var5.putString("username", var3);
         var5.putString("password", var4);
         var5.commit();
         Hashtable var6 = new Hashtable();
         var6.put("numeroDocumento", var1);
         var6.put("tipoDocumento", var2);
         var6.put("username", var3);
         var6.put("password", var4);
         com.puentenet.a.e.b.a(var6);
      }

   }

   // $FF: synthetic method
   static boolean a(ConfigureMainFragment var0) {
      return var0.c();
   }

   private void b(View var1) {
      this.ad = (Spinner)var1.findViewById(2131361832);
      ArrayAdapter var2 = ArrayAdapter.createFromResource(this.k(), 2131165184, 17367048);
      var2.setDropDownViewResource(17367049);
      this.ad.setAdapter(var2);
      this.g = (TextView)var1.findViewById(2131361833);
      this.h = (TextView)var1.findViewById(2131361834);
      this.i = (TextView)var1.findViewById(2131361835);
      this.ab = (CheckBox)var1.findViewById(2131361844);
      this.aa = (ViewSwitcher)var1.findViewById(2131361840);
      this.Y = (Button)var1.findViewById(2131361841);
      this.Z = (Button)var1.findViewById(2131361842);
      this.ae = (Spinner)var1.findViewById(2131361843);
      this.ac = (Button)var1.findViewById(2131361845);
      this.af = (Button)var1.findViewById(2131361846);
   }

   // $FF: synthetic method
   static void b(ConfigureMainFragment var0) {
      var0.F();
   }

   // $FF: synthetic method
   static void c(ConfigureMainFragment var0) {
      var0.G();
   }

   private boolean c() {
      boolean var2 = false;
      boolean var1 = true;
      if(this.h.getText().length() == 0) {
         this.h.setError("Campo obligatorio");
         var1 = false;
      } else {
         this.h.setError((CharSequence)null);
      }

      if(this.i.getText().length() == 0) {
         this.i.setError("Campo obligatorio");
         var1 = false;
      } else {
         this.i.setError((CharSequence)null);
      }

      if(this.g.getText().length() == 0) {
         this.g.setError("Campo obligatorio");
         var1 = var2;
      } else {
         this.g.setError((CharSequence)null);
      }

      return var1;
   }

   // $FF: synthetic method
   static void d(ConfigureMainFragment var0) {
      var0.H();
   }

   // $FF: synthetic method
   static CheckBox e(ConfigureMainFragment var0) {
      return var0.ab;
   }

   // $FF: synthetic method
   static TextView f(ConfigureMainFragment var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static Spinner g(ConfigureMainFragment var0) {
      return var0.ad;
   }

   // $FF: synthetic method
   static TextView h(ConfigureMainFragment var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static TextView i(ConfigureMainFragment var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static ViewSwitcher j(ConfigureMainFragment var0) {
      return var0.aa;
   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var6 = var1.inflate(2130903049, var2, false);
      this.b(var6);
      this.h.setInputType(524288);
      Hashtable var7 = com.puentenet.a.e.b.h();
      if(var7 != null) {
         this.g.setText((String)var7.get("numeroDocumento"));
         this.ad.setSelection(((Integer)var7.get("tipoDocumento")).intValue());
         this.h.setText((String)var7.get("username"));
         this.i.setText((String)var7.get("password"));
         this.ab.setChecked(true);
      }

      if(com.puentenet.a.e.b.a()) {
         this.a(com.puentenet.a.e.b.b());
         this.aa.setDisplayedChild(1);
         this.ab.setVisibility(8);
      } else {
         this.aa.setDisplayedChild(0);
         this.ab.setVisibility(0);
      }

      ImageButton var5 = (ImageButton)var6.findViewById(2131361837);
      ImageButton var8 = (ImageButton)var6.findViewById(2131361838);
      ImageButton var4 = (ImageButton)var6.findViewById(2131361839);
      if(VERSION.SDK_INT < 11) {
         AlphaAnimation var9 = new AlphaAnimation(0.2F, 0.2F);
         var9.setDuration(0L);
         var9.setFillAfter(true);
         var5.startAnimation(var9);
         var8.startAnimation(var9);
         var4.startAnimation(var9);
      } else {
         var5.setAlpha(0.2F);
         var8.setAlpha(0.2F);
         var4.setAlpha(0.2F);
      }

      return var6;
   }

   public void a(View var1, Bundle var2) {
      super.a(var1, var2);
      this.Y.setOnClickListener(this.a);
      this.Z.setOnClickListener(this.b);
      this.ac.setOnClickListener(this.c);
      this.ae.setOnItemSelectedListener(this.d);
      this.ab.setOnCheckedChangeListener(this.e);
      if(this.k().getPackageManager().hasSystemFeature("android.hardware.telephony")) {
         this.af.setOnClickListener(this.f);
      } else {
         this.af.setVisibility(8);
      }

   }

   public void b() {
      this.aa.showPrevious();
      this.H();
      this.ab.setVisibility(0);
   }
}

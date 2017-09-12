package com.puentenet.smandroid.screens.account;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.puentenet.a.c.l;
import com.puentenet.smandroid.k;
import com.puentenet.smandroid.screens.account.e;
import com.puentenet.smandroid.screens.account.h;

public class AccountResumenFragment extends ListFragment {
   private String Y;
   private String Z;
   private h aa = new h("Liquidez");
   private h ab = new h("Renta fija");
   private h ac = new h("Renta variable");
   private h ad = new h("Opciones");
   private h ae = new h("Pases");
   private h af = new h("Valores acreditar");
   private h ag = new h("Cauciones");
   private k ah;
   private e i;

   public AccountResumenFragment() {
      this.c(true);
      this.ah = new k(1, 12, 2, 2);
   }

   private void b() {
      TextView var1 = (TextView)this.q().findViewById(2131361801);
      TextView var2 = (TextView)this.q().findViewById(2131361802);
      var1.setText(this.Y);
      var2.setText(this.Z);
   }

   public View a(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return var1.inflate(2130903041, var2, false);
   }

   public void a(View var1, Bundle var2) {
      super.a(var1, var2);
      this.i = new e(this);
      this.i.a(this.aa.a(), this.aa.b());
      this.i.a(this.ab.a(), this.ab.b());
      this.i.a(this.ac.a(), this.ac.b());
      this.i.a(this.ad.a(), this.ad.b());
      this.i.a(this.ae.a(), this.ae.b());
      this.i.a(this.af.a(), this.af.b());
      this.i.a(this.ag.a(), this.ag.b());
      this.i.b();
      this.a(this.i);
      this.b();
   }

   public void a(l var1) {
      this.Y = String.valueOf(com.puentenet.a.e.b.d().a());
      this.Z = this.ah.format((double)var1.b().floatValue());
      this.b();
      this.aa.a(var1.a());
      this.ab.a(var1.c());
      this.ac.a(var1.d());
      this.ad.a(var1.e());
      this.ae.a(var1.f());
      this.af.a(var1.g());
      this.ag.a(var1.h());
      this.i.notifyDataSetChanged();
   }
}

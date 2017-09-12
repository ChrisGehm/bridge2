package com.puentenet.smandroid;

import android.app.TabActivity;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.puentenet.smandroid.customdialogs.CustomAlertDialog;
import com.puentenet.smandroid.customdialogs.CustomProgressDialog;

public class a implements com.puentenet.a.d.a {
   public static int a = 0;
   public static int b = 1;
   private static a d;
   private TabActivity c;

   public a(TabActivity var1) {
      this.c = var1;
      d = this;
   }

   public static a a() {
      return d;
   }

   public void a(String var1) {
      android.support.v4.app.m var2 = ((FragmentActivity)this.c.getCurrentActivity()).e();
      CustomAlertDialog.a(var1).a(var2, "alertFragment");
   }

   public void b() {
      android.support.v4.app.m var1 = ((FragmentActivity)this.c.getCurrentActivity()).e();
      CustomProgressDialog.a("Cargando...").a(var1, "loadingFragment");
   }

   public void b(String var1) {
      Toast.makeText(this.c, var1, 0).show();
   }

   public void c() {
      DialogFragment var1 = (DialogFragment)((FragmentActivity)this.c.getCurrentActivity()).e().a("loadingFragment");
      if(var1 != null) {
         var1.a();
      }

   }
}

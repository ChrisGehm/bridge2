package com.puentenet.smandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.puentenet.smandroid.f;

public class InitialHelpLoginScreen extends Activity {
   final OnClickListener a = new f(this);

   protected void onActivityResult(int var1, int var2, Intent var3) {
      super.onActivityResult(var1, var2, var3);
      if(var2 == -1) {
         this.setResult(-1);
         this.finish();
      }

   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903056);
      ((Button)this.findViewById(2131361856)).setOnClickListener(this.a);
   }

   protected void onStart() {
      super.onStart();
   }
}

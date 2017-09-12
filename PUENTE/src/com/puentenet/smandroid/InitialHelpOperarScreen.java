package com.puentenet.smandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.puentenet.smandroid.g;

public class InitialHelpOperarScreen extends Activity {
   final OnClickListener a = new g(this);

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903057);
      ((Button)this.findViewById(2131361857)).setOnClickListener(this.a);
   }

   protected void onStart() {
      super.onStart();
   }
}

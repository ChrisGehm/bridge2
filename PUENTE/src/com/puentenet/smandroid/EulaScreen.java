package com.puentenet.smandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.puentenet.smandroid.c;
import com.puentenet.smandroid.d;

public class EulaScreen extends Activity {
   final OnClickListener a = new c(this);
   final OnClickListener b = new d(this);

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130903054);
      Button var3 = (Button)this.findViewById(2131361854);
      Button var2 = (Button)this.findViewById(2131361853);
      var3.setOnClickListener(this.a);
      var2.setOnClickListener(this.b);
   }

   protected void onStart() {
      super.onStart();
   }
}

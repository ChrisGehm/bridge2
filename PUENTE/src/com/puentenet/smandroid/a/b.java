package com.puentenet.smandroid.a;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class b implements com.puentenet.b.e.d {
   private DocumentBuilder a;

   public b() {
      try {
         DocumentBuilderFactory var1 = DocumentBuilderFactory.newInstance();
         var1.setCoalescing(true);
         this.a = var1.newDocumentBuilder();
      } catch (Exception var2) {
         throw new RuntimeException(var2.getMessage());
      }
   }
}

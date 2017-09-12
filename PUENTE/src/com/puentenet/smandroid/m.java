package com.puentenet.smandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;
import com.puentenet.smandroid.l;

class m extends SQLiteOpenHelper {
   m(Context var1) {
      super(var1, "data", (CursorFactory)null, 1);
   }

   public void onCreate(SQLiteDatabase var1) {
      var1.execSQL("create table watchlists (_id integer primary key, name text not null unique);");
      var1.execSQL("create table tickers (_watchlist integer references watchlists ( _id ) on delete cascade, name text not null);");
      l.a(true);
   }

   public void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
      Log.w("PersistanceDbAdapter", "Upgrading database from version " + var2 + " to " + var3 + ", which will destroy all old data");
      var1.execSQL("DROP TABLE IF EXISTS watchlists");
      var1.execSQL("DROP TABLE IF EXISTS tickers");
      this.onCreate(var1);
   }
}

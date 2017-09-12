package com.puentenet.smandroid.b;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;
import com.puentenet.smandroid.b.a;

final class d extends SQLiteOpenHelper {
   public d(Context var1, String var2, int var3) {
      super(var1, var2, (CursorFactory)null, var3);
   }

   public void onCreate(SQLiteDatabase var1) {
      if(var1 == null) {
         throw new IllegalArgumentException("db cannot be null");
      } else {
         var1.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT UNIQUE NOT NULL, %s TEXT UNIQUE NOT NULL, %s INTEGER NOT NULL CHECK (%s >= 0), %s INTEGER NOT NULL CHECK(%s IN (%s, %s)));", new Object[]{"api_keys", "_id", "api_key", "uuid", "created_time", "created_time", "opt_out", "opt_out", "0", "1"}));
         var1.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) NOT NULL, %s TEXT UNIQUE NOT NULL, %s INTEGER NOT NULL CHECK (%s >= 0), %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s TEXT, %s TEXT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT);", new Object[]{"sessions", "_id", "api_key_ref", "api_keys", "_id", "uuid", "session_start_wall_time", "session_start_wall_time", "localytics_library_version", "app_version", "android_version", "android_sdk", "device_model", "device_manufacturer", "device_android_id_hash", "device_telephony_id", "device_telephony_id_hash", "device_serial_number_hash", "locale_language", "locale_country", "network_carrier", "network_country", "network_type", "device_country", "latitude", "longitude"}));
         var1.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) NOT NULL, %s TEXT UNIQUE NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL CHECK (%s >= 0), %s INTEGER NOT NULL CHECK (%s >= 0));", new Object[]{"events", "_id", "session_key_ref", "sessions", "_id", "uuid", "event_name", "real_time", "real_time", "wall_time", "wall_time"}));
         var1.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) NOT NULL, %s TEXT NOT NULL CHECK(%s IN (%s, %s)), %s TEXT NOT NULL, %s INTEGER);", new Object[]{"event_history", "_id", "session_key_ref", "sessions", "_id", "type", "type", Integer.valueOf(0), Integer.valueOf(1), "name", "processed_in_blob"}));
         var1.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL);", new Object[]{"attributes", "_id", "events_key_ref", "events", "_id", "attribute_key", "attribute_value"}));
         var1.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT UNIQUE NOT NULL);", new Object[]{"upload_blobs", "_id", "uuid"}));
         var1.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) NOT NULL, %s INTEGER REFERENCES %s(%s) NOT NULL);", new Object[]{"upload_blob_events", "_id", "upload_blobs_key_ref", "upload_blobs", "_id", "events_key_ref", "events", "_id"}));
      }
   }

   public void onOpen(SQLiteDatabase var1) {
      super.onOpen(var1);
      if(a.b) {
         Log.v("Localytics", String.format("SQLite library version is: %s", new Object[]{DatabaseUtils.stringForQuery(var1, "select sqlite_version()", (String[])null)}));
      }

      if(!var1.isReadOnly()) {
         var1.execSQL("PRAGMA foreign_keys = ON;");
      }

   }

   public void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
      if(var2 < 3) {
         var1.delete("upload_blob_events", (String)null, (String[])null);
         var1.delete("event_history", (String)null, (String[])null);
         var1.delete("upload_blobs", (String)null, (String[])null);
         var1.delete("attributes", (String)null, (String[])null);
         var1.delete("events", (String)null, (String[])null);
         var1.delete("sessions", (String)null, (String[])null);
      }

   }
}

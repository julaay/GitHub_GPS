package com.example.july.github_gps;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Nikola on 27.01.17.
 */

public class DbHelper extends SQLiteOpenHelper {


    public static final String TABLE_NAME  = "GPS.db";
    private final static int DB_Version= 1;

   public DbHelper  (Context context ){super (context, TABLE_NAME,null, DB_Version);}




    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(GPSTable.SQL_CREATE);
        db.execSQL(GPSTable.STMT_INSERT, new String[]{""+11,""+22,"08.02.2017","5:58"});
        Log.e("DATABASE OPERATIONS","Table created...");

    }





    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
sqLiteDatabase.execSQL(GPSTable.SQL_DROP);
        onCreate(sqLiteDatabase);
    }
}

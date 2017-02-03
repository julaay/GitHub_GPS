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

    GPSData g;
    String table="GPS";
    String query=
            "CREATE TABLE "+"GPS"+" (LONGITUDE"+" NUMBER, "+"LATITUDE"+" NUMBER, "+
                    "DATE"+" TEX);";


    public DbHelper(Context context) {
        super(context, "DB", null, 1);
        Log.e("DATABASE OPERATIONS","Database created / opened...");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(query);
        Log.e("DATABASE OPERATIONS","Table created...");

    }

    public void addData(double langitude,double latitude,String date,String time, SQLiteDatabase db){
        ContentValues cv=new ContentValues();
        cv.put(String.valueOf(g.getLangitude()),langitude);
        cv.put(String.valueOf(g.getLatitude()),latitude);
        cv.put(g.getDate(),date);
        cv.put(g.getTime(),time);
        db.insert(table,null,cv);
        Log.e("DATABASE OPERATIONS","One row inserted...");
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

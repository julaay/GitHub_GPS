package com.example.july.github_gps;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by July on 03.02.17.
 */

public class Verbindung extends SQLiteOpenHelper {
    public Verbindung(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    private final static String TAG = "";
    private final static String DB_Name = "GPS.db";
    private static final int DB_VERSION = 3;

    public Verbindung(Context context) {
        super(context, DB_Name, null, DB_VERSION);
        Log.d(TAG, "Verbindung ");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG,"OnCreate bei Verbindung");
        db.execSQL(GPSTable.SQL_CREATE);


        db.execSQL(GPSTable.STMT_INSERT, new String[]{"1test", "2test", "3test","4test"});

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        Log.d(TAG, "============> onUpgrade DbVerbindung: Version" + oldVersion + "---->" + newVersion);

        db.execSQL(GPSTable.SQL_DROP);
        db.execSQL(GPSTable.SQL_CREATE);
        db.execSQL(GPSTable.STMT_INSERT, new String[]{"test1", "test2", "test2","test4"});
        onCreate(db);

    }
}

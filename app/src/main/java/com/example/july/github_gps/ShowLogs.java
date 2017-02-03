package com.example.july.github_gps;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Onur on 02.02.2017.
 */

public class ShowLogs extends AppCompatActivity{

    private final static String TAG = "";
    public static final String DB_NAME = "datenbank_list.db";
    public static final int DB_VERSION = 1;
    ArrayList items = new ArrayList();
    ListView lv= (ListView)findViewById(R.id.ListView);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabelle);


        Log.d(TAG, "MainActivity -------> loadData Event gezündet");
        Verbindung dbVerbindung = new Verbindung(this);
        SQLiteDatabase db = dbVerbindung.getReadableDatabase();

        Log.d(TAG, "Personen Table ----------> INSERT STATEMENT");
        //     db.execSQL(PersonsTable.STMT_INSERT, new String[]{"1", "july", "eigner","19"});
        //   db.execSQL(PersonsTable.STMT_INSERT, new String[]{"2", "paul", "eigner","0"});


        Log.d(TAG, "Statement wurde erfolgreich in die Tabelle hinzugefügt");
        String name = "";

        Cursor rows = db.rawQuery("SELECTLONGITUDE , LATITUDE, DATE, TIME FROM GPS", new String[]{"3"});
        if(rows.getCount() > 0)
        {
            Log.d(TAG, "Cursor wird auf Daten überprüft ------------> Cursor rows");
            rows.moveToFirst();
            name = rows.getString(0)+ " " +rows.getString(1);
            items.add(name);
            rows.close();
        }


        ArrayAdapter adap= new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        lv.setAdapter(adap);

    }
}

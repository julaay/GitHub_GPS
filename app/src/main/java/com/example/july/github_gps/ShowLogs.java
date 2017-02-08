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

    ArrayList items = new ArrayList();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabelle);



        loadData();



        String name = "";

        }


    public void loadData(){
        DbHelper dbHelper= new DbHelper(this);
        SQLiteDatabase sqLiteDatabase= dbHelper.getReadableDatabase();

        Cursor rows = sqLiteDatabase.rawQuery("SELECT LONGITUDE , LATITUDE, DATE, TIME FROM GPS", new String[]{});
        while(rows.moveToNext() )
        {
            items.add(new GPSData(rows.getString(0), rows.getString(1), rows.getString(2), rows.getString(3))); }




            rows.close();
        sqLiteDatabase.close();

ListView lv=(ListView)findViewById(R.id.ListView);



        ArrayAdapter adap= new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        lv.setAdapter(adap);

    }
}

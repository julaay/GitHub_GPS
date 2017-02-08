package com.example.july.github_gps;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements LocationListener {

    private static LocationManager locMan = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        locMan = (LocationManager) getSystemService(LOCATION_SERVICE);



    }


    public void btnclick(final View view) {
        Intent intent= new Intent(this, ShowLogs.class);
       startActivity(intent);

    }

    @Override
    protected void onResume() {
        super.onResume();


      if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        locMan.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 5,  this);
    }


    @Override
    public void onLocationChanged(Location location) {
        if(location!=null){

double lat= location.getLatitude();
            double long1= location.getLongitude();
             Date date = new Date();

            GPSData p = new GPSData(String.format("4.4f", lat), String.format("4.4f", long1), android.text.format.DateFormat.format("DD.MM.YYYY",date.getTime()).toString(), (String) android.text.format.DateFormat.format("HH:mm", date.getTime()));


            TextView tVlongitude= (TextView) findViewById(R.id.tVlongitude);
            TextView tVdate= (TextView) findViewById(R.id.tVdate);
            TextView tVtime= (TextView) findViewById(R.id.tVtime);
            TextView tVlatitude= (TextView) findViewById(R.id.tVlatitude);
            tVlongitude.setText(""+p.getLongitude()+"");
            tVlatitude.setText(""+p.getLatitude()+"");
            tVtime.setText(p.getTime());
            tVdate.setText(p.getDate());


            DbHelper dbHelper = new DbHelper(this);
            SQLiteDatabase db = dbHelper.getWritableDatabase();


            db.execSQL(GPSTable.STMT_INSERT, new String[]{String.valueOf(p.getLongitude()),String.valueOf(p.getLatitude()),p.getDate(), p.getTime()});


           db.close();

        }
    }




    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {}

    @Override
    public void onProviderEnabled(String s) {}

    @Override
    public void onProviderDisabled(String s) {}





    }


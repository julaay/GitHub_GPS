package com.example.july.github_gps;

import android.Manifest;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static LocationManager locMan = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        locMan = (LocationManager) getSystemService(LOCATION_SERVICE);


        //programmieren is lit affsdfgdgfdgsd
        //
    }

    @Override
    protected void onResume(){
        super.onResume();
        //da flo hot do nu wos oba i glaub des brauch ma nd
        locMan.requestLocationUpdates(LocationManager.GPS_PROVIDER,5000,5, (LocationListener) this);


    }


    public void onLocationChanged(Location location){
        if(location!=null){
            double dbl1 = location.getLatitude();
            double dbl2 = location.getLongitude();
            Date d = new Date();

            Positions p = new Positions{
                String.format(keine ahnung wos do steht aufn bild :D),
                String.format(keine ahnung wos do steht aufn bild :D),
                android.test.format.DateFormat.format("DD.MM.YYYY",d.getTime()).toString(),
                        android.test.format.DateFormat.format("HH.mm",d.getTime()).toString()};

            ((EditText)findViewById(R.id.editText_position)).setText(p.toString);//keine ahnung wos da flo unta p gmant hot
            DataBaseHelper dbHelper = new DataBaseHelper(this);
            SQLiteDatabase db = dbHelper.getWriteableDatabase();
            db.execSQL(PositionsTbl.STMT_INSERT,new String[]{p.longitude,p.latitude,p.date, p.time});
            db.close();

            }
        }

    public void onStatusChanged(String s, int i, Bundle bunlde){}
    public void onProviderEnabled(String s, int i, Bundle bunlde){}
    public void onProviderDisabled(String s, int i, Bundle bunlde){}//keine ahnung woher er die mehtoden hod ,des san ole overide mehtods



    }
}

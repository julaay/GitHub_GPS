package com.example.july.github_gps;

/**
 * Created by July on 03.02.17.
 */

public class GPSTable {

    public static final String TABLE_NAME  = "GPS";

    public static final String  longitude="LONGITUDE";
    public static final String  latidude="LATITUDE";
public static String date1= "Date";
  public static String time1="TIME";




    public static final String[] ALL_COLUMNS=new String[] {longitude,latidude,date1,time1};


    public static final String SQL_DROP="DROP TABLE IF EXISTS "+TABLE_NAME;
    public static String SQL_CREATE =
            "CREATE TABLE"+TABLE_NAME+
                    "(" +
                    longitude+"TEXT NOT NULL,"+
                    latidude+"TEXT NOT NULL,"+
                    date1+"TEXT NOT NULL,"+
                    time1+"TEXT NOT NULL"+")";

    public static final String STMT_DELETE="DELETE FROM"+TABLE_NAME;
    public static final String STMT_INSERT=
            "INSERT INTO"+TABLE_NAME+
                    "("+longitude+","+latidude+","+date1+","+time1+")"+"VALUES (?,?,?,?)";

    public static final String UPDATE= "UPDATE"+TABLE_NAME+"SET"+longitude+","+latidude+","+date1+","+longitude+"FROM"+TABLE_NAME;
}




package com.example.july.github_gps;

/**
 * Created by July on 03.02.17.
 */

public class GPSTable {

    public static final String TABLE_NAME  = "GPS";

    public static final double  longitude=0;
    public static final double  latidude=0;
public static String date= "Date";
  public static String time="TIME";




    public static final String[] ALL_COLUMNS=new String[] {String.valueOf(longitude),String.valueOf(latidude),date,time};


    public static final String SQL_DROP="DROP TABLE IF EXISTS "+TABLE_NAME;
    public static String SQL_CREATE =
            "CREATE TABLE"+TABLE_NAME+
                    "(" +
                    longitude+"INTEGER PRIMARY KEY,"+
                    latidude+"TEXT NOT NULL,"+
                    date+"TEXT NOT NULL,"+
                    time+"TEXT NOT NULL"+")";

    public static final String STMT_DELETE="DELETE FROM"+TABLE_NAME;
    public static final String STMT_INSERT=
            "INSERT INTO"+TABLE_NAME+
                    "("+longitude+","+latidude+","+date+","+time+")"+"VALUES (?,?,?,?)";

    public static final String UPDATE= "UPDATE"+TABLE_NAME+"SET"+longitude+","+latidude+","+date+","+longitude;
}




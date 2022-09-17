package com.learn.wolaytegna.spokenwolaytic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {

    //Constants for db name and version
    private static final String DATABASE_NAME = "wolaytegna.db";
    private  static final int DATABASE_VERSION = 6;

    //Constants for identifying table and columns
    public static final String TABLE_WOLAYTA = "wolaytegna";
    public static final String TABLE_SETTING = "setting";
    public static final String TABLE_ALLDATA = "alldata";
    public static final String TABLE_NOF_DATA = "nof_data";

    public static final String ID = "_id";
    public static final String ENGLISH = "english";
    public static final String WOLAYTEGNA = "wolaytegna";
    public static final String IMAGE_ID = "image_id";

    public static final String SETTING_ID = "id";
    public static final String CHECKED_LANG = "language";

    public static final String ALLDATA_ID = "id";
    public static final String ALLDATA_ENGLISH = "alldataenglish";
    public static final String ALLDATA_WOLAYTIC = "alldatawolaytic";

    public static final String NOF_DATA = "nofdata";
    public static final String NOF_DATA_ID = "id";

    //SQL to create table
    private static final String TABLE_CREATE = "CREATE TABLE " + TABLE_WOLAYTA + " (" + ID +
            " INTEGER PRIMARY KEY AUTOINCREMENT, " + ENGLISH + " TEXT, " + WOLAYTEGNA + " TEXT, " + IMAGE_ID + " INTEGER" + ");";

    private static final String TABLE_CRAEATE_SETTING = "CREATE TABLE " + TABLE_SETTING + " (" + SETTING_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
             + CHECKED_LANG + " TEXT);";

    private static final String TABLE_CREATE_ALLDATA = "CREATE TABLE " + TABLE_ALLDATA + " (" + ALLDATA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            ALLDATA_ENGLISH + " TEXT, " + ALLDATA_WOLAYTIC + " TEXT);";

    private static final String TABLE_CREATE_NOF_DATA = "CREATE TABLE " + TABLE_NOF_DATA + " (" + NOF_DATA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            NOF_DATA + " INTEGER);";

    public DBOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        db.execSQL(TABLE_CRAEATE_SETTING);
        db.execSQL(TABLE_CREATE_ALLDATA);
        db.execSQL(TABLE_CREATE_NOF_DATA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_WOLAYTA);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SETTING);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ALLDATA);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NOF_DATA);
        onCreate(db);
    }



}
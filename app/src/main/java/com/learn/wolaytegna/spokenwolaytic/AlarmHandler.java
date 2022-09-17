package com.learn.wolaytegna.spokenwolaytic;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class AlarmHandler {
    private Context context;
    static SQLiteDatabase db;
    static DBOpenHelper helper;

    public AlarmHandler(Context context){
        this.context = context;
        helper = new DBOpenHelper(context);
    }

    public void setAlarmHandler(){
        Intent intent = new Intent(context, ExcutableService.class);
        PendingIntent sender = PendingIntent.getBroadcast(context, 2, intent, 0);
        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        long triggerAfter = 60 * 1000;
        long triggerEvery = 60 * 1000;
        am.setRepeating(AlarmManager.RTC_WAKEUP, triggerAfter, triggerEvery, sender);


    }
    public void cancelAlarmManager(){
        Intent intent = new Intent(context, ExcutableService.class);
        PendingIntent sender = PendingIntent.getBroadcast(context, 2, intent, 0);
        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        am.cancel(sender);
    }
}

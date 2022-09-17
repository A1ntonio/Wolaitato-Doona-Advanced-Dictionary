package com.learn.wolaytegna.spokenwolaytic;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(help.this, "CHANNEL_ID")
//                .setSmallIcon(R.drawable.logo)
//                .setContentTitle("notify")
//                .setContentText("notification")
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
//        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(help.this);
//        // notificationId is a unique int for each notification that you must define
//        notificationManager.notify(0, builder.build());
    }
}
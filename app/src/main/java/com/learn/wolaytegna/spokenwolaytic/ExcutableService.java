package com.learn.wolaytegna.spokenwolaytic;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.Toast;

public class ExcutableService extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int id = new DBAdarter(context).nof_data();
        Toast.makeText(context,String.valueOf(id),Toast.LENGTH_SHORT).show();
        int num = new DBAdarter(context).nof_alldata();
        if (num != 0 && num < 1196){
            if (num == 1196){
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
                builder.setSmallIcon(R.drawable.tralogo);
                builder.setColor(context.getResources().getColor(R.color.colorPrimary));

                builder.setContentTitle("Wolaytatto Doonaa ADV Dictionary");
                builder.setContentText("Congratulation!! You're Successfully Finished All The Conversations.");
                builder.setOnlyAlertOnce(true);

                builder.setVibrate(new long[] {1000, 1000});
                builder.setLights(Color.RED, 3000, 3000);
                Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                builder.setSound(alarmSound);
                builder.setAutoCancel(true);
                builder.setStyle(new NotificationCompat.BigTextStyle().bigText("Congratulation!! You're Successfully Finished All The Conversations."));
                builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
                // notificationId is a unique int for each notification that you must define
                notificationManager.notify(0, builder.build());
            }else if(num >= id){
                new DBAdarter(context).insertId(id+1);
                AllDataSpacecraft allDataSpacecraft = new DBAdarter(context).retrieveAllData(id+1);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
                builder.setSmallIcon(R.drawable.tralogo);
                builder.setColor(context.getResources().getColor(R.color.colorPrimary));

                builder.setContentTitle("Wolaytatto Doonaa ADV Dictionary");
                builder.setContentText("English: "+allDataSpacecraft.getEnglish()+"\n\n"+"Wolaytic: "+allDataSpacecraft.getWolaytegna());
                builder.setOnlyAlertOnce(true);

                builder.setVibrate(new long[] {1000, 1000});
                builder.setLights(Color.RED, 3000, 3000);
                Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                builder.setSound(alarmSound);
                builder.setAutoCancel(true);
                builder.setStyle(new NotificationCompat.BigTextStyle().bigText("English: "+allDataSpacecraft.getEnglish()+"\n\n"+"Wolaytic: "+allDataSpacecraft.getWolaytegna()));
                builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
                // notificationId is a unique int for each notification that you must define
                notificationManager.notify(0, builder.build());
            }

        }

    }
}

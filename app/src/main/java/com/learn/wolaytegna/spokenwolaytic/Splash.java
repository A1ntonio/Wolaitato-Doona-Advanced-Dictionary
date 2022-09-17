package com.learn.wolaytegna.spokenwolaytic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Splash extends Activity {

    TextView welcome;
    TextView welcome1;
    ImageView image;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splashscreen);

        welcome = findViewById(R.id.textView8);
        welcome1 = findViewById(R.id.textView9);
        image = findViewById(R.id.imageView4);


        new Handler().postDelayed(new Runnable() {

// Using handler with postDelayed called runnable run method

            @Override

            public void run() {

                Intent i = new Intent(Splash.this, MainActivity.class);

                startActivity(i);

                // close this activity

                finish();

            }

        }, 3*1000); // wait for 5 seconds


        try {

            Date morning_start = new SimpleDateFormat("HH:mm:ss").parse("07:00:00");
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(morning_start);

            Date morning_end = new SimpleDateFormat("HH:mm:ss").parse("12:00:00");
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(morning_end);

            Date afternoon_end = new SimpleDateFormat("HH:mm:ss").parse("18:00:00");
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTime(afternoon_end);

            Date evening_end = new SimpleDateFormat("HH:mm:ss").parse("24:00:00");
            Calendar calendar5 = Calendar.getInstance();
            calendar5.setTime(evening_end);

            Date currentTime = new SimpleDateFormat("HH:mm:ss").parse("00:00:00");
            Calendar startingCalender = Calendar.getInstance();
            startingCalender.setTime(currentTime);
            startingCalender.add(Calendar.DATE, 1);



            long timeNow = System.currentTimeMillis();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date(timeNow);
            String time = simpleDateFormat.format(date);

            String someRandomTime = time;
            Date d = new SimpleDateFormat("HH:mm:ss").parse(someRandomTime);
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(d);

            if (startingCalender.getTime().after(calendar1.getTime())){
                calendar2.add(Calendar.DATE, 1);
                calendar3.add(Calendar.DATE, 1);
                calendar4.add(Calendar.DATE,1);
                calendar5.add(Calendar.DATE,1);
            }
            Date x = calendar3.getTime();

            if (x.after(calendar1.getTime()) && x.before(calendar2.getTime())){
                welcome.setText(getString(R.string.goodmorning));
                welcome1.setText(getString(R.string.saroaqideti));
            }else if (x.after(calendar2.getTime()) && x.before(calendar4.getTime())){
                welcome.setText(getString(R.string.goodafternoon));
                welcome1.setText(getString(R.string.saropedeti));
            }else if (x.after(calendar4.getTime()) && x.before(calendar5.getTime())){
                welcome.setText(getString(R.string.goodevining));
                welcome1.setText(getString(R.string.saropeedety));
            }else{
                Toast.makeText(this,"Time is not in between", Toast.LENGTH_SHORT).show();

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_right);
        welcome.startAnimation(animation);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.anim_down);
        image.startAnimation(animation2);

    }


}
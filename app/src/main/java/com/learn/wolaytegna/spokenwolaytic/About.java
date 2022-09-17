package com.learn.wolaytegna.spokenwolaytic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class About extends AppCompatActivity {

    Button play_store;
    Button gmail;
    Button telegram;
    Button message;
    Button phone;
    Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setTitle("About");

        play_store = findViewById(R.id.button_play_store);
        gmail = findViewById(R.id.button_gmail);
        telegram = findViewById(R.id.button_telegram);
        message = findViewById(R.id.button_message);
        phone = findViewById(R.id.button_phone);
        about = findViewById(R.id.button_about_app);

        play_store.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.learn.wolaytegna.learnwolaytegna"));
                intent1.setPackage("com.android.vending");
                startActivity(intent1);
            }
        });
        gmail.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("message/rfc822");
                String shareBody = "Here goes your comment...";
                shareIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"antoshavia3@gmail.com"});
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Spoken Wolaytic app");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(shareIntent, "Choose an Email client:"));
            }
        });
        telegram.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(About.this, "@Anteneh3", Toast.LENGTH_LONG).show();
            }
        });
        phone.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:0924376127"));
                startActivity(call);
            }
        });
        about.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(About.this, About_app.class);
                startActivity(i);
            }
        });
        message.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Intent.ACTION_SENDTO);
                send.setData(Uri.parse("smsto:0924376127"));
                send.putExtra("sms_body", "Here goes your comment...");
                startActivity(send);
            }
        });
    }
}

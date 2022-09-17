package com.learn.wolaytegna.spokenwolaytic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Favorits extends AppCompatActivity {

    MediaPlayer mp,mp2,mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Favorites");

        ListView listView = findViewById(R.id.list_item);


        ArrayList<Favorts> list = new DBAdarter(this).retrieveSpacecraft();


        FavoritListAdapter adapter = new FavoritListAdapter(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

    }
}

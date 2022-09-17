package com.learn.wolaytegna.spokenwolaytic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main10Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Wild Animals");

        ListView listView = findViewById(R.id.list_item);
        Categories1 cata1 = new Categories1("Lion","Gaamuwaa",R.raw.record20131231220118);
        Categories1 cata2 = new Categories1("Tiger","Maahiyaa",R.raw.record20131231220123);
        Categories1 cata3 = new Categories1("Monkey","Geleshshuwaa",R.raw.record20131231220130);
        Categories1 cata4 = new Categories1("Crocodile","Hawulashshuwaa",R.raw.record20131231220135);
        Categories1 cata5 = new Categories1("Snake","Shooshsha",R.raw.record20131231220140);
        Categories1 cata6 = new Categories1("Zebra","Hardidaa",R.raw.record20131231220250);
        Categories1 cata7 = new Categories1("Elephant","Dangarssaa",R.raw.record20131231220255);
        Categories1 cata8 = new Categories1("Buffalo","Menttaa",R.raw.record20131231220300);
        Categories1 cata9 = new Categories1("Hyena","Godariyaa",R.raw.record20131231220309);

        ArrayList<Categories1> list = new ArrayList<>();
        list.add(cata1);
        list.add(cata2);
        list.add(cata3);
        list.add(cata4);
        list.add(cata5);
        list.add(cata6);
        list.add(cata7);
        list.add(cata8);
        list.add(cata9);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main10Activity.this).nof_alldata();
        Toast.makeText(Main10Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 132){
            new DBAdarter(Main10Activity.this).saveAllData(cata1);
            new DBAdarter(Main10Activity.this).saveAllData(cata2);
            new DBAdarter(Main10Activity.this).saveAllData(cata3);
            new DBAdarter(Main10Activity.this).saveAllData(cata4);
            new DBAdarter(Main10Activity.this).saveAllData(cata5);
            new DBAdarter(Main10Activity.this).saveAllData(cata6);
            new DBAdarter(Main10Activity.this).saveAllData(cata7);
            new DBAdarter(Main10Activity.this).saveAllData(cata8);
            new DBAdarter(Main10Activity.this).saveAllData(cata9);
        }
    }
}

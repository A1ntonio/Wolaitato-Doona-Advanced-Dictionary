package com.learn.wolaytegna.spokenwolaytic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Education related nouns");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("School","Luxxeta Keettaa",R.raw.record20131231214857);
        Categories1 cata2 = new Categories1("Teacher","Luxisiyaagaa",R.raw.record20131231214910);
        Categories1 cata3 = new Categories1("Student","Luxxiyaagaa",R.raw.record20131231214919);
        Categories1 cata4 = new Categories1("Class room","Kiffilyaa",R.raw.record20131231215005);
        Categories1 cata5 = new Categories1("Library","Maxaafa keettaa",R.raw.record20131231215012);
        Categories1 cata6 = new Categories1("Doctor","Dotoryaa",R.raw.record20131231215019);
        Categories1 cata7 = new Categories1("Professor","Profeseryaa",R.raw.record20131231215025);
        Categories1 cata8 = new Categories1("Education","Luxetta",R.raw.record20131231215031);
        Categories1 cata9 = new Categories1("Knowledge","Eraa",R.raw.record20131231215049);
        Categories1 cata10 = new Categories1("Language","Doona",R.raw.record20131231215059);

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
        list.add(cata10);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main5Activity.this).nof_alldata();
        Toast.makeText(Main5Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 73){
            new DBAdarter(Main5Activity.this).saveAllData(cata1);
            new DBAdarter(Main5Activity.this).saveAllData(cata2);
            new DBAdarter(Main5Activity.this).saveAllData(cata3);
            new DBAdarter(Main5Activity.this).saveAllData(cata4);
            new DBAdarter(Main5Activity.this).saveAllData(cata5);
            new DBAdarter(Main5Activity.this).saveAllData(cata6);
            new DBAdarter(Main5Activity.this).saveAllData(cata7);
            new DBAdarter(Main5Activity.this).saveAllData(cata8);
            new DBAdarter(Main5Activity.this).saveAllData(cata9);
            new DBAdarter(Main5Activity.this).saveAllData(cata10);
        }
    }
}

package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main9Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Domestic Animals");

        ListView listView = findViewById(R.id.list_item);
        Categories1 cata1 = new Categories1("Cow","Miizziyo",R.raw.record20131231215932);
        Categories1 cata2 = new Categories1("Ox","Booraa",R.raw.record20131231215938);
        Categories1 cata3 = new Categories1("Horse","Paraa",R.raw.record20131231215943);
        Categories1 cata4 = new Categories1("Donkey","Hariyaa",R.raw.record20131231215948);
        Categories1 cata5 = new Categories1("Cat","Garawaa/Gawaraa",R.raw.record20131231215957);
        Categories1 cata6 = new Categories1("Dog","Kanaa",R.raw.record20131231220041);
        Categories1 cata7 = new Categories1("Hen","Kuuttuwaa",R.raw.record20131231220045);
        Categories1 cata8 = new Categories1("Got","Deeshshaa",R.raw.record20131231220049);
        Categories1 cata9 = new Categories1("Sheep","Dorssaa",R.raw.record20131231220054);
        Categories1 cata10 = new Categories1("Camel","Gaamelaa",R.raw.record20131231220059);
        Categories1 cata11 = new Categories1("Mule","Baquluwaa",R.raw.record20131231220104);


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
        list.add(cata11);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main9Activity.this).nof_alldata();
        Toast.makeText(Main9Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 121){
            new DBAdarter(Main9Activity.this).saveAllData(cata1);
            new DBAdarter(Main9Activity.this).saveAllData(cata2);
            new DBAdarter(Main9Activity.this).saveAllData(cata3);
            new DBAdarter(Main9Activity.this).saveAllData(cata4);
            new DBAdarter(Main9Activity.this).saveAllData(cata5);
            new DBAdarter(Main9Activity.this).saveAllData(cata6);
            new DBAdarter(Main9Activity.this).saveAllData(cata7);
            new DBAdarter(Main9Activity.this).saveAllData(cata8);
            new DBAdarter(Main9Activity.this).saveAllData(cata9);
            new DBAdarter(Main9Activity.this).saveAllData(cata10);
            new DBAdarter(Main9Activity.this).saveAllData(cata11);
        }
    }
}

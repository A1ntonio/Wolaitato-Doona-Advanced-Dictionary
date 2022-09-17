package com.learn.wolaytegna.spokenwolaytic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Food");

        ListView listView = findViewById(R.id.list_item);
        Categories1 cata1 = new Categories1("Bread","Daabbuwaa",R.raw.record20131231215425);
        Categories1 cata2 = new Categories1("Injera","Buddenaa",R.raw.record20131231215431);
        Categories1 cata3 = new Categories1("Banana","Muuziyaa",R.raw.record20131231215437);
        Categories1 cata4 = new Categories1("Mango","Mangguwaa",R.raw.record20131231215442);
        Categories1 cata5 = new Categories1("Carrot","Kaarootiyaa",R.raw.record20131231215448);
        Categories1 cata6 = new Categories1("Avocado","Afkatuwaa",R.raw.record20131231215454);
        Categories1 cata7 = new Categories1("Meat","Ashuwaa",R.raw.record20131231215500);
        Categories1 cata8 = new Categories1("Apple","Aapilyaa",R.raw.record20131231215506);
        Categories1 cata9 = new Categories1("Sweet Potato","Shukkariyaa",R.raw.record20131231215525);
        Categories1 cata10 = new Categories1("Potato","Gaallaa Donowaa",R.raw.record20131231215604);
        Categories1 cata11 = new Categories1("Sugarcane","Shonkkooruwaa",R.raw.record20131231215610);


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

        int num = new DBAdarter(Main7Activity.this).nof_alldata();
        Toast.makeText(Main7Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 96){
            new DBAdarter(Main7Activity.this).saveAllData(cata1);
            new DBAdarter(Main7Activity.this).saveAllData(cata2);
            new DBAdarter(Main7Activity.this).saveAllData(cata3);
            new DBAdarter(Main7Activity.this).saveAllData(cata4);
            new DBAdarter(Main7Activity.this).saveAllData(cata5);
            new DBAdarter(Main7Activity.this).saveAllData(cata6);
            new DBAdarter(Main7Activity.this).saveAllData(cata7);
            new DBAdarter(Main7Activity.this).saveAllData(cata8);
            new DBAdarter(Main7Activity.this).saveAllData(cata9);
            new DBAdarter(Main7Activity.this).saveAllData(cata10);
            new DBAdarter(Main7Activity.this).saveAllData(cata11);
        }
    }
}

package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main39Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Family");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("Mother","Ayiyoo",R.raw.record20131231220356);
        Categories1 cata2 = new Categories1("Father","Aawaa",R.raw.record20131231220402);
        Categories1 cata3 = new Categories1("Brother","Ishaa",R.raw.record20131231220407);
        Categories1 cata4 = new Categories1("Sister","Michchiyoo",R.raw.record20131231220411);
        Categories1 cata5 = new Categories1("Uncle","Aawaa Ishaa/Aayee Ishaa",R.raw.record20131231220422);
        Categories1 cata6 = new Categories1("Aunt","Aawaa Michchiyoo/Aayee Michchiyoo",R.raw.record20131231220431);
        Categories1 cata7 = new Categories1("Daughter","Macca na'iyoo",R.raw.record20131231220456);
        Categories1 cata8 = new Categories1("Son","Attuma na'aa",R.raw.record20131231220522);
        Categories1 cata9 = new Categories1("Grandmother","Aawaa Ayiyoo/Aayee Ayiyoo",R.raw.record20131231220542);
        Categories1 cata10 = new Categories1("Grandfather","Aawaa aawaa/Aaye aawaa",R.raw.record20131231220553);
        Categories1 cata11 = new Categories1("Wife","Machchiyoo",R.raw.record20131231220603);
        Categories1 cata12 = new Categories1("Husband","Azinaa",R.raw.record20131231220610);
        Categories1 cata13 = new Categories1("Friend","Laggiyaa",R.raw.record20131231220617);

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
        list.add(cata12);
        list.add(cata13);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main39Activity.this).nof_alldata();
        Toast.makeText(Main39Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 0){
            new DBAdarter(Main39Activity.this).saveAllData(cata1);
            new DBAdarter(Main39Activity.this).saveAllData(cata2);
            new DBAdarter(Main39Activity.this).saveAllData(cata3);
            new DBAdarter(Main39Activity.this).saveAllData(cata4);
            new DBAdarter(Main39Activity.this).saveAllData(cata5);
            new DBAdarter(Main39Activity.this).saveAllData(cata6);
            new DBAdarter(Main39Activity.this).saveAllData(cata7);
            new DBAdarter(Main39Activity.this).saveAllData(cata8);
            new DBAdarter(Main39Activity.this).saveAllData(cata9);
            new DBAdarter(Main39Activity.this).saveAllData(cata10);
            new DBAdarter(Main39Activity.this).saveAllData(cata11);
            new DBAdarter(Main39Activity.this).saveAllData(cata12);
            new DBAdarter(Main39Activity.this).saveAllData(cata13);
        }
    }
}

package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Nature");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("Sky","Saluwaa",R.raw.record20131231215652);
        Categories1 cata2 = new Categories1("Earth","Sa'aa",R.raw.record20131231215656);
        Categories1 cata3 = new Categories1("Air","Carkkuwaa",R.raw.record20131231215701);
        Categories1 cata4 = new Categories1("Plant","Doozza",R.raw.record20131231215707);
        Categories1 cata5 = new Categories1("Human Being","Asaa",R.raw.record20131231215804);
        Categories1 cata6 = new Categories1("Animal","Meddossaa",R.raw.record20131231215810);
        Categories1 cata7 = new Categories1("Water","Haattaa",R.raw.record20131231215815);
        Categories1 cata8 = new Categories1("Water fall","Soossuwaa",R.raw.record20131231215821);
        Categories1 cata9 = new Categories1("Land","Bittaa",R.raw.record20131231215826);
        Categories1 cata10 = new Categories1("Cloud","Shaaraa",R.raw.record20131231215843);
        Categories1 cata11 = new Categories1("Rain","Iraa",R.raw.record20131231215848);
        Categories1 cata12 = new Categories1("Fire","Tamaa",R.raw.record20131231215902);
        Categories1 cata13 = new Categories1("Sun","Awaa",R.raw.record20131231215855);
        Categories1 cata14 = new Categories1("Moon","Aginaa",R.raw.record20131231215915);




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
        list.add(cata13);
        list.add(cata12);
        list.add(cata14);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main8Activity.this).nof_alldata();
        Toast.makeText(Main8Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 107){
            new DBAdarter(Main8Activity.this).saveAllData(cata1);
            new DBAdarter(Main8Activity.this).saveAllData(cata2);
            new DBAdarter(Main8Activity.this).saveAllData(cata3);
            new DBAdarter(Main8Activity.this).saveAllData(cata4);
            new DBAdarter(Main8Activity.this).saveAllData(cata5);
            new DBAdarter(Main8Activity.this).saveAllData(cata6);
            new DBAdarter(Main8Activity.this).saveAllData(cata7);
            new DBAdarter(Main8Activity.this).saveAllData(cata8);
            new DBAdarter(Main8Activity.this).saveAllData(cata9);
            new DBAdarter(Main8Activity.this).saveAllData(cata10);
            new DBAdarter(Main8Activity.this).saveAllData(cata11);
            new DBAdarter(Main8Activity.this).saveAllData(cata12);
            new DBAdarter(Main8Activity.this).saveAllData(cata13);
            new DBAdarter(Main8Activity.this).saveAllData(cata14);
        }
    }
}

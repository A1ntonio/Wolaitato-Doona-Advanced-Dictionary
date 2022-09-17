package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main6Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Body Parts");

        ListView listView = findViewById(R.id.list_item);
        Categories1 cata1 = new Categories1("Eye","Ayfiyaa",R.raw.record20131231215110);
        Categories1 cata2 = new Categories1("Ear","Hayittaa",R.raw.record20131231215115);
        Categories1 cata3 = new Categories1("Nose","Siiryaa",R.raw.record20131231215120);
        Categories1 cata4 = new Categories1("Mouse","Doonaa",R.raw.record20131231215133);
        Categories1 cata5 = new Categories1("Teeth","Achchaa",R.raw.record20131231215247);
        Categories1 cata12 = new Categories1("Tongue","Inxarisaa",R.raw.record20131231215252);
        Categories1 cata13 = new Categories1("Lip","Mentershshaa",R.raw.record20131231215303);
        Categories1 cata6 = new Categories1("Leg","Gediyaa",R.raw.record20131231215310);
        Categories1 cata7 = new Categories1("Hand","Kushiyaa",R.raw.record20131231215315);
        Categories1 cata8 = new Categories1("Abdomen","Uluwaa",R.raw.record20131231215322);
        Categories1 cata9 = new Categories1("Chest","Tiraa",R.raw.record20131231215330);
        Categories1 cata10 = new Categories1("Shoulder","Hashiyaa",R.raw.record20131231215336);
        Categories1 cata11 = new Categories1("Neck","Qooriyaa",R.raw.record20131231215342);


        ArrayList<Categories1> list = new ArrayList<>();
        list.add(cata1);
        list.add(cata2);
        list.add(cata3);
        list.add(cata4);
        list.add(cata5);
        list.add(cata12);
        list.add(cata13);
        list.add(cata6);
        list.add(cata7);
        list.add(cata8);
        list.add(cata9);
        list.add(cata10);
        list.add(cata11);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main6Activity.this).nof_alldata();
        Toast.makeText(Main6Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 83){
            new DBAdarter(Main6Activity.this).saveAllData(cata1);
            new DBAdarter(Main6Activity.this).saveAllData(cata2);
            new DBAdarter(Main6Activity.this).saveAllData(cata3);
            new DBAdarter(Main6Activity.this).saveAllData(cata4);
            new DBAdarter(Main6Activity.this).saveAllData(cata5);
            new DBAdarter(Main6Activity.this).saveAllData(cata6);
            new DBAdarter(Main6Activity.this).saveAllData(cata7);
            new DBAdarter(Main6Activity.this).saveAllData(cata8);
            new DBAdarter(Main6Activity.this).saveAllData(cata9);
            new DBAdarter(Main6Activity.this).saveAllData(cata10);
            new DBAdarter(Main6Activity.this).saveAllData(cata11);
            new DBAdarter(Main6Activity.this).saveAllData(cata12);
            new DBAdarter(Main6Activity.this).saveAllData(cata13);
        }
    }
}

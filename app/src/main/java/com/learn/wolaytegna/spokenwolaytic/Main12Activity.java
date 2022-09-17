package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main12Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Vehicles");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("Train","Baburyaa",R.raw.record20131231221440);
        Categories1 cata2 = new Categories1("Air Plane","Tooki-paala",R.raw.record20131231221446);
        Categories1 cata3 = new Categories1("Bus","otoobisiyaa",R.raw.record20131231221513);
        Categories1 cata4 = new Categories1("Car","Kaamyaa",R.raw.record20131231221519);
        Categories1 cata5 = new Categories1("Bicycle","Biskiliityaa",R.raw.record20131231221543);
        Categories1 cata6 = new Categories1("Moter Bicycle","Motoryaa",R.raw.record20131231221621);
        Categories1 cata7 = new Categories1("Taxi","Taxiyaa",R.raw.record20131231221700);
        Categories1 cata8 = new Categories1("Helicopter","Hilicoptryaa",R.raw.record20131231221723);
        Categories1 cata9 = new Categories1("Boat","Wolwoluwaa",R.raw.record20131231221736);
        Categories1 cata10 = new Categories1("Ship","Markabyaa",R.raw.record20131231221748);


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

        int num = new DBAdarter(Main12Activity.this).nof_alldata();
        Toast.makeText(Main12Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 153){
            new DBAdarter(Main12Activity.this).saveAllData(cata1);
            new DBAdarter(Main12Activity.this).saveAllData(cata2);
            new DBAdarter(Main12Activity.this).saveAllData(cata3);
            new DBAdarter(Main12Activity.this).saveAllData(cata4);
            new DBAdarter(Main12Activity.this).saveAllData(cata5);
            new DBAdarter(Main12Activity.this).saveAllData(cata6);
            new DBAdarter(Main12Activity.this).saveAllData(cata7);
            new DBAdarter(Main12Activity.this).saveAllData(cata8);
            new DBAdarter(Main12Activity.this).saveAllData(cata9);
            new DBAdarter(Main12Activity.this).saveAllData(cata10);
        }
    }
}

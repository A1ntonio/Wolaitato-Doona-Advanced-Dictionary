package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setTitle("Days and Months");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("DAYS\n\nMonday","Sagga",R.raw.record20131231214127);
        Categories1 cata2 = new Categories1("Tuesday","Ciishsha",R.raw.record20131231214137);
        Categories1 cata3 = new Categories1("Wednesday","Woliilla",R.raw.record20131231214142);
        Categories1 cata4 = new Categories1("Thursday","Shaagga",R.raw.record20131231214148);
        Categories1 cata5 = new Categories1("Friday","Biizza",R.raw.record20131231214207);
        Categories1 cata6 = new Categories1("Saturday","Qeeraa",R.raw.record20131231214215);
        Categories1 cata7 = new Categories1("Sunday","Woggaa",R.raw.record20131231214221);
        Categories1 cata8 = new Categories1("MONTHS\n\nSeptember","Gifattaa aginaa",R.raw.record20131231214229);
        Categories1 cata9 = new Categories1("October","Gooluwaa aginaa",R.raw.record20131231214238);
        Categories1 cata10 = new Categories1("November","Barataa aginaa",R.raw.record20131231214245);
        Categories1 cata11 = new Categories1("December","Duubalaa aginaa",R.raw.record20131231214301);
        Categories1 cata12 = new Categories1("January","Shachchiyaa aginaa",R.raw.record20131231214310);
        Categories1 cata13 = new Categories1("February","Longiyaa aginaa",R.raw.record20131231214331);
        Categories1 cata14 = new Categories1("March","Bulalaa aginaa",R.raw.record20131231214348);
        Categories1 cata15 = new Categories1("April","Gabbaa aginaa",R.raw.record20131231214356);
        Categories1 cata16 = new Categories1("May","Labooshsha aginaa",R.raw.record20131231214406);
        Categories1 cata17 = new Categories1("June","Guuliyaa aginaa",R.raw.record20131231214413);
        Categories1 cata18 = new Categories1("July","Caljuwaa aginaa",R.raw.record20131231214420);
        Categories1 cata19 = new Categories1("August","Kuushaa aginaa",R.raw.record20131231214430);
        Categories1 cata20 = new Categories1("Thirteenth month(Pagume in amharic) has 5/6 days","Mooxe/Nuuca",R.raw.record20131231214515);

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
        list.add(cata14);
        list.add(cata15);
        list.add(cata16);
        list.add(cata17);
        list.add(cata18);
        list.add(cata19);
        list.add(cata20);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main3Activity.this).nof_alldata();
        Toast.makeText(Main3Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 38){
            new DBAdarter(Main3Activity.this).saveAllData(cata1);
            new DBAdarter(Main3Activity.this).saveAllData(cata2);
            new DBAdarter(Main3Activity.this).saveAllData(cata3);
            new DBAdarter(Main3Activity.this).saveAllData(cata4);
            new DBAdarter(Main3Activity.this).saveAllData(cata5);
            new DBAdarter(Main3Activity.this).saveAllData(cata6);
            new DBAdarter(Main3Activity.this).saveAllData(cata7);
            new DBAdarter(Main3Activity.this).saveAllData(cata8);
            new DBAdarter(Main3Activity.this).saveAllData(cata9);
            new DBAdarter(Main3Activity.this).saveAllData(cata10);
            new DBAdarter(Main3Activity.this).saveAllData(cata11);
            new DBAdarter(Main3Activity.this).saveAllData(cata12);
            new DBAdarter(Main3Activity.this).saveAllData(cata13);
            new DBAdarter(Main3Activity.this).saveAllData(cata14);
            new DBAdarter(Main3Activity.this).saveAllData(cata15);
            new DBAdarter(Main3Activity.this).saveAllData(cata16);
            new DBAdarter(Main3Activity.this).saveAllData(cata17);
            new DBAdarter(Main3Activity.this).saveAllData(cata18);
            new DBAdarter(Main3Activity.this).saveAllData(cata19);
            new DBAdarter(Main3Activity.this).saveAllData(cata20);
        }

    }
}

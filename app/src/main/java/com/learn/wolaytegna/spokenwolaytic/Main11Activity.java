package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main11Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("So miishata");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("Television","Talavizhiniyaa",R.raw.record20131231220754);
        Categories1 cata2 = new Categories1("Radio","Eraadoniyaa",R.raw.record20131231220800);
        Categories1 cata3 = new Categories1("Bed","Aarisaa",R.raw.record20131231220821);
        Categories1 cata4 = new Categories1("Chair","Oydiyaa",R.raw.record20131231220902);
        Categories1 cata5 = new Categories1("Table","Masofiyaa",R.raw.record20131231220907);
        Categories1 cata6 = new Categories1("Computer","Compiteriyaa",R.raw.record20131231220935);
        Categories1 cata7 = new Categories1("Telephone","Silikiyaa",R.raw.record20131231221340);
        Categories1 cata8 = new Categories1("Door","Penigiyaa",R.raw.record20131231221346);
        Categories1 cata9 = new Categories1("Window","Maskoottiyaa",R.raw.record20131231221352);
        Categories1 cata10 = new Categories1("Cup","Siiniyaa",R.raw.record20131231221407);
        Categories1 cata11 = new Categories1("jog","Joogiyaa",R.raw.record20131231221418);
        Categories1 cata12 = new Categories1("Box","Saaxiniyaa",R.raw.record20131231221423);


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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main11Activity.this).nof_alldata();
        Toast.makeText(Main11Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 141){
            new DBAdarter(Main11Activity.this).saveAllData(cata1);
            new DBAdarter(Main11Activity.this).saveAllData(cata2);
            new DBAdarter(Main11Activity.this).saveAllData(cata3);
            new DBAdarter(Main11Activity.this).saveAllData(cata4);
            new DBAdarter(Main11Activity.this).saveAllData(cata5);
            new DBAdarter(Main11Activity.this).saveAllData(cata6);
            new DBAdarter(Main11Activity.this).saveAllData(cata7);
            new DBAdarter(Main11Activity.this).saveAllData(cata8);
            new DBAdarter(Main11Activity.this).saveAllData(cata9);
            new DBAdarter(Main11Activity.this).saveAllData(cata10);
            new DBAdarter(Main11Activity.this).saveAllData(cata11);
            new DBAdarter(Main11Activity.this).saveAllData(cata12);
        }
    }
}

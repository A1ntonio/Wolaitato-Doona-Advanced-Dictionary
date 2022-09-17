package com.learn.wolaytegna.spokenwolaytic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    MediaPlayer mp,mp2,mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Personal Pronouns");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("He","A",R.raw.record20131231214530);
        Categories1 cata2 = new Categories1("She","O",R.raw.record20131231214536);
        Categories1 cata3 = new Categories1("It","Hegaa",R.raw.record20131231214608);
        Categories1 cata4 = new Categories1("I","Ta",R.raw.record20131231214619);
        Categories1 cata5 = new Categories1("Me","Taani",R.raw.record20131231214625);
        Categories1 cata6 = new Categories1("You (for single)","Ne",R.raw.record20131231214631);
        Categories1 cata7 = new Categories1("You (for plural)","Iintte",R.raw.record20131231214638);
        Categories1 cata8 = new Categories1("They","Eti",R.raw.record20131231214644);
        Categories1 cata15 = new Categories1("My","Taagee",R.raw.record20131231214828);
        Categories1 cata9 = new Categories1("Mine","Taagaa",R.raw.record20131231214650);
        Categories1 cata10 = new Categories1("His","Aagaa",R.raw.record20131231214656);
        Categories1 cata11 = new Categories1("Her","Iigaa",R.raw.record20131231214702);
        Categories1 cata12 = new Categories1("Their","Etaaga",R.raw.record20131231214742);
        Categories1 cata13 = new Categories1("Our","Nuugaa",R.raw.record20131231214748);
        Categories1 cata14 = new Categories1("Us","Nuuna",R.raw.record20131231214821);


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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main4Activity.this).nof_alldata();
        Toast.makeText(Main4Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 58){
            new DBAdarter(Main4Activity.this).saveAllData(cata1);
            new DBAdarter(Main4Activity.this).saveAllData(cata2);
            new DBAdarter(Main4Activity.this).saveAllData(cata3);
            new DBAdarter(Main4Activity.this).saveAllData(cata4);
            new DBAdarter(Main4Activity.this).saveAllData(cata5);
            new DBAdarter(Main4Activity.this).saveAllData(cata6);
            new DBAdarter(Main4Activity.this).saveAllData(cata7);
            new DBAdarter(Main4Activity.this).saveAllData(cata8);
            new DBAdarter(Main4Activity.this).saveAllData(cata9);
            new DBAdarter(Main4Activity.this).saveAllData(cata10);
            new DBAdarter(Main4Activity.this).saveAllData(cata11);
            new DBAdarter(Main4Activity.this).saveAllData(cata12);
            new DBAdarter(Main4Activity.this).saveAllData(cata13);
            new DBAdarter(Main4Activity.this).saveAllData(cata14);
            new DBAdarter(Main4Activity.this).saveAllData(cata15);
        }
    }
}

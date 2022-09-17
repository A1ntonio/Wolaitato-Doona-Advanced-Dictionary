package com.learn.wolaytegna.spokenwolaytic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Greeting");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("Good Morning  (formal)","Lo'o aqqadi  (aqidetii)",R.raw.record20131231221917);
        Categories1 cata2 = new Categories1("Good afternoon  (formal)","Lo'o pe'adii  (pe'idetii)",R.raw.record20131231221926);
        Categories1 cata3 = new Categories1("Good evening (formal)","Lo'o pe'adii (pe'idetii)",R.raw.record20131231221926);
        Categories1 cata4 = new Categories1("How are you?","Ay malee",R.raw.record20131231222016);
        Categories1 cata5 = new Categories1("I am very fine thank you, and you?","Taani daro lo'o, neenishin?",R.raw.record20131231222036);
        Categories1 cata6 = new Categories1("Oh! Nice to meet you again","Nenaara zaaretta gayttoogee ufaysses",R.raw.record20131231222105);
        Categories1 cata7 = new Categories1("I missed you so much. How is life?","Taani nena keehi laamotaas. Newu duussay waanii?",R.raw.record20131231222121);
        Categories1 cata8 = new Categories1("I miss you too","Taaka nena laamotaas.",R.raw.record20131231222241);
        Categories1 cata9 = new Categories1("Thanks to god. How is life treating you?","Xoossay galataa ekko. Duussay waanii niyo?",R.raw.record20131231222504);
        Categories1 cata10 = new Categories1("It's fine.","Kehattenne",R.raw.record20131231222516);
        Categories1 cata11 = new Categories1("It's ok.","Injje",R.raw.record20131231222523);
        Categories1 cata12 = new Categories1("It's nice.","Lo'ottenne",R.raw.record20131231222536);
        Categories1 cata13 = new Categories1("It's alright.","Munaasa",R.raw.record20131231222542);
        Categories1 cata14 = new Categories1("It's good.","Keha",R.raw.record20131231222550);
        Categories1 cata15 = new Categories1("As usual.","Baagaakka mala.",R.raw.record20131231222556);
        Categories1 cata16 = new Categories1("Fine.","Lo'o",R.raw.record20131231222604);
        Categories1 cata17 = new Categories1("Not so good.","Darii iita gidena",R.raw.record20131231222610);


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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main13Activity.this).nof_alldata();
        Toast.makeText(Main13Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 163){
            new DBAdarter(Main13Activity.this).saveAllData(cata1);
            new DBAdarter(Main13Activity.this).saveAllData(cata2);
            new DBAdarter(Main13Activity.this).saveAllData(cata3);
            new DBAdarter(Main13Activity.this).saveAllData(cata4);
            new DBAdarter(Main13Activity.this).saveAllData(cata5);
            new DBAdarter(Main13Activity.this).saveAllData(cata6);
            new DBAdarter(Main13Activity.this).saveAllData(cata7);
            new DBAdarter(Main13Activity.this).saveAllData(cata8);
            new DBAdarter(Main13Activity.this).saveAllData(cata9);
            new DBAdarter(Main13Activity.this).saveAllData(cata10);
            new DBAdarter(Main13Activity.this).saveAllData(cata11);
            new DBAdarter(Main13Activity.this).saveAllData(cata12);
            new DBAdarter(Main13Activity.this).saveAllData(cata13);
            new DBAdarter(Main13Activity.this).saveAllData(cata14);
            new DBAdarter(Main13Activity.this).saveAllData(cata15);
            new DBAdarter(Main13Activity.this).saveAllData(cata16);
            new DBAdarter(Main13Activity.this).saveAllData(cata17);
        }
    }
}

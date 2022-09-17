package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main30Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Compliments & Congratulation");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("You look very nice today.", "Neeni hachchi pala lo'aasa.", 0x7f0e0000);
        Categories1 cata2 = new Categories1("You look very handsome today.", "Neeni hachchi pala puulatta lo'asa.", 0x7f0e0001);
        Categories1 cata3 = new Categories1("Your apartment is lovely.", "Neeni de'iyo keettay iita lo'ees.", 0x7f0e0002);
        Categories1 cata4 = new Categories1("Your apartment is beautiful.", "Neeni de'iyo keettay pala lo'ees.", 0x7f0e0000);
        Categories1 cata5 = new Categories1("Your speech was well done.", "Ne haasayaa loyttada haasayadasa.", 0x7f0e0001);
        Categories1 cata6 = new Categories1("Your presentation was excellent.", "Neeni oottido haasayay keehippe lo'ees.", 0x7f0e0002);
        Categories1 cata7 = new Categories1("Your class was good.", "Ne kifilee lo'ees.", 0x7f0e0000);
        Categories1 cata8 = new Categories1("Your lecture was impressive.", "Ne qonccissoy ezgga ezgga giyagaa.", 0x7f0e0001);
        Categories1 cata9 = new Categories1("The dinner was delicious.", "Kahoy pala mal'iyaagaa.", 0x7f0e0000);
        Categories1 cata10 = new Categories1("The dessert was very good.", "Qumaappe guyyiyan miido mal'iyabaykka keehi lo'o.", 0x7f0e0002);
        Categories1 cata11 = new Categories1("The salad was very nice.", "Nu miido salaaxay daro lo'o.", 0x7f0e0002);
        Categories1 cata12 = new Categories1("Your party was very nice.", "Nuussi giigida kassaynne durssay keehi lo'o.", 0x7f0e0002);
        Categories1 cata13 = new Categories1("Congratulation on your new job.", "Ooratta oosuwa demmidoogee niyo hashshu!", 0x7f0e0002);
        Categories1 cata14 = new Categories1("Congratulation on your new baby.", "Na'aa yelidoogee niyo hashshu!", 0x7f0e0002);
        Categories1 cata15 = new Categories1("Congratulation on your promotion.", "Oosuwan dichchaa demmidoogee niyo hashshu!", 0x7f0e0002);
        Categories1 cata16 = new Categories1("Congratulation on your marriage.", "Hashshu ha bullachchay niyo.", 0x7f0e0002);
        Categories1 cata17 = new Categories1("Congratulation on your new car.", "Ooratta kaamiya shammidoogee niyo hashshu!", 0x7f0e0002);
        Categories1 cata18 = new Categories1("Congratulations", "Hashshu ufayttideta!", 0x7f0e0002);
        Categories1 cata19 = new Categories1("Congratulation on...", "Hashshu ufayttasa...", 0x7f0e0002);
        Categories1 cata20 = new Categories1("RESPONSES\n\n\n- Thanks", "Galatays.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("I'm glad you enjoy it.", "Hagaa ne dosidoogan taani ufayttaas.", 0x7f0e0002);
        Categories1 cata22 = new Categories1("I'm glad you liked it.", "Neeni haagaa dosidoogan taani ufayttaas.", 0x7f0e0002);


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
        list.add(cata21);
        list.add(cata22);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main30Activity.this).nof_alldata();
        Toast.makeText(Main30Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 851){
            new DBAdarter(Main30Activity.this).saveAllData(cata1);
            new DBAdarter(Main30Activity.this).saveAllData(cata2);
            new DBAdarter(Main30Activity.this).saveAllData(cata3);
            new DBAdarter(Main30Activity.this).saveAllData(cata4);
            new DBAdarter(Main30Activity.this).saveAllData(cata5);
            new DBAdarter(Main30Activity.this).saveAllData(cata6);
            new DBAdarter(Main30Activity.this).saveAllData(cata7);
            new DBAdarter(Main30Activity.this).saveAllData(cata8);
            new DBAdarter(Main30Activity.this).saveAllData(cata9);
            new DBAdarter(Main30Activity.this).saveAllData(cata10);
            new DBAdarter(Main30Activity.this).saveAllData(cata11);
            new DBAdarter(Main30Activity.this).saveAllData(cata12);
            new DBAdarter(Main30Activity.this).saveAllData(cata13);
            new DBAdarter(Main30Activity.this).saveAllData(cata14);
            new DBAdarter(Main30Activity.this).saveAllData(cata15);
            new DBAdarter(Main30Activity.this).saveAllData(cata16);
            new DBAdarter(Main30Activity.this).saveAllData(cata17);
            new DBAdarter(Main30Activity.this).saveAllData(cata18);
            new DBAdarter(Main30Activity.this).saveAllData(cata19);
            new DBAdarter(Main30Activity.this).saveAllData(cata20);
            new DBAdarter(Main30Activity.this).saveAllData(cata21);
            new DBAdarter(Main30Activity.this).saveAllData(cata22);
        }

    }
}

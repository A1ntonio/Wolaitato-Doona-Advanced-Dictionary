package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main27Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Talking about Broke");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("I'm broke.", "Ta kisee mela.", 0x7f0e0000);
        Categories1 cata2 = new Categories1("I'm totally broke.", "Ta kisee mule mela de'ees.", 0x7f0e0001);
        Categories1 cata3 = new Categories1("I'm flat broke.", "Tawu meqo santteekka ba.", 0x7f0e0002);
        Categories1 cata4 = new Categories1("I'm busted.", "Ayba miishshikka baawa.", 0x7f0e0000);
        Categories1 cata5 = new Categories1("I'm low in purse.", "Ayba birinne baa.", 0x7f0e0001);
        Categories1 cata6 = new Categories1("I don't have a penny.", "Tawu sikkinna santte baa.", 0x7f0e0002);
        Categories1 cata7 = new Categories1("I don't have any money.", "Tawu miishsha giyoobi baa.", 0x7f0e0000);
        Categories1 cata8 = new Categories1("I don't even have a dime to spare.", "Tawu meqo santtee baa.", 0x7f0e0001);
        Categories1 cata9 = new Categories1("Do you have a change?", "Laame santtee de'ii?", 0x7f0e0000);
        Categories1 cata10 = new Categories1("Do you break a hundred?", "Laame santtee de'ii?", 0x7f0e0002);
        Categories1 cata11 = new Categories1("Do you have change for a hundred?", "Niyo xeetu biraa laamee de'ii?", 0x7f0e0002);
        Categories1 cata12 = new Categories1("Do you have change for a birr?", "Niyo issi biraa laamee de'ii?", 0x7f0e0002);
        Categories1 cata13 = new Categories1("I need one birr in quarters.", "Taani issi biray oyddu sumunee laamettidaagaa koyyays.", 0x7f0e0002);
        Categories1 cata14 = new Categories1("Can you break a hundred birr bill?", "Xeetu biraa tawu laammana danddayay?", 0x7f0e0002);
        Categories1 cata15 = new Categories1("I hve some coins I need to change.", "Taayyoo amarida santtimeti de'oosona laammanawu koyyays.", 0x7f0e0002);
        Categories1 cata16 = new Categories1("I'm sorry, I don't have any change.", "Ta azzanays, ayba lame santteekka tawu baa.", 0x7f0e0002);
        Categories1 cata17 = new Categories1("Sorry, I don't have changes to break.", "Ta azzanays, lame santtee tawu baa.", 0x7f0e0002);
        Categories1 cata18 = new Categories1("All I have is this.", "Tawu de'iyaara hanoo.", 0x7f0e0002);
        Categories1 cata19 = new Categories1("I'm out of quarters.", "Tawu laamettida naa'u santtime bakkanay baa.", 0x7f0e0002);
        Categories1 cata20 = new Categories1("I have only a...", "Tawu de'iyaara ... xaalla.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("How do you want it?", "Aappunaawaa gidanawu koyyay?", 0x7f0e0002);
        Categories1 cata22 = new Categories1("Do you want it in fifty cents?", "Naa'u santtime bakkanaa oottanawu koyyay?", 0x7f0e0002);
        Categories1 cata23 = new Categories1("She is such a scrooge.", "A miishshawu qaaxxawusu.", 0x7f0e0002);
        Categories1 cata24 = new Categories1("He is such a skinflint.", "I uuze asa.", 0x7f0e0002);
        Categories1 cata25 = new Categories1("He is a tight-fisted person.", "I miishsha qachchi oyqqiya asa.", 0x7f0e0002);
        Categories1 cata26 = new Categories1("He is so close-fisted.", "I miishshaa tukki wottiya asa.", 0x7f0e0002);


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
        list.add(cata23);
        list.add(cata24);
        list.add(cata25);
        list.add(cata26);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main27Activity.this).nof_alldata();
        Toast.makeText(Main27Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 730){
            new DBAdarter(Main27Activity.this).saveAllData(cata1);
            new DBAdarter(Main27Activity.this).saveAllData(cata2);
            new DBAdarter(Main27Activity.this).saveAllData(cata3);
            new DBAdarter(Main27Activity.this).saveAllData(cata4);
            new DBAdarter(Main27Activity.this).saveAllData(cata5);
            new DBAdarter(Main27Activity.this).saveAllData(cata6);
            new DBAdarter(Main27Activity.this).saveAllData(cata7);
            new DBAdarter(Main27Activity.this).saveAllData(cata8);
            new DBAdarter(Main27Activity.this).saveAllData(cata9);
            new DBAdarter(Main27Activity.this).saveAllData(cata10);
            new DBAdarter(Main27Activity.this).saveAllData(cata11);
            new DBAdarter(Main27Activity.this).saveAllData(cata12);
            new DBAdarter(Main27Activity.this).saveAllData(cata13);
            new DBAdarter(Main27Activity.this).saveAllData(cata14);
            new DBAdarter(Main27Activity.this).saveAllData(cata15);
            new DBAdarter(Main27Activity.this).saveAllData(cata16);
            new DBAdarter(Main27Activity.this).saveAllData(cata17);
            new DBAdarter(Main27Activity.this).saveAllData(cata18);
            new DBAdarter(Main27Activity.this).saveAllData(cata19);
            new DBAdarter(Main27Activity.this).saveAllData(cata20);
            new DBAdarter(Main27Activity.this).saveAllData(cata21);
            new DBAdarter(Main27Activity.this).saveAllData(cata22);
            new DBAdarter(Main27Activity.this).saveAllData(cata23);
            new DBAdarter(Main27Activity.this).saveAllData(cata24);
            new DBAdarter(Main27Activity.this).saveAllData(cata25);
            new DBAdarter(Main27Activity.this).saveAllData(cata26);
        }
    }
}

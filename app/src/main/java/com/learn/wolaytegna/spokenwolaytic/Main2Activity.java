package com.learn.wolaytegna.spokenwolaytic;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setTitle("Numbers");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("One","Issita",R.raw.record20131231213512);
        Categories1 cata2 = new Categories1("Two","Naa'a",R.raw.record20131231213539);
        Categories1 cata3 = new Categories1("Three","Heeza",R.raw.record20131231213547);
        Categories1 cata4 = new Categories1("Four","Oyiida",R.raw.record20131231213558);
        Categories1 cata5 = new Categories1("Five","Iichasha",R.raw.record20131231213605);
        Categories1 cata6 = new Categories1("Six","Usuupuna",R.raw.record20131231213612);
        Categories1 cata7 = new Categories1("Seven","Laapuna",R.raw.record20131231213618);
        Categories1 cata8 = new Categories1("Eight","Hoosipuna",R.raw.record20131231213623);
        Categories1 cata9 = new Categories1("Nine","Uudupuna",R.raw.record20131231213632);
        Categories1 cata10 = new Categories1("Ten","Taama",R.raw.record20131231213644);
        Categories1 cata11 = new Categories1("Eleven","Taammanne Issita",R.raw.record20131231213701);
        Categories1 cata12 = new Categories1("Twelve","Taammanne Naa'a",R.raw.record20131231213707);
        Categories1 cata13 = new Categories1("Thirteen","Taammanne Heeza",R.raw.record20131231213715);
        Categories1 cata14 = new Categories1("Fourteen","Taammanne Oyiida",R.raw.record20131231213720);
        Categories1 cata15 = new Categories1("Fifteen","Taammanne Iichasha",R.raw.record20131231213726);
        Categories1 cata16 = new Categories1("Sixteen","Taammanne Usuupuna",R.raw.record20131231213731);
        Categories1 cata17 = new Categories1("Seventeen","Taammanne Laapuna",R.raw.record20131231213739);
        Categories1 cata18 = new Categories1("Eighteen","Taammanne Hoosipuna",R.raw.record20131231213742);
        Categories1 cata19 = new Categories1("Nineteen","Taammanne Uduupuna",R.raw.record20131231213755);
        Categories1 cata20 = new Categories1("Twenty","Laatama",R.raw.record20131231213755);
        Categories1 cata21 = new Categories1("Thirty","Haastama",R.raw.record20131231213819);
        Categories1 cata22 = new Categories1("Fourth","Ooytama",R.raw.record20131231213831);
        Categories1 cata23 = new Categories1("Fifty","Ishatama",R.raw.record20131231213836);
        Categories1 cata24 = new Categories1("Sixty","Usuupun Taamma",R.raw.record20131231213843);
        Categories1 cata25 = new Categories1("Seventy","Laapun Taamma",R.raw.record20131231213849);
        Categories1 cata26 = new Categories1("Eighty","Hoospun Taamma",R.raw.record20131231213855);
        Categories1 cata27 = new Categories1("Ninety","Uudupun Taamma",R.raw.record20131231213900);
        Categories1 cata28 = new Categories1("One Hundred","Iissi Xeetta",R.raw.record20131231213914);
        Categories1 cata29 = new Categories1("Two Hundred","Naa'u Xeetta",R.raw.record20131231213922);
        Categories1 cata30 = new Categories1("Three Hundred","Heezu Xeetta",R.raw.record20131231213927);
        Categories1 cata31 = new Categories1("One Thousand","Iissi Sha'a",R.raw.record20131231213954);
        Categories1 cata32 = new Categories1("Two Thousand","Naa'u Sha'a",R.raw.record20131231214001);
        Categories1 cata33 = new Categories1("Ten Thousand","Taammu Sha'a",R.raw.record20131231214009);
        Categories1 cata34 = new Categories1("One Hundred Thousand","Iissi Xeettu Sha'a",R.raw.record20131231214016);
        Categories1 cata35 = new Categories1("One Million","Iissi Millone",R.raw.record20131231214025);
        Categories1 cata36 = new Categories1("One Hundred Million","Iissi Xeettu Miillone",R.raw.record20131231214033);
        Categories1 cata37 = new Categories1("One Billion","Iissi Biillone",R.raw.record20131231214042);
        Categories1 cata38 = new Categories1("One Hundred Billion","Issi Xeettu Biillone",R.raw.record20131231214052);

        int num = new DBAdarter(Main2Activity.this).nof_alldata();
        Toast.makeText(Main2Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 0){
            new DBAdarter(Main2Activity.this).saveAllData(cata1);
            new DBAdarter(Main2Activity.this).saveAllData(cata2);
            new DBAdarter(Main2Activity.this).saveAllData(cata3);
            new DBAdarter(Main2Activity.this).saveAllData(cata4);
            new DBAdarter(Main2Activity.this).saveAllData(cata5);
            new DBAdarter(Main2Activity.this).saveAllData(cata6);
            new DBAdarter(Main2Activity.this).saveAllData(cata7);
            new DBAdarter(Main2Activity.this).saveAllData(cata8);
            new DBAdarter(Main2Activity.this).saveAllData(cata9);
            new DBAdarter(Main2Activity.this).saveAllData(cata10);
            new DBAdarter(Main2Activity.this).saveAllData(cata11);
            new DBAdarter(Main2Activity.this).saveAllData(cata12);
            new DBAdarter(Main2Activity.this).saveAllData(cata13);
            new DBAdarter(Main2Activity.this).saveAllData(cata14);
            new DBAdarter(Main2Activity.this).saveAllData(cata15);
            new DBAdarter(Main2Activity.this).saveAllData(cata16);
            new DBAdarter(Main2Activity.this).saveAllData(cata17);
            new DBAdarter(Main2Activity.this).saveAllData(cata18);
            new DBAdarter(Main2Activity.this).saveAllData(cata19);
            new DBAdarter(Main2Activity.this).saveAllData(cata20);
            new DBAdarter(Main2Activity.this).saveAllData(cata21);
            new DBAdarter(Main2Activity.this).saveAllData(cata22);
            new DBAdarter(Main2Activity.this).saveAllData(cata23);
            new DBAdarter(Main2Activity.this).saveAllData(cata24);
            new DBAdarter(Main2Activity.this).saveAllData(cata25);
            new DBAdarter(Main2Activity.this).saveAllData(cata26);
            new DBAdarter(Main2Activity.this).saveAllData(cata27);
            new DBAdarter(Main2Activity.this).saveAllData(cata28);
            new DBAdarter(Main2Activity.this).saveAllData(cata29);
            new DBAdarter(Main2Activity.this).saveAllData(cata30);
            new DBAdarter(Main2Activity.this).saveAllData(cata31);
            new DBAdarter(Main2Activity.this).saveAllData(cata32);
            new DBAdarter(Main2Activity.this).saveAllData(cata33);
            new DBAdarter(Main2Activity.this).saveAllData(cata34);
            new DBAdarter(Main2Activity.this).saveAllData(cata35);
            new DBAdarter(Main2Activity.this).saveAllData(cata36);
            new DBAdarter(Main2Activity.this).saveAllData(cata37);
            new DBAdarter(Main2Activity.this).saveAllData(cata38);
        }

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
        list.add(cata27);
        list.add(cata28);
        list.add(cata29);
        list.add(cata30);
        list.add(cata31);
        list.add(cata32);
        list.add(cata33);
        list.add(cata34);
        list.add(cata35);
        list.add(cata36);
        list.add(cata37);
        list.add(cata38);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

    }


}

package com.learn.wolaytegna.spokenwolaytic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Giving instructoin & Making request");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("GIVING INSTRUCTION\n\nCould you be quit please?", "Hayyanna co'u guuttee?", R.raw.record20210321194121);
        Categories1 cata2 = new Categories1("Could you try to answer the question please?", "Hayyannaa ha oyshawu zaaruwa immanawu maluutee?", R.raw.record20210321194131);
        Categories1 cata3 = new Categories1("Could you be silent please?", "Hayyannaa issitoo sirphphi guutee?", R.raw.record20210321194139);
        Categories1 cata4 = new Categories1("Could you pay attention please?", "Hayyannaa issitoo ha ezgguutee?", R.raw.record20210321194145);
        Categories1 cata5 = new Categories1("Could you sit down please?", "Hayyana duge uttuuttee?", R.raw.record20210321194151);
        Categories1 cata6 = new Categories1("Would you repeat it again please?", "Hayyanintta issitoo zaaretuutee?", R.raw.record20210321194159);
        Categories1 cata7 = new Categories1("Would you be seated please?", "Hayyanintta issitoo uttaneetii?", R.raw.record20210321194206);
        Categories1 cata8 = new Categories1("Would you come to the front please?", "Hayyannaa sinttawukko yuutee?", R.raw.record20210321194216);
        Categories1 cata9 = new Categories1("MAKING REQUEST\n\nCould you clean the blackboard please?", "Hayyanna ha saleedaa tawu qucuutee?", R.raw.record20210321194224);
        Categories1 cata10 = new Categories1("Could someone possibly clean the blackboard please?", "Hayyanintta intteppe issoy saleedaa tawu qucuuteeti?", R.raw.record20210321194240);
        Categories1 cata11 = new Categories1("Could you bring me a chair from the other room please?", "Hayyanintta hara kifiliyaappe tawu wonbbaaraa ehuteetii?", R.raw.record20210321194250);
        Categories1 cata12 = new Categories1("Would you bring me water from the tap please?", "Hayyanna Bombbaappe haattaa duuqa ehuutee?", R.raw.record20210321194259);
        //error 13
        Categories1 cata13 = new Categories1("Could someone close the door please?", "Hayyanintta intteppe issoy ha kariyo gorddaneetii?", R.raw.record20210321194325);
        Categories1 cata14 = new Categories1("May I bother you to bring me that chair please?", "Hayyana nena ta waayissooshsha, ha wonbbaraa ehaanawu?", R.raw.record20210321194401);
        Categories1 cata15 = new Categories1("ACCEPTING THE REQUEST\n\nWith pleasure!", "Ufayssan", R.raw.record20210321194426);
        Categories1 cata16 = new Categories1("Of course!", "Hegee lo'o gidennee!", R.raw.record20210321194438);
        Categories1 cata17 = new Categories1("Gladly!", "Daro ufayssan!", R.raw.record20210321194446);
        Categories1 cata18 = new Categories1("Not at all!", "Aynne gidenna", R.raw.record20210321194450);
        Categories1 cata19 = new Categories1("Sure!", "Tumaappe", R.raw.record20210321194454);
        Categories1 cata20 = new Categories1("Certainly", "Tumu tumuppe", R.raw.record20210321194502);
        Categories1 cata21 = new Categories1("No trouble", "Metoy baa!", R.raw.record20210321194509);
        Categories1 cata22 = new Categories1("Alright!", "Eeno!", R.raw.record20210321194513);
        Categories1 cata23 = new Categories1("No, of course not", "Aynne lanccissenna", R.raw.record20210321194518);
        Categories1 cata24 = new Categories1("REFUSING THE REQUEST\n\nI'm sorry, I can't, I'm in a hurry", "Keehippe azzanays, eesotiyo gishshawu danddaykke", R.raw.record20210321194526);
        Categories1 cata25 = new Categories1("I'm afraid, I can't I'm busy now.", "Ta azzanays, daro oosoy de'iyo gishshawu danddaykke.", R.raw.record20210321194535);
        Categories1 cata26 = new Categories1("I'm sorry I can't. I don't feel well.", "Ta azzanays, tana daafursso gishshawu danddykke.", R.raw.record20210321194549);
        Categories1 cata27 = new Categories1("I'm afraid, I can't I'm exhausted.", "Ta pokkotays, tana daafuriso gishshawu danddaykke.", R.raw.record20210321194601);
        Categories1 cata28 = new Categories1("I'm sorry, I can't I'm with someone.", "Ta azzanays, asaara de'iyo gishshawu danddaykke.", R.raw.record20210321194607);
        Categories1 cata29 = new Categories1("I'm sorry, I would rather you didn't ask.", "Ta azzanays, ne tana oychchenaakko dosays.", R.raw.record20210321194622);


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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main20Activity.this).nof_alldata();
        Toast.makeText(Main20Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 428){
            new DBAdarter(Main20Activity.this).saveAllData(cata1);
            new DBAdarter(Main20Activity.this).saveAllData(cata2);
            new DBAdarter(Main20Activity.this).saveAllData(cata3);
            new DBAdarter(Main20Activity.this).saveAllData(cata4);
            new DBAdarter(Main20Activity.this).saveAllData(cata5);
            new DBAdarter(Main20Activity.this).saveAllData(cata6);
            new DBAdarter(Main20Activity.this).saveAllData(cata7);
            new DBAdarter(Main20Activity.this).saveAllData(cata8);
            new DBAdarter(Main20Activity.this).saveAllData(cata9);
            new DBAdarter(Main20Activity.this).saveAllData(cata10);
            new DBAdarter(Main20Activity.this).saveAllData(cata11);
            new DBAdarter(Main20Activity.this).saveAllData(cata12);
            new DBAdarter(Main20Activity.this).saveAllData(cata13);
            new DBAdarter(Main20Activity.this).saveAllData(cata14);
            new DBAdarter(Main20Activity.this).saveAllData(cata15);
            new DBAdarter(Main20Activity.this).saveAllData(cata16);
            new DBAdarter(Main20Activity.this).saveAllData(cata17);
            new DBAdarter(Main20Activity.this).saveAllData(cata18);
            new DBAdarter(Main20Activity.this).saveAllData(cata19);
            new DBAdarter(Main20Activity.this).saveAllData(cata20);
            new DBAdarter(Main20Activity.this).saveAllData(cata21);
            new DBAdarter(Main20Activity.this).saveAllData(cata22);
            new DBAdarter(Main20Activity.this).saveAllData(cata23);
            new DBAdarter(Main20Activity.this).saveAllData(cata24);
            new DBAdarter(Main20Activity.this).saveAllData(cata25);
            new DBAdarter(Main20Activity.this).saveAllData(cata26);
            new DBAdarter(Main20Activity.this).saveAllData(cata27);
            new DBAdarter(Main20Activity.this).saveAllData(cata28);
            new DBAdarter(Main20Activity.this).saveAllData(cata29);
        }
    }
}

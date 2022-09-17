package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main33Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Making Complaint & Asking Apology");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("It's not good enough..", "Hegee lo'o gidenna..", 0x7f0e0000);
        Categories1 cata2 = new Categories1("That's not good enough..", "Hegee lo'o gidenna..", 0x7f0e0001);
        Categories1 cata3 = new Categories1("It's too bad, I'm afraid..", "Taani mishettas..", 0x7f0e0002);
        Categories1 cata4 = new Categories1("I'm sorry to say this..", "Taani hagaa mishettada gays..", 0x7f0e0000);
        Categories1 cata5 = new Categories1("THE FOLLOWING EXPRESSIONS CAN BE FOLLOWED FROM THE ABOVE EXPRESSIONS.\n\n\n- You are repeatedly trying.", "Neeni zaara zaarada kajjeeladasa.", 0x7f0e0001);
        Categories1 cata6 = new Categories1("Why are be careless about your work?", "Ayssi oosuwa shenehoo gay?", 0x7f0e0002);
        Categories1 cata7 = new Categories1("How could you try to cheat me?", "Waanada neni tana cimmanawu qaaqqatay?", 0x7f0e0000);
        Categories1 cata8 = new Categories1("FORMAL WAYS OF APOLOGIZING\n\n\n- Excuse me, please.", "Tana maara, hayyanaa.", 0x7f0e0001);
        Categories1 cata9 = new Categories1("I'm sorry.", "Kayyottays!", 0x7f0e0000);
        Categories1 cata10 = new Categories1("I'm so sorry", "Keehippe kayyottays!", 0x7f0e0002);
        Categories1 cata11 = new Categories1("Pardon me", "Atto ga tawu.", 0x7f0e0002);
        Categories1 cata12 = new Categories1("I beg your pardon.", "Tana maara gaada wossays.", 0x7f0e0002);
        Categories1 cata13 = new Categories1("I do apologize.", "Taani addappe maarotaa oychchays.", 0x7f0e0002);
        Categories1 cata14 = new Categories1("ACCEPTING APOLOGY POSITIVELY\n\n\n- Certainly", "Ero, hekko tuma maaraas.", 0x7f0e0002);
        Categories1 cata15 = new Categories1("It doesn't matter. /Never mind.", "Aynne baawa hirggoppa", 0x7f0e0002);
        Categories1 cata16 = new Categories1("That's quite all right.", "Mulekka metoy baawa.", 0x7f0e0002);
        Categories1 cata17 = new Categories1("Think nothing of it.", "Ayyinne qoppoppa", 0x7f0e0002);
        Categories1 cata18 = new Categories1("Don't worry about it.", "Heqawu hirggoppa.", 0x7f0e0002);
        Categories1 cata19 = new Categories1("Never mind", "mulekka qoppoppa.", 0x7f0e0002);
        Categories1 cata20 = new Categories1("PRESENT\n\n\n- Excuse me for being late.", "Taani sa'aa poo'isso gishshawu tawu atto garkkii.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("Excuse me for a moment, please.", "Hayyana, ha'issawu atto garkii.", 0x7f0e0002);
        Categories1 cata22 = new Categories1("May I apologize for coming late", "Sa'aa poo'issada yiido gishshawu atotettaa Oychchooshsha!", 0x7f0e0002);
        Categories1 cata23 = new Categories1("I am sorry I am late", "Tawu atto ga; sa'aa poo'issaas.", 0x7f0e0002);
        Categories1 cata24 = new Categories1("PAST\n\n\n- I'm sorry I forgot to ring so early.", "Sohuwaara silkkiya shocanaagaa taani balaas tawu atto ga.", 0x7f0e0002);
        Categories1 cata25 = new Categories1("I'm sorry I forgot to come.", "Taani yiidoogaa balaas tawu atto ga.", 0x7f0e0002);
        Categories1 cata26 = new Categories1("I'm sorry I didn't do my homework.", "Poora, atto ga tawu ta so-oosuwa ootabeykke.", 0x7f0e0002);
        Categories1 cata27 = new Categories1("ACCEPTING THE APOLOGY WITH DISSATISFACTION\n\n\n- I told you to be careful, it's your mistake. It's ok anyways.", "Naagettanaadan taani neessi yootaas. Hehee ne bala ubbankka I ha'i lo'o.", 0x7f0e0002);
        Categories1 cata28 = new Categories1("Don't repeat it again, it's all right for now.", "Naa'antto hegaadan hanoppa. Ha'issawu de'o.", 0x7f0e0002);
        Categories1 cata29 = new Categories1("NOT ACCEPTING THE APOLOGY\n\n\n- I'm sorry, I can't help it.", "Chii maarana danddayikke.", 0x7f0e0002);
        Categories1 cata30 = new Categories1("I'm sorry, it's non of my business.", "Ixxaas; Taani erikke, gattiyay baa tana.", 0x7f0e0002);
        Categories1 cata31 = new Categories1("INFORMAL WAYS OF APOLOGIZING\n\n\n- I'm sorry", "Atotettaa oychchays.", 0x7f0e0002);
        Categories1 cata32 = new Categories1("Sorry", "Atto ga tawu.", 0x7f0e0002);
        Categories1 cata33 = new Categories1("Excuse me.", "Atotettaa ootta.", 0x7f0e0002);
        Categories1 cata34 = new Categories1("I apologize.", "Maara tana.", 0x7f0e0002);
        Categories1 cata35 = new Categories1("Forgive me", "Tana maara.", 0x7f0e0002);
        Categories1 cata36 = new Categories1("Sorry, it was wrong of me.", "Maara tana, ta mooraas.", 0x7f0e0002);
        Categories1 cata37 = new Categories1("Sorry, I'm late.", "Atto gawu tawu, sa'aa poo'issaas.", 0x7f0e0002);
        Categories1 cata38 = new Categories1("Sorry, about yesterday.", "Zinobawu tawu atto ga.", 0x7f0e0002);


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


        int num = new DBAdarter(Main33Activity.this).nof_alldata();
        Toast.makeText(Main33Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 957){
            new DBAdarter(Main33Activity.this).saveAllData(cata1);
            new DBAdarter(Main33Activity.this).saveAllData(cata2);
            new DBAdarter(Main33Activity.this).saveAllData(cata3);
            new DBAdarter(Main33Activity.this).saveAllData(cata4);
            new DBAdarter(Main33Activity.this).saveAllData(cata5);
            new DBAdarter(Main33Activity.this).saveAllData(cata6);
            new DBAdarter(Main33Activity.this).saveAllData(cata7);
            new DBAdarter(Main33Activity.this).saveAllData(cata8);
            new DBAdarter(Main33Activity.this).saveAllData(cata9);
            new DBAdarter(Main33Activity.this).saveAllData(cata10);
            new DBAdarter(Main33Activity.this).saveAllData(cata11);
            new DBAdarter(Main33Activity.this).saveAllData(cata12);
            new DBAdarter(Main33Activity.this).saveAllData(cata13);
            new DBAdarter(Main33Activity.this).saveAllData(cata14);
            new DBAdarter(Main33Activity.this).saveAllData(cata15);
            new DBAdarter(Main33Activity.this).saveAllData(cata16);
            new DBAdarter(Main33Activity.this).saveAllData(cata17);
            new DBAdarter(Main33Activity.this).saveAllData(cata18);
            new DBAdarter(Main33Activity.this).saveAllData(cata19);
            new DBAdarter(Main33Activity.this).saveAllData(cata20);
            new DBAdarter(Main33Activity.this).saveAllData(cata21);
            new DBAdarter(Main33Activity.this).saveAllData(cata22);
            new DBAdarter(Main33Activity.this).saveAllData(cata23);
            new DBAdarter(Main33Activity.this).saveAllData(cata24);
            new DBAdarter(Main33Activity.this).saveAllData(cata25);
            new DBAdarter(Main33Activity.this).saveAllData(cata26);
            new DBAdarter(Main33Activity.this).saveAllData(cata27);
            new DBAdarter(Main33Activity.this).saveAllData(cata28);
            new DBAdarter(Main33Activity.this).saveAllData(cata29);
            new DBAdarter(Main33Activity.this).saveAllData(cata30);
            new DBAdarter(Main33Activity.this).saveAllData(cata31);
            new DBAdarter(Main33Activity.this).saveAllData(cata32);
            new DBAdarter(Main33Activity.this).saveAllData(cata33);
            new DBAdarter(Main33Activity.this).saveAllData(cata34);
            new DBAdarter(Main33Activity.this).saveAllData(cata35);
            new DBAdarter(Main33Activity.this).saveAllData(cata36);
            new DBAdarter(Main33Activity.this).saveAllData(cata37);
            new DBAdarter(Main33Activity.this).saveAllData(cata38);
        }
    }
}

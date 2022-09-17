package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main18Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Asking and Giving Directions");

        ListView listView = findViewById(R.id.list_item);
        Categories1 cata1 = new Categories1("WAYS OF ASKING DIRECTIONS\n\nCan you tell me/show me...?...the way to aroge arada please", "Sanggaa taraa efiya ogiya tawu malaatarkkii hayanaa?", R.raw.record20210319190634);
        Categories1 cata2 = new Categories1("Could you tell me/ show me...? ... the best way to Asko? Please?", "Askko baanawu darii injjetiya ogiya tawu yootanddii/tana bessanddii, hayyanaa?", R.raw.record20210319190747);
        Categories1 cata3 = new Categories1("Would you tell me / show me...? ...the right way to ledeta please?", "Tawu yootutee/Tana bessuutee... Suure Ledetaa efiya ogiya", R.raw.record20210319190839);
        //error4
        Categories1 cata4 = new Categories1("Do you mind telling me...?... how to get to kaldis coffee please?", "Tawu issiba yootanawu hanqqettoppa... Qalddise kofiya waani gakkanaakko.", R.raw.record20210319191658);
        Categories1 cata5 = new Categories1("I was wondering if you would tell me ...the right direction to kera please?", "Sitti oottidi qeeraa kessiya ogiya... ne tawu odidaakko!", R.raw.record20210319191711);
        //error
        Categories1 cata6 = new Categories1("Can you tell me/show me ... pharmacy?", "Neeni tawu yootanawu/tana bessanawu danddayay... parimaasiya?", R.raw.record20210319191729);
        Categories1 cata7 = new Categories1("Could you tell me/show me...pay phone?", "Neeni tawu yootandii/ tana bessaanddi ...deriya silkkiya?", R.raw.record20210319191729);
        Categories1 cata8 = new Categories1("Would you tell me / show me .... supermarket?", "Ne tawu oduutee/tana bessuutee... ubba shaqaxa keettaa?", R.raw.record20210319191739);
        Categories1 cata9 = new Categories1("Do you mind telling me ... where the nearest police station is?", "Neeni tawu yootanawu hanqqetuuteeshsha ... matattiya xaace keettay awan diyakko?", R.raw.record20210319191801);
        Categories1 cata10 = new Categories1("I was wondering if you would tell me ... Library", "Maxaafa keetay de'iyoosaa... neeni tawu odiyaakko taani ufayttays.", R.raw.record20210319191815);
        Categories1 cata11 = new Categories1("... Bakery", "...daabbo keetay de'iyoosa.", R.raw.record20210319191830);
        Categories1 cata12 = new Categories1("... Cafe", "...tukke keettay diyossaa.", R.raw.record20210319191838);
        Categories1 cata13 = new Categories1("... Hospital", "... hosppitaalee de'iyoosaa", R.raw.record20210319191847);
        Categories1 cata14 = new Categories1("... Restaurant", "... quma keetay de'iyoosaa", R.raw.record20210319191858);
        Categories1 cata15 = new Categories1("... Bar", "... ushsha keettay diyossaa.", R.raw.record20210319191906);
        Categories1 cata16 = new Categories1("Excuse me/paradon me do you know which direction is it to ...", "Atotettaa oychchays ... efiya ginay awugaakko neeni eray?", R.raw.record20210319192009);
        Categories1 cata17 = new Categories1("Excuse me is this the way to shiromeda?", "Attoga tawu, Hagee shuro meedaa efiya ogee?", R.raw.record20210319192024);
        Categories1 cata18 = new Categories1("Does this bus go to shiromeda?", "Hagee otoobisee shuro meedaa bii?", R.raw.record20210319192039);
        Categories1 cata19 = new Categories1("Is this right way to shiromeda?", "Hagee shuro meedawu suure ogee?", R.raw.record20210319192052);
        Categories1 cata20 = new Categories1("Yes, it is.", "Ee, hegaa", R.raw.record20210319192102);
        Categories1 cata21 = new Categories1("Yes, it does", "Ee, I oottees.", R.raw.record20210319192115);
        Categories1 cata22 = new Categories1("No it isn't.", "Chi, gidenna.", R.raw.record20210319192123);
        Categories1 cata23 = new Categories1("No it doesn't.", "Chi, I oottenna.", R.raw.record20210319192132);
        Categories1 cata24 = new Categories1("I'm sorry", "Poora taani kayyottays.", R.raw.record20210319192144);
        Categories1 cata25 = new Categories1("I'm afraid", "Ayye, waayidi!", R.raw.record20210319192217);
        //error
        Categories1 cata26 = new Categories1("I do not know", "Taani erikke", R.raw.record20210319192217);
        Categories1 cata27 = new Categories1("I have no idea.", "Taani eriyoobi baawa", R.raw.record20210319192234);
        Categories1 cata28 = new Categories1("I am a stranger here my self.", "Taani ta huuphen heerawu imatta", R.raw.record20210319192249);
        Categories1 cata29 = new Categories1("WAYS OF GIVING DIRECTION", "ZAAROTAA", R.raw.record20210319192308);
        Categories1 cata30 = new Categories1("Yes oh! Yea sure go straight ahead up to the building.", "Eettenne, Ee tuma ba sitti gaada wogga keetta gakkanawu.", R.raw.record20210319192440);
        Categories1 cata31 = new Categories1("Keep going straight untill you reach the curve.", "Ogiya yeddennan ba leeqqamaa gakkanaashin.", R.raw.record20210319192452);
        Categories1 cata32 = new Categories1("...you reach the juncture.", "... ballaa gakkanaashin.", R.raw.record20210319192506);
        Categories1 cata33 = new Categories1("... you reach the bus stop.", "... Otobisse eqqiyosaa gakkanashin.", R.raw.record20210319192516);
        Categories1 cata34 = new Categories1("... you reach the square", "... dabaabaa gakkanashin.", R.raw.record20210319192527);
        Categories1 cata35 = new Categories1("... you reach the land mark.", "... zawaa malaataa gakkanaashin.", R.raw.record20210319192538);
        Categories1 cata36 = new Categories1("Turn to the left.", "Haddirssakko simma.", R.raw.record20210319192549);
        Categories1 cata37 = new Categories1("Take a left/ take a right hand side.", "Haddirssa (ushachcha) kushiya baggi oykka.", R.raw.record20210319192613);
        Categories1 cata38 = new Categories1("Go straight for 50 meter", "Ishatamu mitire gidiyaagaa suure ba.", R.raw.record20210319192628);
        Categories1 cata39 = new Categories1("Go around the fence.", "Dirssaa baggakko ba.", R.raw.record20210319192649);
        Categories1 cata40 = new Categories1("Go around the round about.", "Dabaabaa yuushuwa ba.", R.raw.record20210319192659);
        Categories1 cata41 = new Categories1("Excuse me, how long does it take from here to your home?", "Atto ga tawu hagaappe ne soo baanawu woysa ekkanee?", R.raw.record20210319192717);
        Categories1 cata42 = new Categories1("It take an hour walk.", "Tohuwan biikko issi saate.", R.raw.record20210319192733);
        Categories1 cata43 = new Categories1("What's about driving?", "Kaamiyyan shin?", R.raw.record20210319192745);
        Categories1 cata44 = new Categories1("It takes 30 minutes' drive.", "Kaamiyan 30 daqiiqa giiyaagaa ekkes.",R.raw.record20210319192802 );
        Categories1 cata45 = new Categories1("Traffic circle", "Dabaabaa", R.raw.record20210319192815);
        Categories1 cata46 = new Categories1("Intersection", "Oyddusaa balla ogiya",R.raw.record20210319192824);
        Categories1 cata47 = new Categories1("Stop light", "Tiraafike xomppiya", R.raw.record20210319192833);
        Categories1 cata48 = new Categories1("Side walk", "Miyiyaara hemettiyo toho ogiya",  R.raw.record20210319192846);
        Categories1 cata49 = new Categories1("Cross walk", "Ogiya qanxxidi pinniyo ogiya", R.raw.record20210319192859);


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
        list.add(cata39);
        list.add(cata40);
        list.add(cata41);
        list.add(cata42);
        list.add(cata43);
        list.add(cata44);
        list.add(cata45);
        list.add(cata46);
        list.add(cata47);
        list.add(cata48);
        list.add(cata49);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main18Activity.this).nof_alldata();
        Toast.makeText(Main18Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 301){
            new DBAdarter(Main18Activity.this).saveAllData(cata1);
            new DBAdarter(Main18Activity.this).saveAllData(cata2);
            new DBAdarter(Main18Activity.this).saveAllData(cata3);
            new DBAdarter(Main18Activity.this).saveAllData(cata4);
            new DBAdarter(Main18Activity.this).saveAllData(cata5);
            new DBAdarter(Main18Activity.this).saveAllData(cata6);
            new DBAdarter(Main18Activity.this).saveAllData(cata7);
            new DBAdarter(Main18Activity.this).saveAllData(cata8);
            new DBAdarter(Main18Activity.this).saveAllData(cata9);
            new DBAdarter(Main18Activity.this).saveAllData(cata10);
            new DBAdarter(Main18Activity.this).saveAllData(cata11);
            new DBAdarter(Main18Activity.this).saveAllData(cata12);
            new DBAdarter(Main18Activity.this).saveAllData(cata13);
            new DBAdarter(Main18Activity.this).saveAllData(cata14);
            new DBAdarter(Main18Activity.this).saveAllData(cata15);
            new DBAdarter(Main18Activity.this).saveAllData(cata16);
            new DBAdarter(Main18Activity.this).saveAllData(cata17);
            new DBAdarter(Main18Activity.this).saveAllData(cata18);
            new DBAdarter(Main18Activity.this).saveAllData(cata19);
            new DBAdarter(Main18Activity.this).saveAllData(cata20);
            new DBAdarter(Main18Activity.this).saveAllData(cata21);
            new DBAdarter(Main18Activity.this).saveAllData(cata22);
            new DBAdarter(Main18Activity.this).saveAllData(cata23);
            new DBAdarter(Main18Activity.this).saveAllData(cata24);
            new DBAdarter(Main18Activity.this).saveAllData(cata25);
            new DBAdarter(Main18Activity.this).saveAllData(cata26);
            new DBAdarter(Main18Activity.this).saveAllData(cata27);
            new DBAdarter(Main18Activity.this).saveAllData(cata28);
            new DBAdarter(Main18Activity.this).saveAllData(cata29);
            new DBAdarter(Main18Activity.this).saveAllData(cata30);
            new DBAdarter(Main18Activity.this).saveAllData(cata31);
            new DBAdarter(Main18Activity.this).saveAllData(cata32);
            new DBAdarter(Main18Activity.this).saveAllData(cata33);
            new DBAdarter(Main18Activity.this).saveAllData(cata34);
            new DBAdarter(Main18Activity.this).saveAllData(cata35);
            new DBAdarter(Main18Activity.this).saveAllData(cata36);
            new DBAdarter(Main18Activity.this).saveAllData(cata37);
            new DBAdarter(Main18Activity.this).saveAllData(cata38);
            new DBAdarter(Main18Activity.this).saveAllData(cata39);
            new DBAdarter(Main18Activity.this).saveAllData(cata40);
            new DBAdarter(Main18Activity.this).saveAllData(cata41);
            new DBAdarter(Main18Activity.this).saveAllData(cata42);
            new DBAdarter(Main18Activity.this).saveAllData(cata43);
            new DBAdarter(Main18Activity.this).saveAllData(cata44);
            new DBAdarter(Main18Activity.this).saveAllData(cata45);
            new DBAdarter(Main18Activity.this).saveAllData(cata46);
            new DBAdarter(Main18Activity.this).saveAllData(cata47);
            new DBAdarter(Main18Activity.this).saveAllData(cata48);
            new DBAdarter(Main18Activity.this).saveAllData(cata49);
        }
    }
}

package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main25Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Travel & Transportation");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("QUESTION ASKED BY A TRAVEL AGENT\n\n\n- Where would you like to go?", "Awa baanawu koyyay, neeni?", R.raw.record20210321203029);
        Categories1 cata2 = new Categories1("Where would you like to go?", "Awude baana koyyay, ne?", R.raw.record20210321203036);
        Categories1 cata3 = new Categories1("What days would you like to travel?", "Aappun gallassatussi manddaranawu dosay?", R.raw.record20210321203050);
        Categories1 cata4 = new Categories1("Where to?", "Awee?", R.raw.record20210321203056);
        Categories1 cata5 = new Categories1("One way or round trip?", "Yaanne haanne manddarayiyye yaani attaggay?", R.raw.record20210321203106);
        Categories1 cata6 = new Categories1("VERIFYING YOUR ROUTE WHEN TRAVELING\n\n\n- Am I going or?", "Awu biyaanaashsha?", R.raw.record20210321203115);
        Categories1 cata7 = new Categories1("Is it far from here?", "I hagaappe hashooshsha?", R.raw.record20210321203123);
        Categories1 cata8 = new Categories1("Which way is to down town?", "Araadaa efiya ogee awugeeshsha?", R.raw.record20210321203129);
        Categories1 cata9 = new Categories1("Is this the road to cazanchis?", "Hagee ogee kaazanchchiise efiyaagee?", R.raw.record20210321203138);
        Categories1 cata10 = new Categories1("How do I get to sodo from here?", "Hagaappe Burrayyo waanada biyaanaa?", R.raw.record20210321203148);
        Categories1 cata11 = new Categories1("WHEN YOU ARE LOST\n\n\n- I can't find my way to ...", "Taani ... efiya ogiya balarggaas.", R.raw.record20210321203157);
        Categories1 cata12 = new Categories1("Can you help me? I am lost...", "Neeni tana maaddanddii? Taani xayira asa?", R.raw.record20210321203208);
        Categories1 cata13 = new Categories1("I seem to be lost...", "Baa, ogiya balada bayaychchennan aggikke.", R.raw.record20210321203219);
        Categories1 cata14 = new Categories1("A TAXI DRIVER ASKING WHERE TO GO\n\n\n- Where to?", "Awe biyoy?", R.raw.record20210321203231);
        Categories1 cata15 = new Categories1("Where to friend?", "Awee, laggiyawu?", R.raw.record20210321203245);
        Categories1 cata16 = new Categories1("Where to sir?", "Awee ta godawu?", R.raw.record20210321203253);
        Categories1 cata17 = new Categories1("Where to lady?", "Awee godee?", R.raw.record20210321203258);
        Categories1 cata18 = new Categories1("Where to madam?", "Awee, manttaa yee?", R.raw.record20210321203303);
        Categories1 cata19 = new Categories1("Where can I drive you?", "Awa laaggoo nena?", R.raw.record20210321203310);
        Categories1 cata20 = new Categories1("Where do you want to go?", "Awu baana koyyay neeni?", R.raw.record20210321203316);
        Categories1 cata21 = new Categories1("Where would you like to go?", "Awu baanawu dosay neeni?", R.raw.record20210321203321);
        Categories1 cata22 = new Categories1("BASIC INSTRUCTION TO A TAXI DRIVER\n\n\n- Can you take to radison hotel?", "Iraadisani Hoteeliyawu efaana danddayay?", R.raw.record20210321203333);
        Categories1 cata23 = new Categories1("Take me to the airport", "Tana horophphillee uttiyoossaa efaa", R.raw.record20210321203343);
        Categories1 cata24 = new Categories1("Would you take me to any night clubs?", "Tana issi qamma kaassa maabari de'iyoosaa efanddii?", R.raw.record20210321203354);
        Categories1 cata25 = new Categories1("I need to go to hayat Hospital", "Taani Haayaate osppitaaliya baana koyyays.", R.raw.record20210321203419);
        Categories1 cata26 = new Categories1("The airport, please.", "Horophphilee uttiyoosaa, hayyannaa.", R.raw.record20210321203432);
        Categories1 cata27 = new Categories1("GENERAL QUESTIONS ASKED BY A TAXI DRIVER\n\n\n- You in hurry?", "Neeni eesotay?",R.raw.record20210321203438);
        Categories1 cata28 = new Categories1("Which way do you want me to go?", "Taani awugaa ogiyaara nena efaanaadan koyyay?", R.raw.record20210321203452);
        Categories1 cata29 = new Categories1("It's rush hour, I don't go there.", "Hegaan wocamay de'ees; taani yaa biikke.", R.raw.record20210321203507);
        Categories1 cata30 = new Categories1("Mind if I smoke?", "Taani sijaaraa sarbbiyaakko dosikkii?", R.raw.record20210321203545);
        Categories1 cata31 = new Categories1("Please don't smoke.", "Hayyanaa sarbbopparkkii?", R.raw.record20210321203552);
        Categories1 cata32 = new Categories1("Is the radio to load?", "Iradooniya cenggurssay keehi waassii?", R.raw.record20210321203552);
        Categories1 cata33 = new Categories1("I don't go there.", "Taani yaa biikke.", 0x7f0e0002);
        Categories1 cata34 = new Categories1("Is here okay to drop you?", "Hagaan wottoo nena?", 0x7f0e0002);
        Categories1 cata35 = new Categories1("ASKING ABOUT ARRIVING SOMEWHERE\n\n\n- When do we get there?", "Yaa awude gakkiyo nuuni?", 0x7f0e0002);
        Categories1 cata36 = new Categories1("When will we arrive?", "Nuuni awude gakkanee yaa?", 0x7f0e0002);
        Categories1 cata37 = new Categories1("Are we there yet?", "Birooni yaa gakkibookkoni nuuni?", 0x7f0e0002);
        Categories1 cata38 = new Categories1("Are we almost there?", "Nuuni yaa geliiddi de'iyoo?", 0x7f0e0002);
        Categories1 cata39 = new Categories1("CONCERNING THE FINAL DESTINATION\n\n\n- Let me down there", "Taana hagaan wottana danddayay?", 0x7f0e0002);
        Categories1 cata40 = new Categories1("PAYING\n\n\n- Do you have change for a fifty?", "Neessi ishatamu marccuwa laame de'ii?", 0x7f0e0002);
        Categories1 cata41 = new Categories1("Can you break a hundred?", "Issi xeetu marccuwa laammuutee?", 0x7f0e0002);
        Categories1 cata42 = new Categories1("Keep the change.", "Zaaruwaa yaa oykka!", 0x7f0e0002);
        Categories1 cata43 = new Categories1("I'm sorry, I don't have any change.", "Poora, ayba laameenne tawu baawa.", 0x7f0e0002);
        Categories1 cata44 = new Categories1("Don't you have any thing smaller?", "Ayyiba laameeka baawee?", 0x7f0e0002);


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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main25Activity.this).nof_alldata();
        Toast.makeText(Main25Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 648){
            new DBAdarter(Main25Activity.this).saveAllData(cata1);
            new DBAdarter(Main25Activity.this).saveAllData(cata2);
            new DBAdarter(Main25Activity.this).saveAllData(cata3);
            new DBAdarter(Main25Activity.this).saveAllData(cata4);
            new DBAdarter(Main25Activity.this).saveAllData(cata5);
            new DBAdarter(Main25Activity.this).saveAllData(cata6);
            new DBAdarter(Main25Activity.this).saveAllData(cata7);
            new DBAdarter(Main25Activity.this).saveAllData(cata8);
            new DBAdarter(Main25Activity.this).saveAllData(cata9);
            new DBAdarter(Main25Activity.this).saveAllData(cata10);
            new DBAdarter(Main25Activity.this).saveAllData(cata11);
            new DBAdarter(Main25Activity.this).saveAllData(cata12);
            new DBAdarter(Main25Activity.this).saveAllData(cata13);
            new DBAdarter(Main25Activity.this).saveAllData(cata14);
            new DBAdarter(Main25Activity.this).saveAllData(cata15);
            new DBAdarter(Main25Activity.this).saveAllData(cata16);
            new DBAdarter(Main25Activity.this).saveAllData(cata17);
            new DBAdarter(Main25Activity.this).saveAllData(cata18);
            new DBAdarter(Main25Activity.this).saveAllData(cata19);
            new DBAdarter(Main25Activity.this).saveAllData(cata20);
            new DBAdarter(Main25Activity.this).saveAllData(cata21);
            new DBAdarter(Main25Activity.this).saveAllData(cata22);
            new DBAdarter(Main25Activity.this).saveAllData(cata23);
            new DBAdarter(Main25Activity.this).saveAllData(cata24);
            new DBAdarter(Main25Activity.this).saveAllData(cata25);
            new DBAdarter(Main25Activity.this).saveAllData(cata26);
            new DBAdarter(Main25Activity.this).saveAllData(cata27);
            new DBAdarter(Main25Activity.this).saveAllData(cata28);
            new DBAdarter(Main25Activity.this).saveAllData(cata29);
            new DBAdarter(Main25Activity.this).saveAllData(cata30);
            new DBAdarter(Main25Activity.this).saveAllData(cata31);
            new DBAdarter(Main25Activity.this).saveAllData(cata32);
            new DBAdarter(Main25Activity.this).saveAllData(cata33);
            new DBAdarter(Main25Activity.this).saveAllData(cata34);
            new DBAdarter(Main25Activity.this).saveAllData(cata35);
            new DBAdarter(Main25Activity.this).saveAllData(cata36);
            new DBAdarter(Main25Activity.this).saveAllData(cata37);
            new DBAdarter(Main25Activity.this).saveAllData(cata38);
            new DBAdarter(Main25Activity.this).saveAllData(cata39);
            new DBAdarter(Main25Activity.this).saveAllData(cata40);
            new DBAdarter(Main25Activity.this).saveAllData(cata41);
            new DBAdarter(Main25Activity.this).saveAllData(cata42);
            new DBAdarter(Main25Activity.this).saveAllData(cata43);
            new DBAdarter(Main25Activity.this).saveAllData(cata44);
        }
           }
}

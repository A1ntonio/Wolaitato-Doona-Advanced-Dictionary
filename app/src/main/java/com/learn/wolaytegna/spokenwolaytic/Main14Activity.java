package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main14Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Shopping");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("How much is it?","Hagaa gatee woysee?",R.raw.record20131231222854);
        Categories1 cata2 = new Categories1("How much is that?","Hegee gatee woysee?",R.raw.record20131231222902);
        Categories1 cata3 = new Categories1("How much is this?","Hagee aappunee?",R.raw.record20131231222909);
        Categories1 cata4 = new Categories1("How much are they?","Hageetu gatee aappunee?",R.raw.record20131231222916);
        Categories1 cata5 = new Categories1("How much are those?","Hageetu gatee woqqee?",R.raw.record20131231222933);
        Categories1 cata6 = new Categories1("How much is a kilo?","Issi Kiiluwa gatee woysee?",R.raw.record20131231222956);
        Categories1 cata7 = new Categories1("How much is a litter of...?","Issi litiro gatee woysee?",R.raw.record20131231223004);
        Categories1 cata8 = new Categories1("What is the last price?","Ekkiyo wurssetta gatee woysse?",R.raw.record20131231223032);
        Categories1 cata9 = new Categories1("It seems very expensive.","Hegee Daro al'o misatees.?",R.raw.record20131231223043);
        Categories1 cata10 = new Categories1("Is two hundred all right with you?","Naa'u xeetu marcuwan hanii?",R.raw.record20131231223101);
        Categories1 cata11 = new Categories1("Mmm... Ok, how about 250?","Immm...Ero naa'u xeetanne ishatamanshin?",R.raw.record20131231223115);
        Categories1 cata12 = new Categories1("Thanks, I'll have it.","Ero(Galatays); hegaa taani ekkana.",R.raw.record20131231223130);
        Categories1 cata13 = new Categories1("Thanks, I'll have them.","Ero (Galatays) hegeeta taani ekkana.",R.raw.record20131231223141);
        Categories1 cata14 = new Categories1("Thanks I'll take this one, please","Galatays, hegaa taani ekkana, hayyanaa.",R.raw.record20131231223212);
        Categories1 cata15 = new Categories1("I think I'll have this one","Hagaa ekkanawu qoppays.",R.raw.record20131231223238);
        Categories1 cata16 = new Categories1("Ok, I will take it.","Ero, hagaa ekkana.",R.raw.record20131231223247);
        Categories1 cata17 = new Categories1("Very well, I will take a litter.","Daro lo'o issi litiruwa ekkana.",R.raw.record20131231223255);
        Categories1 cata18 = new Categories1("I think I'll leave it, thank you","Aggaaga nawu qoppays; galatays.",R.raw.record20131231223322);
        Categories1 cata19 = new Categories1("Thanks, but it's not quit what I want.","Galatays hagee mule ta koyiyoogaa gidenna.",R.raw.record20131231223333);
        Categories1 cata20 = new Categories1("It's to expensive.","Hagee daro al'o",R.raw.record20131231223344);
        Categories1 cata21 = new Categories1("They are too expensive","Hageeti daro al'o.",R.raw.record20131231223351);
        Categories1 cata22 = new Categories1("It's too small.","Hagee keehippe guutta.",R.raw.record20131231223358);
        Categories1 cata23 = new Categories1("They are too big.","Hageeti keehippe gita.",R.raw.record20131231223406);
        Categories1 cata24 = new Categories1("I don't want to pay that much.","Hegaa keesaa qanxxanawu taani koyikke.",R.raw.record20131231223414);
        Categories1 cata25 = new Categories1("I'm afraid that's too much.","Hagee Keehippe daro gatee; yashshees.",R.raw.record20131231223451);
        Categories1 cata26 = new Categories1("Isn't that rather expensive","Hegee ubba gede al'uwa darennee?",R.raw.record20131231223524);
        Categories1 cata27 = new Categories1("Oh! I am afraid that is very expensive.","Haha! Hegee ubba yaa al'uwaa dares; yayyays.",R.raw.record20131231223623);
        Categories1 cata28 = new Categories1("Do you have...?","...niyo de'ii?",R.raw.record20131231222802);
        Categories1 cata29 = new Categories1("Which type would you like?","Awugaa dosay?",R.raw.record20131231222827);
        Categories1 cata30 = new Categories1("Do you want foreign or local?","Kare biittaagaayye nuugaa?",R.raw.record20131231222841);
        Categories1 cata31 = new Categories1("That one over there","Hegaa hiniin de'iyaagaa",R.raw.record20131231222811);
        Categories1 cata32 = new Categories1("Can I help you?","Ay maaddoo",R.raw.record20131231222744);
        Categories1 cata33 = new Categories1("I'm looking for...","...koyyas",R.raw.record20131231222753);


        ArrayList<Categories1> list = new ArrayList<>();
        list.add(cata32);
        list.add(cata33);
        list.add(cata28);
        list.add(cata31);
        list.add(cata29);
        list.add(cata30);
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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main14Activity.this).nof_alldata();
        Toast.makeText(Main14Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 180){
            new DBAdarter(Main14Activity.this).saveAllData(cata1);
            new DBAdarter(Main14Activity.this).saveAllData(cata2);
            new DBAdarter(Main14Activity.this).saveAllData(cata3);
            new DBAdarter(Main14Activity.this).saveAllData(cata4);
            new DBAdarter(Main14Activity.this).saveAllData(cata5);
            new DBAdarter(Main14Activity.this).saveAllData(cata6);
            new DBAdarter(Main14Activity.this).saveAllData(cata7);
            new DBAdarter(Main14Activity.this).saveAllData(cata8);
            new DBAdarter(Main14Activity.this).saveAllData(cata9);
            new DBAdarter(Main14Activity.this).saveAllData(cata10);
            new DBAdarter(Main14Activity.this).saveAllData(cata11);
            new DBAdarter(Main14Activity.this).saveAllData(cata12);
            new DBAdarter(Main14Activity.this).saveAllData(cata13);
            new DBAdarter(Main14Activity.this).saveAllData(cata14);
            new DBAdarter(Main14Activity.this).saveAllData(cata15);
            new DBAdarter(Main14Activity.this).saveAllData(cata16);
            new DBAdarter(Main14Activity.this).saveAllData(cata17);
            new DBAdarter(Main14Activity.this).saveAllData(cata18);
            new DBAdarter(Main14Activity.this).saveAllData(cata19);
            new DBAdarter(Main14Activity.this).saveAllData(cata20);
            new DBAdarter(Main14Activity.this).saveAllData(cata21);
            new DBAdarter(Main14Activity.this).saveAllData(cata22);
            new DBAdarter(Main14Activity.this).saveAllData(cata23);
            new DBAdarter(Main14Activity.this).saveAllData(cata24);
            new DBAdarter(Main14Activity.this).saveAllData(cata25);
            new DBAdarter(Main14Activity.this).saveAllData(cata26);
            new DBAdarter(Main14Activity.this).saveAllData(cata27);
            new DBAdarter(Main14Activity.this).saveAllData(cata28);
            new DBAdarter(Main14Activity.this).saveAllData(cata29);
            new DBAdarter(Main14Activity.this).saveAllData(cata30);
            new DBAdarter(Main14Activity.this).saveAllData(cata31);
            new DBAdarter(Main14Activity.this).saveAllData(cata32);
            new DBAdarter(Main14Activity.this).saveAllData(cata33);
        }
    }
}

package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main29Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Agreeing & Disagreeing");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("SIMPLE AGREEMENT\n\n\n- yes", "Ee", 0x7f0e0000);
        Categories1 cata2 = new Categories1("Right", "Gamma", 0x7f0e0001);
        Categories1 cata3 = new Categories1("You're right", "Neeni gamma", 0x7f0e0002);
        Categories1 cata4 = new Categories1("Right you are", "Ee neeni gamma", 0x7f0e0000);
        Categories1 cata5 = new Categories1("Sure", "Tumuppe", 0x7f0e0001);
        Categories1 cata6 = new Categories1("Absolutely", "Tumuppe gamma", 0x7f0e0002);
        Categories1 cata7 = new Categories1("By all means", "Ubbabankka gamma", 0x7f0e0000);
        Categories1 cata8 = new Categories1("STATING OUR CONCURRENCE\n\n\n- That is true", "Hagee tuma", 0x7f0e0001);
        Categories1 cata9 = new Categories1("You're right", "Neeni tuma", 0x7f0e0000);
        Categories1 cata10 = new Categories1("That's for certain", "Hegee gammabaa", 0x7f0e0002);
        Categories1 cata11 = new Categories1("It works for me", "Hagee taassikka oottees.", 0x7f0e0002);
        Categories1 cata12 = new Categories1("Well said", "Lo'o gaadasa", 0x7f0e0002);
        Categories1 cata13 = new Categories1("I agree with you 100%", "Xeetu kushe ta ne qofan maayettas.", 0x7f0e0002);
        Categories1 cata14 = new Categories1("That's for sure", "Hegee gammabaa", 0x7f0e0002);
        Categories1 cata15 = new Categories1("That's for darn sure", "Hegee erettidabaa", 0x7f0e0002);
        Categories1 cata16 = new Categories1("I have no problem with that.", "He qofan tawu metoy baa", 0x7f0e0002);
        Categories1 cata17 = new Categories1("We see ey to eye on this.", "Nuuni ubbaykka maayettida", 0x7f0e0002);
        Categories1 cata18 = new Categories1("EXPRESSING ACCEPTANCE\n\n\n- I think its fine.", "Ta qoppiyoode hagee lo'o.", 0x7f0e0002);
        Categories1 cata19 = new Categories1("This is second to none", "Hari aybiika koshenna", 0x7f0e0002);
        Categories1 cata20 = new Categories1("It's good enough", "Hagee lo'o gidiis.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("This is perfect", "Hagee gamma.", 0x7f0e0002);
        Categories1 cata22 = new Categories1("It's satisfactory", "Hagee lo'o", 0x7f0e0002);
        Categories1 cata23 = new Categories1("This is ultimate", "Hagee wotoy maynna lo'o", 0x7f0e0002);
        Categories1 cata24 = new Categories1("I like it", "Hagaa ta dosaas", 0x7f0e0002);
        Categories1 cata25 = new Categories1("Never been better.", "Hagaattoo lo'iya hari baa", 0x7f0e0002);
        Categories1 cata26 = new Categories1("I have never seen anything like it.", "Hagaadan lo'iyagaa mule be'abeykke", 0x7f0e0002);
        Categories1 cata27 = new Categories1("I love it", "Hagaa ta dosaas.", 0x7f0e0002);
        Categories1 cata28 = new Categories1("It's wonderful", "Hagee pala lo'ees.", 0x7f0e0002);
        Categories1 cata29 = new Categories1("Bingo!", "Keehippe lo'o", 0x7f0e0002);
        Categories1 cata30 = new Categories1("STATING STRONG DISAGREEMENT\n\n\n- I disagree completely", "Taani mule maayettikke.", 0x7f0e0002);
        Categories1 cata31 = new Categories1("I couldn't disagree with you more", "Hagaappe daruwa nenaara ta maayettana danddaykke", 0x7f0e0002);
        Categories1 cata32 = new Categories1("That is a big fat lie", "Hgee keehippe gita worddo.", 0x7f0e0002);
        Categories1 cata33 = new Categories1("You are lying through your teeth.", "Ne worddoy ne haasayankka erettees.", 0x7f0e0002);
        Categories1 cata34 = new Categories1("EXPRESSING REJECTIONS\n\n\n- I hate it.", "T hagaa ixxays.", 0x7f0e0002);
        Categories1 cata35 = new Categories1("I don't care for it.", "Hagawu ta soho immikke.", 0x7f0e0002);
        Categories1 cata36 = new Categories1("It's ugly.", "Hagee iitees", 0x7f0e0002);
        Categories1 cata37 = new Categories1("I can't stand it.", "Ha qofan ta de'ana danddykke.", 0x7f0e0002);
        Categories1 cata38 = new Categories1("No way", "He ogiyan gidenna", 0x7f0e0002);
        Categories1 cata39 = new Categories1("No, sir", "Gidennate godawwu", 0x7f0e0002);
        Categories1 cata40 = new Categories1("Sorry", "Ta azzanays", 0x7f0e0002);
        Categories1 cata41 = new Categories1("Not a chance", "Qaada gidenna.", 0x7f0e0002);
        Categories1 cata42 = new Categories1("Absolutely not", "Tumuppe gidenna", 0x7f0e0002);
        Categories1 cata43 = new Categories1("WAYS OF EXPRESSIONG AGREEMENT\n\n\n- Yes, of course", "Ee hegaadan", 0x7f0e0002);
        Categories1 cata44 = new Categories1("You are quite right", "Neeni wottoy baynna gamma", 0x7f0e0002);
        Categories1 cata45 = new Categories1("I agree with you", "Ta neegan maayettaas", 0x7f0e0002);
        Categories1 cata46 = new Categories1("I've to agree with you", "Maayettaas", 0x7f0e0002);
        Categories1 cata47 = new Categories1("I could not agree more", "Hegaa ta daro maayettikke", 0x7f0e0002);
        Categories1 cata48 = new Categories1("So do I", "Tankka neegadan", 0x7f0e0002);
        Categories1 cata49 = new Categories1("I suppose so", "Neeni giidoogaattoo gays.", 0x7f0e0002);
        Categories1 cata50 = new Categories1("Definitely", "Tumuppe", 0x7f0e0002);
        Categories1 cata51 = new Categories1("I think so", "Qoppidobaa", 0x7f0e0002);
        Categories1 cata52 = new Categories1("I share your idea.", "Ne qofaa shaakkays.", 0x7f0e0002);
        Categories1 cata53 = new Categories1("That's exactly what I think.", "Hegee tumu ta qoppidobaa.", 0x7f0e0002);
        Categories1 cata54 = new Categories1("WAYS OF EXPRESSING DISAGREEMENT\n\n\n- I am afraid I disagree", "Tana yashshees ta maaykke", 0x7f0e0002);
        Categories1 cata55 = new Categories1("I couldn't argee less", "Ta maayana danddaykke", 0x7f0e0002);
        Categories1 cata56 = new Categories1("That is nonsense", "Hegee mule milatennabaa", 0x7f0e0002);
        Categories1 cata57 = new Categories1("You must be joking", "Ne qilccayda de'aasa", 0x7f0e0002);
        Categories1 cata58 = new Categories1("Don't make me laugh", "Tana miichchoppa", 0x7f0e0002);
        Categories1 cata59 = new Categories1("You must be kidding", "Ne qiliccaydda daassa", 0x7f0e0002);


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
        list.add(cata50);
        list.add(cata51);
        list.add(cata52);
        list.add(cata53);
        list.add(cata54);
        list.add(cata55);
        list.add(cata56);
        list.add(cata57);
        list.add(cata58);
        list.add(cata59);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main29Activity.this).nof_alldata();
        Toast.makeText(Main29Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 792){
            new DBAdarter(Main29Activity.this).saveAllData(cata1);
            new DBAdarter(Main29Activity.this).saveAllData(cata2);
            new DBAdarter(Main29Activity.this).saveAllData(cata3);
            new DBAdarter(Main29Activity.this).saveAllData(cata4);
            new DBAdarter(Main29Activity.this).saveAllData(cata5);
            new DBAdarter(Main29Activity.this).saveAllData(cata6);
            new DBAdarter(Main29Activity.this).saveAllData(cata7);
            new DBAdarter(Main29Activity.this).saveAllData(cata8);
            new DBAdarter(Main29Activity.this).saveAllData(cata9);
            new DBAdarter(Main29Activity.this).saveAllData(cata10);
            new DBAdarter(Main29Activity.this).saveAllData(cata11);
            new DBAdarter(Main29Activity.this).saveAllData(cata12);
            new DBAdarter(Main29Activity.this).saveAllData(cata13);
            new DBAdarter(Main29Activity.this).saveAllData(cata14);
            new DBAdarter(Main29Activity.this).saveAllData(cata15);
            new DBAdarter(Main29Activity.this).saveAllData(cata16);
            new DBAdarter(Main29Activity.this).saveAllData(cata17);
            new DBAdarter(Main29Activity.this).saveAllData(cata18);
            new DBAdarter(Main29Activity.this).saveAllData(cata19);
            new DBAdarter(Main29Activity.this).saveAllData(cata20);
            new DBAdarter(Main29Activity.this).saveAllData(cata21);
            new DBAdarter(Main29Activity.this).saveAllData(cata22);
            new DBAdarter(Main29Activity.this).saveAllData(cata23);
            new DBAdarter(Main29Activity.this).saveAllData(cata24);
            new DBAdarter(Main29Activity.this).saveAllData(cata25);
            new DBAdarter(Main29Activity.this).saveAllData(cata26);
            new DBAdarter(Main29Activity.this).saveAllData(cata27);
            new DBAdarter(Main29Activity.this).saveAllData(cata28);
            new DBAdarter(Main29Activity.this).saveAllData(cata29);
            new DBAdarter(Main29Activity.this).saveAllData(cata30);
            new DBAdarter(Main29Activity.this).saveAllData(cata31);
            new DBAdarter(Main29Activity.this).saveAllData(cata32);
            new DBAdarter(Main29Activity.this).saveAllData(cata33);
            new DBAdarter(Main29Activity.this).saveAllData(cata34);
            new DBAdarter(Main29Activity.this).saveAllData(cata35);
            new DBAdarter(Main29Activity.this).saveAllData(cata36);
            new DBAdarter(Main29Activity.this).saveAllData(cata37);
            new DBAdarter(Main29Activity.this).saveAllData(cata38);
            new DBAdarter(Main29Activity.this).saveAllData(cata39);
            new DBAdarter(Main29Activity.this).saveAllData(cata40);
            new DBAdarter(Main29Activity.this).saveAllData(cata41);
            new DBAdarter(Main29Activity.this).saveAllData(cata42);
            new DBAdarter(Main29Activity.this).saveAllData(cata43);
            new DBAdarter(Main29Activity.this).saveAllData(cata44);
            new DBAdarter(Main29Activity.this).saveAllData(cata45);
            new DBAdarter(Main29Activity.this).saveAllData(cata46);
            new DBAdarter(Main29Activity.this).saveAllData(cata47);
            new DBAdarter(Main29Activity.this).saveAllData(cata48);
            new DBAdarter(Main29Activity.this).saveAllData(cata49);
            new DBAdarter(Main29Activity.this).saveAllData(cata50);
            new DBAdarter(Main29Activity.this).saveAllData(cata51);
            new DBAdarter(Main29Activity.this).saveAllData(cata52);
            new DBAdarter(Main29Activity.this).saveAllData(cata53);
            new DBAdarter(Main29Activity.this).saveAllData(cata54);
            new DBAdarter(Main29Activity.this).saveAllData(cata55);
            new DBAdarter(Main29Activity.this).saveAllData(cata56);
            new DBAdarter(Main29Activity.this).saveAllData(cata57);
            new DBAdarter(Main29Activity.this).saveAllData(cata58);
            new DBAdarter(Main29Activity.this).saveAllData(cata59);
        }
    }
}

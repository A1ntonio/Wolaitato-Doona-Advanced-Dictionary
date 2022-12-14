package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main35Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Miscellaneous");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("WAYS OF GIVING CONFIRMATION\n\n\n- I see", "Ahaa! Yaanidee?", 0x7f0e0000);
        Categories1 cata2 = new Categories1("Thank you", "Galatays (God immo!)", 0x7f0e0001);
        Categories1 cata3 = new Categories1("Oh, I see", "Ahaa, tumee? Adda ga, ane!", 0x7f0e0002);
        Categories1 cata4 = new Categories1("It's all clear now.", "Ero, mule qoncciis ha'i.", 0x7f0e0000);
        Categories1 cata5 = new Categories1("WARNINGS!\n\n\n- Be careful!", "Nena akeeka", 0x7f0e0001);
        Categories1 cata6 = new Categories1("Watch out!", "Nena akeeka", 0x7f0e0002);
        Categories1 cata7 = new Categories1("Look out!", "Nena akeeka", 0x7f0e0000);
        Categories1 cata8 = new Categories1("Watch your stop!", "Neeni essanasaa xella", 0x7f0e0001);
        Categories1 cata9 = new Categories1("Be ware!", "Nena era!", 0x7f0e0000);
        Categories1 cata10 = new Categories1("Caution!", "Ye'e", 0x7f0e0002);
        Categories1 cata11 = new Categories1("Take care!", "Naagetta!", 0x7f0e0002);
        Categories1 cata12 = new Categories1("Look before you leap!", "Piranaappe kasiyan ne wodhdhanassaa xeella.\n\nAkeekenna geressay...", 0x7f0e0002);
        Categories1 cata13 = new Categories1("Play it cool!", "Akeekada kaa'a", 0x7f0e0002);
        Categories1 cata14 = new Categories1("Look both ways before you cross the street!", "Yaa, haa xeellada pinna.", 0x7f0e0002);
        Categories1 cata15 = new Categories1("BETTING WITH SOMEONE ELSE.\n\n\n You wanna bet?", "Manddettana koyayyii?", 0x7f0e0002);
        Categories1 cata16 = new Categories1("You bet?", "Oysettutee?", 0x7f0e0002);
        Categories1 cata17 = new Categories1("I bet", "Ta naasettana (manddettana)/(Oysettana)", 0x7f0e0002);
        Categories1 cata18 = new Categories1("I will go for it do you?", "Neenara manddettana.", 0x7f0e0002);
        Categories1 cata19 = new Categories1("Let's pat some wager?", "Hey manddetta; biraa koyykko.", 0x7f0e0002);
        Categories1 cata20 = new Categories1("RESPONSES FOR BETTING QUESTIONS\n\n\n- Yah, let's bet", "Ee, oyttana.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("I'll go for it", "Ee, wottana", 0x7f0e0002);
        Categories1 cata22 = new Categories1("Sorry, I don't wanna do gambling.", "Haakko, taani ceere kaa'ikke; miishsha oyttikke.", 0x7f0e0002);
        Categories1 cata23 = new Categories1("EXPRESSING SOMEONES DEATH\n\n\n- She died.", "A hayqqaasu", 0x7f0e0002);
        Categories1 cata24 = new Categories1("She died.", "A shemppaasu", 0x7f0e0002);
        Categories1 cata25 = new Categories1("She died.", "A cimaasu.", 0x7f0e0002);
        Categories1 cata26 = new Categories1("She died.", "A bari Godan gayttaasu.", 0x7f0e0002);
        Categories1 cata27 = new Categories1("she is deceased.", "A ba de'uwa wurssaasu (hayqqaasu, xeesettaasu)", 0x7f0e0002);
        Categories1 cata28 = new Categories1("She perished.", "A ceeggasu.", 0x7f0e0002);
        Categories1 cata29 = new Categories1("She passed away.", "A hayqqasu.", 0x7f0e0002);
        Categories1 cata30 = new Categories1("He passed on", "I haayqqiis.", 0x7f0e0002);
        Categories1 cata31 = new Categories1("He is no longer among us", "I nuuppe shaakettis.", 0x7f0e0002);
        Categories1 cata32 = new Categories1("She has gone to a better land", "A xillosaa baasu.", 0x7f0e0002);
        Categories1 cata33 = new Categories1("She's gone to meet her maker.", "A ba Godan gayttana baasu.", 0x7f0e0002);
        Categories1 cata34 = new Categories1("'YOU CAN DO IT GO ON', LIKE EXPRESSIONS\n\n\n- Go on! You can do it!", "Wolqqaa immo!", 0x7f0e0002);
        Categories1 cata35 = new Categories1("Just one more!", "Booray gatto! (Booraa goyyiya asa)", 0x7f0e0002);
        Categories1 cata36 = new Categories1("Stick with it!", "Minna! Itimay utto! Itimay anggallo!\n\n(Uuttaa haashiya asaa)", 0x7f0e0002);
        Categories1 cata37 = new Categories1("Go for it!", "Kaaray damaamo! (Kaaraa daddiya asaa)", 0x7f0e0002);
        Categories1 cata38 = new Categories1("Give it a try!", "Hasiyan haara (haarite)! \n\n(Harppan daddiya asaa)", 0x7f0e0002);
        Categories1 cata39 = new Categories1("Give it a shot", "Donoy miskkato! Moohuwa mentto! \n\n(Donuwa, ...tokkiya assaa)", 0x7f0e0002);
        Categories1 cata40 = new Categories1("Give a shot try", "Uuttay alo! \n\n(Uuttaa tokkiya asaa)", 0x7f0e0002);
        Categories1 cata41 = new Categories1("'GREAT JOB!' LIKE EXPRESSIONS\n\n\n- I'm so proud of you!", "Hashshu, hashshu!", 0x7f0e0002);
        Categories1 cata42 = new Categories1("I'm very proud of you!", "Woraab! Hashshu.", 0x7f0e0002);
        Categories1 cata43 = new Categories1("You did a great job!", "Woraabi! Gitabaa Oottadasa.", 0x7f0e0002);
        Categories1 cata44 = new Categories1("Keep the tempo up!", "Hayya! Minna!", 0x7f0e0002);
        Categories1 cata45 = new Categories1("Keep it up!", "Hashshu Minna.", 0x7f0e0002);
        Categories1 cata46 = new Categories1("You did an awesome job.", "Maalaaliyabaa oottadasa! Woraabi!", 0x7f0e0002);
        Categories1 cata47 = new Categories1("Great job!", "Wolqqaama Ooso! Woraabi!", 0x7f0e0002);
        Categories1 cata48 = new Categories1("Wonderful!", "Gude! Hashshukka!", 0x7f0e0002);
        Categories1 cata49 = new Categories1("EXPRESSIONS TO OTHERS TO BE QUITE\n\n\n- Quite!", "Hayzzite!", 0x7f0e0002);
        Categories1 cata50 = new Categories1("Keep quite!", "Co'u giite!", 0x7f0e0002);
        Categories1 cata51 = new Categories1("Keep still!", "Co'u giite!", 0x7f0e0002);
        Categories1 cata52 = new Categories1("Be still!", "Sirphphi giite!", 0x7f0e0002);
        Categories1 cata53 = new Categories1("Hush!", "Shiii! Hayzzite", 0x7f0e0002);
        Categories1 cata54 = new Categories1("Silence! (formal)", "Co'u!", 0x7f0e0002);
        Categories1 cata55 = new Categories1("Shut up! (informal)", "Bara! Barite! (Qeeri naata)", 0x7f0e0002);
        Categories1 cata56 = new Categories1("Shut your mouth!", "Oykka (Bara) ne doonaa.", 0x7f0e0002);
        Categories1 cata57 = new Categories1("Hold your tongue!", "Teqqa ne doonaa.", 0x7f0e0002);
        Categories1 cata58 = new Categories1("Hush your mouth!", "Hayzza! Cooga!", 0x7f0e0002);
        Categories1 cata59 = new Categories1("Button your lip!", "Gordda ne doonnaa!", 0x7f0e0002);
        Categories1 cata60 = new Categories1("EXPRESSING AS THE SUN IS BURNING.\n\n\n- There is a scorehing sun out there", "Kareen loolliya away de'ees.", 0x7f0e0002);
        Categories1 cata61 = new Categories1("The sun is burning.", "Away penttees! Awiyaa xuuggawusu.", 0x7f0e0002);
        Categories1 cata62 = new Categories1("The sun is blistering.", "Away eettees.", 0x7f0e0002);
        Categories1 cata63 = new Categories1("The sun is going to bake us.", "Away doyssees.", 0x7f0e0002);
        Categories1 cata64 = new Categories1("It is broiling today.", "Hachchi wolqqaama away awaxxees.", 0x7f0e0002);
        Categories1 cata65 = new Categories1("A PREFACE TO MAKING A STATEMENT.\n\n\n- As you may already know.", "Kase intte eriyogaadan.", 0x7f0e0002);
        Categories1 cata66 = new Categories1("As you might know", "Intte waayidi erana...", 0x7f0e0002);
        Categories1 cata67 = new Categories1("As you know", "Intte eriyogaadan...", 0x7f0e0002);
        Categories1 cata68 = new Categories1("As you are aware", "Intee akeekiyoogaadan", 0x7f0e0002);
        Categories1 cata69 = new Categories1("For you information", "Intteyyoo taani yootanabay.", 0x7f0e0002);
        Categories1 cata70 = new Categories1("If I may be so based", "Taani intteyyoo baaso oottada odanabay...", 0x7f0e0002);
        Categories1 cata71 = new Categories1("WHEN SOMEONE HAS DO SOMETHING WRONG\n\n\n- How could you do such a silly thing?", "I neeni hagaa mala eeyya oosuwa waatada Oottadii!", 0x7f0e0002);
        Categories1 cata72 = new Categories1("How could you do such a thing?", "I neeni ayba asee hagaadan Oottiyaagee?", 0x7f0e0002);
        Categories1 cata73 = new Categories1("What on earth were you thinking?", "Ha biittan ne mala qofo baynna asa be'a erikke!", 0x7f0e0002);
        Categories1 cata74 = new Categories1("What possessed you to do that?", "Neeni hagaa Oottishin nena aybi oyqqidee?", 0x7f0e0002);


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
        list.add(cata60);
        list.add(cata61);
        list.add(cata62);
        list.add(cata63);
        list.add(cata64);
        list.add(cata65);
        list.add(cata66);
        list.add(cata67);
        list.add(cata68);
        list.add(cata69);
        list.add(cata70);
        list.add(cata71);
        list.add(cata72);
        list.add(cata73);
        list.add(cata74);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);


        int num = new DBAdarter(Main35Activity.this).nof_alldata();
        Toast.makeText(Main35Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 1027){
            new DBAdarter(Main35Activity.this).saveAllData(cata1);
            new DBAdarter(Main35Activity.this).saveAllData(cata2);
            new DBAdarter(Main35Activity.this).saveAllData(cata3);
            new DBAdarter(Main35Activity.this).saveAllData(cata4);
            new DBAdarter(Main35Activity.this).saveAllData(cata5);
            new DBAdarter(Main35Activity.this).saveAllData(cata6);
            new DBAdarter(Main35Activity.this).saveAllData(cata7);
            new DBAdarter(Main35Activity.this).saveAllData(cata8);
            new DBAdarter(Main35Activity.this).saveAllData(cata9);
            new DBAdarter(Main35Activity.this).saveAllData(cata10);
            new DBAdarter(Main35Activity.this).saveAllData(cata11);
            new DBAdarter(Main35Activity.this).saveAllData(cata12);
            new DBAdarter(Main35Activity.this).saveAllData(cata13);
            new DBAdarter(Main35Activity.this).saveAllData(cata14);
            new DBAdarter(Main35Activity.this).saveAllData(cata15);
            new DBAdarter(Main35Activity.this).saveAllData(cata16);
            new DBAdarter(Main35Activity.this).saveAllData(cata17);
            new DBAdarter(Main35Activity.this).saveAllData(cata18);
            new DBAdarter(Main35Activity.this).saveAllData(cata19);
            new DBAdarter(Main35Activity.this).saveAllData(cata20);
            new DBAdarter(Main35Activity.this).saveAllData(cata21);
            new DBAdarter(Main35Activity.this).saveAllData(cata22);
            new DBAdarter(Main35Activity.this).saveAllData(cata23);
            new DBAdarter(Main35Activity.this).saveAllData(cata24);
            new DBAdarter(Main35Activity.this).saveAllData(cata25);
            new DBAdarter(Main35Activity.this).saveAllData(cata26);
            new DBAdarter(Main35Activity.this).saveAllData(cata27);
            new DBAdarter(Main35Activity.this).saveAllData(cata28);
            new DBAdarter(Main35Activity.this).saveAllData(cata29);
            new DBAdarter(Main35Activity.this).saveAllData(cata30);
            new DBAdarter(Main35Activity.this).saveAllData(cata31);
            new DBAdarter(Main35Activity.this).saveAllData(cata32);
            new DBAdarter(Main35Activity.this).saveAllData(cata33);
            new DBAdarter(Main35Activity.this).saveAllData(cata34);
            new DBAdarter(Main35Activity.this).saveAllData(cata35);
            new DBAdarter(Main35Activity.this).saveAllData(cata36);
            new DBAdarter(Main35Activity.this).saveAllData(cata37);
            new DBAdarter(Main35Activity.this).saveAllData(cata38);
            new DBAdarter(Main35Activity.this).saveAllData(cata39);
            new DBAdarter(Main35Activity.this).saveAllData(cata40);
            new DBAdarter(Main35Activity.this).saveAllData(cata41);
            new DBAdarter(Main35Activity.this).saveAllData(cata42);
            new DBAdarter(Main35Activity.this).saveAllData(cata43);
            new DBAdarter(Main35Activity.this).saveAllData(cata44);
            new DBAdarter(Main35Activity.this).saveAllData(cata45);
            new DBAdarter(Main35Activity.this).saveAllData(cata46);
            new DBAdarter(Main35Activity.this).saveAllData(cata47);
            new DBAdarter(Main35Activity.this).saveAllData(cata48);
            new DBAdarter(Main35Activity.this).saveAllData(cata49);
            new DBAdarter(Main35Activity.this).saveAllData(cata50);
            new DBAdarter(Main35Activity.this).saveAllData(cata51);
            new DBAdarter(Main35Activity.this).saveAllData(cata52);
            new DBAdarter(Main35Activity.this).saveAllData(cata53);
            new DBAdarter(Main35Activity.this).saveAllData(cata54);
            new DBAdarter(Main35Activity.this).saveAllData(cata55);
            new DBAdarter(Main35Activity.this).saveAllData(cata56);
            new DBAdarter(Main35Activity.this).saveAllData(cata57);
            new DBAdarter(Main35Activity.this).saveAllData(cata58);
            new DBAdarter(Main35Activity.this).saveAllData(cata59);
            new DBAdarter(Main35Activity.this).saveAllData(cata60);
            new DBAdarter(Main35Activity.this).saveAllData(cata61);
            new DBAdarter(Main35Activity.this).saveAllData(cata62);
            new DBAdarter(Main35Activity.this).saveAllData(cata63);
            new DBAdarter(Main35Activity.this).saveAllData(cata64);
            new DBAdarter(Main35Activity.this).saveAllData(cata65);
            new DBAdarter(Main35Activity.this).saveAllData(cata66);
            new DBAdarter(Main35Activity.this).saveAllData(cata67);
            new DBAdarter(Main35Activity.this).saveAllData(cata68);
            new DBAdarter(Main35Activity.this).saveAllData(cata69);
            new DBAdarter(Main35Activity.this).saveAllData(cata70);
            new DBAdarter(Main35Activity.this).saveAllData(cata71);
            new DBAdarter(Main35Activity.this).saveAllData(cata72);
            new DBAdarter(Main35Activity.this).saveAllData(cata73);
            new DBAdarter(Main35Activity.this).saveAllData(cata74);
        }
    }
}

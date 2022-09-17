package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main17Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Talking about Annoyance");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("No!", "chii, hanenaa.", R.raw.record20210319185040);
        Categories1 cata2 = new Categories1("How annoying!", "Ayba yiilloyii?", R.raw.record20210319185107);
        Categories1 cata3 = new Categories1("How infuriating!", "Ayba yiilloyii?", R.raw.record20210319185107);
        Categories1 cata4 = new Categories1("Isn't that annoying!", "Hegee yiilloyennee?", R.raw.record20210319185124);
        Categories1 cata5 = new Categories1("How maddening", "Ayba gooshshiyaabee?", R.raw.record20210319185135);
        Categories1 cata6 = new Categories1("Isn't that maddening!", "Hegee gooshshennabee?", R.raw.record20210319185151);
        Categories1 cata7 = new Categories1("What a nuisance!", "Ayba issi gooshshiyaabee I?", R.raw.record20210319185204);
        Categories1 cata8 = new Categories1("Damn!", "Cayetta! Haakka!", R.raw.record20210319185218);
        Categories1 cata9 = new Categories1("I'm angry with you", "Taani ne bollan lancca uttaas.", R.raw.record20210319185232);
        Categories1 cata10 = new Categories1("Don't get under my skin", "Tawu maracciya mullugissoppa", R.raw.record20210319185245);
        Categories1 cata11 = new Categories1("I can't believe you did this to me", "Neeni taasi hagaa oottees gaada ammanikke.", R.raw.record20210319185307);
        Categories1 cata12 = new Categories1("You are driving me nuts", "Ne tana gooshshaa oyttaasa.", R.raw.record20210319185322);
        Categories1 cata13 = new Categories1("I'm so pissed", "Tawu maraccee mullugiis.", R.raw.record20210319185333);
        Categories1 cata14 = new Categories1("I'm pissed off", "Taani xuugetaas.", R.raw.record20210319185348);
        Categories1 cata15 = new Categories1("You're getting on my nerves", "Tana neeni yiilloyaydda daasa.", R.raw.record20210319185400);
        Categories1 cata16 = new Categories1("Don't cross me", "Tana xuuggooppa!", R.raw.record20210319185417);
        Categories1 cata17 = new Categories1("That makes me crazy", "Hegee tana yiilloyees.", R.raw.record20210319185429);
        Categories1 cata18 = new Categories1("Now, you're trying my patient.", "Ha'i, neeni tana danddayaa wurssissadasa.",R.raw.record20210319185453);
        Categories1 cata19 = new Categories1("You're not disappointed, are you?", "Neeni yiillotabaakka, yiillotadiiyye?", R.raw.record20210319185510);
        Categories1 cata20 = new Categories1("Are you angry?", "Neeni hanqqettadii?", R.raw.record20210319185523);
        Categories1 cata21 = new Categories1("Don't be angry with me. I really didn't mean it.", "Tanaara ooyettoppa. Taani qoppada oottabeykke tuma",R.raw.record20210319185547);
        Categories1 cata22 = new Categories1("Are you mad at me?", "Ta bolli keehi yiillotadiiyee?", R.raw.record20210319185603);
        Categories1 cata23 = new Categories1("I really didn't think it will upset you.", "Taani tuma hegee nena lanccissana ga beykke.", R.raw.record20210319185734);
        Categories1 cata24 = new Categories1("I don't mean it I hope you're not mad at me", "Taani qoppada oottabeyikke; ne yillotennagaadan hidootaa wottays.", R.raw.record20210319185820);
        Categories1 cata25 = new Categories1("Enough is enough!", "Gidana, gidana!", R.raw.record20210319185834);
        Categories1 cata26 = new Categories1("I can't stand him any longer", "Hagaa daro mittana danddayikke.", R.raw.record20210319185845);
        Categories1 cata27 = new Categories1("I can't bear him any more", "Hagaa daro danddayikke.",R.raw.record20210319185857 );
        Categories1 cata28 = new Categories1("Cool down", "Ane aggaaga ne!", R.raw.record20210319185919);
        Categories1 cata29 = new Categories1("Take it easy", "Aggaaga ne!", R.raw.record20210319185928);
        Categories1 cata30 = new Categories1("Calm down", "Cooga nee", R.raw.record20210319185956);
        Categories1 cata31 = new Categories1("Chill out", "Irxxa", R.raw.record20210319190017);
        Categories1 cata32 = new Categories1("Are you crazy", "Neeni gooyyadiiyye?", R.raw.record20210319190031);
        Categories1 cata33 = new Categories1("Are you out of your mind?", "Ne kahay tillennee?", R.raw.record20210319190043);
        Categories1 cata34 = new Categories1("Have you gone insane?", "Neeni baqettadiiyye?", R.raw.record20210319190054);
        Categories1 cata35 = new Categories1("Have you lost your mind", "Ne hakkaa bayaychchadiiyye?", R.raw.record20210319190106);
        Categories1 cata36 = new Categories1("That's none of your business", "Hegan nena gattiyaabi baa.", R.raw.record20210319185909);//
        Categories1 cata37 = new Categories1("Mind your own business", "Ne oosuwa akeeka.", R.raw.record20210319190213);
        Categories1 cata38 = new Categories1("Keep your nose out of my business", "Ta Oosuwappe ne kushiya shodda", R.raw.record20210319190237);
        Categories1 cata39 = new Categories1("None of your business", "Hagee ne ooso gidenna", R.raw.record20210319190251);
        Categories1 cata40 = new Categories1("Let me be", "Kichcha, tana yeda!", R.raw.record20210319190303);
        Categories1 cata41 = new Categories1("Let me be alone", "Taani ta kanchche gidana. Tarkka uttana.",R.raw.record20210319190332);
        Categories1 cata42 = new Categories1("Leave me be", "Kichchite ta matappe.", R.raw.record20210319190344);
        Categories1 cata43 = new Categories1("Leave me alone", "Tarkka de'ana koyyays.",  R.raw.record20210319190354);
        Categories1 cata44 = new Categories1("I just want to be left alone.", "Ta tarkka, baddo de'ana koyyays.", R.raw.record20210319190414);
        Categories1 cata45 = new Categories1("May I be with myself for a while?", "Taani tarkka takkashshoo, guutta wodees?",R.raw.record20210319190431);


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
        list.add(cata36);
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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main17Activity.this).nof_alldata();
        Toast.makeText(Main17Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 256){
            new DBAdarter(Main17Activity.this).saveAllData(cata1);
            new DBAdarter(Main17Activity.this).saveAllData(cata2);
            new DBAdarter(Main17Activity.this).saveAllData(cata3);
            new DBAdarter(Main17Activity.this).saveAllData(cata4);
            new DBAdarter(Main17Activity.this).saveAllData(cata5);
            new DBAdarter(Main17Activity.this).saveAllData(cata6);
            new DBAdarter(Main17Activity.this).saveAllData(cata7);
            new DBAdarter(Main17Activity.this).saveAllData(cata8);
            new DBAdarter(Main17Activity.this).saveAllData(cata9);
            new DBAdarter(Main17Activity.this).saveAllData(cata10);
            new DBAdarter(Main17Activity.this).saveAllData(cata11);
            new DBAdarter(Main17Activity.this).saveAllData(cata12);
            new DBAdarter(Main17Activity.this).saveAllData(cata13);
            new DBAdarter(Main17Activity.this).saveAllData(cata14);
            new DBAdarter(Main17Activity.this).saveAllData(cata15);
            new DBAdarter(Main17Activity.this).saveAllData(cata16);
            new DBAdarter(Main17Activity.this).saveAllData(cata17);
            new DBAdarter(Main17Activity.this).saveAllData(cata18);
            new DBAdarter(Main17Activity.this).saveAllData(cata19);
            new DBAdarter(Main17Activity.this).saveAllData(cata20);
            new DBAdarter(Main17Activity.this).saveAllData(cata21);
            new DBAdarter(Main17Activity.this).saveAllData(cata22);
            new DBAdarter(Main17Activity.this).saveAllData(cata23);
            new DBAdarter(Main17Activity.this).saveAllData(cata24);
            new DBAdarter(Main17Activity.this).saveAllData(cata25);
            new DBAdarter(Main17Activity.this).saveAllData(cata26);
            new DBAdarter(Main17Activity.this).saveAllData(cata27);
            new DBAdarter(Main17Activity.this).saveAllData(cata28);
            new DBAdarter(Main17Activity.this).saveAllData(cata29);
            new DBAdarter(Main17Activity.this).saveAllData(cata30);
            new DBAdarter(Main17Activity.this).saveAllData(cata31);
            new DBAdarter(Main17Activity.this).saveAllData(cata32);
            new DBAdarter(Main17Activity.this).saveAllData(cata33);
            new DBAdarter(Main17Activity.this).saveAllData(cata34);
            new DBAdarter(Main17Activity.this).saveAllData(cata35);
            new DBAdarter(Main17Activity.this).saveAllData(cata36);
            new DBAdarter(Main17Activity.this).saveAllData(cata37);
            new DBAdarter(Main17Activity.this).saveAllData(cata38);
            new DBAdarter(Main17Activity.this).saveAllData(cata39);
            new DBAdarter(Main17Activity.this).saveAllData(cata40);
            new DBAdarter(Main17Activity.this).saveAllData(cata41);
            new DBAdarter(Main17Activity.this).saveAllData(cata42);
            new DBAdarter(Main17Activity.this).saveAllData(cata43);
            new DBAdarter(Main17Activity.this).saveAllData(cata44);
            new DBAdarter(Main17Activity.this).saveAllData(cata45);
        }
    }
}

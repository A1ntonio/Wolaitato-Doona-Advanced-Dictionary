package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main34Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Introduction");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("INTRODUCING SOMEONE TO SOMEONE ELSE.\n\n\n- Have you met...before?", "Haagappe kase ... gayttaddi?", 0x7f0e0000);
        Categories1 cata2 = new Categories1("I would like you to meet...", "...gayttanadan koyayis.", 0x7f0e0001);
        Categories1 cata3 = new Categories1("Let me introduce you to...", "Ane nena erisayiys...", 0x7f0e0002);
        Categories1 cata4 = new Categories1("May I introduce you to ...", "... nena errissoo?", 0x7f0e0000);
        Categories1 cata5 = new Categories1("I don't think you have met...", "...eretiyako shin erike.", 0x7f0e0001);
        Categories1 cata6 = new Categories1("I would like you to meet my friend Elias...", "Ta laggiya Eliyasaara eretanaadan koyays... ", 0x7f0e0002);
        Categories1 cata7 = new Categories1("This is my friend Eyob.", "Hagee ta laggiyaa Eyoobba.", 0x7f0e0000);
        Categories1 cata8 = new Categories1("Elias, have you met Eyob?", "Eliasa, Eyobara gayttari/eretarri?", 0x7f0e0001);
        Categories1 cata9 = new Categories1("MORE OF INFORMAL EXPRESSIONS.\n\n\n- Do you two know each other?", "Innite naa'ay ereteeti?", 0x7f0e0000);
        Categories1 cata10 = new Categories1("Have you two been introduced?", "Initte naa'ay eretideeti?", 0x7f0e0002);
        Categories1 cata11 = new Categories1("Haven't you been introduced?", "Initte naa'ay erettibeeketi?", 0x7f0e0002);
        Categories1 cata12 = new Categories1("Oh, I'm sorry; how silly of me. This is Elias.", "Oh, haaka, aybba pattena ase ta. Hagee Elliyaasa.", 0x7f0e0002);
        Categories1 cata13 = new Categories1("Fana, Bini is the guy I was telling you about.", "Fanee, hagee bi'a biina ta neesi abbaa yooto bitaniya.", 0x7f0e0002);
        Categories1 cata14 = new Categories1("WHEN YOU HAVE JUST BEEN INTRODUCED TO SOMEONE.\n\n\n- Good to meet you.", "Neera gayttooge lo'o.", 0x7f0e0002);
        Categories1 cata15 = new Categories1("Nice meeting you.", "Gaytoogee lo'o.", 0x7f0e0002);
        Categories1 cata16 = new Categories1("I am happy to meet you.", "Neenara gayttooge ufayssisi.", 0x7f0e0002);
        Categories1 cata17 = new Categories1("Glad to meet you.", "Neenara gaytooge ufayssesi.", 0x7f0e0002);
        Categories1 cata18 = new Categories1("I am glad to meet you.", "Neenara gaytoogaw ufayitaasi.", 0x7f0e0002);
        Categories1 cata19 = new Categories1("AFTER EXPRESSING OUR GLADNESS OF INTRODUCING THAT PERSON.\n\n\n- Fana told me all about you.", "Faaniya neba mullebaaka tawu yootaasu.", 0x7f0e0002);
        Categories1 cata20 = new Categories1("I've heard so much about you. I feel I know you already.", "Nebaa loyyiita siyaasi. Ha'i neena erays ga qoppays.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("So we finally met face to face.", "Wurisettan ayfiyan gayttida.", 0x7f0e0002);
        Categories1 cata22 = new Categories1("WHEN WE FORGET THE NAME OF THE PERSON WHOM WE INTRODUCED TO.\n\n\n- I am sorry what was your name again?", "Attogane, ne suntta oona gaadisho?", 0x7f0e0002);
        Categories1 cata23 = new Categories1("I didn't catch your name.", "Ne sunttaa oykanna danddayabeke.", 0x7f0e0002);
        Categories1 cata24 = new Categories1("Oh sorry, I forgot your name.", "Atottetaa oychchays, ne suntta dogargas.", 0x7f0e0002);
        Categories1 cata25 = new Categories1("SELF INTRODUCING\n\n\n- Marry...(shaking hand)", "Meero...(kushiyan sarotayyda)", 0x7f0e0002);
        Categories1 cata26 = new Categories1("May I introduce my self? I am ...", "Taana erisoo? Taanii....", 0x7f0e0002);
        Categories1 cata27 = new Categories1("Let me introduce my self. I am...", "Tana erisays, Taanii...", 0x7f0e0002);
        Categories1 cata28 = new Categories1("Hello... My name is...", "Hallo...Ta sunttay...", 0x7f0e0002);
        Categories1 cata29 = new Categories1("EXPRESSIONS USED TO MAKE FRIENDS AT A BAR OR CAFE.\n\n\n- May join you?", "Nenaara walakkettoo?", 0x7f0e0002);
        Categories1 cata30 = new Categories1("Is this stool taken?", "Hagee barcummay oyqqetidde?", 0x7f0e0002);
        Categories1 cata31 = new Categories1("Is this seat taken?", "Hagee utiyoosay oykettidee?", 0x7f0e0002);
        Categories1 cata32 = new Categories1("Mind if I join you?", "Nenaara walaketiyaako qofissi?", 0x7f0e0002);


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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main34Activity.this).nof_alldata();
        Toast.makeText(Main34Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 995){
            new DBAdarter(Main34Activity.this).saveAllData(cata2);
            new DBAdarter(Main34Activity.this).saveAllData(cata3);
            new DBAdarter(Main34Activity.this).saveAllData(cata1);
            new DBAdarter(Main34Activity.this).saveAllData(cata4);
            new DBAdarter(Main34Activity.this).saveAllData(cata5);
            new DBAdarter(Main34Activity.this).saveAllData(cata6);
            new DBAdarter(Main34Activity.this).saveAllData(cata7);
            new DBAdarter(Main34Activity.this).saveAllData(cata8);
            new DBAdarter(Main34Activity.this).saveAllData(cata9);
            new DBAdarter(Main34Activity.this).saveAllData(cata10);
            new DBAdarter(Main34Activity.this).saveAllData(cata11);
            new DBAdarter(Main34Activity.this).saveAllData(cata12);
            new DBAdarter(Main34Activity.this).saveAllData(cata13);
            new DBAdarter(Main34Activity.this).saveAllData(cata14);
            new DBAdarter(Main34Activity.this).saveAllData(cata15);
            new DBAdarter(Main34Activity.this).saveAllData(cata16);
            new DBAdarter(Main34Activity.this).saveAllData(cata17);
            new DBAdarter(Main34Activity.this).saveAllData(cata18);
            new DBAdarter(Main34Activity.this).saveAllData(cata19);
            new DBAdarter(Main34Activity.this).saveAllData(cata20);
            new DBAdarter(Main34Activity.this).saveAllData(cata21);
            new DBAdarter(Main34Activity.this).saveAllData(cata22);
            new DBAdarter(Main34Activity.this).saveAllData(cata23);
            new DBAdarter(Main34Activity.this).saveAllData(cata24);
            new DBAdarter(Main34Activity.this).saveAllData(cata25);
            new DBAdarter(Main34Activity.this).saveAllData(cata26);
            new DBAdarter(Main34Activity.this).saveAllData(cata27);
            new DBAdarter(Main34Activity.this).saveAllData(cata28);
            new DBAdarter(Main34Activity.this).saveAllData(cata29);
            new DBAdarter(Main34Activity.this).saveAllData(cata30);
            new DBAdarter(Main34Activity.this).saveAllData(cata31);
            new DBAdarter(Main34Activity.this).saveAllData(cata32);
        }

    }
}

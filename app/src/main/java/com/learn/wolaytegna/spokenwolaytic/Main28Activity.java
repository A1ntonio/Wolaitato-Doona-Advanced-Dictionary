package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main28Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Asking for advice & Giving suggestion");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("Advice", "Zoriyaa", 0x7f0e0000);
        Categories1 cata2 = new Categories1("Adivise", "Zoriyoogaa", 0x7f0e0001);
        Categories1 cata3 = new Categories1("I advised her not to accept his invitation.", "A shoobiya ekkenaadan O ta zoraas.", 0x7f0e0002);
        Categories1 cata4 = new Categories1("He advised me repeatedly on my wrong deeds.", "Ta oottido balawu I tana zaari zaaridi zoriis.", 0x7f0e0000);
        Categories1 cata5 = new Categories1("The advice he gave me was very valuable.", "I taayyoo immido zoree keehi maaddiyabaa.", 0x7f0e0001);
        Categories1 cata6 = new Categories1("Mother usually advises me.", "Ta aayyiya tana ubbatoo zorawusu.", 0x7f0e0002);
        Categories1 cata7 = new Categories1("She rejected her friend's advice.", "A ba laggiyaa zoriya ekkukku.", 0x7f0e0000);
        Categories1 cata8 = new Categories1("SOME WAYS OF ASKING FOR ADVICE\n\n\n- Excuse me, what shall I do?", "Atotettaa oychchays ay oottiyaakko lo'o?", 0x7f0e0001);
        Categories1 cata9 = new Categories1("What do your advice me to do?", "Ay oottanaadan tana ne zoray?", 0x7f0e0000);
        Categories1 cata10 = new Categories1("What do you recommend me to...", "Neeni tawu ay qofaa immay hegan...?", 0x7f0e0002);
        Categories1 cata11 = new Categories1("How shall I do it?", "Hagaa ta waatada Oottoo?", 0x7f0e0002);
        Categories1 cata12 = new Categories1("When shall I do it?", "Hagaa ta awude Oottoo?", 0x7f0e0002);
        Categories1 cata13 = new Categories1("Where can I ...?", "Awan Oottanawu danddayiyaanaa...", 0x7f0e0002);
        Categories1 cata14 = new Categories1("Where should I ...?", "Awan ta...", 0x7f0e0002);
        Categories1 cata15 = new Categories1("Do you think I should...?", "Ta ay oottiyaakko lo'o ga qoppay?", 0x7f0e0002);
        Categories1 cata16 = new Categories1("Is it ok if I ...?", "Taani hagaadan oottiyaakko lo'o niyo misatii?", 0x7f0e0002);
        Categories1 cata17 = new Categories1("Could you give me some advice about ...+ ing?", "Hagaabawu guutta zoriya tawu immuutee?", 0x7f0e0002);
        Categories1 cata18 = new Categories1("Shall/Should report this to the police?", "Hgaa xaaciyawu erissoo?", 0x7f0e0002);
        Categories1 cata19 = new Categories1("Shall/ Should use a force?", "Wolqqan go'ettoo?", 0x7f0e0002);
        Categories1 cata20 = new Categories1("Shall/Should tell the truth?", "Tumaa yootoo?", 0x7f0e0002);
        Categories1 cata21 = new Categories1("GIVING SUGGESTIONS OR OPINIONS.\n\n\n- I would advise you to ....", "Nena ta zoriyoy...", 0x7f0e0002);
        Categories1 cata22 = new Categories1("You better do this.", "Neeni hagaa loytta ootta!", 0x7f0e0002);
        Categories1 cata23 = new Categories1("You better not do that again", "Neeni hegaa naa'antto hagaadan oottennaakko lo'oshin", 0x7f0e0002);
        Categories1 cata24 = new Categories1("I think you shouldn't.......", "Ta qoppiyo mala neeni hagaa...Oottennaakko lo'o", 0x7f0e0002);
        Categories1 cata25 = new Categories1("I advice you to ...", "Taani nena zoriyoy....", 0x7f0e0002);
        Categories1 cata26 = new Categories1("You must.....", "Neeni .... oottana bessaasa.", 0x7f0e0002);
        Categories1 cata27 = new Categories1("I advise you not to ....", "Neeni hagaadan oottennaadan ta zoriyoy...", 0x7f0e0002);
        Categories1 cata28 = new Categories1("Don't.....", "....Oottoppa.", 0x7f0e0002);
        Categories1 cata29 = new Categories1("You mustn't ....", "Neeni oottana bessennabay...", 0x7f0e0002);
        Categories1 cata30 = new Categories1("You ought to .....", "....oottana bessaasa", 0x7f0e0002);
        Categories1 cata31 = new Categories1("INDIRECT SUGGESTIONS\n\n\n- How about ....?", "Waatada hagaabaa...?", 0x7f0e0002);
        Categories1 cata32 = new Categories1("What about ....?", "Aybissi Hagaabaa...?", 0x7f0e0002);
        Categories1 cata33 = new Categories1("Don't you think.....", "....masatenne?", 0x7f0e0002);
        Categories1 cata34 = new Categories1("Why don't you.....?","Ayssi neeni ....?", 0x7f0e0002);
        Categories1 cata35 = new Categories1("I think you should ....", "Ta qoppiyo mala ne...?", 0x7f0e0002);
        Categories1 cata36 = new Categories1("If I were you, I would't ....", "Ta nena gidiyabaa gidiyaakko...", 0x7f0e0002);


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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main28Activity.this).nof_alldata();
        Toast.makeText(Main28Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 756){
            new DBAdarter(Main28Activity.this).saveAllData(cata1);
            new DBAdarter(Main28Activity.this).saveAllData(cata2);
            new DBAdarter(Main28Activity.this).saveAllData(cata3);
            new DBAdarter(Main28Activity.this).saveAllData(cata4);
            new DBAdarter(Main28Activity.this).saveAllData(cata5);
            new DBAdarter(Main28Activity.this).saveAllData(cata6);
            new DBAdarter(Main28Activity.this).saveAllData(cata7);
            new DBAdarter(Main28Activity.this).saveAllData(cata8);
            new DBAdarter(Main28Activity.this).saveAllData(cata9);
            new DBAdarter(Main28Activity.this).saveAllData(cata10);
            new DBAdarter(Main28Activity.this).saveAllData(cata11);
            new DBAdarter(Main28Activity.this).saveAllData(cata12);
            new DBAdarter(Main28Activity.this).saveAllData(cata13);
            new DBAdarter(Main28Activity.this).saveAllData(cata14);
            new DBAdarter(Main28Activity.this).saveAllData(cata15);
            new DBAdarter(Main28Activity.this).saveAllData(cata16);
            new DBAdarter(Main28Activity.this).saveAllData(cata17);
            new DBAdarter(Main28Activity.this).saveAllData(cata18);
            new DBAdarter(Main28Activity.this).saveAllData(cata19);
            new DBAdarter(Main28Activity.this).saveAllData(cata20);
            new DBAdarter(Main28Activity.this).saveAllData(cata21);
            new DBAdarter(Main28Activity.this).saveAllData(cata22);
            new DBAdarter(Main28Activity.this).saveAllData(cata23);
            new DBAdarter(Main28Activity.this).saveAllData(cata24);
            new DBAdarter(Main28Activity.this).saveAllData(cata25);
            new DBAdarter(Main28Activity.this).saveAllData(cata26);
            new DBAdarter(Main28Activity.this).saveAllData(cata27);
            new DBAdarter(Main28Activity.this).saveAllData(cata28);
            new DBAdarter(Main28Activity.this).saveAllData(cata29);
            new DBAdarter(Main28Activity.this).saveAllData(cata30);
            new DBAdarter(Main28Activity.this).saveAllData(cata31);
            new DBAdarter(Main28Activity.this).saveAllData(cata32);
            new DBAdarter(Main28Activity.this).saveAllData(cata33);
            new DBAdarter(Main28Activity.this).saveAllData(cata34);
            new DBAdarter(Main28Activity.this).saveAllData(cata35);
            new DBAdarter(Main28Activity.this).saveAllData(cata36);
        }
    }
}

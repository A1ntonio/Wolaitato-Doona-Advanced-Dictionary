package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main31Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Bored Expression");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("EXPRESSING THAT OUR JOB IS BORING\n\n\n- I am getting bored of it.", "Ha yohoy tana salettis.", 0x7f0e0000);
        Categories1 cata2 = new Categories1("I'm doing the same shit over and over again.", "Issi oosiyo zaaretta zaarettada oottiyogee salettis.", 0x7f0e0001);
        Categories1 cata3 = new Categories1("I have a monotonous life.", "Tana ta de'oy iitees(salettes).", 0x7f0e0002);
        Categories1 cata4 = new Categories1("My work dosn't interest mw.", "Ta oosoy tana ufayssenna.", 0x7f0e0000);
        Categories1 cata5 = new Categories1("EXPRESSING OUR BORED FEELING.\n\n\n- I'm bored.", "Tana salettis", 0x7f0e0001);
        Categories1 cata6 = new Categories1("I'm bored silly.", "Tana mule iitees.", 0x7f0e0002);
        Categories1 cata7 = new Categories1("I'm bored to tears.", "Tana iitees, yeekka yeekka gees.", 0x7f0e0000);
        Categories1 cata8 = new Categories1("I'm bored to death.", "Tana saletay worees.", 0x7f0e0001);
        Categories1 cata9 = new Categories1("I'm feeling dull.", "Tana iitees.", 0x7f0e0000);
        Categories1 cata10 = new Categories1("I'm feeling down.", "Tana iitees.", 0x7f0e0002);
        Categories1 cata11 = new Categories1("I'm feeling blue.", "Tana keehippe iiti uttiis.", 0x7f0e0002);
        Categories1 cata12 = new Categories1("EXPRESSING OTHERS BORING\n\n\n- He's personality is very boring.", "A asummay iitees. Lo'o asa eeshshi assi baa.", 0x7f0e0002);
        Categories1 cata13 = new Categories1("It's boring whenever he's around.", "I nunaara de'iyo wode iitees.", 0x7f0e0002);
        Categories1 cata14 = new Categories1("He's a boring person.", "I salettiya asa.", 0x7f0e0002);
        Categories1 cata15 = new Categories1("EXPRESSING THAT OUR FEELING NOT ACCEPT\n\n\n- I'm so bored today.", "Tana hachchi keehippe iitees.", 0x7f0e0002);
        Categories1 cata16 = new Categories1("I'm dying from boredom.", "Aybakko tana iitidi worees.", 0x7f0e0002);
        Categories1 cata17 = new Categories1("I get bored very easily.", "Tana eesuwan salettigees.", 0x7f0e0002);
        Categories1 cata18 = new Categories1("I'm usually bored all weekend.", "Tana ubbattoo sambbata gallassatun iitees.", 0x7f0e0002);
        Categories1 cata19 = new Categories1("My life is so boring.", "Ta duussay ayba iiti!", 0x7f0e0002);
        Categories1 cata20 = new Categories1("That sounds so boring.", "Hegee keehi iitiyabaa.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("RESPONSE FOR BORED PERSON\n\n\n- Don't be grouchy.", "Gigga ne ganccaroppa.", 0x7f0e0002);
        Categories1 cata22 = new Categories1("Stop pouting.", "Ganccariya essa!", 0x7f0e0002);
        Categories1 cata23 = new Categories1("Stop gripping.", "Ganccariya agga.", 0x7f0e0002);
        Categories1 cata24 = new Categories1("ASKING SOMEONE WHY HE/SHE BORED.\n\n\n- Something got you down?", "Issibay yilloyi wottenan aggenna nena.", 0x7f0e0002);
        Categories1 cata25 = new Categories1("Why are you so blue?", "Aybissi lanccadii?", 0x7f0e0002);
        Categories1 cata26 = new Categories1("What's got you down?", "Aybe nena lanccissiday?", 0x7f0e0002);
        Categories1 cata27 = new Categories1("Why is your face so long?", "Ne sinttay neeni yillotidoogaa erissees.", 0x7f0e0002);
        Categories1 cata28 = new Categories1("YOU CAN EXPRESS BORING LIKE THIS\n\n\n- I'm depressed", "Tana deexettees/iitees/Akali oottees", 0x7f0e0002);
        Categories1 cata29 = new Categories1("I'm feeling down.", "Tana iitees.", 0x7f0e0002);
        Categories1 cata30 = new Categories1("What a yawner!", "Ayba iitiyaabee!", 0x7f0e0002);
        Categories1 cata31 = new Categories1("What a wet blanket you are.", "Neeni ayba salettiy asee.", 0x7f0e0002);
        Categories1 cata32 = new Categories1("Today is a boring day.", "Hachchi sa'ay iitiya gallassa.", 0x7f0e0002);


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

        int num = new DBAdarter(Main31Activity.this).nof_alldata();
        Toast.makeText(Main31Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 873){
            new DBAdarter(Main31Activity.this).saveAllData(cata1);
            new DBAdarter(Main31Activity.this).saveAllData(cata2);
            new DBAdarter(Main31Activity.this).saveAllData(cata3);
            new DBAdarter(Main31Activity.this).saveAllData(cata4);
            new DBAdarter(Main31Activity.this).saveAllData(cata5);
            new DBAdarter(Main31Activity.this).saveAllData(cata6);
            new DBAdarter(Main31Activity.this).saveAllData(cata7);
            new DBAdarter(Main31Activity.this).saveAllData(cata8);
            new DBAdarter(Main31Activity.this).saveAllData(cata9);
            new DBAdarter(Main31Activity.this).saveAllData(cata10);
            new DBAdarter(Main31Activity.this).saveAllData(cata11);
            new DBAdarter(Main31Activity.this).saveAllData(cata12);
            new DBAdarter(Main31Activity.this).saveAllData(cata13);
            new DBAdarter(Main31Activity.this).saveAllData(cata14);
            new DBAdarter(Main31Activity.this).saveAllData(cata15);
            new DBAdarter(Main31Activity.this).saveAllData(cata16);
            new DBAdarter(Main31Activity.this).saveAllData(cata17);
            new DBAdarter(Main31Activity.this).saveAllData(cata18);
            new DBAdarter(Main31Activity.this).saveAllData(cata19);
            new DBAdarter(Main31Activity.this).saveAllData(cata20);
            new DBAdarter(Main31Activity.this).saveAllData(cata21);
            new DBAdarter(Main31Activity.this).saveAllData(cata22);
            new DBAdarter(Main31Activity.this).saveAllData(cata23);
            new DBAdarter(Main31Activity.this).saveAllData(cata24);
            new DBAdarter(Main31Activity.this).saveAllData(cata25);
            new DBAdarter(Main31Activity.this).saveAllData(cata26);
            new DBAdarter(Main31Activity.this).saveAllData(cata27);
            new DBAdarter(Main31Activity.this).saveAllData(cata28);
            new DBAdarter(Main31Activity.this).saveAllData(cata29);
            new DBAdarter(Main31Activity.this).saveAllData(cata30);
            new DBAdarter(Main31Activity.this).saveAllData(cata31);
            new DBAdarter(Main31Activity.this).saveAllData(cata32);
        }

    }
}

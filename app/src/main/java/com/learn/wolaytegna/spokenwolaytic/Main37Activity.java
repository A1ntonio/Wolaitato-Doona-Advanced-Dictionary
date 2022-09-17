package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main37Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("At work");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("EXPRESSING THAT WE ARE BUSY IN WORK", "OOSUWA BOLLI NU KEEHIPPE UN'ETTIDOOGA QONCCISSIYOODE", 0x7f0e0000);
        Categories1 cata2 = new Categories1("- I'm up to my neck in work", "Tawu oosoy qooriya gakkiis.", 0x7f0e0001);
        Categories1 cata3 = new Categories1("- I'm busy as bees", "Mattaadan jaamaydda de'ays.", 0x7f0e0002);
        Categories1 cata4 = new Categories1("- I'm so tied up.", "Pude shemppiyoossi baa.", 0x7f0e0000);
        Categories1 cata5 = new Categories1("- I've got a pretty tight schedule today!", "Keehippe un'o wodee tawu dees.", 0x7f0e0001);
        Categories1 cata6 = new Categories1("- I've no time to breathe", "Shemppo xaya uttaas.", 0x7f0e0002);
        Categories1 cata7 = new Categories1("EXPRESSING THAT A WORK IS IMMEDIATE", "HA OOSOY EESO GIDIYOGAA YOOTANAWU", 0x7f0e0000);
        Categories1 cata8 = new Categories1("- I need it immediately", "Eesuwan koyyas.", 0x7f0e0001);
        Categories1 cata9 = new Categories1("- I need it now.", "Ha'i koyyays", 0x7f0e0000);
        Categories1 cata10 = new Categories1("- I need it in a jiffy", "Ha'i eesuwan koyyays", 0x7f0e0002);
        Categories1 cata11 = new Categories1("- I need it in flash", "Eesuwan koyyays", 0x7f0e0002);
        Categories1 cata12 = new Categories1("- Hurry up!", "Ellella", 0x7f0e0002);
        Categories1 cata13 = new Categories1("- Get with it", "Ee so ya", 0x7f0e0002);
        Categories1 cata14 = new Categories1("- Get moving", "Ee so ya", 0x7f0e0002);
        Categories1 cata15 = new Categories1("- Look a live!", "Elle elle", 0x7f0e0002);
        Categories1 cata16 = new Categories1("- Double time!", "Dakko eesuwan", 0x7f0e0002);
        Categories1 cata17 = new Categories1("- Snap to it!", "Ee so ya", 0x7f0e0002);
        Categories1 cata18 = new Categories1("- Chop, chop!", "Elle elle", 0x7f0e0002);
        Categories1 cata19 = new Categories1("- Shake a leg!", "Waaxi waaxa", 0x7f0e0002);
        Categories1 cata20 = new Categories1("- Go!", "Eesuwan eesuwan", 0x7f0e0002);
        Categories1 cata21 = new Categories1("EXPRESSING EASY WORK", "NU OOTTIYOODE KAWUSHSHA GIDIYA OOSOTA QONCCISSIYA OGETA", 0x7f0e0002);
        Categories1 cata22 = new Categories1("- It's as easy as ABC", "ABC pitaliyaadan kawushsha.", 0x7f0e0002);
        Categories1 cata23 = new Categories1("- No sweat!", "Aynne daafurssenna", 0x7f0e0002);
        Categories1 cata24 = new Categories1("- I could do that in my sleep", "Xiskkadakka oottana danddayays", 0x7f0e0002);
        Categories1 cata25 = new Categories1("- It's like breathing", "Carkko mala", 0x7f0e0002);
        Categories1 cata26 = new Categories1("- It's a piece of cake!", "Keehi kawushsha", 0x7f0e0002);
        Categories1 cata27 = new Categories1("- You could do it with your eyes closed!", "Ayfiya qilmmadakka oottana danddayays", 0x7f0e0002);
        Categories1 cata28 = new Categories1("EXPRESSIONS FOR WHO DO NOT WANT TO TRY TO WORK", "OOTTIMALANAADAN KOYYENNA ASSAS GIYO QONCCISSOTA", 0x7f0e0002);
        Categories1 cata29 = new Categories1("- No pain no gain.", "Daafurennan aybinne beetenna", 0x7f0e0002);
        Categories1 cata30 = new Categories1("- Just give it a try!", "Ane ootta mala", 0x7f0e0002);
        Categories1 cata31 = new Categories1("- Come on! You can do it!", "Oota! Danddayaasa!", 0x7f0e0002);
        Categories1 cata32 = new Categories1("- Come on!", "Oota ane!", 0x7f0e0002);
        Categories1 cata33 = new Categories1("- See what you can do!", "Ane mala be'a", 0x7f0e0002);
        Categories1 cata34 = new Categories1("- Try your luck!", "Ne qaadaa mala!", 0x7f0e0002);
        Categories1 cata35 = new Categories1("EXPRESSIONS TO SAY 'GOOD JOB'", "OOSANCHCHAA GALATANAWU WOYKKO MINTTETTANAWU NU KOYYIYOODE", 0x7f0e0002);
        Categories1 cata36 = new Categories1("- Nice job!", "Keehi lo'o ooso!", 0x7f0e0002);
        Categories1 cata37 = new Categories1("- You keep this up!", "Goobay hagaadan ootta", 0x7f0e0002);
        Categories1 cata38 = new Categories1("- Good work!", "Lo'o ooso", 0x7f0e0002);
        Categories1 cata39 = new Categories1("- Very impressive!", "Keehippe malaaliya ooso", 0x7f0e0002);
        Categories1 cata40 = new Categories1("- Keep it up!", "Minna sinttanawukka hagaadan ootta.", 0x7f0e0002);
        Categories1 cata41 = new Categories1("- We are pleased with your work!", "Ne oosuwan ufayttida.", 0x7f0e0002);
        Categories1 cata42 = new Categories1("EXPRESSING THAT OUR JOB IS NOT EASY", "NU OOSOY KAWUSHSHA GIDENNAAGAA QONCCISSANAWU", 0x7f0e0002);
        Categories1 cata43 = new Categories1("- It's not as easy as it seems", "Nu xeelliyogaadan kawushsha gidenna.", 0x7f0e0002);
        Categories1 cata44 = new Categories1("- Easier said than done.", "Be'iyoode lo'iyoori mala gidenna.", 0x7f0e0002);
        Categories1 cata45 = new Categories1("- It's not as easy as it looks.", "Xeelliyoode laafa milateeshin gidenna.", 0x7f0e0002);
        Categories1 cata46 = new Categories1("- It's harder than you think.", "Ne qoppiyoogaadan kawushsha gidenna.", 0x7f0e0002);
        Categories1 cata47 = new Categories1("EXPRESSING THAT WE HAVE A KNOWLEDGE ON THAT JOB", "ISSI OOSUWA LOYTTIDI ERIYOGAANNE HE OOSUWAWU NUUSSI MEEZEE DE'IYOOGAA YOOTANAWU.", 0x7f0e0002);
        Categories1 cata48 = new Categories1("- I know that inside out.", "Ubbabaakka loytta erays.", 0x7f0e0002);
        Categories1 cata49 = new Categories1("- I know that theory like the back of my hand.", "Ta kushiya gomppaadan geeshshada erays.", 0x7f0e0002);
        Categories1 cata50 = new Categories1("- I'm an old hand on that.", "Ha allaalliyawu tawu gita meezee de'es.", 0x7f0e0002);
        Categories1 cata51 = new Categories1("- I can perform those steps with my eyes closed.", "Ayfiya qilimmada oottana dandayays.", 0x7f0e0002);
        Categories1 cata52 = new Categories1("- I know each step by heart.", "Ubbaakka ta wozanan erays.", 0x7f0e0002);


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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);


        int num = new DBAdarter(Main37Activity.this).nof_alldata();
        Toast.makeText(Main37Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 1144){
            new DBAdarter(Main37Activity.this).saveAllData(cata1);
            new DBAdarter(Main37Activity.this).saveAllData(cata2);
            new DBAdarter(Main37Activity.this).saveAllData(cata3);
            new DBAdarter(Main37Activity.this).saveAllData(cata4);
            new DBAdarter(Main37Activity.this).saveAllData(cata5);
            new DBAdarter(Main37Activity.this).saveAllData(cata6);
            new DBAdarter(Main37Activity.this).saveAllData(cata7);
            new DBAdarter(Main37Activity.this).saveAllData(cata8);
            new DBAdarter(Main37Activity.this).saveAllData(cata9);
            new DBAdarter(Main37Activity.this).saveAllData(cata10);
            new DBAdarter(Main37Activity.this).saveAllData(cata11);
            new DBAdarter(Main37Activity.this).saveAllData(cata12);
            new DBAdarter(Main37Activity.this).saveAllData(cata13);
            new DBAdarter(Main37Activity.this).saveAllData(cata14);
            new DBAdarter(Main37Activity.this).saveAllData(cata15);
            new DBAdarter(Main37Activity.this).saveAllData(cata16);
            new DBAdarter(Main37Activity.this).saveAllData(cata17);
            new DBAdarter(Main37Activity.this).saveAllData(cata18);
            new DBAdarter(Main37Activity.this).saveAllData(cata19);
            new DBAdarter(Main37Activity.this).saveAllData(cata20);
            new DBAdarter(Main37Activity.this).saveAllData(cata21);
            new DBAdarter(Main37Activity.this).saveAllData(cata22);
            new DBAdarter(Main37Activity.this).saveAllData(cata23);
            new DBAdarter(Main37Activity.this).saveAllData(cata24);
            new DBAdarter(Main37Activity.this).saveAllData(cata25);
            new DBAdarter(Main37Activity.this).saveAllData(cata26);
            new DBAdarter(Main37Activity.this).saveAllData(cata27);
            new DBAdarter(Main37Activity.this).saveAllData(cata28);
            new DBAdarter(Main37Activity.this).saveAllData(cata29);
            new DBAdarter(Main37Activity.this).saveAllData(cata30);
            new DBAdarter(Main37Activity.this).saveAllData(cata31);
            new DBAdarter(Main37Activity.this).saveAllData(cata32);
            new DBAdarter(Main37Activity.this).saveAllData(cata33);
            new DBAdarter(Main37Activity.this).saveAllData(cata34);
            new DBAdarter(Main37Activity.this).saveAllData(cata35);
            new DBAdarter(Main37Activity.this).saveAllData(cata36);
            new DBAdarter(Main37Activity.this).saveAllData(cata37);
            new DBAdarter(Main37Activity.this).saveAllData(cata38);
            new DBAdarter(Main37Activity.this).saveAllData(cata39);
            new DBAdarter(Main37Activity.this).saveAllData(cata40);
            new DBAdarter(Main37Activity.this).saveAllData(cata41);
            new DBAdarter(Main37Activity.this).saveAllData(cata42);
            new DBAdarter(Main37Activity.this).saveAllData(cata43);
            new DBAdarter(Main37Activity.this).saveAllData(cata44);
            new DBAdarter(Main37Activity.this).saveAllData(cata45);
            new DBAdarter(Main37Activity.this).saveAllData(cata46);
            new DBAdarter(Main37Activity.this).saveAllData(cata47);
            new DBAdarter(Main37Activity.this).saveAllData(cata48);
            new DBAdarter(Main37Activity.this).saveAllData(cata49);
            new DBAdarter(Main37Activity.this).saveAllData(cata50);
            new DBAdarter(Main37Activity.this).saveAllData(cata51);
            new DBAdarter(Main37Activity.this).saveAllData(cata52);
        }
    }
}

package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main22Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Asking for Permission");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("THE FORMAL WAY OF ASKING FOR PERMISSION\n\n\n- Excuse me, could I ...?", "-Ta danddayiyaanaa? ...", R.raw.record20210321195821);
        Categories1 cata2 = new Categories1("Could I possibly ... ?", "-Ta danddayiyaanaa? ...", R.raw.record20210321195826);
        Categories1 cata3 = new Categories1("Would you ... ?", "-Ne paqqaduutee?", R.raw.record20210321195833);
        Categories1 cata4 = new Categories1("Would you mind ...?", "-Tawu paqqadiyaakko nena lanccissanee?", R.raw.record20210321195844);
        Categories1 cata5 = new Categories1("Would you mind if I...? (+ past tense)", "-Nena lanccissi ta... gidiyaakko?", R.raw.record20210321195854);
        Categories1 cata6 = new Categories1("Do you think I could ...?", "-Ta oottanaagaa ne qoppay?", R.raw.record20210321195903);
        Categories1 cata7 = new Categories1("Do you mind if I ...?", "-Ta hegaa oottiyaakko lanccissi?", R.raw.record20210321195913);
        Categories1 cata8 = new Categories1("May I ....?", "-Ta oottana danddayanee?", R.raw.record20210321195954);
        Categories1 cata9 = new Categories1("INFORMAL WAY OF ASKING FOR PERMISSION\n\n\n- Can I...?", "... ta danddayanee..", R.raw.record20210321200002);
        Categories1 cata10 = new Categories1("Is it all right if I...?", "...Ta oottikko nena iitanee?", R.raw.record20210321200009);
        Categories1 cata11 = new Categories1("Ok if I...?", "Ahaa tayyoo...danddayetanee?", R.raw.record20210321200030);
        Categories1 cata12 = new Categories1("Mind if I...?", "Tana gidiyaakko... nena lanccissanee?", R.raw.record20210321200044);
        Categories1 cata13 = new Categories1("Can I ask you something?", "Issibaa oychchana danddayiyanaa?", R.raw.record20210321200058);
        Categories1 cata14 = new Categories1("There is something I wanted to ask you..", "Hegan issi ta nena oychchana koyyidobay...", R.raw.record20210321200109);
        Categories1 cata15 = new Categories1("Yes, what is it?", "Ee, aybee i?", R.raw.record20210321200116);
        Categories1 cata16 = new Categories1("ACCEPTING / GRANTING THE PERMISSION\n\n\n- Sure", "Loyttada", R.raw.record20210321200121);
        Categories1 cata17 = new Categories1("Yes, ...", "Ee...", R.raw.record20210321200124);
        Categories1 cata18 = new Categories1("Yes of course,", "Ee tuma", R.raw.record20210321200128);
        Categories1 cata19 = new Categories1("Yes, certainly", "Ee tuma", R.raw.record20210321200314);
        Categories1 cata20 = new Categories1("Go ahead", "Keehippe loyttada", R.raw.record20210321200326);
        Categories1 cata21 = new Categories1("Ok, all right", "Ero ba dooma", R.raw.record20210321200332);
        Categories1 cata22 = new Categories1("Not at all,", "Ero maayaas", R.raw.record20210321200336);
        Categories1 cata23 = new Categories1("No, I don't mind", "Metoy baa", R.raw.record20210321200342);
        Categories1 cata24 = new Categories1("No, that's alright", "Aynne baa aynne lanccikke", R.raw.record20210321200348);
        Categories1 cata25 = new Categories1("Certainly, please do", "Hayyannaa tuma ootta", R.raw.record20210321200355);
        Categories1 cata26 = new Categories1("With pleasure", "Ufayssan", R.raw.record20210321200404);
        Categories1 cata27 = new Categories1("By all means", "Ubba ogiyankka", R.raw.record20210321200411);
        Categories1 cata28 = new Categories1("That's fine", "Hegee lo'o", R.raw.record20210321200415);
        Categories1 cata29 = new Categories1("That's alright", "Hegee lo'o", R.raw.record20210321200415);
        Categories1 cata30 = new Categories1("You may", "Ne danddaynee?", R.raw.record20210321200422);
        Categories1 cata31 = new Categories1("Of course.", "Loyttada", R.raw.record20210321200427);
        Categories1 cata32 = new Categories1("REFUSUAL OF PERMISSION(+ REASON IF NECESSARY)\n\n\n- No", "Danddayettenna",R.raw.record20210321200431 );
        Categories1 cata33 = new Categories1("No, I couldn't", "Baa danddaykke", R.raw.record20210321200436);
        Categories1 cata34 = new Categories1("No, I'm afraid not", "Ay danddayiyabaa milatenna", R.raw.record20210321200450);
        Categories1 cata35 = new Categories1("No, I'm sorry, I can't", "Ta azzanays danddayiyabaa milatenna", R.raw.record20210321200457);
        Categories1 cata36 = new Categories1("No, I'd rather you didn't.", "Agga ta danddaykke ne tana metennaakko lo'o", R.raw.record20210321200511);
        Categories1 cata37 = new Categories1("I'm afraid I can't I'll be", "Atotettaa oychchays ta danddayiyabaa milatenna.", R.raw.record20210321200522);
        Categories1 cata38 = new Categories1("I'm sorry, I can't it is...", "Taani azzanays, hegaa danddaykke...", R.raw.record20210321200529);
        Categories1 cata39 = new Categories1("Sorry but,...", "Azzanayshin...", R.raw.record20210321200539);
        Categories1 cata40 = new Categories1("Yes, I do mind", "Ee tana lanccissees",R.raw.record20210321200549 );
        Categories1 cata41 = new Categories1("You may not", "Niyo hanenna", R.raw.record20210321200554);
        Categories1 cata42 = new Categories1("I do mind", "Tana lanccissees", R.raw.record20210321200559);
        Categories1 cata43 = new Categories1("I'm afraid I can't help you", "Atotettaa oychchays nena maaddana danddaykke", R.raw.record20210321200606);
        Categories1 cata44 = new Categories1("I'm very sorry, but...", "Keehippe azzanays shin...", R.raw.record20210321200614);
        Categories1 cata45 = new Categories1("HESITATION (+ REASON)\n\n\n- Well, actually ...", "Lo'o tuma gidikko ...", R.raw.record20210321200620);



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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);


        int num = new DBAdarter(Main22Activity.this).nof_alldata();
        Toast.makeText(Main22Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 514){
            new DBAdarter(Main22Activity.this).saveAllData(cata1);
            new DBAdarter(Main22Activity.this).saveAllData(cata2);
            new DBAdarter(Main22Activity.this).saveAllData(cata3);
            new DBAdarter(Main22Activity.this).saveAllData(cata4);
            new DBAdarter(Main22Activity.this).saveAllData(cata5);
            new DBAdarter(Main22Activity.this).saveAllData(cata6);
            new DBAdarter(Main22Activity.this).saveAllData(cata7);
            new DBAdarter(Main22Activity.this).saveAllData(cata8);
            new DBAdarter(Main22Activity.this).saveAllData(cata9);
            new DBAdarter(Main22Activity.this).saveAllData(cata10);
            new DBAdarter(Main22Activity.this).saveAllData(cata11);
            new DBAdarter(Main22Activity.this).saveAllData(cata12);
            new DBAdarter(Main22Activity.this).saveAllData(cata13);
            new DBAdarter(Main22Activity.this).saveAllData(cata14);
            new DBAdarter(Main22Activity.this).saveAllData(cata15);
            new DBAdarter(Main22Activity.this).saveAllData(cata16);
            new DBAdarter(Main22Activity.this).saveAllData(cata17);
            new DBAdarter(Main22Activity.this).saveAllData(cata18);
            new DBAdarter(Main22Activity.this).saveAllData(cata19);
            new DBAdarter(Main22Activity.this).saveAllData(cata20);
            new DBAdarter(Main22Activity.this).saveAllData(cata21);
            new DBAdarter(Main22Activity.this).saveAllData(cata22);
            new DBAdarter(Main22Activity.this).saveAllData(cata23);
            new DBAdarter(Main22Activity.this).saveAllData(cata24);
            new DBAdarter(Main22Activity.this).saveAllData(cata25);
            new DBAdarter(Main22Activity.this).saveAllData(cata26);
            new DBAdarter(Main22Activity.this).saveAllData(cata27);
            new DBAdarter(Main22Activity.this).saveAllData(cata28);
            new DBAdarter(Main22Activity.this).saveAllData(cata29);
            new DBAdarter(Main22Activity.this).saveAllData(cata30);
            new DBAdarter(Main22Activity.this).saveAllData(cata31);
            new DBAdarter(Main22Activity.this).saveAllData(cata32);
            new DBAdarter(Main22Activity.this).saveAllData(cata33);
            new DBAdarter(Main22Activity.this).saveAllData(cata34);
            new DBAdarter(Main22Activity.this).saveAllData(cata35);
            new DBAdarter(Main22Activity.this).saveAllData(cata36);
            new DBAdarter(Main22Activity.this).saveAllData(cata37);
            new DBAdarter(Main22Activity.this).saveAllData(cata38);
            new DBAdarter(Main22Activity.this).saveAllData(cata39);
            new DBAdarter(Main22Activity.this).saveAllData(cata40);
            new DBAdarter(Main22Activity.this).saveAllData(cata41);
            new DBAdarter(Main22Activity.this).saveAllData(cata42);
            new DBAdarter(Main22Activity.this).saveAllData(cata43);
            new DBAdarter(Main22Activity.this).saveAllData(cata44);
            new DBAdarter(Main22Activity.this).saveAllData(cata45);
        }

    }
}

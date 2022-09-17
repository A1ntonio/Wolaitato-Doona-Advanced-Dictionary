package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main23Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("School Encounters");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("GETTING READY TO STUDY OR DO HOMEWORK\n\n\n- Time to-open the book", "Maxaafaa dooyananays", R.raw.record20210321201007);
        Categories1 cata2 = new Categories1("Time to hit the books to use", "Maxaafaa nabbabanaanays", R.raw.record20210321201013);
        Categories1 cata3 = new Categories1("I have a lot of studying to do", "Ta xan'anawu daroobay de'ees", R.raw.record20210321201020);
        Categories1 cata4 = new Categories1("I have to study", "Ta xan'ana bessees", R.raw.record20210321201030);
        Categories1 cata5 = new Categories1("I hava midterm tomorrow", "Tawu wontto laytta baggaa paacce de'ees", R.raw.record20210321201110);
        Categories1 cata6 = new Categories1("I have got a midterm tomorrow", "Tawu wontto paaccee de'ees", R.raw.record20210321201121);
        Categories1 cata7 = new Categories1("I have got a big examp this Friday.", "Ha saamintaa wurssettan tawu paaccee de'ees.", R.raw.record20210321201212);
        Categories1 cata8 = new Categories1("ASKING ABOUT CLASSROOM EXAMINATIONS\n\n\n- Whan is the final exam?", "Wogga paacce awudee?", R.raw.record20210321201218);
        Categories1 cata9 = new Categories1("When is the mid term?", "Bagga laytta paacee awudee?", R.raw.record20210321201226);
        Categories1 cata10 = new Categories1("What will the test cover?", "Paacee awugaa gakkanawu yii?", R.raw.record20210321201236);
        Categories1 cata11 = new Categories1("Will there be a review session?", "Paacee kase bakka layttaagaa oyqqii?", R.raw.record20210321201255);
        Categories1 cata12 = new Categories1("What is on the test?", "Qeeri paacee ay oyqqii?", R.raw.record20210321201303);
        Categories1 cata13 = new Categories1("RETURNING TO SCHOOL AFTER AN ABSENCE\n\n\n- Do you have a note from home?", "So asaappe ehiido piqaadee niyo de'ii?", R.raw.record20210321201311);
        Categories1 cata14 = new Categories1("Do you have a note from your mother?", "ne aayeeppe ehiido piqaadee niyo de'ii?", R.raw.record20210321201319);
        Categories1 cata15 = new Categories1("Do you have a note from your doctor?", "Aakimiyaappe ehiido markka woraqatay niyo de'ii?", R.raw.record20210321201328);
        Categories1 cata16 = new Categories1("ASKING ABOUT A CLASSROOM ASSIGNMENT\n\n\n- How many pages do we have to read for Monday?", "Ne saga galla nabbabanawu aappun maxaafaa sinttay de'ii?",R.raw.record20210321201350);
        Categories1 cata17 = new Categories1("How many pages?", "Aappun sinttatee?", R.raw.record20210321201403);
        Categories1 cata18 = new Categories1("What is the reading assignment for next time?", "Kaalliya wodiyan nu nabbabiyo so oosoy aybee?", R.raw.record20210321201411);
        Categories1 cata19 = new Categories1("Will there be a quiz?", "Qeeri paacee nuuyyoo de'ii?", R.raw.record20210321201419);
        Categories1 cata20 = new Categories1("What is the assignment for tomorrow?", "Wontto so oosoy aybee?", R.raw.record20210321201425);
        Categories1 cata21 = new Categories1("ASKING FOR CLARIFICATION IN A COLLEGE CLASSROOM\n\n\n- Could you explain that again?", "Hegaa zaaretta qonccissuuttee?", R.raw.record20210321201432);
        Categories1 cata22 = new Categories1("I don't get it, Please explain.", "Hayyanna tawu gelibeenna qonccissane.", R.raw.record20210321201440);
        Categories1 cata23 = new Categories1("Please go over that part again", "Hayyanna hagaa tawu zaaretta!", R.raw.record20210321201447);
        Categories1 cata24 = new Categories1("I still don't understand.", "Hanno gakkanawu tawu gelibeenna.", R.raw.record20210321201454);
        Categories1 cata25 = new Categories1("ASKING ABOUT EXAMINATIONS\n\n\n- Is it out of hundred or what?", "Xeetaappe oyqqiyye ay oyqqi?", R.raw.record20210321201503);
        Categories1 cata26 = new Categories1("Which portion shall we cover?", "Awugaa gakkanawu wurssi xan'anee?", R.raw.record20210321201523);
        Categories1 cata27 = new Categories1("Which part of the course shall we focus more?", "Ha timirttiyawu nu awugaa loyyitti xana'anee?", R.raw.record20210321201617);
        Categories1 cata28 = new Categories1("How would be the grading system?", "Ha paaciya oosuwa markkiya imoy aymalee?", R.raw.record20210321201646);
        Categories1 cata29 = new Categories1("ASKING ABOUT GRADES\n\n\n- Can you tell me what grade I'm getting?", "Paaciyan taani ay keena markkiya ekkidaakko ne tawu oduutee?", R.raw.record20210321201657);
        Categories1 cata30 = new Categories1("How many A's were there?", "Aappun 'A' de'ii?", R.raw.record20210321201706);
        Categories1 cata31 = new Categories1("I worked hard, so don't I deserve A?", "Ta loyttada oottaashin A demmabeykke.", R.raw.record20210321201713);
        Categories1 cata32 = new Categories1("Can I talk to you about my grade?", "Ta markkiyabaa nenaara haasayoo?", R.raw.record20210321201722);


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

        int num = new DBAdarter(Main23Activity.this).nof_alldata();
        Toast.makeText(Main23Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 559){
            new DBAdarter(Main23Activity.this).saveAllData(cata1);
            new DBAdarter(Main23Activity.this).saveAllData(cata2);
            new DBAdarter(Main23Activity.this).saveAllData(cata3);
            new DBAdarter(Main23Activity.this).saveAllData(cata4);
            new DBAdarter(Main23Activity.this).saveAllData(cata5);
            new DBAdarter(Main23Activity.this).saveAllData(cata6);
            new DBAdarter(Main23Activity.this).saveAllData(cata7);
            new DBAdarter(Main23Activity.this).saveAllData(cata8);
            new DBAdarter(Main23Activity.this).saveAllData(cata9);
            new DBAdarter(Main23Activity.this).saveAllData(cata10);
            new DBAdarter(Main23Activity.this).saveAllData(cata11);
            new DBAdarter(Main23Activity.this).saveAllData(cata12);
            new DBAdarter(Main23Activity.this).saveAllData(cata13);
            new DBAdarter(Main23Activity.this).saveAllData(cata14);
            new DBAdarter(Main23Activity.this).saveAllData(cata15);
            new DBAdarter(Main23Activity.this).saveAllData(cata16);
            new DBAdarter(Main23Activity.this).saveAllData(cata17);
            new DBAdarter(Main23Activity.this).saveAllData(cata18);
            new DBAdarter(Main23Activity.this).saveAllData(cata19);
            new DBAdarter(Main23Activity.this).saveAllData(cata20);
            new DBAdarter(Main23Activity.this).saveAllData(cata21);
            new DBAdarter(Main23Activity.this).saveAllData(cata22);
            new DBAdarter(Main23Activity.this).saveAllData(cata23);
            new DBAdarter(Main23Activity.this).saveAllData(cata24);
            new DBAdarter(Main23Activity.this).saveAllData(cata25);
            new DBAdarter(Main23Activity.this).saveAllData(cata26);
            new DBAdarter(Main23Activity.this).saveAllData(cata27);
            new DBAdarter(Main23Activity.this).saveAllData(cata28);
            new DBAdarter(Main23Activity.this).saveAllData(cata29);
            new DBAdarter(Main23Activity.this).saveAllData(cata30);
            new DBAdarter(Main23Activity.this).saveAllData(cata31);
            new DBAdarter(Main23Activity.this).saveAllData(cata32);
        }
    }
}

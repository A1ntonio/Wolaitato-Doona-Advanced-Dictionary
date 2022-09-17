package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main16Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Getting some one Attention");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("Excuse me","Attoga tawu.",R.raw.record20210319072537);
        Categories1 cata2 = new Categories1("Pardom me...","Attoga tawu.",R.raw.record20210319072537);
        Categories1 cata3 = new Categories1("Excuse me Dr/Mr/Miss...","Atto ga tawu Dottoriyawu. (Mantta Ababa)",R.raw.record20210319072604);
        Categories1 cata4 = new Categories1("Excuse me, could you help me?","Attotetta ootta tawu, Tana maadduutee?",R.raw.record20210319072625);
        Categories1 cata5 = new Categories1("Pardom me, could I have some help?","Atotettaa oychchays, Neeppe maado demmanddinaa?",R.raw.record20210319072642);
        Categories1 cata6 = new Categories1("Excuse me, Miss...","Atto ga tawu, mokkiyaaree",R.raw.record20210319072657);
        Categories1 cata7 = new Categories1("Excuse me waiter...","Atto ga tawu mokkiyaagoo",R.raw.record20210319072708);


        ArrayList<Categories1> list = new ArrayList<>();
        list.add(cata1);
        list.add(cata2);
        list.add(cata3);
        list.add(cata4);
        list.add(cata5);
        list.add(cata6);
        list.add(cata7);


        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main16Activity.this).nof_alldata();
        Toast.makeText(Main16Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 249){
            new DBAdarter(Main16Activity.this).saveAllData(cata1);
            new DBAdarter(Main16Activity.this).saveAllData(cata2);
            new DBAdarter(Main16Activity.this).saveAllData(cata3);
            new DBAdarter(Main16Activity.this).saveAllData(cata4);
            new DBAdarter(Main16Activity.this).saveAllData(cata5);
            new DBAdarter(Main16Activity.this).saveAllData(cata6);
            new DBAdarter(Main16Activity.this).saveAllData(cata7);
        }
    }
}

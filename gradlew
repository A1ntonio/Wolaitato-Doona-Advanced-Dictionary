package com.learn.wolaytegna.learnwolaytegna;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Main24Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Expressing likes & dislikes");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("ASKING YES/NO QUESTIONS ABOUT INTERESTS AND LIKES\n\n\n- Do you like....?", "Neeni ... dosay?", 0x7f0e0000);
        Categories1 cata2 = new Categories1("RESPONSES\n\n- Yes, I do", "Ee, dosays.", 0x7f0e0001);
        Categories1 cata3 = new Categories1("Yes, very much", "Ee keehi dosays", 0x7f0e0002);
        Categories1 cata4 = new Categories1("Yes, I do very much", "Ee keehi dosays", 0x7f0e0000);
        Categories1 cata5 = new Categories1("Yes, a lot", "Ee daro dosays.", 0x7f0e0001);
        Categories1 cata6 = new Categories1("Yes, I do a lot", "Ee keehi dosays.", 0x7f0e0002);
        Categories1 cata7 = new Categories1("Yes, I love it/you/them", "Ee keehi hegaa dosays/A dosays/Eta dosays.", 0x7f0e0000);
        Categories1 cata8 = new Categories1("ASKING\n\n- Do you enjoy...?", "Neeni .... ufayttay?", 0x7f0e0001);
        Categories1 cata9 = new Categories1("RESPONSES\n\n- Yes, very much indeed.", "Ee keehippe tuma.", 0x7f0e0000);
        Categories1 cata10 = new Categories1("Yes, very much indeed.", "Ee, taani A keehi dosays, tuma.", 0x7f0e0002);
        Categories1 cata11 = new Categories1("Yes, I like you/them very much indeed.", "Ee, taani inttena/ Eta daro dosays tuma.", 0x7f0e0002);
        Categories1 cata12 = new Categories1("ASKING\n\n-Are you interested...?", "Neeni ... dosadii?", 0x7f0e0002);
        Categories1 cata13 = new Categories1("RESPONSES\n\n-Yes, actually I am", "Ee, taani dosaas.", 0x7f0e0002);
        Categories1 cata14 = new Categories1("Yes, as a matter of fact I do", "Ee, tumaappe ufayssis.", 0x7f0e0002);
        Categories1 cata15 = new Categories1("Yes, it's all right", "Ee, lo'o(injetiis)", 0x7f0e0002);
        Categories1 cata16 = new Categories1("Yes, it's ok.", "Ee, injje", 0x7f0e0002);
        Categories1 cata17 = new Categories1("ASKING\n\n- Have you got any favorite...?", "Dosadii?", 0x7f0e0002);
        Categories1 cata18 = new Categories1("Have you got any favorite...?", "Neeni dosiyo...demmadii?", 0x7f0e0002);
        Categories1 cata19 = new Categories1("Have you got any favorite...?", "Neeni dooriyo...demmadii?", 0x7f0e0002);
        Categories1 cata20 = new Categories1("RESPONSES\n\n-Well actually...", "Ee, taani dosaas.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("Well frankly", "Ee, tumaappe.", 0x7f0e0002);
        Categories1 cata22 = new Categories1("Well frankly speaking", "Tuma, haasayikko ee", 0x7f0e0002);
        Categories1 cata23 = new Categories1("Well, I prefer", "Ero, taani .... doorays", 0x7f0e0002);
        Categories1 cata24 = new Categories1("Well, to be honest", "Ero xilluwa odanawu", 0x7f0e0002);
        Categories1 cata25 = new Categories1("Well, as a matter of fact", "... Ee, tuma odanawu", 0x7f0e0002);
        Categories1 cata26 = new Categories1("Well, I'm more into", "Ero, waayi hegaa taani dosana.", 0x7f0e0002);
        Categories1 cata27 = new Categories1("No I'm afraid I'm not", "Chi, waayi hegaa taani dosana.", 0x7f0e0002);
        Categories1 cata28 = new Categories1("No, I'm afraid I don't", "Akkay, taassi hegee waayi de'ana", 0x7f0e0002);
        Categories1 cata29 = new Categories1("", "", 0x7f0e0002);


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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
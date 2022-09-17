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
   
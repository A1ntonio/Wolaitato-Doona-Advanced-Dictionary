package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main26Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("At the Restaurant");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("Waitress", "Mokkiyaaro/Tukke keettan", 0x7f0e0000);
        Categories1 cata2 = new Categories1("Waiter", "Mokkiyaagaa/Tukke keettan", 0x7f0e0001);
        Categories1 cata3 = new Categories1("EXPRESSIONS USED BY WAITRESS AND WAITERS\n\n\n- May I help you?", "At kiitettoo?", 0x7f0e0002);
        Categories1 cata4 = new Categories1("Can I help you?", "Ay kiitettoo?", 0x7f0e0000);
        Categories1 cata5 = new Categories1("May I take your order?", "Ay kiitetto?", 0x7f0e0001);
        Categories1 cata6 = new Categories1("Did you order?", "Kiittadi?", 0x7f0e0002);
        Categories1 cata7 = new Categories1("Have you ordered?", "Intte kiittidetii?", 0x7f0e0000);
        Categories1 cata8 = new Categories1("What would you like darling?", "Ay kaayeettii, ta siiqotto?", 0x7f0e0001);
        Categories1 cata9 = new Categories1("What would you like to order?", "Ay kiittanawu koyyeetii?", 0x7f0e0000);
        Categories1 cata10 = new Categories1("What would you like to eat?", "Ay maanawu doseetti?", 0x7f0e0002);
        Categories1 cata11 = new Categories1("Would you like a drink before dinner?", "Kahuwa maanaape kasettada ushshaa uyyenawu koyyays?", 0x7f0e0002);
        Categories1 cata12 = new Categories1("What did you order?", "Aybaa ne kiittadii?", 0x7f0e0002);
        Categories1 cata13 = new Categories1("What can I bring you?", "Ay ehoo niyo?", 0x7f0e0002);
        Categories1 cata14 = new Categories1("What will you have sir?", "Ay maanee ta godawu!", 0x7f0e0002);
        Categories1 cata15 = new Categories1("What are you having?", "Ay maanee?", 0x7f0e0002);
        Categories1 cata16 = new Categories1("What kind of dressing would you like?", "Sawettiyaabaa ay yeggoo?", 0x7f0e0002);
        Categories1 cata17 = new Categories1("What kind of dessert will you have?", "Ay mala doonaa shokiyooba niyoo ehoo?", 0x7f0e0002);
        Categories1 cata18 = new Categories1("How would you like your meat?", "Ashoy niyo waanidi ka'iyaakko dosay?", 0x7f0e0002);
        Categories1 cata19 = new Categories1("Rare?", "Guuttaara ka'o", 0x7f0e0002);
        Categories1 cata20 = new Categories1("Just a moment. I'm coming.", "Guuttaa takkkashsha: taani yaydda de'ays.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("Would you like anything else?", "Harabaa neeni ay dosay?", 0x7f0e0002);
        Categories1 cata22 = new Categories1("Will you have anything else?", "Haraabaa neeni aybaa maanawu dosay?", 0x7f0e0002);
        Categories1 cata23 = new Categories1("Will there be anything else?", "Harabaa neeni gujjiyoobi de'ii?", 0x7f0e0002);
        Categories1 cata24 = new Categories1("Anything to drink?", "Uyiyobaa ehoo?", 0x7f0e0002);
        Categories1 cata25 = new Categories1("Is everything all right here?", "Hegan ubbabay kumettee?", 0x7f0e0002);
        Categories1 cata26 = new Categories1("CUSTOMER/CLIENT/\n\n\n- May I have a menu please?", "Miyo quma paatetti xaafetti uttido woraqataa hayyannaa tawu ehutee?", 0x7f0e0002);
        Categories1 cata27 = new Categories1("I'd like spaghetti please.", "Hayyannaa tawu pastta ehutee?", 0x7f0e0002);
        Categories1 cata28 = new Categories1("I ordered at bootle of beer?", "Issi xaramuse biraa kiittaas.", 0x7f0e0002);
        Categories1 cata29 = new Categories1("Could I have tea please?", "Shayyiya tawu ehutee?", 0x7f0e0002);
        Categories1 cata30 = new Categories1("Could I have white coffee please?", "Hayyannaa tukkiya maattaa gujjada tawu ehutee?", 0x7f0e0002);
        Categories1 cata31= new Categories1("OTHER EXPRESSIONS\n\n\n- We haven't decided yet.", "Hanno gakkanawu qoppi wurssibookko naanggashsha1", 0x7f0e0002);
        Categories1 cata32 = new Categories1("We are ready to order now.", "Ha'i kiittanawu nuuni giigida.", 0x7f0e0002);
        Categories1 cata33 = new Categories1("What comes with the dinner?", "Kahuwaara inttessi aybi yo geetti?", 0x7f0e0002);
        Categories1 cata34 = new Categories1("May I have beer please?", "Biiraa ta uyoo?", 0x7f0e0002);
        Categories1 cata35 = new Categories1("Could we have separate bills, please?", "Hayyanaa nuuni miishsha qanxxiyo biiliyaa dumma dumma ootta ehutee?", 0x7f0e0002);
        Categories1 cata36 = new Categories1("Just a glass of water?", "Issi burccukko haattaa immarkki?", 0x7f0e0002);
        Categories1 cata37 = new Categories1("It comes to .... Birr.", "Neegee yiidoy...miishsha.", 0x7f0e0002);
        Categories1 cata38 = new Categories1("Is service charge included?", "Ta haggaazoy aani gujettidee?", 0x7f0e0002);



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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main26Activity.this).nof_alldata();
        Toast.makeText(Main26Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 692){
            new DBAdarter(Main26Activity.this).saveAllData(cata1);
            new DBAdarter(Main26Activity.this).saveAllData(cata2);
            new DBAdarter(Main26Activity.this).saveAllData(cata3);
            new DBAdarter(Main26Activity.this).saveAllData(cata4);
            new DBAdarter(Main26Activity.this).saveAllData(cata5);
            new DBAdarter(Main26Activity.this).saveAllData(cata6);
            new DBAdarter(Main26Activity.this).saveAllData(cata7);
            new DBAdarter(Main26Activity.this).saveAllData(cata8);
            new DBAdarter(Main26Activity.this).saveAllData(cata9);
            new DBAdarter(Main26Activity.this).saveAllData(cata10);
            new DBAdarter(Main26Activity.this).saveAllData(cata11);
            new DBAdarter(Main26Activity.this).saveAllData(cata12);
            new DBAdarter(Main26Activity.this).saveAllData(cata13);
            new DBAdarter(Main26Activity.this).saveAllData(cata14);
            new DBAdarter(Main26Activity.this).saveAllData(cata15);
            new DBAdarter(Main26Activity.this).saveAllData(cata16);
            new DBAdarter(Main26Activity.this).saveAllData(cata17);
            new DBAdarter(Main26Activity.this).saveAllData(cata18);
            new DBAdarter(Main26Activity.this).saveAllData(cata19);
            new DBAdarter(Main26Activity.this).saveAllData(cata20);
            new DBAdarter(Main26Activity.this).saveAllData(cata21);
            new DBAdarter(Main26Activity.this).saveAllData(cata22);
            new DBAdarter(Main26Activity.this).saveAllData(cata23);
            new DBAdarter(Main26Activity.this).saveAllData(cata24);
            new DBAdarter(Main26Activity.this).saveAllData(cata25);
            new DBAdarter(Main26Activity.this).saveAllData(cata26);
            new DBAdarter(Main26Activity.this).saveAllData(cata27);
            new DBAdarter(Main26Activity.this).saveAllData(cata28);
            new DBAdarter(Main26Activity.this).saveAllData(cata29);
            new DBAdarter(Main26Activity.this).saveAllData(cata30);
            new DBAdarter(Main26Activity.this).saveAllData(cata31);
            new DBAdarter(Main26Activity.this).saveAllData(cata32);
            new DBAdarter(Main26Activity.this).saveAllData(cata33);
            new DBAdarter(Main26Activity.this).saveAllData(cata34);
            new DBAdarter(Main26Activity.this).saveAllData(cata35);
            new DBAdarter(Main26Activity.this).saveAllData(cata36);
            new DBAdarter(Main26Activity.this).saveAllData(cata37);
            new DBAdarter(Main26Activity.this).saveAllData(cata38);
        }
    }
}

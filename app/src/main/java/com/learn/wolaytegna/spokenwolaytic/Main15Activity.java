package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main15Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("At the bank");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("THE BANK TELLER\n\nHow can I help you?","Ay maaddana danddayiyaanaa?",R.raw.record20210319065915);
        Categories1 cata2 = new Categories1("How may I help you?","Ay maaddoo nena?",R.raw.record20210319065959);
        Categories1 cata3 = new Categories1("I'm open here","Hagan ta giiga uttaas maaduwawu",R.raw.record20210319070023);
        Categories1 cata4 = new Categories1("I can help you down here","Hagan nena maaddana danddayays.",R.raw.record20210319070043);
        Categories1 cata5 = new Categories1("Next, please","Kalliya kayaaway, hayyana.",R.raw.record20210319070126);
        Categories1 cata6 = new Categories1("Yes","Yee",R.raw.record20210319070146);
        Categories1 cata7 = new Categories1("BASIC REQUESTS TO A BANK TELLER\n\nI'd like to make deposit.","Taani bankkiyan biraa wottana koyyays",R.raw.record20210319070203);
        Categories1 cata8 = new Categories1("I'd like to transfer money into my saving account.","Miishshaa ta buukiya payduwawu laammana koyyays.",R.raw.record20210319070236);
        Categories1 cata9 = new Categories1("I'd like to make a withdraw.","Miishshaa kessana koyyays.",R.raw.record20210319070319);
        Categories1 cata10 = new Categories1("I'd like to withdrawl money from my account.","Miishshaa ta buukiya payduwaappe kessana koyyays.",R.raw.record20210319070340);
        Categories1 cata11 = new Categories1("REQUESTING CHANGE FROM A TELLER OR CASHIER\n\nI need some change","Miishshaa laamiya koyyays.",R.raw.record20210319070353);
        Categories1 cata12 = new Categories1("I need a roll of quarters.","Taani oyddu qasho biraa koyyays.",R.raw.record20210319070422);
        Categories1 cata13 = new Categories1("Give me some change","Ane taassi hagaa laamma.",R.raw.record20210319070441);
        Categories1 cata14 = new Categories1("Break this, please","Hayyana hagaa tawu laamma",R.raw.record20210319070453);
        Categories1 cata15 = new Categories1("GENERAL BANKING MATTERS\n\nAre you a customer here?","Neeni hagan miishshaa wottiyaagee",R.raw.record20210319070507);
        Categories1 cata16 = new Categories1("May I see your ID?","Ne mattaawoqiya be'oo?",R.raw.record20210319070521);
        Categories1 cata17 = new Categories1("Enter your PIN here.","Ne pine payduwa hagan gelissa.",R.raw.record20210319070538);
        Categories1 cata18 = new Categories1("Is your name spelt like this?","Ne sunttay hagaadan xaafettii?",R.raw.record20210319070554);
        Categories1 cata19 = new Categories1("Endorse this, please.","Ane hagan parama",R.raw.record20210319070609);
        Categories1 cata20 = new Categories1("BASIC REQUESTS TO A PERSONAL BANKER\n\nI'd like to apply for a loan.","Tal'iya ekkanawu malkkachchaa xaafana koyyays.",R.raw.record20210319070626);
        Categories1 cata21 = new Categories1("I'd like to close my checking account.","Taani ta buukiya payduwa gorddana koyyays.",R.raw.record20210319070639);
        Categories1 cata22 = new Categories1("I'd like to open a saving account.","Taani miishshaa dagayiyo buukiya dooyana koyyays.",R.raw.record20210319071023);
        Categories1 cata23 = new Categories1("INFORMATION ABOUT FOREIGN EXCHANGE RATES\n\nHow many pounds to the dollar?","Issi doolaariyawu woysa pawundee?",R.raw.record20210319071116);
        Categories1 cata24 = new Categories1("How many birr to the dollar?","Issi doolaariyawu aappun biree?",R.raw.record20210319071137);
        Categories1 cata25 = new Categories1("What is the exchange rate of marks of dollar?","Issi doolaaree aappunan laametti?",R.raw.record20210319071156);
        Categories1 cata26 = new Categories1("The exchange rate is going up.","Laamee pude dicciis.",R.raw.record20210319071209);
        Categories1 cata27 = new Categories1("ABOUT FOREIGN EXCHANGE\n\nI would like to buy some foreign currency.","Taani issi kare biittaa miishshaa shammana koyyasishin?",R.raw.record20210319071229);
        Categories1 cata28 = new Categories1("We don't handle foreign exchange here.","Nuuni kare biittaa miishshaa laamiya haggazokko hagan.",R.raw.record20210319071435);
        Categories1 cata29 = new Categories1("Do you handle foreign exchange here?","Intte kare biitta miishshaa laamiya immeetti hagan?",R.raw.record20210319071454);
        Categories1 cata30 = new Categories1("What is the current exchange rate?","Ha wodiyan(hachchi) woysan laamettishsha",R.raw.record20210319071525);
        Categories1 cata31 = new Categories1("CONCERNING A BANK ACCOUNT\n\nI need to order new checks.","Hara ooratta cheekkiya go'ettana koyyays.",R.raw.record20210319071538);
        Categories1 cata32 = new Categories1("What's is the interest rate?","Dichchay woysee?",R.raw.record20210319071549);
        Categories1 cata33 = new Categories1("Can you give me a new bank account?","Taassi ooratta bankkiya buukiya immana danddayy?",R.raw.record20210319071637);
        Categories1 cata34 = new Categories1("Is this account insured by federal government?","Ha buukee kiike kawotettan maacettideeye?",R.raw.record20210319071748);
        Categories1 cata35 = new Categories1("I think there is an error in my account.","Ta buukiya payduwan bali de'eennan agenna.",R.raw.record20210319071816);
        Categories1 cata36 = new Categories1("I would like to change some foreign currency?","Taani kare biittaa miishshaa guuttaa laammana koyyaysishin?",R.raw.record20210319071254);


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
        list.add(cata36);
        list.add(cata28);
        list.add(cata29);
        list.add(cata30);
        list.add(cata31);
        list.add(cata32);
        list.add(cata33);
        list.add(cata34);
        list.add(cata35);

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main15Activity.this).nof_alldata();
        Toast.makeText(Main15Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 213){
            new DBAdarter(Main15Activity.this).saveAllData(cata1);
            new DBAdarter(Main15Activity.this).saveAllData(cata2);
            new DBAdarter(Main15Activity.this).saveAllData(cata3);
            new DBAdarter(Main15Activity.this).saveAllData(cata4);
            new DBAdarter(Main15Activity.this).saveAllData(cata5);
            new DBAdarter(Main15Activity.this).saveAllData(cata6);
            new DBAdarter(Main15Activity.this).saveAllData(cata7);
            new DBAdarter(Main15Activity.this).saveAllData(cata8);
            new DBAdarter(Main15Activity.this).saveAllData(cata9);
            new DBAdarter(Main15Activity.this).saveAllData(cata10);
            new DBAdarter(Main15Activity.this).saveAllData(cata11);
            new DBAdarter(Main15Activity.this).saveAllData(cata12);
            new DBAdarter(Main15Activity.this).saveAllData(cata13);
            new DBAdarter(Main15Activity.this).saveAllData(cata14);
            new DBAdarter(Main15Activity.this).saveAllData(cata15);
            new DBAdarter(Main15Activity.this).saveAllData(cata16);
            new DBAdarter(Main15Activity.this).saveAllData(cata17);
            new DBAdarter(Main15Activity.this).saveAllData(cata18);
            new DBAdarter(Main15Activity.this).saveAllData(cata19);
            new DBAdarter(Main15Activity.this).saveAllData(cata20);
            new DBAdarter(Main15Activity.this).saveAllData(cata21);
            new DBAdarter(Main15Activity.this).saveAllData(cata22);
            new DBAdarter(Main15Activity.this).saveAllData(cata23);
            new DBAdarter(Main15Activity.this).saveAllData(cata24);
            new DBAdarter(Main15Activity.this).saveAllData(cata25);
            new DBAdarter(Main15Activity.this).saveAllData(cata26);
            new DBAdarter(Main15Activity.this).saveAllData(cata27);
            new DBAdarter(Main15Activity.this).saveAllData(cata28);
            new DBAdarter(Main15Activity.this).saveAllData(cata29);
            new DBAdarter(Main15Activity.this).saveAllData(cata30);
            new DBAdarter(Main15Activity.this).saveAllData(cata31);
            new DBAdarter(Main15Activity.this).saveAllData(cata32);
            new DBAdarter(Main15Activity.this).saveAllData(cata33);
            new DBAdarter(Main15Activity.this).saveAllData(cata34);
            new DBAdarter(Main15Activity.this).saveAllData(cata35);
            new DBAdarter(Main15Activity.this).saveAllData(cata36);
        }
    }
}

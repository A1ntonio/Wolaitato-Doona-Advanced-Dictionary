package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main36Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Job Interview");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("QUESTIONS FOUND ON SURVEYS AND FORMS", "PILLGGIYO WORAQQATAA BOLLINNE FORIMIYA BOLLI DAROTOO KIYIYA OYSHATA.", 0x7f0e0000);
        Categories1 cata2 = new Categories1("- Name?", "Sunttaa?", 0x7f0e0001);
        Categories1 cata3 = new Categories1("- Occupation?", "Oosuwa?", 0x7f0e0002);
        Categories1 cata4 = new Categories1("- Address?", "Qatuwa?", 0x7f0e0000);
        Categories1 cata5 = new Categories1("- Previous occupation?", "Kase Oosuwa?", 0x7f0e0001);
        Categories1 cata6 = new Categories1("- Age?", "Laytaa?", 0x7f0e0002);
        Categories1 cata7 = new Categories1("- Gender? (Female, male)", "Mattumaa? (maccaa, Attumaa)", 0x7f0e0000);
        Categories1 cata8 = new Categories1("- Religion?", "Ammanuwa? (Haymaanootiya)", 0x7f0e0001);
        Categories1 cata9 = new Categories1("- Mariel status?", "Geluwa-ekuwa?", 0x7f0e0000);
        Categories1 cata10 = new Categories1("AN EMPLOYER TO A PROSPECTIVE EMPLOYEE", "QAXARIYAAGEE BARI QAXARANA URAASSI SHIISHSHIYO OYCHCHI-ZAAROTA", 0x7f0e0002);
        Categories1 cata11 = new Categories1("- What are your qualifications?", "Neeni Loohada Kiyidobati aybee aybee?", 0x7f0e0002);
        Categories1 cata12 = new Categories1("- What is yout degree in?", "Neeni digiriya ekkidoy ayba timirittiyaanee?", 0x7f0e0002);
        Categories1 cata13 = new Categories1("- Where did you go to school?", "Awa luxetta keettan tamaaradii?", 0x7f0e0002);
        Categories1 cata14 = new Categories1("- What sort of salary do you expect?", "Woysa damoozan qaxarettanawu qoppay?", 0x7f0e0002);
        Categories1 cata15 = new Categories1("- Let me see your resume?", "Anne neeni kase oottido taarikiya tana bessa (CV).", 0x7f0e0002);
        Categories1 cata16 = new Categories1("- Let me see your references?", "Ane neessi de'iya naqaashata tana bessa (CV).", 0x7f0e0002);
        Categories1 cata17 = new Categories1("- Do you have a port folio?", "Neessi maaran shiishshido naqaashay ('portti fooliyoy') de'ii?", 0x7f0e0002);
        Categories1 cata18 = new Categories1("- Why did you leave your last job?", "Ha'i ha ne wurssetta oosuwa ayssi yeddadi?", 0x7f0e0002);
        Categories1 cata19 = new Categories1("- When can you start?", "Oosuwan gelissikko awude doommana danddayay?", 0x7f0e0002);
        Categories1 cata20 = new Categories1("- Don't call us, we'll call you.", "Nuussi neeni silkkiya shocoppa; Nuuni niyo shocana.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("PROSPECTIVE EMPLOYEE", "QAXARETTANAWU QOFETTIDA OOSANCHCHAA OYSHAA", 0x7f0e0002);
        Categories1 cata22 = new Categories1("- What's the salary?", "Daamoozay woysee?", 0x7f0e0002);
        Categories1 cata23 = new Categories1("- Is it salaried or hourly?", "Agina damoozeeyye Saatiyane?", 0x7f0e0002);
        Categories1 cata24 = new Categories1("- Is it part-time or full time?", "Konttiraateeyye gophphe oosanchchee?", 0x7f0e0002);
        Categories1 cata25 = new Categories1("- What are the hours?", "Aappun saatee Oottiyaanaa hachchi-hachchii?", 0x7f0e0002);
        Categories1 cata26 = new Categories1("- What are the benefits?", "Damoozappe kareera dumma go'ati aybee aybee?", 0x7f0e0002);
        Categories1 cata27 = new Categories1("- Do I get insurance?", "Inshuuranssee imeetii?", 0x7f0e0002);
        Categories1 cata28 = new Categories1("- What would be expected of me?", "Taappe intte aybaa naageetii?", 0x7f0e0002);
        Categories1 cata29 = new Categories1("A LACK OF WORK EXPERIENCE", "HA QAXARETTIYAAGAWU OOSO MEEZE NAQAASHI BAYNNAGAA QONCCISSIYO OGIYAA", 0x7f0e0002);
        Categories1 cata30 = new Categories1("- You are still young", "Neeni hekko biroon yelaga.", 0x7f0e0002);
        Categories1 cata31 = new Categories1("- You are a little green(fresh)", "Neeni biroon aybanne oykkabeenna Ooratta.", 0x7f0e0002);
        Categories1 cata32 = new Categories1("- You are still wet behind the ears.", "Neeyyoo biroon darobay paca.", 0x7f0e0002);
        Categories1 cata33 = new Categories1("Yu are still a little now to all this.", "Neeni biroona; Loohabaakka.", 0x7f0e0002);
        Categories1 cata34 = new Categories1("COMPETENCE AND ABILITY", "QAXARETTANAWU YIIDAAGEE BARI ERANNE DANDDAYAA YOOTISHIN", 0x7f0e0002);
        Categories1 cata35 = new Categories1("- I'm an old hand at this", "Hegaa baggaara daro laytta Oottido meezee de'ees.", 0x7f0e0002);
        Categories1 cata36 = new Categories1("- I'm a professional", "Ha Oosuwan loohada kiyida, meeze de'iyo asa taani.", 0x7f0e0002);
        Categories1 cata37 = new Categories1("- I wrote the book on that", "Ta Ooso era xeelliyagan maxaafaa xaafida erancha.", 0x7f0e0002);
        Categories1 cata38 = new Categories1("- I know it like a book", "Hegaa taani maxaafadan erays.", 0x7f0e0002);
        Categories1 cata39 = new Categories1("- I know it inside and out", "Hegawu taani garssa bollaakka erays. Tana giite.", 0x7f0e0002);
        Categories1 cata40 = new Categories1("- I know it like the back of my hand.", "Hegaa taani wurssa erays.", 0x7f0e0002);
        Categories1 cata41 = new Categories1("- I know it back wards and forwards", "Hegaa taani guyye-guttinne sinttawukko Oottanawu danddayays.", 0x7f0e0002);
        Categories1 cata42 = new Categories1("- I know it all from A to Z", "Taani hegaa muliyakka A ppe Z gakkanawu erays.", 0x7f0e0002);
        Categories1 cata43 = new Categories1("- It's like breathing", "Taani hegaa ta shemppuwaadan erays.", 0x7f0e0002);


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

        CategoriesListAdapter2 adapter = new CategoriesListAdapter2(this, R.layout.custom_layout2, list);
        listView.setAdapter(adapter);

        int num = new DBAdarter(Main36Activity.this).nof_alldata();
        Toast.makeText(Main36Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 1101){
            new DBAdarter(Main36Activity.this).saveAllData(cata1);
            new DBAdarter(Main36Activity.this).saveAllData(cata2);
            new DBAdarter(Main36Activity.this).saveAllData(cata3);
            new DBAdarter(Main36Activity.this).saveAllData(cata4);
            new DBAdarter(Main36Activity.this).saveAllData(cata5);
            new DBAdarter(Main36Activity.this).saveAllData(cata6);
            new DBAdarter(Main36Activity.this).saveAllData(cata7);
            new DBAdarter(Main36Activity.this).saveAllData(cata8);
            new DBAdarter(Main36Activity.this).saveAllData(cata9);
            new DBAdarter(Main36Activity.this).saveAllData(cata10);
            new DBAdarter(Main36Activity.this).saveAllData(cata11);
            new DBAdarter(Main36Activity.this).saveAllData(cata12);
            new DBAdarter(Main36Activity.this).saveAllData(cata13);
            new DBAdarter(Main36Activity.this).saveAllData(cata14);
            new DBAdarter(Main36Activity.this).saveAllData(cata15);
            new DBAdarter(Main36Activity.this).saveAllData(cata16);
            new DBAdarter(Main36Activity.this).saveAllData(cata17);
            new DBAdarter(Main36Activity.this).saveAllData(cata18);
            new DBAdarter(Main36Activity.this).saveAllData(cata19);
            new DBAdarter(Main36Activity.this).saveAllData(cata20);
            new DBAdarter(Main36Activity.this).saveAllData(cata21);
            new DBAdarter(Main36Activity.this).saveAllData(cata22);
            new DBAdarter(Main36Activity.this).saveAllData(cata23);
            new DBAdarter(Main36Activity.this).saveAllData(cata24);
            new DBAdarter(Main36Activity.this).saveAllData(cata29);
            new DBAdarter(Main36Activity.this).saveAllData(cata30);
            new DBAdarter(Main36Activity.this).saveAllData(cata25);
            new DBAdarter(Main36Activity.this).saveAllData(cata26);
            new DBAdarter(Main36Activity.this).saveAllData(cata27);
            new DBAdarter(Main36Activity.this).saveAllData(cata28);
            new DBAdarter(Main36Activity.this).saveAllData(cata31);
            new DBAdarter(Main36Activity.this).saveAllData(cata32);
            new DBAdarter(Main36Activity.this).saveAllData(cata33);
            new DBAdarter(Main36Activity.this).saveAllData(cata34);
            new DBAdarter(Main36Activity.this).saveAllData(cata35);
            new DBAdarter(Main36Activity.this).saveAllData(cata36);
            new DBAdarter(Main36Activity.this).saveAllData(cata37);
            new DBAdarter(Main36Activity.this).saveAllData(cata38);
            new DBAdarter(Main36Activity.this).saveAllData(cata39);
            new DBAdarter(Main36Activity.this).saveAllData(cata40);
            new DBAdarter(Main36Activity.this).saveAllData(cata41);
            new DBAdarter(Main36Activity.this).saveAllData(cata42);
            new DBAdarter(Main36Activity.this).saveAllData(cata43);
        }

    }
}

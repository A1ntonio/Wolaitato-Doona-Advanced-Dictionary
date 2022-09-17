package com.learn.wolaytegna.spokenwolaytic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main32Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Requesting and offering");

        ListView listView = findViewById(R.id.list_item);

        Categories1 cata1 = new Categories1("Request\n\n- Could you clean that black board please?", "Woosaa(oyshaa)\n\n- He saleedaa quccuuteeshsha taassi?", 0x7f0e0000);
        Categories1 cata2 = new Categories1("Offering\n\n- Shall I help you in carrying the luggage?", "Zaaruwa\n\n- Taani nena hagaa shanxxaa tooka maaddoo?", 0x7f0e0001);
        Categories1 cata3 = new Categories1("Excuse me, but....", "Atotettaa oychchays, shin...", 0x7f0e0002);
        Categories1 cata4 = new Categories1("I hope you don't mind my asking but...", "Issibaa taani nena oychchooshsha?...", 0x7f0e0000);
        Categories1 cata5 = new Categories1("I'm sorry to trouble you, but ....", "Issibaa nena metooshsha?...", 0x7f0e0001);
        Categories1 cata6 = new Categories1("FORMAL EXPRESSION\n\n\n- Could I help you?...", "....Maaddoo?", 0x7f0e0002);
        Categories1 cata7 = new Categories1("Would you like me to help you...", "...Taani nena maaddanaadan koyay?", 0x7f0e0000);
        Categories1 cata8 = new Categories1("Would you mind helping you..", "...Maaddoo?", 0x7f0e0001);
        Categories1 cata9 = new Categories1("Shall I help you?...", "...Maaddoo?", 0x7f0e0000);
        Categories1 cata10 = new Categories1("Do you mind helping you? I could...", "...Taani danddayiyobaa nena maaddooshsha?", 0x7f0e0002);
        Categories1 cata11 = new Categories1("...carrying the luggage pleas?", "Shanxxa tookkara...", 0x7f0e0002);
        Categories1 cata12 = new Categories1("....give you a ride please?", "Manddariyobaa togissada...", 0x7f0e0002);
        Categories1 cata13 = new Categories1("....push the car please?", "Kaamiya sugara...", 0x7f0e0002);
        Categories1 cata14 = new Categories1("...clean the house please?", "Keettaa pittada ...", 0x7f0e0002);
        Categories1 cata15 = new Categories1("...collect the goods please?", "Hagaa ubbabaa shiishshada...", 0x7f0e0002);
        Categories1 cata16 = new Categories1("Lend a hand - shall help you?", "Kushiyaa miccara - Taani maaddoo nena?", 0x7f0e0002);
        Categories1 cata17 = new Categories1("I wonder if you would be so kind to ...", "Ne... haniyaakko ta woraabays.", 0x7f0e0002);
        Categories1 cata18 = new Categories1("I wonder if I could ...", "Ta ... haniyaakko ta woraabays.", 0x7f0e0002);
        Categories1 cata19 = new Categories1("I should very great ful...", "....taani keehi galatana shin.", 0x7f0e0002);
        Categories1 cata20 = new Categories1("I should great ful..", "... taani galatana shin.", 0x7f0e0002);
        Categories1 cata21 = new Categories1("If you could .... I'd be very great ful.", "Neeni ... danddayidaakko, taani galatanashin.", 0x7f0e0002);
        Categories1 cata22 = new Categories1("If you don't mind I'll....", "Neeni lanccennaakko taani ....shin.", 0x7f0e0002);
        Categories1 cata23 = new Categories1("Does you want me to...", "Neeni ta (yaatana) mala koyay?", 0x7f0e0002);
        Categories1 cata24 = new Categories1("Could I?", "Taani yaatoo?", 0x7f0e0002);
        Categories1 cata25 = new Categories1("Is it possible for you...?", "Hagee danddayettiyaabe neeyyoo...?", 0x7f0e0002);
        Categories1 cata26 = new Categories1("INFORMAL EXPRESSIONS\n\n\n- Can I help you push your car?", "Ha kaamiya sugada nena maaddoo?", 0x7f0e0002);
        Categories1 cata27 = new Categories1("May I help you clean the blackboard?", "Taani nena saleedaa qucadda maaddoo?", 0x7f0e0002);
        Categories1 cata28 = new Categories1("Can I give you a ride?", "Ta kaamiyan ne biyosaa efoo?", 0x7f0e0002);
        Categories1 cata29 = new Categories1("What can I help you?", "Nena ta ay maaddoo?", 0x7f0e0002);
        Categories1 cata30 = new Categories1("How about my... for you?", "Taani neesi ...waanii?", 0x7f0e0002);
        Categories1 cata31 = new Categories1("RESPONSES\n\nACCEPTING THE OFFERING\n\n\n- Thank you, it is nice of you to help me.", "Galatays. Neeni tana maaddidoogawu lo'o asa.", 0x7f0e0002);
        Categories1 cata32 = new Categories1("That would be very kind of you. Thank you.", "Ne kehatettawu galatays.", 0x7f0e0002);
        Categories1 cata33 = new Categories1("That is kind of you. Thanks.", "Neeni keha asa. Galatays.", 0x7f0e0002);
        Categories1 cata34 = new Categories1("Yes, thank you for your kindness.", "Ee; Ne kehatettawu nena galatays.", 0x7f0e0002);
        Categories1 cata35 = new Categories1("Thank you, with pleasure.", "Galatays nena. ufayttaydda.", 0x7f0e0002);
        Categories1 cata36 = new Categories1("Oh, thanks!", "Oh, galatays.", 0x7f0e0002);
        Categories1 cata37 = new Categories1("Oh, thank you!", "Oh, nena galatays.", 0x7f0e0002);
        Categories1 cata38 = new Categories1("Ok, thank you!", "Ero, nena galatays.", 0x7f0e0002);
        Categories1 cata39 = new Categories1("Yea, thank you!", "Ero, Galatays.", 0x7f0e0002);
        Categories1 cata40 = new Categories1("Oh, thanks ever so much!", "Oh, haroodeegaappekka aaruwa galatays nena.", 0x7f0e0002);
        Categories1 cata41 = new Categories1("REFUSING TO ACCEPT THE OFFER\n\n\n- No thank you, it is very simple I can manage it.", "Chii, aggaaga galatays. Hagee kawushsha; taani oykkana danddayays.", 0x7f0e0002);
        Categories1 cata42 = new Categories1("No, Thank you there is somebody helping me.", "Chii, galatays. Tana maaddiya asi de'ees.", 0x7f0e0002);
        Categories1 cata43 = new Categories1("Thanks don't bother...", "Galatays, waayettoppa", 0x7f0e0002);
        Categories1 cata44= new Categories1("No, thanks, it's not necessary.", "Akkay, galatays. Koshshenna.", 0x7f0e0002);
        Categories1 cata45 = new Categories1("No, it's all right.", "Chii metoy baawa.", 0x7f0e0002);
        Categories1 cata46 = new Categories1("EXPRESSING INABILITY TO HELP\n\n\n- I wish I could help you but...", "Taani nena maaddidaakko dasay shin...", 0x7f0e0002);
        Categories1 cata47 = new Categories1("I'm afraid I can't...", "Atotettaa oychchays dandayikke.", 0x7f0e0002);
        Categories1 cata48 = new Categories1("I'd really like to help but...", "Tumaappe, taani maaddiyaakko dosays shin...", 0x7f0e0002);
        Categories1 cata49 = new Categories1("RESPONSES\n\n\n- Never mind.", "Aynne metoy baa.", 0x7f0e0002);
        Categories1 cata50 = new Categories1("Please don't wory.", "Hayyanaa, aynne hirggoppa.", 0x7f0e0002);
        Categories1 cata51 = new Categories1("That's al right.", "Hegee metenna.", 0x7f0e0002);
        Categories1 cata52 = new Categories1("Not to worry.", "Hirggissiyaabi baawa.", 0x7f0e0002);


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


        int num = new DBAdarter(Main32Activity.this).nof_alldata();
        Toast.makeText(Main32Activity.this, String.valueOf(num), Toast.LENGTH_SHORT).show();
        if (num == 905){
            new DBAdarter(Main32Activity.this).saveAllData(cata1);
            new DBAdarter(Main32Activity.this).saveAllData(cata2);
            new DBAdarter(Main32Activity.this).saveAllData(cata3);
            new DBAdarter(Main32Activity.this).saveAllData(cata4);
            new DBAdarter(Main32Activity.this).saveAllData(cata5);
            new DBAdarter(Main32Activity.this).saveAllData(cata6);
            new DBAdarter(Main32Activity.this).saveAllData(cata7);
            new DBAdarter(Main32Activity.this).saveAllData(cata8);
            new DBAdarter(Main32Activity.this).saveAllData(cata9);
            new DBAdarter(Main32Activity.this).saveAllData(cata10);
            new DBAdarter(Main32Activity.this).saveAllData(cata11);
            new DBAdarter(Main32Activity.this).saveAllData(cata12);
            new DBAdarter(Main32Activity.this).saveAllData(cata13);
            new DBAdarter(Main32Activity.this).saveAllData(cata14);
            new DBAdarter(Main32Activity.this).saveAllData(cata15);
            new DBAdarter(Main32Activity.this).saveAllData(cata16);
            new DBAdarter(Main32Activity.this).saveAllData(cata17);
            new DBAdarter(Main32Activity.this).saveAllData(cata18);
            new DBAdarter(Main32Activity.this).saveAllData(cata19);
            new DBAdarter(Main32Activity.this).saveAllData(cata20);
            new DBAdarter(Main32Activity.this).saveAllData(cata21);
            new DBAdarter(Main32Activity.this).saveAllData(cata22);
            new DBAdarter(Main32Activity.this).saveAllData(cata23);
            new DBAdarter(Main32Activity.this).saveAllData(cata24);
            new DBAdarter(Main32Activity.this).saveAllData(cata25);
            new DBAdarter(Main32Activity.this).saveAllData(cata26);
            new DBAdarter(Main32Activity.this).saveAllData(cata27);
            new DBAdarter(Main32Activity.this).saveAllData(cata28);
            new DBAdarter(Main32Activity.this).saveAllData(cata29);
            new DBAdarter(Main32Activity.this).saveAllData(cata30);
            new DBAdarter(Main32Activity.this).saveAllData(cata31);
            new DBAdarter(Main32Activity.this).saveAllData(cata32);
            new DBAdarter(Main32Activity.this).saveAllData(cata33);
            new DBAdarter(Main32Activity.this).saveAllData(cata34);
            new DBAdarter(Main32Activity.this).saveAllData(cata35);
            new DBAdarter(Main32Activity.this).saveAllData(cata36);
            new DBAdarter(Main32Activity.this).saveAllData(cata37);
            new DBAdarter(Main32Activity.this).saveAllData(cata38);
            new DBAdarter(Main32Activity.this).saveAllData(cata39);
            new DBAdarter(Main32Activity.this).saveAllData(cata40);
            new DBAdarter(Main32Activity.this).saveAllData(cata41);
            new DBAdarter(Main32Activity.this).saveAllData(cata42);
            new DBAdarter(Main32Activity.this).saveAllData(cata43);
            new DBAdarter(Main32Activity.this).saveAllData(cata44);
            new DBAdarter(Main32Activity.this).saveAllData(cata45);
            new DBAdarter(Main32Activity.this).saveAllData(cata46);
            new DBAdarter(Main32Activity.this).saveAllData(cata47);
            new DBAdarter(Main32Activity.this).saveAllData(cata48);
            new DBAdarter(Main32Activity.this).saveAllData(cata49);
            new DBAdarter(Main32Activity.this).saveAllData(cata50);
            new DBAdarter(Main32Activity.this).saveAllData(cata51);
            new DBAdarter(Main32Activity.this).saveAllData(cata52);
        }
    }
}

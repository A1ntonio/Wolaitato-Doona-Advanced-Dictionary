package com.learn.wolaytegna.spokenwolaytic;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NotificationCompat.Builder notification;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlarmHandler alarmHandler = new AlarmHandler(this);
        alarmHandler.cancelAlarmManager();
        alarmHandler.setAlarmHandler();

        Toast.makeText(this, "Alarm set!", Toast.LENGTH_SHORT).show();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton favorite = findViewById(R.id.favbutton);
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Favorits.class);
                startActivity(i);
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final ListView listView = findViewById(R.id.listView);

        Categories cata1 = new Categories("SOME BASIC WORDS/NOUNS\n\n\nNumber","Payduwaa", R.drawable.ic_filter_1_black_24dp);
        Categories cata2 = new Categories("Days & Months","Galasatanne Aginatta", R.drawable.ic_today_black_24dp);
        Categories cata3 = new Categories("Personal pronouns","Asa suniitta qoncisyageeta", R.drawable.ic_android_black_24dp);
        Categories cata4 = new Categories("Education related nouns","Timirtera gayitiyaa suntatta", R.drawable.ic_school_black_24dp);
        Categories cata5 = new Categories("Body parts","Boola kifiletta", R.drawable.ic_accessibility_black_24dp);
        Categories cata6 = new Categories("Food","Kattaa/Qummaa", R.drawable.ic_room_service_black_24dp);
        Categories cata7 = new Categories("Nature","Xoossa meretta", R.drawable.ic_nature_black_24dp);
        Categories cata8 = new Categories("Domestic Animals","So medosatta", R.drawable.ic_pets_black_24dp);
        Categories cata9 = new Categories("Wild Animals","Kare medosatta", R.drawable.lion);
        Categories cata10 = new Categories("Furniture","So miishaata",R.drawable.ic_home_black_24dp);
        Categories cata11 = new Categories("Transportation","Maandaryobata", R.drawable.ic_directions_transit_black_24dp);
        Categories cata12 = new Categories("SOME BASIC SPEECHES\n\n\nGreeting","Sarotaa", R.drawable.ic_pan_tool_black_24dp);
        Categories cata13 = new Categories("Shopping","Zal'iyoogaa (Zal'iyaa)", R.drawable.ic_shopping_basket_black_24dp);
        Categories cata14 = new Categories("At the Bank","Bankke keettan haniyabaa", R.drawable.ic_account_balance_black_24dp);
        Categories cata15 = new Categories("Getting some one Attention","Asi nena Ezgganaadan oottiyooga", R.drawable.ic_hearing_black_24dp);
        Categories cata16 = new Categories("Asking and Giving Directions","Ginaa/al'iyooganne Malaatiyooga", R.drawable.ic_directions_black_24dp);
        Categories cata17 = new Categories("Home life","So asaa de'uwaa xeelliya allaalleta", R.drawable.ic_home_black_24dp);
        Categories cata18 = new Categories("Giving instruction & Making Request","Azazuwa immiyoogaanne zaari oychchiyoogaa", R.drawable.ic_help_black_24dp);
        Categories cata19 = new Categories("Personal Health & Common Health Problem", "Issi asanne ubba asaa payyatettaa metuwaa", R.drawable.ic_local_hospital_black_24dp);
        Categories cata20 = new Categories("Asking for Permission","Eenotaa oychchiyoogaa", R.drawable.ic_help_black_24dp);
        Categories cata21 = new Categories("School Encounters","Timirtte allaalliyabaa", R.drawable.ic_school_black_24dp);
        Categories cata22 = new Categories("Expressing likes & dislikes","Dosiyoogaanne Ixxiyoogaa Qonccissiyo Haasayaa", R.drawable.ic_thumbs_up_down_black_24dp);
        Categories cata23 = new Categories("Travel & Transportation","Manddaraa Biyogaanne Toga Meheta (manddariyobata)", R.drawable.ic_flight_black_24dp);
        Categories cata24 = new Categories("At the Restaurant", "Quma keettan/Tukke keettan", R.drawable.ic_restaurant_black_24dp);
        Categories cata25 = new Categories("Talking about Broke", "Nu kiisee mela gidiyoogaa haasayiyoode", R.drawable.ic_money_off_black_24dp);
        Categories cata26 = new Categories("Asking for advice & Giving suggestion","Zoriya Oychchiyoogan lo'o iita giya qofaa immiyoogaa", R.drawable.ic_help_black_24dp);
        Categories cata27 = new Categories("Agreeing & Disagreeing","Qofan maayettiyogaanne Maayettennagaa", R.drawable.ic_thumbs_up_down_black_24dp);
        Categories cata28 = new Categories("Compliments & Congratulation","Nashuwaanne ufayssan siyettiyabaa qonccissuwaa", R.drawable.ic_insert_emoticon_black_24dp);
        Categories cata29 = new Categories("Bored Expression","Saleta Haasayaa", R.drawable.ic_mood_bad_black_24dp);
        Categories cata30 = new Categories("Requesting and offering","Asi maaddanaadan woossiyogaanne Maaduwa immanawu oychchiyoogaa", R.drawable.ic_help_black_24dp);
        Categories cata31 = new Categories("Making Complaint & Asking Apology","Yuu'ettidoogaa Qonccissiyoogaanne Atotettaa Oychchitoogaa", R.drawable.ic_android_black_24dp);
        Categories cata33 = new Categories("Introduction","Orrata asaara erutuwaa",R.drawable.ic_phone_black_24dp);
        Categories cata35 = new Categories("Miscellaneous","Ubba Qommo Haasayataa Walahan", R.drawable.ic_android_black_24dp);
        Categories cata36 = new Categories("Job Interview","Oosuwan Qaxariyo Oyshaa", R.drawable.ic_work_black_24dp);
        Categories cata37 = new Categories("At work","Oosuwa bolli nu de'ishin", R.drawable.ic_work_black_24dp);
        Categories cata38 = new Categories("Talking about Annoyance","Yiillotidi Haasayiyoogaa", R.drawable.ic_mood_bad_black_24dp);
        Categories cata39 = new Categories("Family", "So asaa", R.drawable.ic_android_black_24dp);

        ArrayList<Categories> list = new ArrayList<>();
        list.add(cata1);
        list.add(cata2);
        list.add(cata3);
        list.add(cata4);
        list.add(cata5);
        list.add(cata6);
        list.add(cata7);
        list.add(cata8);
        list.add(cata9);
        list.add(cata39);
        list.add(cata10);
        list.add(cata11);
        list.add(cata12);
        list.add(cata13);
        list.add(cata14);
        list.add(cata15);
        list.add(cata38);
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
        list.add(cata33);
        list.add(cata35);
        list.add(cata36);
        list.add(cata37);

        CategoriesListAdapter adapter = new CategoriesListAdapter(this, R.layout.custom_layout, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String string = String.valueOf(parent.getItemIdAtPosition(position));
                switch (string){
                    case "0":
                        Intent i = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(i);
                        break;
                        case "1":
                        Intent i1 = new Intent(MainActivity.this, Main3Activity.class);
                        startActivity(i1);
                        break;
                case "2":
                        Intent i2 = new Intent(MainActivity.this, Main4Activity.class);
                        startActivity(i2);
                        break;
                case "3":
                        Intent i3 = new Intent(MainActivity.this, Main5Activity.class);
                        startActivity(i3);
                        break;
                case "4":
                        Intent i4 = new Intent(MainActivity.this, Main6Activity.class);
                        startActivity(i4);
                        break;
                case "5":
                        Intent i5 = new Intent(MainActivity.this, Main7Activity.class);
                        startActivity(i5);
                        break;
                case "6":
                        Intent i6 = new Intent(MainActivity.this, Main8Activity.class);
                        startActivity(i6);
                        break;
                case "7":
                        Intent i7 = new Intent(MainActivity.this, Main9Activity.class);
                        startActivity(i7);
                        break;
                case "8":
                        Intent i8 = new Intent(MainActivity.this, Main10Activity.class);
                        startActivity(i8);
                        break;
                case "9":
                        Intent ii = new Intent(MainActivity.this, Main39Activity.class);
                        startActivity(ii);
                        break;
                case "10":
                        Intent i10 = new Intent(MainActivity.this, Main11Activity.class);
                        startActivity(i10);
                        break;
                case "11":
                        Intent i11 = new Intent(MainActivity.this, Main12Activity.class);
                        startActivity(i11);
                        break;
                case "12":
                        Intent i12 = new Intent(MainActivity.this, Main13Activity.class);
                        startActivity(i12);
                        break;
                case "13":
                        Intent i13 = new Intent(MainActivity.this, Main14Activity.class);
                        startActivity(i13);
                        break;
                case "14":
                        Intent i14 = new Intent(MainActivity.this, Main15Activity.class);
                        startActivity(i14);
                        break;
                case "15":
                        Intent i15 = new Intent(MainActivity.this, Main16Activity.class);
                        startActivity(i15);
                        break;
                case "16":
                        Intent i16 = new Intent(MainActivity.this, Main17Activity.class);
                        startActivity(i16);
                        break;
                case "17":
                        Intent i17 = new Intent(MainActivity.this, Main18Activity.class);
                        startActivity(i17);
                        break;
                case "18":
                        Intent i18 = new Intent(MainActivity.this, Main19Activity.class);
                        startActivity(i18);
                        break;
                case "19":
                        Intent i19 = new Intent(MainActivity.this, Main20Activity.class);
                        startActivity(i19);
                        break;
                case "20":
                        Intent i20 = new Intent(MainActivity.this, Main21Activity.class);
                        startActivity(i20);
                        break;
                case "21":
                        Intent i21 = new Intent(MainActivity.this, Main22Activity.class);
                        startActivity(i21);
                        break;
                case "22":
                        Intent i22 = new Intent(MainActivity.this, Main23Activity.class);
                        startActivity(i22);
                        break;
                case "23":
                        Intent i23 = new Intent(MainActivity.this, Main24Activity.class);
                        startActivity(i23);
                        break;
                case "24":
                        Intent i24 = new Intent(MainActivity.this, Main25Activity.class);
                        startActivity(i24);
                        break;
                case "25":
                        Intent i25 = new Intent(MainActivity.this, Main26Activity.class);
                        startActivity(i25);
                        break;
                case "26":
                        Intent i26 = new Intent(MainActivity.this, Main27Activity.class);
                        startActivity(i26);
                        break;
                case "27":
                        Intent i27 = new Intent(MainActivity.this, Main28Activity.class);
                        startActivity(i27);
                        break;
                case "28":
                        Intent i28 = new Intent(MainActivity.this, Main29Activity.class);
                        startActivity(i28);
                        break;
                case "29":
                        Intent i29 = new Intent(MainActivity.this, Main30Activity.class);
                        startActivity(i29);
                        break;
                case "30":
                        Intent i30 = new Intent(MainActivity.this, Main31Activity.class);
                        startActivity(i30);
                        break;
                case "31":
                        Intent i31 = new Intent(MainActivity.this, Main32Activity.class);
                        startActivity(i31);
                        break;
                case "32":
                        Intent i32 = new Intent(MainActivity.this, Main33Activity.class);
                        startActivity(i32);
                        break;
                case "33":
                        Intent i33 = new Intent(MainActivity.this, Main34Activity.class);
                        startActivity(i33);
                        break;
                case "34":
                        Intent i34 = new Intent(MainActivity.this, Main35Activity.class);
                        startActivity(i34);
                        break;
                case "35":
                        Intent i35 = new Intent(MainActivity.this, Main36Activity.class);
                        startActivity(i35);
                        break;
                        case "36":
                        Intent i36 = new Intent(MainActivity.this, Main37Activity.class);
                        startActivity(i36);
                        break;
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        LinearLayout linearLayout = findViewById(R.id.linear);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if (count == 1){
                    LinearLayout linearLayout = findViewById(R.id.linear);
                    linearLayout.setBackgroundResource(R.drawable.cherch);
                }else if (count == 2){
                    LinearLayout linearLayout = findViewById(R.id.linear);
                    linearLayout.setBackgroundResource(R.drawable.femalestudents);
                }else if (count == 3){
                    LinearLayout linearLayout = findViewById(R.id.linear);
                    linearLayout.setBackgroundResource(R.drawable.gondaliya);
                }else if (count == 4){
                    LinearLayout linearLayout = findViewById(R.id.linear);
                    linearLayout.setBackgroundResource(R.drawable.xoona);
                }else if (count == 5){
                    LinearLayout linearLayout = findViewById(R.id.linear);
                    linearLayout.setBackgroundResource(R.drawable.woogaasa);
                }else if (count == 6){
                    LinearLayout linearLayout = findViewById(R.id.linear);
                    linearLayout.setBackgroundResource(R.drawable.wolaytaclose);
                }else if (count == 7){
                    LinearLayout linearLayout1 = findViewById(R.id.linear);
                    linearLayout1.setBackgroundResource(R.drawable.lemoketa);
                }else if (count == 8){
                    LinearLayout linearLayout1 = findViewById(R.id.linear);
                    linearLayout1.setBackgroundResource(R.drawable.wolaytadance);
                    count = 1;
                }
            }
        });
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.setting){

            LinearLayout linearLayout1 = findViewById(R.id.linear);
            linearLayout1.setBackgroundResource(R.drawable.xoona);
            Intent i = new Intent(MainActivity.this, Setting.class);
            startActivity(i);

        } else if (id == R.id.nav_update) {

            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.learn.wolaytegna.learnwolaytegna"));
            intent1.setPackage("com.android.vending");
            startActivity(intent1);

        } else if (id == R.id.nav_about) {
            LinearLayout linear = findViewById(R.id.linear);
            linear.setBackgroundResource(R.drawable.woogaasa);

            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);

        } else if (id == R.id.nav_rate) {
            LinearLayout linear = findViewById(R.id.linear);
            linear.setBackgroundResource(R.drawable.lemoketa);

            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.learn.wolaytegna.learnwolaytegna"));
            intent1.setPackage("com.android.vending");
            startActivity(intent1);

        } else if (id == R.id.nav_share) {
            LinearLayout linear = findViewById(R.id.linear);
            linear.setBackgroundResource(R.drawable.sodoketema);

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String shareBody = "Download and use this app to understand either spoken english or spoken wolaytic! \n https://play.google.com/store/apps/details?id=com.learn.wolaytegna.learnwolaytegna";
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Spoken wolaytic");
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(shareIntent, "Share via"));


        } else if (id == R.id.nav_exit) {
            MainActivity.this.finish();
        } else if (id == R.id.nav_version){
            LinearLayout linearLayout2 = findViewById(R.id.linear);
            linearLayout2.setBackgroundResource(R.drawable.ajorafall);
        }
        else if (id == R.id.help){
            Intent intent = new Intent(this, help.class);
            startActivity(intent);

        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }


}

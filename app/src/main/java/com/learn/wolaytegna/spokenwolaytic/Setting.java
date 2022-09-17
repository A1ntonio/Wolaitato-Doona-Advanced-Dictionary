package com.learn.wolaytegna.spokenwolaytic;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Set;

public class Setting extends AppCompatActivity {

    RadioButton butn1,butn2;
    RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        setTitle("Setting");

        butn1 = findViewById(R.id.radioButton);
        butn2 = findViewById(R.id.radioButton2);
        group = findViewById(R.id.group);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton) {
                    Setting_spacecraft ss = new Setting_spacecraft("english");
                    new DBAdarter(Setting.this).save_setting(ss);
                    new DBAdarter(Setting.this).deleteSetting("wolaytic");
                }else {
                    Setting_spacecraft ss = new Setting_spacecraft("wolaytic");
                    new DBAdarter(Setting.this).save_setting(ss);
                    new DBAdarter(Setting.this).deleteSetting("english");
                }
            }
        });

        SQLiteDatabase db;
        DBOpenHelper helper = new DBOpenHelper(Setting.this);

        db = helper.getWritableDatabase();

        Cursor c = db.rawQuery("SELECT * FROM " + DBOpenHelper.TABLE_SETTING + ";", null);

        while (c.moveToNext()) {
            if (c.getString(1).equals("english")){
                butn1.setChecked(true);
            }else {
                butn2.setChecked(true);
            }

        }
    }
}

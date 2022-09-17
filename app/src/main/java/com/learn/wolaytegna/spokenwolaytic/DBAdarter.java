package com.learn.wolaytegna.spokenwolaytic;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DBAdarter {

     Context c;
     static SQLiteDatabase db;
    static DBOpenHelper helper;


    public DBAdarter(Context c){
        this.c = c;
        helper = new DBOpenHelper(c);
    }

    public void insertId(int id){
        try{
            db = helper.getWritableDatabase();

            ContentValues cv = new ContentValues();
            cv.put(DBOpenHelper.NOF_DATA, id);

            long result = db.insert(DBOpenHelper.TABLE_NOF_DATA, null, cv);
            if (result>0) {
            }
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            helper.close();
        }
    }



    public void saveSpacecraft(Favorts spacecraft){
        try{
            db = helper.getWritableDatabase();

            ContentValues cv = new ContentValues();
            cv.put(DBOpenHelper.ENGLISH, spacecraft.getEnglish());
            cv.put(DBOpenHelper.WOLAYTEGNA, spacecraft.getWolaytegna());
            cv.put(DBOpenHelper.IMAGE_ID, spacecraft.getImage_id());


            long result = db.insert(DBOpenHelper.TABLE_WOLAYTA, null, cv);
            if (result>0) {
            }
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            helper.close();
        }

    }

    public void saveAllData(Categories1 spacecraft){
        try{
            db = helper.getWritableDatabase();

            ContentValues cv = new ContentValues();
            cv.put(DBOpenHelper.ALLDATA_ENGLISH, spacecraft.getEnglish());
            cv.put(DBOpenHelper.ALLDATA_WOLAYTIC, spacecraft.getWolaytegna());

            long result = db.insert(DBOpenHelper.TABLE_ALLDATA, null, cv);
            if (result>0) {
            }
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            helper.close();
        }
    }

    public ArrayList<Favorts> retrieveSpacecraft() {
        ArrayList<Favorts> spacecrafts = new ArrayList<>();

        try{
            db = helper.getWritableDatabase();

            Cursor c = db.rawQuery("SELECT * FROM " + DBOpenHelper.TABLE_WOLAYTA + ";", null);

            Favorts s;
            spacecrafts.clear();

            while (c.moveToNext()){
                String s_english = c.getString(1);
                String s_wolaytegna = c.getString(2);
                int s_image_id = c.getInt(3);


            s = new Favorts(s_english, s_wolaytegna, s_image_id);

            spacecrafts.add(s);

            }


        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            helper.close();
        }

        return spacecrafts;
    }
    public AllDataSpacecraft retrieveAllData(int idd) {
        AllDataSpacecraft s = new AllDataSpacecraft(null, null);
        try{
            db = helper.getWritableDatabase();

            Cursor c = db.rawQuery("SELECT * FROM " + DBOpenHelper.TABLE_ALLDATA + " WHERE " + DBOpenHelper.ALLDATA_ID + " = " + idd +";", null);



            while (c.moveToNext()){
                String s_english = c.getString(1);
                String s_wolaytegna = c.getString(2);


                s = new AllDataSpacecraft(s_english, s_wolaytegna);

            }


        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            helper.close();
        }

        return s;
    }

    public int nof_alldata(){
        int id = 0;
        try{
            db = helper.getWritableDatabase();

            Cursor c = db.rawQuery("SELECT * FROM " + DBOpenHelper.TABLE_ALLDATA + ";", null);

            while (c.moveToNext()){

                id = c.getInt(0);
            }


        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            helper.close();
        }
        return id;
    }

    public int nof_data(){
        int id = 0;
        try{
            db = helper.getWritableDatabase();

            Cursor c = db.rawQuery("SELECT * FROM " + DBOpenHelper.TABLE_NOF_DATA + ";", null);

            while (c.moveToNext()){

                id = c.getInt(1);
            }


        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            helper.close();
        }
        return id;
    }



    public boolean deleteSingleRow(String select) {

        try{
            db = helper.getWritableDatabase();

            String selection = DBOpenHelper.ENGLISH + " = '"+ select + "'";

            long result = db.delete(DBOpenHelper.TABLE_WOLAYTA,selection, null);
            if (result>0) {
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            helper.close();
        }

        return false;


    }

    public void save_setting(Setting_spacecraft spacecraft){
        try{
            db = helper.getWritableDatabase();

            ContentValues cv = new ContentValues();
            cv.put(DBOpenHelper.CHECKED_LANG, spacecraft.getLanguage());

            long result = db.insert(DBOpenHelper.TABLE_SETTING, null, cv);
            if (result>0) {
            }
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            helper.close();
        }

    }


    public boolean deleteSetting(String select) {

        try{
            db = helper.getWritableDatabase();

            String selection = DBOpenHelper.CHECKED_LANG + " = '"+ select + "'";

            long result = db.delete(DBOpenHelper.TABLE_SETTING,selection, null);
            if (result>0) {
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            helper.close();
        }

        return false;


    }


}

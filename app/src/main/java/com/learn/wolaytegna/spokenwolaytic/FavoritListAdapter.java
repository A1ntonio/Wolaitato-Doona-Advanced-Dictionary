package com.learn.wolaytegna.spokenwolaytic;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Locale;

public class FavoritListAdapter extends ArrayAdapter<Favorts> implements TextToSpeech.OnInitListener {

    private int lastPosition = -1;
    private Context context;
    private int mResource;
    private ArrayList<Favorts> arrayList;
    private TextToSpeech myTTS;

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
                myTTS.setLanguage(Locale.US);
        }
        else if (status == TextToSpeech.ERROR) {
            Toast.makeText(context, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }


    //holds variable in a view
    private static class ViewHolder{
        TextView englishView;
        TextView wolaytaView;
        ImageView imageV;
        ToggleButton tglbtn;
        int image_id;
        Button share_btn;
    }



   public FavoritListAdapter(Context context, int resource, ArrayList<Favorts> objects) {
        super(context, resource, objects);
        this.context = context;
        this.mResource = resource;
        this.arrayList = objects;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Favorts getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull final ViewGroup parent) {

       Favorts favorts = new Favorts(getItem(position).getEnglish(),getItem(position).getWolaytegna(),getItem(position).getImage_id());

       final ViewHolder holder;

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(mResource, parent, false);

            TextView englishTextView = convertView.findViewById(R.id.textView3);
            TextView WolaytegnaTextView = convertView.findViewById(R.id.textView4);
            ImageView imgFlag = convertView.findViewById(R.id.imageView2);
            ToggleButton tgl = convertView.findViewById(R.id.togglebtn);
            Button share = convertView.findViewById(R.id.share_btn);

            holder = new ViewHolder();
            holder.englishView = englishTextView;
            holder.wolaytaView = WolaytegnaTextView;
            holder.imageV = imgFlag;
            holder.tglbtn = tgl;
            holder.image_id = favorts.getImage_id();
            holder.share_btn = share;

            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        Animation animation = AnimationUtils.loadAnimation(context, (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        convertView.startAnimation(animation);
        lastPosition = position;


        holder.tglbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (holder.tglbtn.isChecked()){
                    String s = holder.englishView.getText().toString();
                    String s1 = holder.wolaytaView.getText().toString();
                    int i = holder.image_id;
                    Favorts favorts = new Favorts(s,s1,i);
                    new DBAdarter(context).saveSpacecraft(favorts);
               }else {
                   new DBAdarter(context).deleteSingleRow(holder.englishView.getText().toString());
               }

            }
        });

        SQLiteDatabase db;
        DBOpenHelper helper = new DBOpenHelper(context);

        db = helper.getWritableDatabase();

        Cursor c = db.rawQuery("SELECT * FROM " + DBOpenHelper.TABLE_SETTING + ";", null);
        myTTS = new TextToSpeech(context,this);
        while (c.moveToNext()) {
            if (c.getString(1).equals("english")){
                holder.imageV.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String words = holder.englishView.getText().toString();
                        myTTS.speak(words, TextToSpeech.QUEUE_FLUSH, null);
                    }
                });
            }else {
                holder.imageV.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(context, holder.image_id);
                        mp.start();
                    }
                });
            }

        }

        holder.share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareBody = holder.englishView.getText().toString() + "\n\n" + holder.wolaytaView.getText().toString();
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Learn Wolayta language and spoken english!!!");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                context.startActivity(Intent.createChooser(shareIntent, "Share via"));

            }
        });

        convertView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareBody = holder.englishView.getText().toString() + "\n\n" + holder.wolaytaView.getText().toString();
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Learn Wolaytegna");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                context.startActivity(Intent.createChooser(shareIntent, "Share via"));
                return false;
            }
        });

        holder.englishView.setText(favorts.getEnglish());
        holder.wolaytaView.setText(favorts.getWolaytegna());
        holder.imageV.setImageResource(R.drawable.ic_volume_up_black_24dp);
        holder.tglbtn.setChecked(true);

        return convertView;
    }

}

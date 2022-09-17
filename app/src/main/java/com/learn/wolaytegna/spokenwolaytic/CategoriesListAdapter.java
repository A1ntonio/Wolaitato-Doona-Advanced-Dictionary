package com.learn.wolaytegna.spokenwolaytic;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoriesListAdapter extends ArrayAdapter<Categories> {

    private int lastPosition = -1;
    private Context context;
    private int mResource;
    private ArrayList<Categories> arrayList;


    //holds variable in a view
    private static class ViewHolder{
        TextView englishView;
        TextView wolaytaView;
        ImageView imageV;
    }


   public CategoriesListAdapter(Context context, int resource, ArrayList<Categories> objects) {
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
    public Categories getItem(int position) {
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

       Categories categories = new Categories(getItem(position).getEnglish(),getItem(position).getWolaytegna(),getItem(position).getImUrl());

       ViewHolder holder;

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(mResource, parent, false);

            TextView englishTextView = convertView.findViewById(R.id.textView3);
            TextView WolaytegnaTextView = convertView.findViewById(R.id.textView4);
            ImageView imgFlag = convertView.findViewById(R.id.imageView2);

            holder = new ViewHolder();
            holder.englishView = englishTextView;
            holder.wolaytaView = WolaytegnaTextView;
            holder.imageV = imgFlag;

            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        Animation animation = AnimationUtils.loadAnimation(context, (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        convertView.startAnimation(animation);
        lastPosition = position;

        holder.englishView.setText(categories.getEnglish());
        holder.wolaytaView.setText(categories.getWolaytegna());
        holder.imageV.setImageResource(categories.getImUrl());

        return convertView;
    }
}

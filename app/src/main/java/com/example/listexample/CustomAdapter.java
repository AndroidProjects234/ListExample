package com.example.listexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter  extends ArrayAdapter<String> {
     CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row,foods);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater buckysinflater=LayoutInflater.from(getContext());//  get the reference of an activity
        View customView=buckysinflater.inflate(R.layout.custom_row,parent,false);
        String singleFoodItem =getItem(position);  //get an item at that position
        ImageView buckysImage=(ImageView)customView.findViewById(R.id.buckysImage);
        TextView buckysText=(TextView)customView.findViewById(R.id.buckysText);
         buckysImage.setImageResource(R.drawable.chunky);
        buckysText.setText(singleFoodItem);
        return customView;

    }
}

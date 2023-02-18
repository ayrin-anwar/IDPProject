package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter1 extends BaseAdapter {
    Context context;
    int logos[];
    LayoutInflater inflter;
    public CustomAdapter1(Context applicationContext, int[] logos) {
        this.context = applicationContext;
        this.logos = logos;
        inflter = (LayoutInflater.from(applicationContext));
    }
    public int getCount()
    {
        return logos.length;
    }


    public Object getItem(int i) {
        return null;
    }


    public long getItemId(int i) {
        return 0;
    }
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_gridview, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.icon); // get the reference of ImageView
        icon.setImageResource(logos[i]); // set logo images
        return view;
    }

}

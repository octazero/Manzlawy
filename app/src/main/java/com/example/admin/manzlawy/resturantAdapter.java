package com.example.admin.manzlawy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class resturantAdapter extends ArrayAdapter {

    int[]imgs;
    String[]names;
    String[]rating;
    Context c;
    LayoutInflater li;
    public resturantAdapter(Context context, String[]name,String[]price,int[] img) {
        super(context, R.layout.food_model,name);
        this.imgs=img;
        this.c=context;
        this.names=name;
        this.rating=price;
    }


    /*@Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }*/

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            li= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=li.inflate(R.layout.resturant_model,null);
        }
        final ResturantHolder vh=new ResturantHolder();
        vh.name = (TextView) convertView.findViewById(R.id.textView3);
        vh.rating= (TextView) convertView.findViewById(R.id.textView4);
        vh.im= (ImageView) convertView.findViewById(R.id.imageView3);
        vh.im.setImageResource(imgs[position]);
        vh.name.setText(names[position]);
        vh.rating.setText("Rating "+rating[position]);
        return convertView;
    }
    private class ResturantHolder{
        public TextView name;
        public TextView rating;
        public ImageView im;
    }
}


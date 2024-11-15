package com.example.admin.manzlawy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class foodAdapter extends ArrayAdapter {

    int[]imgs;
    String[]names;
    String[]prices;
    Context c;
    LayoutInflater li;
    public foodAdapter(Context context, String[]name,String[]price,int[] img) {
        super(context, R.layout.food_model,name);
        this.imgs=img;
        this.c=context;
        this.names=name;
        this.prices=price;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            li= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=li.inflate(R.layout.food_model,null);
        }
        final FoodHolder vh=new FoodHolder();
        vh.name = (TextView) convertView.findViewById(R.id.Name);
        vh.price= (TextView) convertView.findViewById(R.id.textView2);
        vh.im= (ImageView) convertView.findViewById(R.id.imageView);
        vh.im.setImageResource(imgs[position]);
        vh.name.setText(names[position]);
        vh.price.setText(prices[position]);
        return convertView;
    }



    private class FoodHolder{

        public TextView name;
        public TextView price;
        public ImageView im;
    }
}

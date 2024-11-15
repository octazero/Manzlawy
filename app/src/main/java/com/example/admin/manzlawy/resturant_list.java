package com.example.admin.manzlawy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class resturant_list extends AppCompatActivity {
    ListView lv;
    String[]names;
    String []rating;
    int[] imgs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant_list);
        names=new String[]{"el 7aga reda"};
        rating=new String[]{"4.1"};
        imgs=new int[]{R.drawable.el7aga};
        lv= (ListView) findViewById(R.id.ResturantList);
        resturantAdapter ra=new resturantAdapter(this,names,rating,imgs);
        lv.setAdapter(ra);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),food_list.class);
                startActivity(intent);
            }
        });
    }
}

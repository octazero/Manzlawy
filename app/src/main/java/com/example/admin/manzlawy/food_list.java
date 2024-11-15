package com.example.admin.manzlawy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class food_list extends AppCompatActivity {
    ListView lv;
    String[]names;
    String []prices;
    int[] imgs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        names=new String[]{"om3li"};
        prices=new String[]{"50"};
        imgs=new int[]{R.drawable.om3li,R.drawable.molokheya_egypt_2012};
        lv= (ListView) findViewById(R.id.lvs);
        foodAdapter fd=new foodAdapter(this,names,prices,imgs);
        lv.setAdapter(fd);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),FoodDetails.class);
                startActivity(intent);
            }
        });
    }
}

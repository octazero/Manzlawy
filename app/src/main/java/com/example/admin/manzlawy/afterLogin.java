package com.example.admin.manzlawy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class afterLogin extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        button = (Button)findViewById(R.id.searchForFood);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign = new Intent(getApplicationContext(),Search.class);
                startActivity(sign);
            }
        });

    }
    @Override
    public  boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.Id)
        {
            Intent intent = new Intent(getApplicationContext(),Profile.class);
            startActivity(intent);
        }
        if(item.getItemId() == R.id.Id1)
        {
            Intent intent = new Intent(getApplicationContext(),food_list.class);
            startActivity(intent);
        }
        return true;
    }
}

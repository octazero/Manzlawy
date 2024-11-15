package com.example.admin.manzlawy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

    Spinner mo7afazat, amaken;
    Button register, signin, searchForFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        mo7afazat = (Spinner) findViewById(R.id.mo7afzat);
        amaken = (Spinner) findViewById(R.id.amaken);
        register = (Button) findViewById(R.id.register);
        signin = (Button) findViewById(R.id.signin);
        searchForFood = (Button) findViewById(R.id.searchForFood);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(getApplicationContext(),Register.class);
                startActivity(reg);
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign = new Intent(getApplicationContext(),SignIn.class);
                startActivity(sign);
            }
        });

        searchForFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign = new Intent(getApplicationContext(),Search.class);
                startActivity(sign);
            }
        });

    }
}

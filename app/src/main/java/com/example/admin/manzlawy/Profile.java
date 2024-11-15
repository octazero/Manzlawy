package com.example.admin.manzlawy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    TextView Name,Age,Address;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        button = (Button)findViewById(R.id.EditProfile);
        Name = (TextView)findViewById(R.id.Name);
        Age = (TextView)findViewById(R.id.Age);
        Address = (TextView)findViewById(R.id.Address);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),EditProfile.class);
                intent.putExtra("Name", Name.getText());
                intent.putExtra("Age", Age.getText());
                intent.putExtra("Address", Address.getText());
                startActivity(intent);
            }
        });
    }
}


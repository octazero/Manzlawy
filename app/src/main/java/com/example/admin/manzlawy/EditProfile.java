package com.example.admin.manzlawy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditProfile extends AppCompatActivity {

    EditText Name,Age,Address;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        Name = (EditText)findViewById(R.id.NameEdit);
        Age = (EditText)findViewById(R.id.AgeEdit);
        Address = (EditText)findViewById(R.id.AddressEdit);
        Name.setText(getIntent().getStringExtra("Name"));
        Age.setText(getIntent().getStringExtra("Age"));
        Address.setText(getIntent().getStringExtra("Address"));
        button = (Button)findViewById(R.id.Done);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Name.setText("Seif");
            }
        });
    }
}

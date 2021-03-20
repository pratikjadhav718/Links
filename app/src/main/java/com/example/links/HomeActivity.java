package com.example.links;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = findViewById(R.id.gbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Activity2Intent = new Intent(getApplicationContext(),gweb.class);
                startActivity(Activity2Intent);
            }
        });

        button = findViewById(R.id.fbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Activity2Intent = new Intent(getApplicationContext(),fweb.class);
                startActivity(Activity2Intent);
            }
        });

        button = findViewById(R.id.tbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Activity2Intent = new Intent(getApplicationContext(),tweb.class);
                startActivity(Activity2Intent);
            }
        });

        button = findViewById(R.id.ibutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Activity2Intent = new Intent(getApplicationContext(),iweb.class);
                startActivity(Activity2Intent);
            }
        });

        button = findViewById(R.id.ybutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Activity2Intent = new Intent(getApplicationContext(),yweb.class);
                startActivity(Activity2Intent);
            }
        });

    }
}
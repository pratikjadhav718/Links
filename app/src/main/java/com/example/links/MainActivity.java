package com.example.links;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.postDelayed(r ,3000);
    }

    Runnable r = new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(MainActivity.this,HomeActivity.class));
            finish();
        }
    };
}
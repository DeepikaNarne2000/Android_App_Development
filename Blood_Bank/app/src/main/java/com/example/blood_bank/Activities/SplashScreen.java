package com.example.blood_bank.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.blood_bank.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
Toast.makeText(getApplicationContext(),"Please Wait....",Toast.LENGTH_SHORT).show();  
    }
}

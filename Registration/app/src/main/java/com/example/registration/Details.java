package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String name =getIntent().getStringExtra("myname");
        String roll =getIntent().getStringExtra("myroll");
        String mobile =getIntent().getStringExtra("mymobile");
        String email =getIntent().getStringExtra("myemail");
        String password =getIntent().getStringExtra("mypassword");
        String gender =getIntent().getStringExtra("mygender");
        tv = findViewById(R.id.details);
        tv.setText(name+"\n"+roll+"\n"+mobile+"\n"+email+"\n"+password+"\n"+gender);
    }
}

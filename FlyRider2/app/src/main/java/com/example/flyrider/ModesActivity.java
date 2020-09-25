package com.example.flyrider;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ModesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);

        findViewById(R.id.forest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ModesActivity.this, GameActivity.class));

                //Intent intent = new Intent(ModesActivity.this, Background.class);
                //String mode = "forest";
                //intent.putExtra("mode",mode);
                //startActivity(intent);
            }

        });

        findViewById(R.id.desert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ModesActivity.this, GameActivity.class));

                //Intent intent = new Intent(ModesActivity.this, Background.class);
                //String mode = "Desert";
                //intent.putExtra("mode",mode);
                //startActivity(intent);
            }
        });

    }
}
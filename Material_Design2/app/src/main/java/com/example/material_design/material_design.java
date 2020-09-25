package com.example.material_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.snackbar.Snackbar;

public class material_design extends AppCompatActivity {
    Snackbar snackbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design);

        findViewById(R.id.snackbar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view,"this is snackbar", Snackbar.LENGTH_LONG);
                Snackbar.setAction("retry",new View.OnClickListener(){
                    public void onClick(View view){
                        Toast.makeText(material_design.this,"retry", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.setBackgroundTint(getResources().getColor(R.color.materialPrimary));
                snackbar.setActionTextColor(getResources().getColor(android.R.color.white));
                snackbar.show();

            }
        });
        findViewById(R.id.datePicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                MaterialDatePicker.Builder builderdate =
                        MaterialDatePicker.Builder.datePicker();
                final MaterialDatePicker materialDatePicker = builderdate.build();
                materialDatePicker.show(getSupportFragmentManager(),"");
                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection){
                        snackbar=Snackbar.make(view,""+materialDatePicker.getHeaderText(),Snackbar.LENGTH_LONG);
                        snackbar.show();
                    }
                });


            }
        });
    }
}
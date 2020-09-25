package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_name,et_mobile,et_email,et_password,et_roll;
    RadioButton rd1,rd2;
    Spinner sp_branch;
    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_roll = findViewById(R.id.rollnum);
        et_name = findViewById(R.id.username);
        et_mobile = findViewById(R.id.phonenum);
        et_email = findViewById(R.id.email);
        et_password = findViewById(R.id.passwrd);
        sp_branch = findViewById(R.id.branch);
        ArrayAdapter<CharSequence> branchAdapter = ArrayAdapter.createFromResource(this,R.array.branch,android.R.layout.simple_spinner_item);
        sp_branch.setAdapter(branchAdapter);
    }


    public void submit(View view) {
        String name = et_name.getText().toString();
        String roll = et_name.getText().toString();
        String mobile = et_mobile.getText().toString();
        String email = et_email.getText().toString();
        String pass = et_password.getText().toString();
        if(name.isEmpty() || roll.isEmpty() || mobile.isEmpty() || email.isEmpty() || pass.isEmpty()){
            Toast.makeText(this, "Please Enter The Details", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(MainActivity.this, Details.class);
            i.putExtra("myroll", roll);
            i.putExtra("myname", name);
            i.putExtra("mymobile", mobile);
            i.putExtra("myemail", email);
            i.putExtra("mypassword", pass);
            i.putExtra("mygender",gender);
            startActivity(i);
        }
    }
}

package com.example.lucenamargaquiz4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtName,txtPassword,txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName = findViewById(R.id.etEmail2);
        txtPassword = findViewById(R.id.tvPassword);
        txtEmail = findViewById(R.id.etEmail2);
    }

    public void showScreen2(View v){
        String name = txtName.getText().toString();
        Intent i3 = new Intent(this, Main3Activity.class);
        i3.putExtra("person", name);
        startActivity(i3);
    }

    public void goRegister(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
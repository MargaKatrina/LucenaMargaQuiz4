package com.example.lucenamargaquiz4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtName, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName = findViewById(R.id.tvName);
        txtPassword = findViewById(R.id.tvPassword);
    }

    public void displayUser(View v){
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        txtName.setText(sp.getString("user", ""));
        txtPassword.setText(sp.getString("pwd", ""));
    }

    public void showScreen3(View v){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }
}

package com.example.lucenamargaquiz4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.etEmail);
        txtPassword = findViewById(R.id.etPassword);
        txtEmail = findViewById(R.id.etEmail);
    }

    public void goLogin(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void saveInfo(View v){
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("user", txtName.getText().toString());
        editor.putString("pwd", txtPassword.getText().toString());
        editor.putString("Email", txtEmail.getText().toString());
        editor.commit();
        Toast.makeText(this, "Registered Successfully", Toast.LENGTH_LONG).show();
    }
    public void showScreen3(View v){
        String name = txtEmail.getText().toString();
        Intent i3 = new Intent(this, Main3Activity.class);
        i3.putExtra("person", name);
        startActivity(i3);
    }
}
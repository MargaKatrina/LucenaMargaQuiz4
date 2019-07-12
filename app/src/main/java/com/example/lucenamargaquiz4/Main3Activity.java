package com.example.lucenamargaquiz4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    TextView txtGreeting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txtGreeting = findViewById(R.id.tvGreeting);
        Intent intent = getIntent();
        String str = intent.getStringExtra("person");
        txtGreeting.setText("Welcome " + str);
    }


    public void showScreen2(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}


package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView nameTV = this.findViewById(R.id.input);
        TextView nameTV2 = this.findViewById(R.id.number);

    }

    public void onNextScreenButtonClicked(View v) {

        Intent i = new Intent(this, Screen3.class);

        this.startActivity(i);
    }
}
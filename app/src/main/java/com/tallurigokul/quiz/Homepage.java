package com.tallurigokul.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
package com.tallurigokul.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tallurigokul.quiz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        System.out.println("Hello");
        System.out.println("Hello2");
    }
}
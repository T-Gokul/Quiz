package com.tallurigokul.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText name, email, reg, pass, contact;
    Spinner year, sem, sec;
    ImageView passSH;
    Button signUp;

    String[] yearList = {"Year", "1", "2", "3", "4"};
    String[] semList = {"Semester", "1", "2", "3", "4", "5", "6", "7", "8"};
    String[] secList = {"Section", "A", "B", "C", "D"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        reg = findViewById(R.id.regNum);
        pass = findViewById(R.id.password);
        contact = findViewById(R.id.phone);
        year = findViewById(R.id.year);
        sem = findViewById(R.id.semester);
        sec = findViewById(R.id.section);
        passSH = findViewById(R.id.show_pass);
        signUp = findViewById(R.id.signUp);

        ArrayAdapter<String> yrAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, yearList);
        yrAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        year.setAdapter(yrAdapter);

        ArrayAdapter<String> semAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, semList);
        semAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sem.setAdapter(semAdapter);

        ArrayAdapter<String> secAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, secList);
        secAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sec.setAdapter(secAdapter);

        passSH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pass.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                    passSH.setImageResource(R.drawable.passwordhide);
                    pass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    passSH.setImageResource(R.drawable.passwordshow);
                    pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter Name", Toast.LENGTH_SHORT).show();
                } else if (reg.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter Register Number", Toast.LENGTH_SHORT).show();
                } else if (email.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter Email Id", Toast.LENGTH_SHORT).show();
                } else if (pass.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter Password", Toast.LENGTH_SHORT).show();
                } else if (year.getSelectedItem().toString().equals("Year")) {
                    Toast.makeText(getApplicationContext(), "Please Select Year", Toast.LENGTH_SHORT).show();
                } else if (sem.getSelectedItem().toString().equals("Semester")) {
                    Toast.makeText(getApplicationContext(), "Please Select Semester", Toast.LENGTH_SHORT).show();
                } else if (sec.getSelectedItem().toString().equals("Section")) {
                    Toast.makeText(getApplicationContext(), "Please Select Section", Toast.LENGTH_SHORT).show();
                } else if (contact.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter Contact Number", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(SignUp.this, Homepage.class);
                    startActivity(intent);
                }
            }
        });

    }
}
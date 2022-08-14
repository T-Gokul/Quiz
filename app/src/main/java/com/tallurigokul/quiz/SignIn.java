package com.tallurigokul.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    EditText reg,pass;
    TextView signUp;
    ImageView passSH;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        reg=findViewById(R.id.regNum);
        pass=findViewById(R.id.password);
        passSH=findViewById(R.id.show_pass);
        signIn=findViewById(R.id.signIn);
        signUp=findViewById(R.id.signUpTv);

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

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (reg.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter Register Number", Toast.LENGTH_SHORT).show();
                } else if (pass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter Password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(SignIn.this,Homepage.class);
                    startActivity(intent);
                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignIn.this,SignUp.class);
                startActivity(intent);
            }
        });

    }
}
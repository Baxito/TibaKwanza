package com.example.miriam.tibakwanza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    //Variable declaration
Button login;
EditText regNo,pass;
TextView sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//Variable initialization
        login = findViewById(R.id.button);
        regNo = findViewById(R.id.reg_no);
        pass = findViewById(R.id.password);
        sign_up = findViewById(R.id.signUp);

        //Starting new activity from login button
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        //Starting new activity from login button
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,AppnActivity.class);
                startActivity(intent);
            }
        });

    }

}

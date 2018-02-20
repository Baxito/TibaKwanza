package com.example.miriam.tibakwanza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppnActivity extends AppCompatActivity {

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appn);
        submit = (Button)findViewById(R.id.button2);
        //Starting new activity from login button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AppnActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }

}

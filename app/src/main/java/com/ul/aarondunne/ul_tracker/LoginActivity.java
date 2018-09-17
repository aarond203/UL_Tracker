package com.ul.aarondunne.ul_tracker;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText studID = findViewById(R.id.stud_ID);
        final EditText studPassword = findViewById(R.id.stud_pass);

        final Button loginButton = findViewById(R.id.login_button);
        final Button registerButton = findViewById(R.id.reg_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(LoginActivity.this, MainScreenActivity.class);
                startActivity(l);
                finish();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent regIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(regIntent);
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            }
        });

    }
}

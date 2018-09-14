package com.ul.aarondunne.ul_tracker;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final Intent i = new Intent(SplashScreen.this, LoginActivity.class);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(i);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
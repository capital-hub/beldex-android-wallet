package com.m2049r.xmrwallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.m2049r.xmrwallet.onboarding.OnBoardingManager;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method is used so that your splash activity
        //can cover the entire screen.

        setContentView(R.layout.activity_splashscreen);
        //this will bind your MainActivity.class file with activity_main.

        int SPLASH_SCREEN_TIME_OUT = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                OnBoardingManager.setOnBoardingShown(getApplicationContext());
                startActivity(new Intent(Splashscreen.this, LoginActivity.class));
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}

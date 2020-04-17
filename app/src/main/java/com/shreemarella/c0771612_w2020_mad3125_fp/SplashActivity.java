package com.shreemarella.c0771612_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity
{
    private int SPLASH_TIMING = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent hint = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(hint);
                finish();
            }
        },SPLASH_TIMING);
    }
    }
}

package com.example.irmayanti.irmayantisyam_1202154347_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        //membuat method handler untuk menahan lamanya splash screen
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                //membuat sekaligus memulai intent untuk perpindahan halaman
                finish();
            }
        }, 3000L); //menentukan waktu munculnya
    }
}

package com.rdwn.myapps.Slide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rdwn.myapps.MainActivity;
import com.rdwn.myapps.R;

/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 29 April 2019
 */

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                    startActivity(intent);

                }
            }
        };
        timerThread.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

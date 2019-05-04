package com.rdwn.myapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 29 April 2019
 */

public class Splash extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, WindowManager.LayoutParams.TYPE_STATUS_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(Splash.this, MainActivity.class));
                    finish();
                }

            }
        };
        thread.start();
    }
}

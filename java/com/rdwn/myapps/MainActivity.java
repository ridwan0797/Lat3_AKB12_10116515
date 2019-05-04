package com.rdwn.myapps;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.rdwn.myapps.Fragment.DailyFragment;
import com.rdwn.myapps.Fragment.GalleryFragment;
import com.rdwn.myapps.Fragment.HomeFragment;
import com.rdwn.myapps.Fragment.MusicFragment;
import com.rdwn.myapps.Fragment.ProfileFragment;


/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 30 April 2019
 */

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// set default nya Home Fragment
        loadFragment(new HomeFragment());
        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        // listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment){
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;
            case R.id.navigation_daily:
                fragment = new DailyFragment();
                break;
            case R.id.navigation_gallery:
                fragment = new GalleryFragment();
                break;
            case R.id.navigation_music:
                fragment = new MusicFragment();
                break;
            case R.id.navigation_profile:
                fragment = new ProfileFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
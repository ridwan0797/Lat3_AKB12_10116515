package com.rdwn.myapps.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdwn.myapps.R;

/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 1 Mei 2019
 */


public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

}

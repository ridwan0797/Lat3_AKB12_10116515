package com.rdwn.myapps.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rdwn.myapps.R;

/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 1 Mei 2019
 */


public class ProfileFragment extends Fragment {

    ImageView fb;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);




    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        ImageView fb = (ImageView) view.findViewById(R.id.facebook);
        ImageView tw = (ImageView) view.findViewById(R.id.twitter);
        ImageView ig = (ImageView) view.findViewById(R.id.instagram);
        ImageView mp = (ImageView) view.findViewById(R.id.mapView);


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uriUrl = Uri.parse("https://facebook.com/ara.sisipit");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });


        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uriUrl = Uri.parse("https://twitter.com/vampirkw?s=09t");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });


        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uriUrl = Uri.parse("https://www.google.com/maps/place/Puri+Kahuripan+Residence/@-6.8626086,107.5312417,18z/data=!4m5!3m4!1s0x2e68e46399a62cef:0x57187fe351e5dc60!8m2!3d-6.862504!4d107.5318066");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });






    }


}

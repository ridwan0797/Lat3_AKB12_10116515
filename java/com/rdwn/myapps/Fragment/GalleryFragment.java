package com.rdwn.myapps.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdwn.myapps.Adapter.GalleryListAdapter;
import com.rdwn.myapps.Model.Gallery;
import com.rdwn.myapps.R;
import com.rdwn.myapps.Widgets.GridMarginDecoration;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 2-3 Mei 2019
 */


public class GalleryFragment extends Fragment implements GalleryListAdapter.OnGridItemSelectedListener{

    private RecyclerView lvSingle;
    private GridLayoutManager gridLayoutManager;
    private GalleryListAdapter galleryListAdapter;

    private Context context;

    public static GalleryFragment newInstance() {
        return new GalleryFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        lvSingle = (RecyclerView) rootView.findViewById(R.id.lvSingle);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        galleryListAdapter = new GalleryListAdapter(this);
        gridLayoutManager = new GridLayoutManager(context, 2);

        lvSingle.setLayoutManager(gridLayoutManager);
        lvSingle.addItemDecoration(new GridMarginDecoration(context, 2, 2, 2, 2));
        lvSingle.setAdapter(galleryListAdapter);

        loadData();
    }

    private void loadData(){
        List<Gallery> singleList = new ArrayList<>();
        Gallery single;

        int img[] = {R.drawable.gh, R.drawable.gi,
                R.drawable.gc, R.drawable.gd,
                R.drawable.gk, R.drawable.gf,
                R.drawable.ga, R.drawable.gb};

        String title[] = {"Music Store", "Train NY",
                "Seoul", "Tokyo",
                "BMW R-100 Custom Project 1", "BMW R-100 Custom Project 2",
                "DCIM 7", "DCIM 11"};

        for (int i = 0; i < img.length; i++){
            single = new Gallery();

            single.setImg(img[i]);
            single.setTitle(title[i]);

            singleList.add(single);
        }

        galleryListAdapter.addAll(singleList);
    }

    @Override
    public void onGridItemClick(View v, int position) {
        Toast.makeText(context, galleryListAdapter.getItem(position).getTitle(), Toast.LENGTH_SHORT).show();
    }
}
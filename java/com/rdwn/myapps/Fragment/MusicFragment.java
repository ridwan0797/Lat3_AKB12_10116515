package com.rdwn.myapps.Fragment;


/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 3-4  Mei 2019
 */



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

import com.rdwn.myapps.Adapter.ListAdapter;
import com.rdwn.myapps.Adapter.ListAdapterd;
import com.rdwn.myapps.Adapter.MusicAdapter;
import com.rdwn.myapps.Adapter.VideoAdapter;
import com.rdwn.myapps.Model.Music;
import com.rdwn.myapps.Model.Video;
import com.rdwn.myapps.R;

public class MusicFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclermusic_view);
        RecyclerView recyclerViewz = (RecyclerView) view.findViewById(R.id.recyclervideo_view);

        MusicAdapter listAdapter = new MusicAdapter();
        VideoAdapter listAdapterd = new VideoAdapter();


        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);


        recyclerViewz.setAdapter(listAdapterd);
        RecyclerView.LayoutManager layoutManagerh = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        recyclerViewz.setLayoutManager(layoutManagerh);

        return view;
    }
}

package com.rdwn.myapps.Adapter;

/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 3-4  Mei 2019
 */


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rdwn.myapps.Model.Music;
import com.rdwn.myapps.Model.OurData;
import com.rdwn.myapps.R;

public class MusicAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_music, parent, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        ((ListViewHolder)viewHolder).bindView(i);

    }

    @Override
    public int getItemCount() {
        return Music.Artis.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        private TextView mArtis,mJudul;
        private ImageView mAlbum;

        public ListViewHolder(View itemView){

            super(itemView);

            mArtis = (TextView) itemView.findViewById(R.id.nama_artis);
            mJudul = (TextView) itemView.findViewById(R.id.judul);
            mAlbum = (ImageView) itemView.findViewById(R.id.album);
            itemView.setOnClickListener(this);
        }


        public void bindView(int position) {


            mArtis.setText(Music.Artis[position]);
            mJudul.setText(Music.judul[position]);
            mAlbum.setImageResource(Music.album[position]);
        }

        public void onClick(View view) {


        }

    }
}


package com.rdwn.myapps.Adapter;

/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 3-4  Mei 2019
 */



import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rdwn.myapps.Model.Music;
import com.rdwn.myapps.Model.OurData;
import com.rdwn.myapps.Model.Video;
import com.rdwn.myapps.R;

public class VideoAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_video, parent, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        ((ListViewHolder)viewHolder).bindView(i);


    }

    @Override
    public int getItemCount() {
        return Video.desc_video.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        private TextView mDesc;
        private ImageView mTumb,mPlay;

        public ListViewHolder(View itemView){

            super(itemView);


            mDesc = (TextView) itemView.findViewById(R.id.thumb_desc);
            mTumb = (ImageView) itemView.findViewById(R.id.thumb);
            itemView.setOnClickListener(this);
        }


        public void bindView(int position) {


            mDesc.setText(Video.desc_video[position]);
            mTumb.setImageResource(Video.tumb_video[position]);

        }

        public void onClick(View view) {


        }

    }
}



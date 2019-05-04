package com.rdwn.myapps.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rdwn.myapps.Model.OurData;
import com.rdwn.myapps.R;

/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 2-3 Mei 2019
 */


public class ListAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        ((ListViewHolder)viewHolder).bindView(i);

    }

    @Override
    public int getItemCount() {
        return OurData.title.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        private TextView mImageText,mDesc;
        private ImageView mImage;

        public ListViewHolder(View itemView){

            super(itemView);

            mImageText = (TextView) itemView.findViewById(R.id.image_name);
            mDesc = (TextView) itemView.findViewById(R.id.desc);
            mImage = (ImageView) itemView.findViewById(R.id.imaged);
            itemView.setOnClickListener(this);
        }


        public void bindView(int position) {


            mImageText.setText(OurData.title[position]);
            mDesc.setText(OurData.desc[position]);
            mImage.setImageResource(OurData.picturePath[position]);
        }

        public void onClick(View view) {


        }

    }
}

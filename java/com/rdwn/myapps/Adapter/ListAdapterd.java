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


public class ListAdapterd extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewz = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listhor, parent, false);
        return  new ListViewHolder(viewz);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        ((ListViewHolder)viewHolder).bindView(i);

    }

    @Override
    public int getItemCount() {
        return OurData.nama.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        private TextView mNama;
        private ImageView mFoto;

        public ListViewHolder(View itemView){

            super(itemView);


            mNama = (TextView) itemView.findViewById(R.id.nama);
            mFoto = (ImageView) itemView.findViewById(R.id.foto);
            itemView.setOnClickListener(this);
        }


        public void bindView(int position) {


            mNama.setText(OurData.nama[position]);
            mFoto.setImageResource(OurData.foto[position]);
        }

        public void onClick(View view) {


        }

    }
}


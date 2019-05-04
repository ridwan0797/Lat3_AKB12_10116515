package com.rdwn.myapps.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import com.rdwn.myapps.R;
import com.rdwn.myapps.Model.Gallery;

/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 2-3 Mei 2019
 */


public class GalleryListAdapter extends RecyclerView.Adapter<GalleryListAdapter.SingleViewHolder>{

    private List<Gallery> singleList;
    private OnGridItemSelectedListener onGridItemSelectedListener;

    public GalleryListAdapter(OnGridItemSelectedListener onGridItemSelectedListener) {
        this.onGridItemSelectedListener = onGridItemSelectedListener;
        singleList = new ArrayList<>();
    }

    private void add(Gallery item) {
        singleList.add(item);
        notifyItemInserted(singleList.size() - 1);
    }

    public void addAll(List<Gallery> singleList) {
        for (Gallery single : singleList) {
            add(single);
        }
    }

    public void remove(Gallery item) {
        int position = singleList.indexOf(item);
        if (position > -1) {
            singleList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public Gallery getItem(int position){
        return singleList.get(position);
    }

    @Override
    public SingleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_gallery, parent, false);
        final SingleViewHolder singleViewHolder = new SingleViewHolder(view);
        singleViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int adapterPos = singleViewHolder.getAdapterPosition();
                if (adapterPos != RecyclerView.NO_POSITION) {
                    if (onGridItemSelectedListener != null) {
                        onGridItemSelectedListener.onGridItemClick(singleViewHolder.itemView, adapterPos);
                    }
                }
            }
        });
        return singleViewHolder;
    }

    @Override
    public void onBindViewHolder(SingleViewHolder holder, int position) {
        final Gallery single = singleList.get(position);
        holder.img.setImageResource(single.getImg());
        holder.title.setText(single.getTitle());
    }

    @Override
    public int getItemCount() {
        return singleList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public class SingleViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title;
        public SingleViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }

    public interface OnGridItemSelectedListener {
        void onGridItemClick(View v, int position);
    }
}

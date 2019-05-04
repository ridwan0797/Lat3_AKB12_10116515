package com.rdwn.myapps.Widgets;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Nama : Ridwan Maulana
 * NIM : 10116515
 * Kelas : AKB 12
 * Waktu Pengerjaan : 2-3  Mei 2019
 */


public class GridMarginDecoration extends RecyclerView.ItemDecoration {

    private int left;
    private int right;
    private int top;
    private int bottom;

    public GridMarginDecoration(Context context, int left, int right, int top, int bottom) {

        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public void getItemOffsets(
            Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.set(left, top, right, bottom);
    }
}
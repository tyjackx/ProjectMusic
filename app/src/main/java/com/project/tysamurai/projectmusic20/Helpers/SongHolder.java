package com.project.tysamurai.projectmusic20.Helpers;

import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.project.tysamurai.projectmusic20.R;

/**
 * Created by tanay on 8/4/17.
 */

public class SongHolder extends RecyclerView.ViewHolder {
    public TextView artist,title;
    public CardView element;
    public ImageView songimage;

    public SongHolder(View itemView) {
        super(itemView);
        this.element=(CardView) itemView.findViewById(R.id.element);
        this.title = (TextView) itemView.findViewById(R.id.title);
        this.artist = (TextView) itemView.findViewById(R.id.artist);
        this.songimage = (ImageView) itemView.findViewById(R.id.songimage);
    }
}

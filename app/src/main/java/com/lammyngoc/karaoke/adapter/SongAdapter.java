package com.lammyngoc.karaoke.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.lammyngoc.karaoke.R;
import com.lammyngoc.karaoke.model.Song;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    Activity context;
    int resource;
    public SongAdapter(@NonNull Activity context, int resource, ArrayList<Song> songList) {
        super(context, resource);
        this.context=context;
        this.resource=resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // nhân bản giao diện
        View view=context.getLayoutInflater().inflate(resource,null);
        // truy xuất từng view trong giao diện
        TextView txtSongId=view.findViewById(R.id.txtSongId);
        TextView txtSongName=view.findViewById(R.id.txtSongName);
        TextView txtSingerName=view.findViewById(R.id.txtSingerName);

        // lấy thông tin tại vị trí mà nó nhân bản
        Song song=getItem(position);
        // hiển thị view đã laays
        txtSongId.setText(song.getSongId());
        txtSongName.setText(song.getSongName());
        txtSingerName.setText(song.getSingerName());

        return view;
    }
}

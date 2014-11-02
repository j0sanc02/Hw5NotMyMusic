package com.example.jpapp_000.hw5notmymusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jpapp_000 on 11/2/2014.
 */
public class GridViewAdapter extends ArrayAdapter<Song> {
    private Context mContext;
    private List<Song> mSongs;


    public GridViewAdapter(Context context, int textViewResourceID, List<Song> songs) {
        super(context, textViewResourceID, songs);
        this.mContext = context;
        this.mSongs = songs;
    }

    @Override

    public View getView (int position, View convertView, ViewGroup parent){
        if(convertView==null){

            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_my,parent, false);

        }

        final Song son = mSongs.get(position);

        TextView textViewTitle = (TextView)convertView.findViewById(R.id.textViewSongTitle);

        return convertView;

    }


}

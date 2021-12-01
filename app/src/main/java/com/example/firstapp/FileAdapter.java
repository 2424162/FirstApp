package com.example.firstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class FileAdapter extends ArrayAdapter<FileInfo> {
    private int newResourceId;
    public FileAdapter(@NonNull Context context, int resource, @NonNull List<FileInfo> objects) {
        super(context, resource, objects);
        newResourceId = resource;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        FileInfo fileInfo = getItem(position);
        View view = LayoutInflater.from (getContext ()).inflate (newResourceId, parent, false);
        TextView name =  view.findViewById(R.id.ItemName);
        TextView size = view.findViewById(R.id.ItemSize);
        ImageView imgId = view.findViewById(R.id.ItemImage);
        name.setText(fileInfo.getName());
        size.setText(fileInfo.getSize());
        imgId.setImageResource(fileInfo.getImgId());





        return view;

    }
}

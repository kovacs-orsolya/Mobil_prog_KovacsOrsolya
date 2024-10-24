package com.example.hf5;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;


public class CustomAdapter extends ArrayAdapter<String> {
    private Activity context;
    private ArrayList<String> list;
    private HashMap<Integer, Integer> colorMap = new HashMap<>();

    public CustomAdapter(@NonNull Activity context, ArrayList<String> list) {
        super(context, R.layout.listview_row,list);
        this.context=context;
        this.list=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.listview_row,null,true);
        TextView txt=view.findViewById(R.id.txt);
        txt.setText(list.get(position));

        // Beállítjuk a szöveg színét
        // Alapértelmezett szín (fekete)
        txt.setTextColor(colorMap.getOrDefault(position, Color.BLACK));
        return view;
    }
    public void setColor(int position, int color) {
        colorMap.put(position, color);
        notifyDataSetChanged(); // Frissítjük az adaptert
    }

}

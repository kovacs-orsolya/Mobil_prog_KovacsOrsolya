package com.example.hf7;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.VH> {
    private Activity context;
    private List<Animal> animals;


    public CustomAdapter(@NonNull Activity context, List<Animal> animals) {
        this.context=context;
        this.animals = animals;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new VH(itemView,context);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        Animal animal =animals.get(position);
        holder.imgProfile.setImageResource(animal.getImage());
        holder.tvName.setText(animal.getName());
        holder.info.setText(animal.getInfo());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public class VH extends RecyclerView.ViewHolder{
        View rootView;
        ImageView imgProfile;
        TextView tvName;
        TextView info;
        public VH(@NonNull View itemView, Context context) {
            super(itemView);
            rootView = itemView;
            imgProfile = itemView.findViewById(R.id.image);
            tvName = itemView.findViewById(R.id.name);
            info = itemView.findViewById(R.id.info);
        }


    }
}

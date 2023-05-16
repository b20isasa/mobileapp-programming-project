package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends  RecyclerView.Adapter<MyViewHolder>{
    private List<Items> ProjektList;

    public MyAdapter(List<Items> ProjektLista) {
        this.ProjektList = ProjektLista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ID.setText(ProjektList.get(position).getID());
        holder.Location.setText(ProjektList.get(position).getLocation());
        holder.Name.setText(ProjektList.get(position).getName());
        holder.Login.setText(ProjektList.get(position).getLogin());
    }

    @Override
    public int getItemCount() {
        return new;

    }
}

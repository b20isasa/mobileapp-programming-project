package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyViewHolder extends  RecyclerView.ViewHolder{
    public TextView ID;
    public TextView Location;
    public TextView Name;
    public TextView Login;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        ID = itemView.findViewById(R.id.ID);
        Login = itemView.findViewById(R.id.Login);
        Name = itemView.findViewById(R.id.Name);
        Location = itemView.findViewById(R.id.Location);
    }

}

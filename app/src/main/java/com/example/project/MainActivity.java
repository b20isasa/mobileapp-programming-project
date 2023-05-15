package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Button knappen;
    private MyAdapter adapter;
    private ArrayList<Items> ProjectList;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b20isasa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ProjectList = new ArrayList<Items>();
        adapter = new MyAdapter(ProjectList);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        knappen = findViewById(R.id.knappen);

        knappen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("==>", "tillbaka");
                Intent intent = new Intent (MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });


    }


    public void onPostExecute(String json){
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Items>>(){}.getType();
        ArrayList<Items> Alista = gson.fromJson(json, type);
        ProjectList.addAll(Alista);
        adapter.notifyDataSetChanged();
    }


}


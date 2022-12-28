package com.example.toeic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DetailTudienActivity extends AppCompatActivity {

    RecyclerView rcTudiens;
    ArrayList<Tudiens> arrayList;
    DetailTudiensAdapter detailTudiensAdapter;
    Database database;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tudien);
        toolbar=findViewById(R.id.toolbarDetailTudien);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Detail");
        database=new Database(this);

        rcTudiens = findViewById(R.id.rcTudiens);
        int id = getIntent().getIntExtra("id",1);
        arrayList=database.getTudiens(id);
        detailTudiensAdapter=new DetailTudiensAdapter(arrayList);
        rcTudiens.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rcTudiens.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rcTudiens.setAdapter(detailTudiensAdapter);

    }
}
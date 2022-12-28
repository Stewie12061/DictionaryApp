package com.example.toeic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class  SearchTudienActivity extends AppCompatActivity implements AdapterTudien.Listener {
    Toolbar toolbar;
    SearchView searchView;
    ArrayList<Tudien> arrayList;
    AdapterTudien adapterTudien;
    RecyclerView rcTudien;
    Database database;
    LottieAnimationView searchWaiting;
    TextView goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // thanh tim kiem
        toolbar = findViewById(R.id.toolbarSearch);
        searchView = toolbar.findViewById(R.id.searchView);
        database = new Database(this);

        searchWaiting = findViewById(R.id.searchWaiting);

        rcTudien = findViewById(R.id.rcTudien);
        arrayList=database.getTudien();
        adapterTudien = new
                AdapterTudien(arrayList, this); // this ở đây là fragment
        rcTudien.setLayoutManager(new
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rcTudien.addItemDecoration(new
                DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rcTudien.setAdapter(adapterTudien);
        setVisible(false);

        goback = toolbar.findViewById(R.id.backprevious);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapterTudien.getFilter().filter(newText);
                if (adapterTudien.arrayListFilter.size() == 0 || newText.isEmpty()) {
                    setVisible(false);
                } else {
                    setVisible(true);
                }
                return false;
            }
        });

        searchView.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchWaiting.setVisibility(View.INVISIBLE);
                rcTudien.setVisibility(View.VISIBLE);
            }
        });
        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                searchWaiting.setVisibility(View.VISIBLE);
                rcTudien.setVisibility(View.INVISIBLE);
                return false;
            }
        });
    }

    public void setVisible(boolean flag) {
        if (!flag) {
            rcTudien.setVisibility(View.GONE);
        } else {
            rcTudien.setVisibility(View.VISIBLE);
        }
    }
    public static int idTudien;

    @Override
    public void onclick(Tudien tudien) {
        database.updateTudien(tudien, 1);
        idTudien=tudien.idTudien;
        Toast.makeText(this, "đã tìm thấy" , Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(SearchTudienActivity.this,DetailTudienActivity.class);
        intent.putExtra("id",idTudien);
        startActivity(intent);
    }
}

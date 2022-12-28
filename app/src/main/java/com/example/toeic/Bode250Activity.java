package com.example.toeic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bode250Activity extends AppCompatActivity {

    Button bd1, bd2, bd3, bd4, bd5;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bode250);
        bd1 = findViewById(R.id.bd1250);
        bd2 = findViewById(R.id.bd2250);
        bd3 = findViewById(R.id.bd3250);
        bd4 = findViewById(R.id.bd4250);
        bd5 = findViewById(R.id.bd5250);

        sp = getSharedPreferences("dataLogin", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        bd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("bode", bd1.getText().toString());
                editor.apply();
                // chen id vào day
                //vi du id  = 1 danh cho bo de so 1
                startQuestion(1);
            }
        });
        bd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("bode", bd2.getText().toString());
                editor.apply();
                // chen id vào day
                //vi du id  = 1 danh cho bo de so 1
                startQuestion(2);
            }
        });
        bd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("bode", bd3.getText().toString());
                editor.apply();
                // chen id vào day
                //vi du id  = 1 danh cho bo de so 1
                startQuestion(3);
            }
        });
        bd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("bode", bd4.getText().toString());
                editor.apply();
                // chen id vào day
                //vi du id  = 1 danh cho bo de so 1
                startQuestion(4);
            }
        });
        bd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("bode", bd5.getText().toString());
                editor.apply();
                // chen id vào day
                //vi du id  = 1 danh cho bo de so 1
                startQuestion(5);
            }
        });

    }

    private void startQuestion(int id) {
        //lay id, name theo chu de
        // Category category = new Category();
        //int categoryID = category.getId();
        // String categoryName = category.getName();

        Intent intent = new Intent(Bode250Activity.this, TestActivity.class);
        intent.putExtra("idcategories", id);

        startActivity(intent);
        Toast.makeText(this, "Bắt đầu thôi", Toast.LENGTH_SHORT).show();
    }
}
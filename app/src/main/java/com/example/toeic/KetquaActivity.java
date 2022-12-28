package com.example.toeic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class KetquaActivity extends AppCompatActivity {
    TextView tvAnswer, tvTime;
    Button btnFinish;
    SharedPreferences sp;
    String ketqua, timeleft, bode, level;
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);

        tvAnswer=findViewById(R.id.tvAnswer);
        btnFinish=findViewById(R.id.btnFinish);
        sp = getApplicationContext().getSharedPreferences("dataLogin", Context.MODE_PRIVATE);
        ketqua = sp.getString("score"," ");
        timeleft =sp.getString("time"," ");
        bode = sp.getString("bode"," ");
        level = sp.getString("level"," ");
//        Intent intent = getIntent();
//        sp=getShar"")
//        int ketqua=intent.gedPreferences(etIntExtra("score",0);

        tvAnswer.setText(ketqua);


        database = new Database(this);

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                database.insertKetqua(ketqua,timeleft,bode,level);
                Intent intent=new Intent(KetquaActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        tvTime = findViewById(R.id.tvTimeLeft);
        tvTime.setText(timeleft);
    }
}
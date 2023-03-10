package com.example.toeic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class ListeningActivity extends AppCompatActivity {
    Button btnLis;
    MediaPlayer mediaPlayer;
    TextView tvQuestion, tvTime;
    ImageView imgQuestion;
    RadioGroup radioGroup;
    RadioButton rd1, rd2, rd3, rd4;
    Button btnXacnhan;
    CountDownTimer countDownTimer;

    ArrayList<Question> questionsList;
    long timeLeftinMillis;
    int questionCounter, questionSize;
    int Score;
    int count = 0;
    boolean answered;
    Question currentQuestion;
    Database database;
    TextView tvDiem;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening);

//        btnLis = findViewById(R.id.btnLis);
        btnLis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(ListeningActivity.this, R.raw.gapem);
                mediaPlayer.start();
            }
        });
        tvQuestion = findViewById(R.id.tvCauhoi);
        tvTime = findViewById(R.id.tv_Time);
        imgQuestion = findViewById(R.id.imgQuestion);
        tvDiem = findViewById(R.id.tvdiem);
        sp = getSharedPreferences("dataLogin", MODE_PRIVATE);

        radioGroup = findViewById(R.id.radio_Group);
        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);
        rd3 = findViewById(R.id.rd3);
        rd4 = findViewById(R.id.rd4);
        btnXacnhan = findViewById(R.id.btnXacnhan);


        database = new Database(this);

        Intent intent = getIntent();
        int categoryID = intent.getIntExtra("idcategories", 0);

        // danh s??ch list ch???a c??u h???i
        questionsList = database.getQuestions(categoryID);
        // l???y k??ch c??? danH s??ch = t???ng s??? c??u h???i
        questionSize = questionsList.size();
        Log.d("111", database.getQuestions(categoryID).size() + "");
        // ?????o v??? tr?? c??c ph???n t??? c??u h???i
//        Collections.shuffle(questionsList);
        // show c??u h???i v?? ????p ??n
        showNextQuestion();
        startCountDown();
        // button xac nhan cau tiep, hoan thanh
        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                n???u ch??a tr??? l???i
                if (!answered) {
//                    n???u ch???n 1 trong 4 ????p ??n
                    if (rd1.isChecked() || rd2.isChecked() || rd3.isChecked() || rd4.isChecked()) {
                        //kiem tra dap an
                        checkAnswer();
                    } else {
                        Toast.makeText(ListeningActivity.this, "h??y ch???n ????p ??n", Toast.LENGTH_SHORT).show();
                    }
                } else showNextQuestion();
            }
        });
    }

    private void showNextQuestion() {
        // set l???i m??u ??en cho ????p ??n
        rd1.setTextColor(Color.BLACK);
        rd2.setTextColor(Color.BLACK);
        rd3.setTextColor(Color.BLACK);
        rd4.setTextColor(Color.BLACK);
//        // x??a ch???n
        radioGroup.clearCheck();
//        currentQuestion = questionsList.get(questionCounter);
        //hien thi cau hoi
//        tvQuestion.setText(currentQuestion.getQuestion());
//        rd1.setText(currentQuestion.option1);
//        rd2.setText(currentQuestion.option2);
//        rd3.setText(currentQuestion.option3);
//        rd4.setText(currentQuestion.option4);

        // t??ng sau m???i c??u h???i
//        questionCounter++;
//        // set v??? tr?? c??u h???i hi???n t???i
//        // gi?? tr??? false, ch??a tr??? l???i, ??ang show
//        answered = false;
//        // g???n t??n cho Button
//        btnXacnhan.setText("X??c nh???n");
////        //th???i gian ch???y 30s
//        timeLeftinMillis = 7000000;
//        // ?????m ng?????c th???i gian tr??? l???i
////        startCountDown();

        // n???u c??n c??u
        if (questionCounter < questionSize) {
            // l???y d??? li???u ??? v??? tr?? counter
            currentQuestion = questionsList.get(questionCounter);
            //hien thi cau hoi
            tvQuestion.setText(currentQuestion.getQuestion());
            imgQuestion.setImageResource(currentQuestion.getQuestion_image());
            rd1.setText(currentQuestion.option1);
            rd2.setText(currentQuestion.option2);
            rd3.setText(currentQuestion.option3);
            rd4.setText(currentQuestion.option4);

            // t??ng sau m???i c??u h???i
            questionCounter++;
            // set v??? tr?? c??u h???i hi???n t???i
            // gi?? tr??? false, ch??a tr??? l???i, ??ang show
            answered = false;
            // g???n t??n cho Button
//            btnXacnhan.setText("X??c nh???n");
            //th???i gian ch???y 30s
            timeLeftinMillis = 4200000;
            // ?????m ng?????c th???i gian tr??? l???i
//            startCountDown();

        } else {
            finishQuestion();
        }

    }

    private void checkAnswer() {
        //true ???? tr??? l???i
        answered = true;
//        tr??? v??? radiobutton trong fbgroup ???????c check
        RadioButton rdselect = findViewById(radioGroup.getCheckedRadioButtonId());

        // v??? tr?? c???a c??u ???? ch???n
        int answer = radioGroup.indexOfChild(rdselect) + 1;

        // n???u tr??? l???i ????ng ????p ??n
        if (answer == currentQuestion.getAnswer()) {
            Score = Score + 10;
            tvDiem.setText("??i???m: " + Score);
            // ph????ng th???c hi???n th??? ????p ??n
        }
        showNextQuestion();
    }

    private void startCountDown() {
        countDownTimer = new CountDownTimer(timeLeftinMillis, 1000) {
            @Override
            public void onTick(long m) {
                timeLeftinMillis = m;
                //update
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                //h???t gi???
                timeLeftinMillis = 0;
                //ph????ng th???c ki???m tra ????p ??n
                checkAnswer();
            }
        }.start();
    }

    private void updateCountDownText() {
        int minutes = (int) ((timeLeftinMillis / 1000) / 60);

        int seconds = (int) ((timeLeftinMillis / 1000) % 60);
        // ?????nh d???ng ki???u time
        String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        //hi???n th??? l??n m??n h??nh
        tvTime.setText(timeFormatted);
        // n???u th???i gian d???i 10s s??? chuy???n m??u
        if (timeLeftinMillis < 10000) {
            tvTime.setTextColor(Color.RED);
        } else {
            tvTime.setTextColor(Color.BLACK);
        }

    }

    private void finishQuestion() {
        // ch???a d??? li???u g???i qua activity main
        Intent intent = new Intent(ListeningActivity.this, KetquaActivity.class);
        SharedPreferences.Editor editor = sp.edit();
        String diem = tvTime.getText().toString();
        editor.putString("score", diem);
//        intent.putExtra("score",Score);
        editor.apply();
        startActivity(intent);
    }

    //back
    @Override
    public void onBackPressed() {
        count++;
        if (count >= 1) {
            finishQuestion();
        }
        count = 0;
    }
}
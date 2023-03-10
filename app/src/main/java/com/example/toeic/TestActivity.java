package com.example.toeic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class TestActivity extends AppCompatActivity {

    TextView tvQuestion, tvTime;
    ImageView imgQuestion;
    RadioGroup radioGroup;
    RadioButton rd1, rd2, rd3, rd4;
    Button btnXacnhan, btnDone;
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
    MediaPlayer mediaPlayer;
    VideoView videoView;
    SeekBar seekbar;
    Button btnPlay;
    static Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        tvQuestion = findViewById(R.id.tvCauhoi);
        tvTime = findViewById(R.id.tv_Time);
        imgQuestion = findViewById(R.id.imgQuestion);
        tvDiem = findViewById(R.id.tvdiem);
//        seekbar = findViewById(R.id.seekBar);
//        btnPlay = findViewById(R.id.btnPlay);

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
        Collections.shuffle(questionsList);
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
                        Toast.makeText(TestActivity.this,String.valueOf(Score),Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(TestActivity.this, "h??y ch???n ????p ??n", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    showNextQuestion();
                }
            }
        });

        btnDone = findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder
                                (TestActivity.this);
                View view = LayoutInflater.from(TestActivity.this).inflate(
                        R.layout.dialog_alert,
                        (ConstraintLayout)findViewById(R.id.layoutDialogContainer)
                );
                builder.setView(view);
                ((TextView) view.findViewById(R.id.textTitle))
                        .setText("Ho??n th??nh b??i thi");
                ((TextView) view.findViewById(R.id.textMessage))
                        .setText("B???n c?? mu???n ho??n th??nh b??i thi ngay b??y gi????");
                ((Button) view.findViewById(R.id.buttonYes))
                        .setText("Yes");
                ((Button) view.findViewById(R.id.buttonNo))
                        .setText("No");
                final AlertDialog alertDialog = builder.create();
                view.findViewById(R.id.buttonYes).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finishQuestion();
                    }
                });
                view.findViewById(R.id.buttonNo).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.dismiss();
                    }
                });
                if (alertDialog.getWindow() != null){
                    alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                }
                alertDialog.show();

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
//            int audioOrImage = 0;
//            if (!currentQuestion.getIsImage) {
//                audioOrImage = currentQuestion.getQuestion_image();
//                btnPlay.setVisibility(View.VISIBLE);
//            }
//            else{
//                btnPlay.setVisibility(View.GONE);
//                imgQuestion.setImageResource(currentQuestion.getQuestion_image());
//            }

            imgQuestion.setImageResource(currentQuestion.getQuestion_image());
//            uri = Uri.parse(currentQuestion.question_image_audio);
////            seekbar.(currentQuestion.getQuestion_image());
//            btnPlay.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (mediaPlayer != null) {
//                        mediaPlayer.stop();
//                        mediaPlayer.release();
//                        mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
//                    } else {
//                        mediaPlayer = MediaPlayer.create(getApplicationContext(), uri);
//                        mediaPlayer.start();
//                    }
//                }
//            });
//            try {
//                mediaPlayer.setDataSource(currentQuestion.getQuestion_image_audio());
//                mediaPlayer.prepareAsync();
//                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                    @Override
//                    public void onPrepared(MediaPlayer mp) {
//                        mp.start();
////                    btnPlay.setImageResource(R.drawable.ic_baseline_pause_circle_filled_24);
//                    }
//                });
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            btnPlay.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (mediaPlayer.isPlaying()){
//                        mediaPlayer.pause();
////                    btnPlay.setImageResource(R.drawable.ic_baseline_play_circle_filled_24);
//                    }
//                    else
//                        mediaPlayer.start();
////                btnPlay.setImageResource(R.drawable.ic_baseline_pause_circle_filled_24);
//                }
//            });

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

    }
    else

    {
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
        tvTime.setText("Th???i gian c??n l???i: " + timeFormatted);
        // n???u th???i gian d???i 30s s??? chuy???n m??u
        if (timeLeftinMillis < 30000) {
            tvTime.setTextColor(Color.RED);
        } else {
            tvTime.setTextColor(Color.BLACK);
        }

    }

    private void finishQuestion() {
        // ch???a d??? li???u g???i qua activity main
        Intent intent = new Intent(TestActivity.this, KetquaActivity.class);
        SharedPreferences.Editor editor = sp.edit();
        String diem = tvDiem.getText().toString();
        String time = tvTime.getText().toString();
        // tvDiem = thoi gian
        // tvTime = Diem ???
        editor.putString("score", diem);
        editor.putString("time", time);
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
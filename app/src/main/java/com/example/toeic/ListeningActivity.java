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

        // danh sách list chứa câu hỏi
        questionsList = database.getQuestions(categoryID);
        // lấy kích cở danH sách = tổng số câu hỏi
        questionSize = questionsList.size();
        Log.d("111", database.getQuestions(categoryID).size() + "");
        // đảo vị trí các phần tử câu hỏi
//        Collections.shuffle(questionsList);
        // show câu hỏi và đáp án
        showNextQuestion();
        startCountDown();
        // button xac nhan cau tiep, hoan thanh
        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                nếu chưa trả lời
                if (!answered) {
//                    nếu chọn 1 trong 4 đáp án
                    if (rd1.isChecked() || rd2.isChecked() || rd3.isChecked() || rd4.isChecked()) {
                        //kiem tra dap an
                        checkAnswer();
                    } else {
                        Toast.makeText(ListeningActivity.this, "hãy chọn đáp án", Toast.LENGTH_SHORT).show();
                    }
                } else showNextQuestion();
            }
        });
    }

    private void showNextQuestion() {
        // set lại màu đen cho đáp án
        rd1.setTextColor(Color.BLACK);
        rd2.setTextColor(Color.BLACK);
        rd3.setTextColor(Color.BLACK);
        rd4.setTextColor(Color.BLACK);
//        // xóa chọn
        radioGroup.clearCheck();
//        currentQuestion = questionsList.get(questionCounter);
        //hien thi cau hoi
//        tvQuestion.setText(currentQuestion.getQuestion());
//        rd1.setText(currentQuestion.option1);
//        rd2.setText(currentQuestion.option2);
//        rd3.setText(currentQuestion.option3);
//        rd4.setText(currentQuestion.option4);

        // tăng sau mỗi câu hỏi
//        questionCounter++;
//        // set vị trí câu hỏi hiện tại
//        // giá trị false, chưa trả lời, đang show
//        answered = false;
//        // gắn tên cho Button
//        btnXacnhan.setText("Xác nhận");
////        //thời gian chạy 30s
//        timeLeftinMillis = 7000000;
//        // đếm ngược thời gian trả lời
////        startCountDown();

        // nếu còn câu
        if (questionCounter < questionSize) {
            // lấy dữ liệu ở vị trí counter
            currentQuestion = questionsList.get(questionCounter);
            //hien thi cau hoi
            tvQuestion.setText(currentQuestion.getQuestion());
            imgQuestion.setImageResource(currentQuestion.getQuestion_image());
            rd1.setText(currentQuestion.option1);
            rd2.setText(currentQuestion.option2);
            rd3.setText(currentQuestion.option3);
            rd4.setText(currentQuestion.option4);

            // tăng sau mỗi câu hỏi
            questionCounter++;
            // set vị trí câu hỏi hiện tại
            // giá trị false, chưa trả lời, đang show
            answered = false;
            // gắn tên cho Button
//            btnXacnhan.setText("Xác nhận");
            //thời gian chạy 30s
            timeLeftinMillis = 4200000;
            // đếm ngược thời gian trả lời
//            startCountDown();

        } else {
            finishQuestion();
        }

    }

    private void checkAnswer() {
        //true đã trả lời
        answered = true;
//        trả về radiobutton trong fbgroup được check
        RadioButton rdselect = findViewById(radioGroup.getCheckedRadioButtonId());

        // vị trí của câu đã chọn
        int answer = radioGroup.indexOfChild(rdselect) + 1;

        // nếu trả lời đúng đáp án
        if (answer == currentQuestion.getAnswer()) {
            Score = Score + 10;
            tvDiem.setText("Điểm: " + Score);
            // phương thức hiển thị đáp án
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
                //hết giờ
                timeLeftinMillis = 0;
                //phương thức kiểm tra đáp án
                checkAnswer();
            }
        }.start();
    }

    private void updateCountDownText() {
        int minutes = (int) ((timeLeftinMillis / 1000) / 60);

        int seconds = (int) ((timeLeftinMillis / 1000) % 60);
        // định dạng kiểu time
        String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        //hiển thị lên màn hình
        tvTime.setText(timeFormatted);
        // nếu thời gian dứi 10s sẽ chuyển màu
        if (timeLeftinMillis < 10000) {
            tvTime.setTextColor(Color.RED);
        } else {
            tvTime.setTextColor(Color.BLACK);
        }

    }

    private void finishQuestion() {
        // chứa dữ liệu gửi qua activity main
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
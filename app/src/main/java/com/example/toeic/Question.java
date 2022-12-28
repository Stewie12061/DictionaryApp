package com.example.toeic;

public final class Question {
    public int id;
    public int stt;
    public String question;
    public int question_image;
    public int question_image_audio;
//    public boolean isImage;
    public String option1;
    public String option2;
    public String option3;
    public String option4;
    public int answer;
    public int categoryID;

    public Question(int stt, String question, int question_image, int question_image_audio, String option1, String option2, String option3, String option4, int answer, int categoryID) {
        this.stt = stt;
        this.question = question;
        this.question_image = question_image;
        this.question_image_audio = question_image_audio;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.categoryID = categoryID;
    }

    public Question(String question, int question_image, String option1, String option2, String option3, String option4, int answer, int categoryID) {
        this.question = question;
        this.question_image = question_image;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.categoryID = categoryID;
    }

    public Question(String question, int question_image, int question_image_audio, String option1, String option2, String option3, String option4, int answer, int categoryID) {
        this.question = question;
        this.question_image = question_image;
        this.question_image_audio = question_image_audio;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.categoryID = categoryID;
    }

    public Question(){

    }

    public Question(int categoryID) {
        this.categoryID = categoryID;
    }


    public int getQuestion_image() {
        return question_image;
    }

    public void setQuestion_image(int question_image) {
        this.question_image = question_image;
    }

    //hàm khởi tạo có giá trị
    public Question(String question, String option1, String option2, String option3, String option4, int answer, int categoryID) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.categoryID = categoryID;
    }

    public Question(int id, String question, int question_image, String option1, String option2, String option3, String option4, int answer, int categoryID) {
        this.id = id;
        this.question = question;
        this.question_image = question_image;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.categoryID = categoryID;
    }


    // tạo setter và getter cho các biến
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getQuestion_image_audio() {
        return question_image_audio;
    }

    public void setQuestion_image_audio(int question_image_audio) {
        this.question_image_audio = question_image_audio;
    }
}

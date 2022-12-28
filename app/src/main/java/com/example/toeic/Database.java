package com.example.toeic;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Database {
    // da dung cach nao thi dung 1 cach thoi khong dung chung nhu the nay

    //ten database
    private static final String DATABASE_NAME = "Question.db";
    //VERTION

    private SQLiteDatabase db;

    Context context;

    public Database(@Nullable Context context) {
        this.context = context;
    }

    public SQLiteDatabase openDB() {
        return context.openOrCreateDatabase(DATABASE_NAME, Context.MODE_PRIVATE, null);
    }

    public void closeDB(SQLiteDatabase db) {
        db.close();
    }


    public void CreateTable() {
        SQLiteDatabase db = openDB();
        //ID co index  = 0
        //Name cos index = 1
        String CATEGORIES_TABLE = "CREATE TABLE IF NOT EXISTS tblTudien (" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " NAME TEXT," +
                " DES TEXT," +
                " IDTUDIEN INTEGER," +
                " isHistory INTEGER);";
        String TUDIEN_TABLE = "CREATE TABLE IF NOT EXISTS tblTudiens (" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " TUDIEN TEXT," +
                " DANHTU TEXT," +
                " VIET INTEGER," +
                " VIET1 INTEGER," +
                " IDTUDIENS INTEGER);";
        String VOCAB_TABLE = "CREATE TABLE IF NOT EXISTS tblVocab(" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " TOPICVOCAB TEXT," +
                " NOIDUNG1 TEXT," +
                " NOIDUNG2 TEXT," +
                " IDVOCAB INTEGER );";
        String VOCABULARY_TABLE = "CREATE TABLE IF NOT EXISTS tblVocabulary (" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " TOPICVOCAB TEXT," +
                " NOIDUNG1 TEXT," +
                " NOIDUNG2 TEXT," +
                " NOIDUNG3 TEXT," +
                " NOIDUNG4 TEXT," +
                " NOIDUNG5 TEXT," +
                " NOIDUNG6 TEXT," +
                " NOIDUNG7 TEXT," +
                " NOIDUNG8 TEXT," +
                " IDVOCABULARY INTEGER," +
                " NOIDUNG9 TEXT);";
        String SENT_TABLE = "CREATE TABLE IF NOT EXISTS tblSent (" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " TOPICSEN TEXT," +
                " DES1 TEXT," +
                " DES2 TEXT," +
                " IDSENT INTEGER);";
        String SENTENCES_TABLE = "CREATE TABLE IF NOT EXISTS tblSentences (" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " TOPICSEN TEXT," +
                " DES1 TEXT," +
                " DES2 TEXT," +
                " DES3 TEXT," +
                " DES4 TEXT," +
                " DES5 TEXT," +
                " DES6 TEXT," +
                " DES7 TEXT," +
                " DES8 TEXT," +
                " IDSENTENCES INTEGER," +
                " DES9 TEXT);";
        String TOEIC_TABLE = "CREATE TABLE IF NOT EXISTS tblTOEIC(" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " ENGLISH TEXT," +
                " VIETNAMESE TEXT);";
        String TOEFL_TABLE = "CREATE TABLE IF NOT EXISTS tblTOEFL(" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " ENGLIS TEXT," +
                " VIETNAMES TEXT);";
        String IELTS_TABLE = "CREATE TABLE IF NOT EXISTS tblIELTS(" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " ENGLI TEXT," +
                " VIETNAM TEXT);";
        //biến bảng question
        String QUESTIONS_TABLE = "CREATE TABLE IF NOT EXISTS " +
                Table.QuestionsTable.TABLE_NAME + " ( " +
                Table.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Table.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                Table.QuestionsTable.COLUMN_QUESTION_IMAGE + " INTEGER," +
                Table.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                Table.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                Table.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                Table.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                Table.QuestionsTable.COLUMN_ANSWER + " INTEGER, " +
                Table.QuestionsTable.COLUMN_CATEGORY_ID + " INTEGER )";
        String KETQUA_TABLE = "CREATE TABLE IF NOT EXISTS tblKETQUA(" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " DIEM TEXT," +
                " TIMELEFT TEXT," +
                " BODE TEXT," +
                " LEVEL TEXT)";
        db.execSQL(CATEGORIES_TABLE);
        db.execSQL(QUESTIONS_TABLE);
        db.execSQL(VOCAB_TABLE);
        db.execSQL(SENTENCES_TABLE);
        db.execSQL(SENT_TABLE);
        db.execSQL(VOCABULARY_TABLE);
        db.execSQL(TUDIEN_TABLE);
        db.execSQL(TOEIC_TABLE);
        db.execSQL(TOEFL_TABLE);
        db.execSQL(IELTS_TABLE);
        db.execSQL(KETQUA_TABLE);
        db.close();
    }

    public void insertKetqua(String diem, String timeleft, String bode, String level) {
        ContentValues values = new ContentValues();
        values.put("DIEM", diem);
        values.put("TIMELEFT", timeleft);
        values.put("BODE", bode);
        values.put("LEVEL", level);
        SQLiteDatabase db = openDB();
        db.insert("tblKETQUA", null, values);
        closeDB(db);
    }

    public void insertToeic(Toeic toeic) {
        ContentValues values = new ContentValues();
        values.put("ENGLISH", toeic.English);
        values.put("VIETNAMESE", toeic.Vietnamese);
        SQLiteDatabase db = openDB();
        db.insert("tblTOEIC", null, values);
        closeDB(db);
    }

    public void insertToefl(Toefl toefl) {
        ContentValues values = new ContentValues();
        values.put("ENGLIS", toefl.English);
        values.put("VIETNAMES", toefl.Vietnamese);
        SQLiteDatabase db = openDB();
        db.insert("tblTOEFL", null, values);
        closeDB(db);
    }

    public void insertIelts(Ielts ielts) {
        ContentValues values = new ContentValues();
        values.put("ENGLI", ielts.English);
        values.put("VIETNAM", ielts.Vietnamese);
        SQLiteDatabase db = openDB();
        db.insert("tblIELTS", null, values);
        closeDB(db);
    }

    // insert chủ đề vào cơ sở dữ liệu
    public void insertTudien(Tudien tudien) {

        ContentValues values = new ContentValues();
        values.put("NAME", tudien.name);
        values.put("DES", tudien.des);
        values.put("IDTUDIEN", tudien.idTudien);
        SQLiteDatabase db = openDB();
        db.insert("tblTudien", null, values);
        closeDB(db);
    }

    public void insertTudiens(Tudiens tudiens) {

        ContentValues values = new ContentValues();
        values.put("TUDIEN", tudiens.tudien);
        values.put("DANHTU", tudiens.danhtu);
        values.put("VIET", tudiens.viet);
        values.put("VIET1", tudiens.viet1);
        values.put("IDTUDIENS", tudiens.idTudien);
        SQLiteDatabase db = openDB();
        db.insert("tblTudiens", null, values);
        closeDB(db);
    }

    public void insertVocab(Vocab vocab) {

        ContentValues values = new ContentValues();
        values.put("TOPICVOCAB", vocab.topicvocab);
        values.put("NOIDUNG1", vocab.des1vocab);
        values.put("NOIDUNG2", vocab.des2vocab);
        values.put("IDVOCAB", vocab.idvocab);
        SQLiteDatabase db = openDB();
        db.insert("tblVocab", null, values);
        closeDB(db);
    }

    public void insertVocabulary(Vocabulary vocabulary) {

        ContentValues values = new ContentValues();
        values.put("TOPICVOCAB", vocabulary.topicvoca);
        values.put("NOIDUNG1", vocabulary.des1voca);
        values.put("NOIDUNG2", vocabulary.des2voca);
        values.put("NOIDUNG3", vocabulary.des3voca);
        values.put("NOIDUNG4", vocabulary.des4voca);
        values.put("NOIDUNG5", vocabulary.des5voca);
        values.put("NOIDUNG6", vocabulary.des6voca);
        values.put("NOIDUNG7", vocabulary.des7voca);
        values.put("NOIDUNG8", vocabulary.des8voca);
        values.put("NOIDUNG9", vocabulary.des9voca);
        values.put("IDVOCABULARY", vocabulary.idvoca);
        SQLiteDatabase db = openDB();
        db.insert("tblVocabulary", null, values);
        closeDB(db);
    }

    public void insertSenten(Sentences sentences) {

        ContentValues values = new ContentValues();
        values.put("TOPICSEN", sentences.topicsenten);
        values.put("DES1", sentences.des1senten);
        values.put("DES2", sentences.des2senten);
        values.put("IDSENT", sentences.idSen);
        SQLiteDatabase db = openDB();
        db.insert("tblSent", null, values);
        closeDB(db);
    }

    public void insertSent(Senten senten) {

        ContentValues values = new ContentValues();
        values.put("TOPICSEN", senten.topicsente);
        values.put("DES1", senten.des1sente);
        values.put("DES2", senten.des2sente);
        values.put("DES3", senten.des3sente);
        values.put("DES4", senten.des4sente);
        values.put("DES5", senten.des5sente);
        values.put("DES6", senten.des6sente);
        values.put("DES7", senten.des7sente);
        values.put("DES8", senten.des8sente);
        values.put("DES9", senten.des9sente);
        values.put("IDSENTENCES", senten.idSent);
        SQLiteDatabase db = openDB();
        db.insert("tblSentences", null, values);
        closeDB(db);
    }


    // các giá trị insert
 //   public void CreateCategories() {
       //môn văn id =1
//       Tudien c1 = new Tudien("Ngữ văn", "CON CHO");
//       insertCategories(c1);
       //môn lịch sử id =2
 //      Tudien c2 = new Tudien("Lịch sử", "CON QQQ");
//       insertCategories(c2);
       //môn địa lý id=3
//        Tudien c3 = new Tudien("Địa lý", "121212 CHO");
//        insertCategories(c3);
//    }
    public ArrayList<Ketqua> getKetqua() {
        SQLiteDatabase db = openDB();
        ArrayList<Ketqua> ketquas = new ArrayList<>();
        String sql = "select * from tblKETQUA";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    String diem = c.getString(1);
                    String timeleft = c.getString(2);
                    String bode = c.getString(3);
                    String level = c.getString(4);
                    ketquas.add(new Ketqua(diem, timeleft, bode, level));
                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return ketquas;
    }

    public ArrayList<Toeic> getToeic() {
        SQLiteDatabase db = openDB();
        ArrayList<Toeic> toeics = new ArrayList<>();
        String sql = "select * from tblTOEIC";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    String name = c.getString(1);
                    String des = c.getString(2);
                    toeics.add(new Toeic(name, des));
                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return toeics;
    }

    public ArrayList<Toefl> getToefl() {
        SQLiteDatabase db = openDB();
        ArrayList<Toefl> toefls = new ArrayList<>();
        String sql = "select * from tblTOEFL";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    String name = c.getString(1);
                    String des = c.getString(2);
                    toefls.add(new Toefl(name, des));
                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return toefls;
    }

    public ArrayList<Ielts> getIelts() {
        SQLiteDatabase db = openDB();
        ArrayList<Ielts> ielts = new ArrayList<>();
        String sql = "select * from tblIELTS";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    String name = c.getString(1);
                    String des = c.getString(2);
                    ielts.add(new Ielts(name, des));
                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return ielts;
    }

    public ArrayList<Tudien> getTudien() {
        SQLiteDatabase db = openDB();
        ArrayList<Tudien> TudienList = new ArrayList<>();
        String sql = "select * from tblTudien";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    int id = c.getInt(0);
                    String name = c.getString(1);
                    String des = c.getString(2);
                    int idtudien = c.getInt(3);
                    TudienList.add(new Tudien(name, des, idtudien, id));
                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return TudienList;
    }


    public ArrayList<Tudiens> getTudiens(int idTudien) {
        ArrayList<Tudiens> tudiens = new ArrayList<>();
        SQLiteDatabase db = openDB();
        String sql = "select *from tblTudiens";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    if (c.getInt(5) == idTudien) {
                        String tudien = c.getString(1);
                        String danhtu = c.getString(2);
                        String viet = c.getString(3);
                        String viet1 = c.getString(4);
                        int ID = c.getInt(5);
                        tudiens.add(new Tudiens(tudien, danhtu, viet, viet1, ID));

                    }
                } while (c.moveToNext());
            }
        }
        closeDB(db);
        return tudiens;
    }

    public ArrayList<Vocab> getVocab() {
        SQLiteDatabase db = openDB();
        ArrayList<Vocab> vocabList = new ArrayList<>();
        String sql = "select * from tblVocab";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
//                int id=c.getInt(0);
                    String topic = c.getString(1);
                    String noidung1 = c.getString(2);
                    String noidung2 = c.getString(3);
                    int id = c.getInt(4);
                    vocabList.add(new Vocab(topic, noidung1, noidung2, id));
                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return vocabList;
    }

    public ArrayList<Vocabulary> getVocabulary(int idVocab) {
//        String sql = "Select *from tblSent where ID= " + idSen;
        ArrayList<Vocabulary> vocabularyArrayList = new ArrayList<>();
        SQLiteDatabase db = openDB();
        String sql = "select *from tblVocabulary";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    if (c.getInt(10) == idVocab) {
                        String topic = c.getString(1);
                        String noidung1 = c.getString(2);
                        String noidung2 = c.getString(3);
                        String noidung3 = c.getString(4);
                        String noidung4 = c.getString(5);
                        String noidung5 = c.getString(6);
                        String noidung6 = c.getString(7);
                        String noidung7 = c.getString(8);
                        String noidung8 = c.getString(9);
                        String noidung9 = c.getString(11);
                        int ID1 = c.getInt(10);
                        vocabularyArrayList.add(new Vocabulary(topic, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8, noidung9, ID1));
                    }
                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return vocabularyArrayList;
    }

    public ArrayList<Sentences> getSentences() {
        SQLiteDatabase db = openDB();
        ArrayList<Sentences> sentencesArrayList = new ArrayList<>();
        String sql = "select * from tblSent";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {

//                int id=c.getInt(0);

                    String topic = c.getString(1);
                    String noidung1 = c.getString(2);
                    String noidung2 = c.getString(3);
                    int id = c.getInt(4);
                    sentencesArrayList.add(new Sentences(topic, noidung1, noidung2, id));
                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return sentencesArrayList;
    }

    public ArrayList<Senten> getSen(int idSen) {
//        String sql = "Select *from tblSent where ID= " + idSen;
        ArrayList<Senten> sentencesArrayList = new ArrayList<>();
        SQLiteDatabase db = openDB();
        String sql = "select *from tblSentences";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
//                int id=c.getInt(0);
                    if (c.getInt(10) == idSen) {
                        String topic = c.getString(1);
                        String noidung1 = c.getString(2);
                        String noidung2 = c.getString(3);
                        String noidung3 = c.getString(4);
                        String noidung4 = c.getString(5);
                        String noidung5 = c.getString(6);
                        String noidung6 = c.getString(7);
                        String noidung7 = c.getString(8);
                        String noidung8 = c.getString(9);
                        String noidung9 = c.getString(11);
                        int ID = c.getInt(10);
                        sentencesArrayList.add(new Senten(topic, noidung1, noidung2, noidung3, noidung4, noidung5, noidung6, noidung7, noidung8, noidung9, ID));
                    }
                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return sentencesArrayList;
    }


//    public ArrayList<TuDien> getTudien() {
//        ArrayList<TuDien> tuDienArrayList = new ArrayList<>();
//        db = openDB();
//        Cursor c = db.query(Table.TUDIEN.TABLE_NAME, null,null,null,null,null,null);
//        if (c.moveToFirst()) {
//            do {
//
//                TuDien tuDien = new TuDien();
//                tuDien.setName(c.getString(1));
//                tuDien.setDes(c.getString(2));
//            }
//            while (c.moveToNext());
//        }
//
//        closeDB(db);
//        return tuDienArrayList;
//    }
//
//
//    private void insertTudien(Tudien tudien) {
//        db = openDB();
//        ContentValues values = new ContentValues();
//        values.put(Table.TUDIEN.COLUMN_NAME, tudien.getName());
//        values.put(Table.TUDIEN.COLUMN_DES, tudien.getDes());
//
//        db.insert(Table.TUDIEN.TABLE_NAME, null, values);
//        closeDB(db);
//
//    }
//
//    public void CreateTudien() {
//        Tudien t1 = new Tudien("Con ga");
//        insertTudien(t1);
//        Tudien t2 = new Tudien("Con gaiii");
//        insertTudien(t2);
//        Tudien t3 = new Tudien("Con gauu");
//        insertTudien(t3);
//        Tudien t4 = new Tudien("Con gabbb");
//        insertTudien(t4);
//    }

    //    //insert câu hỏi và đáp án vào CSDL
//    public void insertQuestion(Question question) {
////        db = openDB();
//        ContentValues values = new ContentValues();
////        values
//        values.put("CAUHOI", question.question);
//        values.put("OPTION1", question.option1);
//        values.put("OPTION2", question.option2);
//        values.put("OPTION3", question.option3);
//        values.put("OPTION4", question.option4);
//        values.put("DAPAN", question.answer);
//        values.put("DE", question.categoryID);
//        SQLiteDatabase db = openDB();
//        db.insert("tblQuestion", null, values);
//        closeDB(db);
//insert câu hỏi và đáp án vào CSDL
    public void insertQuestion(Question question) {
        db = openDB();
        ContentValues values = new ContentValues();
//        values
        values.put(Table.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        values.put(Table.QuestionsTable.COLUMN_QUESTION_IMAGE, question.getQuestion_image());
        values.put(Table.QuestionsTable.COLUMN_OPTION1, question.getOption1());
        values.put(Table.QuestionsTable.COLUMN_OPTION2, question.getOption2());
        values.put(Table.QuestionsTable.COLUMN_OPTION3, question.getOption3());
        values.put(Table.QuestionsTable.COLUMN_OPTION4, question.getOption4());
        values.put(Table.QuestionsTable.COLUMN_ANSWER, question.getAnswer());
        values.put(Table.QuestionsTable.COLUMN_CATEGORY_ID, question.getCategoryID());


        db.insert(Table.QuestionsTable.TABLE_NAME, null, values);
        closeDB(db);
    }

    public ArrayList<Question> getQuestions(int categoryID) {
        ArrayList<Question> questionArrayList = new ArrayList<>();
        db = openDB();


        String selection = Table.QuestionsTable.COLUMN_CATEGORY_ID + " = ?";

        String[] selectionArgs = new String[]{String.valueOf(categoryID)};

        Cursor c = db.query(Table.QuestionsTable.TABLE_NAME, null, selection, selectionArgs, null, null, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    Question question = new Question();

                    question.setId(c.getInt(0));
                    question.setQuestion(c.getString(1));
                    question.setQuestion_image(c.getInt(2));
                    question.setOption1(c.getString(3));
                    question.setOption2(c.getString(4));
                    question.setOption3(c.getString(5));
                    question.setOption4(c.getString(6));
                    question.setAnswer(c.getInt(7));
                    question.setCategoryID(c.getInt(8));
                    questionArrayList.add(question);

                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return questionArrayList;

    }

    public int countKetqua() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query("tblKETQUA", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public int countTudien() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query("tblTudien", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public int countTudiens() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query("tblTudiens", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public int countQuestion() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query(Table.QuestionsTable.TABLE_NAME, null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public int countVocab() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query("tblVocab", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public int countVocabulary() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query("tblVocabulary", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public int countSenten() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query("tblSent", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public int countSentences() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query("tblSentences", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public int countToeic() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query("tblTOEIC", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public int countToefl() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query("tblTOEFL", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public int countIelts() {
        SQLiteDatabase db = openDB();
        Cursor cursor = db.query("tblIELTS", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            return cursor.getCount();
        }
        return 0;
    }

    public void updateTudien(Tudien tudien, int i) {
        SQLiteDatabase db = openDB();
        ContentValues values = new ContentValues();
        values.put("NAME", tudien.name);
        values.put("DES", tudien.des);
        values.put("IDTUDIEN", tudien.idTudien);
        values.put("isHistory", 1);
        db.update("tblTudien", values, "ID=" + tudien.id, null);
        closeDB(db);
    }

    public ArrayList<Tudien> getHistoryTudien() {
        SQLiteDatabase db = openDB();
        ArrayList<Tudien> arr = new ArrayList<>();
        String sql = "select *from tblTudien where isHistory =1";
        Cursor c = db.rawQuery(sql, null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    int id = c.getInt(0);
                    String name = c.getString(1);
                    String des = c.getString(2);
                    int Idtudien = c.getInt(3);
                    arr.add(new Tudien(name, des, id, Idtudien));
                }
                while (c.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }


}

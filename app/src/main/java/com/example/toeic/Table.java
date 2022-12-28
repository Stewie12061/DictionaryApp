package com.example.toeic;

import android.provider.BaseColumns;

public final class Table {
    private Table() {
    }

    // dữ liệu bảng categories
//    public static class CategoriesTable implements BaseColumns {
//        public static final String TABLE_NAME = "categories";
//        public static final String COLUMN_NAME = "name";
//        public static final String COLUMN_DES = "des";
//
//
//    }

    //Dữ liệu bảng question
    public static class QuestionsTable implements BaseColumns {
        //tên bảng
        public static final String TABLE_NAME = "tblQuestion";
        //câu hỏi
        public static final String COLUMN_QUESTION = "questions";
        public static final String COLUMN_QUESTION_IMAGE = "questionImg";

        //4 đáp án
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";

        //đáp án
        public static final String COLUMN_ANSWER = "answer";
        //id chuyên mục
        public static final String COLUMN_CATEGORY_ID = "id_categories";

    }
//    public static class TUDIEN implements BaseColumns{
//        public static final String TABLE_NAME="Tudien";
//        public static final String COLUMN_NAME = "name";
//
//    }
}

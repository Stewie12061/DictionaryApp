package com.example.toeic;

import java.io.Serializable;

public class Sentences{
    String topicsenten;
    String des1senten;
    String des2senten;
    int idSen;

    public Sentences(String topicsenten, String des1senten, String des2senten, int idSen) {
        this.topicsenten = topicsenten;
        this.des1senten = des1senten;
        this.des2senten = des2senten;
        this.idSen = idSen;
    }
}

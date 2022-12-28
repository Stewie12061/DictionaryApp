package com.example.toeic;

import java.io.Serializable;

public class Vocab implements Serializable {
    String topicvocab;
    String des1vocab;
    String des2vocab;
    int idvocab;

    public Vocab(String topicvocab, String des1vocab, String des2vocab, int idvocab) {
        this.topicvocab = topicvocab;
        this.des1vocab = des1vocab;
        this.des2vocab = des2vocab;
        this.idvocab = idvocab;
    }
}

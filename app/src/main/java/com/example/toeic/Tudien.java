package com.example.toeic;

public class Tudien {

     String name;
     String des;
     int idTudien;
     int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Tudien(String name, String des) {
        this.name = name;
        this.des = des;
    }

//    public Tudien() {
//    }

//    public Tudien(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return getName();
    }

    public Tudien(String name, String des, int idTudien, int id) {
        this.name = name;
        this.des = des;
        this.idTudien = idTudien;
        this.id = id;
    }

    public Tudien(String name, String des, int idTudien) {
        this.name = name;
        this.des = des;
        this.idTudien = idTudien;
    }
}

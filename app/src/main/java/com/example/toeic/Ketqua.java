package com.example.toeic;

public class Ketqua {
    String diem, timeleft, bode, level;

    public Ketqua(String diem, String timeleft, String bode, String level) {
        this.diem = diem;
        this.timeleft = timeleft;
        this.bode = bode;
        this.level = level;
    }


    public String getDiem() {
        return diem;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }

    public String getTimeleft() {
        return timeleft;
    }

    public void setTimeleft(String timeleft) {
        this.timeleft = timeleft;
    }

    public String getBode() {
        return bode;
    }

    public void setBode(String bode) {
        this.bode = bode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

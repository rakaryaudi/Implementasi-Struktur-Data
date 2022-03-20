package com.company;

public class Music {
    private String judulLagu;
    private String namaPenyanyi;

    public Music(String judulLagu,String namaPenyanyi){
        this.judulLagu=judulLagu;
        this.namaPenyanyi=namaPenyanyi;
    }

    public String getJudulLagu() {
        return judulLagu;
    }
    @Override
    public String toString() {
        return judulLagu + "(" + namaPenyanyi + ")";
    }
}

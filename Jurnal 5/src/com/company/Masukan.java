package com.company;

public class Masukan {
    private String tugas;

    public Masukan(String tugas){
        this.tugas = tugas;
    }

    public String getTugas() {
        return tugas;
    }

    @Override
    public String toString(){
        return tugas;
    }
}

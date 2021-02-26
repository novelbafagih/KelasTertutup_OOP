package com.KelasTertutup;

public class Segitiga {
    private int alas;
    private int tinggi;
    //constructor
    public Segitiga(){
        alas = 3;
        tinggi = 5;
    }
    //getter
    public int getAlas(){
        return alas;
    }

    public int getTinggi(){
        return tinggi;
    }
    //Setter
    public void setAlas(int alasBaru){
        alas = alasBaru;
    }
    public void setTinggi(int tinggiBaru) {
        tinggi = tinggiBaru;
    }

    public double luas(){
        double luasS = tinggi * alas /2.0;
        return luasS;
    }
}

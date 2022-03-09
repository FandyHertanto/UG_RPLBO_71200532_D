package com.ug5a.soal2;

public class Sepatu {
    private String kode;
    private static int nextNum=245101;
    private String merkModel;
    private int ukuran;
    private long harga;
    private int stok;

    public Sepatu(String argMerkModel, int argUkuran, long argHarga, int argStok) {
        this.merkModel = argMerkModel;
        this.ukuran = argUkuran;
        this.harga = argHarga;
        this.stok = argStok;
        this.kode="NK"+nextNum;
        nextNum++;
    }

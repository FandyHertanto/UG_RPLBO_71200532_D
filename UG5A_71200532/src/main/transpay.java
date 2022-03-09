package com.ug5a.soal1;

public class TransPay {
    private String nama;
    private long saldo;

//    public TransPay(String nama, long saldo) {
//        this.nama = nama;
//        this.saldo = saldo;
//    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public long getSaldo() {
        return saldo;
    }
    public void topUp(long saldo){
        if (saldo>0){
            this.saldo+=saldo;
        }else{
            this.saldo=this.saldo;
        }
    }
    public void bayar(int jumlah, Keyboard key){
        if (jumlah<0){
            System.out.println("input tidak valid");
        }else{
            if (jumlah*key.getHarga()<=this.saldo){
                this.saldo=this.saldo-(jumlah* key.getHarga());
                System.out.println("Pembayaran sukses! Silahkan mengambil "+key.getMerkModel()+" di counter");
            }else{
                System.out.println("Pembayaran anda gagal! Saldo Anda kurang, silahkan melakukan top up!");
            }
        }
    }
}

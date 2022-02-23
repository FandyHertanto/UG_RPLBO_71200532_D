package com.ug3.soal1;

import java.util.Scanner;

public class UG3soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====================Data Product"+'"'+"====================");
        System.out.println("Masukan Data Product Makanan Anda");
        System.out.print("Nama Makanan: ");
        String name=input.nextLine();
        System.out.print("Tanggal kadaluarsa: ");
        String tgl=input.nextLine();
        System.out.print("Jumlah (quantity): ");
        Float quan=input.nextFloat();
        System.out.print("Berat (gram): ");
        Float heavy=input.nextFloat();

        System.out.println();
        System.out.println();
        System.out.println("====================Data Product====================");
        System.out.println("Nama makanan = "+name);
        System.out.println("Tanggal kadaluarsa = "+tgl);
        System.out.println("Jumlah(quantity) = "+quan);
        System.out.println("Berat = "+heavy);
        System.out.println("====================================================");
    }
}
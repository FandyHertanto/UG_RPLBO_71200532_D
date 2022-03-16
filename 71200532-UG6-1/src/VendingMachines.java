package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private Double consumerMoney;

    public void VendingMachine() {

    }
    public void VendingMachine(int code, int capacity) {
        this.code = String.valueOf(code);
        this.capacity = capacity;
    }
    public void VendingMachine(int code, int capacity, Goods goods, double accpetanceBalance) {

    }
    public void proceedOrder(String goodsCode, int orderQuantity) {

    }
    public Double takeMoney(double money) {
        this.consumerMoney = money;
    }
    private Void giveGood(double goodsPrice, String goodsName) {

    }
    public double withdrawMoney() {

    }
    public Void inputGoods(Goods good) {

    }

}
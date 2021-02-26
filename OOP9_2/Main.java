package com.OOP9_2;

public class Main {

    public static void main(String[] args) {
        Stock kucing = new Stock("kucing","kucing");

        stock.previousClosingPrice = 99999999999999999999999999999;
        stock.currentPrice = 99999999999999999999999999999;

        System.out.printf("%.2f",stock.getChangePercent());
        System.out.println("%");
    }
}

package com.KelasTertutup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account daniel = new Account(69,3);
        daniel.setSalary(20);
        daniel.setMonth(90);
        daniel.getMoney();

        Account andira = new Account(0,0);
        System.out.println("Daniel = "+daniel.getBalance());
        System.out.println("Andira = "+andira.getBalance());

        Rectangle kotak = new Rectangle(4,40);
        System.out.println(kotak.getArea());

        Rectangle kotak1 = new Rectangle(3.5,35.9);
        System.out.println(kotak1.getArea());


    }
}

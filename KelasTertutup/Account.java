package com.KelasTertutup;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double salary = 0;
    private int month;

    public Account(){

    }

    public Account(int newId,int newBalance){
        id = newId;
        balance = newBalance;
    }

    public void setSalary(int newSalary){
        salary = newSalary;
    }

    public void setMonth(int newMonth){
        month = newMonth;
    }

    public void getMoney(){
        balance += month * salary;
        month = 0;
    }

    public double getBalance(){
        return balance;
    }

}

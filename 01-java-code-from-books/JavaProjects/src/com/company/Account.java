package com.company;

public class Account {
    private int AccountNumber;
    private double balance;
    public Account (int AccountNumber, double balance) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }
    public Account(int AccountNumber) {
        this.AccountNumber = AccountNumber;
        balance = 0.0;
    }
}

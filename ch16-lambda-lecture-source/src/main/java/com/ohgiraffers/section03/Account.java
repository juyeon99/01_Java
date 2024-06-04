package com.ohgiraffers.section03;

public class Account {
    private String ownerName;
    private int balance;

    public Account() {
    }

    public Account(String ownerName, int balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public Account(String ownerName) {     // ownerName만 parameter로 있는 constructor
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}

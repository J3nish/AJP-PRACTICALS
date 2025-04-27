/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical_8;

import java.io.Serializable;
/**
 *
 * @author Meet
 */
public class Bank {
    private int acNo;
    private String acHolderName;
    private double balance;

    // Constructor
    public Bank() {}

    // Getter and Setter for Account Number
    public int getAcNo() {
        return acNo;
    }
    public void setAcNo(int acNo) {
        this.acNo = acNo;
    }

    // Getter and Setter for Holder Name
    public String getAcHolderName() {
        return acHolderName;
    }
    public void setAcHolderName(String acHolderName) {
        this.acHolderName = acHolderName;
    }

    // Getter and Setter for Balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposite(double amount) {
        this.balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
    }
}

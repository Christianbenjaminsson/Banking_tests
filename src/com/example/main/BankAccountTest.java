package com.example.main;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount account;

    @org.junit.jupiter.api.Test
    public void deposit() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    public void withDraw_branch() {
        double balance = account.withDraw(600.00, true);
        assertEquals(400.00, balance, 0);
        //BankAccount account = new BankAccount("Andrew", "Buchalka", 500.00, BankAccount.CHECKING);
        //account.withDraw(200.00, true);
        //assertEquals(300.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void withDraw_notBranch() {
        double balance = account.withDraw(600.00, false);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void getBalance_withDraw() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        account.withDraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }
}
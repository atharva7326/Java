package com.bank.module;

public interface BankService {
    void createAccount(String name, double initialAmount);
    void deposit(int accountNumber, double amount);
    void withdraw(int accountNumber, double amount);
    void checkBalance(int accountNumber);
    void displayAllAccounts();
}

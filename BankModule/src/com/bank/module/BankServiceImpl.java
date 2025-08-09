package com.bank.module;

import java.util.HashMap;
import java.util.Map;

public class BankServiceImpl implements BankService {
    private Map<Integer, Bank> accountMap = new HashMap<>();
    private static int accountCounter = 1000;

    public void createAccount(String name, double initialAmount) {
        Bank account = new Bank(accountCounter, name, initialAmount);
        accountMap.put(accountCounter, account);
        System.out.println("Account created! Account Number: " + accountCounter);
        accountCounter++;
    }

    public void deposit(int accountNumber, double amount) {
        Bank account = accountMap.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposited " + amount + " successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        Bank account = accountMap.get(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Withdrawn " + amount + " successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(int accountNumber) {
        Bank account = accountMap.get(accountNumber);
        if (account != null) {
            System.out.println("Current Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAllAccounts() {
        if (accountMap.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Bank account : accountMap.values()) {
                System.out.println("Account No: " + account.getAccountNumber() +
                                   ", Name: " + account.getAccountHolderName() +
                                   ", Balance: " + account.getBalance());
            }
        }
    }
}

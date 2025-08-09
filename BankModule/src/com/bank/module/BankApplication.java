package com.bank.module;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bankService = new BankServiceImpl();//upcasting

        while (true) {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    sc.nextLine();  
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Amount: ");
                    double amt = sc.nextDouble();
                    bankService.createAccount(name, amt);
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    int accNum = sc.nextInt();
                    System.out.print("Enter Deposit Amount: ");
                    double dep = sc.nextDouble();
                    bankService.deposit(accNum, dep);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.nextInt();
                    System.out.print("Enter Withdraw Amount: ");
                    double with = sc.nextDouble();
                    bankService.withdraw(accNum, with);
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.nextInt();
                    bankService.checkBalance(accNum);
                    break;
                case 5:
                    bankService.displayAllAccounts();
                    break;
                case 6:
                    System.out.println("Thank you for using the Bank System!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

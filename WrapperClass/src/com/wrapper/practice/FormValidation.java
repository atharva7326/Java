package com.wrapper.practice;
import java.util.Scanner;

public class FormValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        String ageStr = sc.nextLine();
        
        try {
            int age = Integer.parseInt(ageStr);
            if(age < 0 || age > 120) {
                System.out.println("Age must be between 0 and 120.");
            } else {
                System.out.println("Valid age: " + age);
            }
        } catch (NumberFormatException e) {
            System.out.println("Age must be a valid number.");
        }

        System.out.print("Are you a student (true/false): ");
        String studentStr = sc.nextLine();
        boolean isStudent = Boolean.parseBoolean(studentStr);
        System.out.println("Is student: " + isStudent);
    }
}

package com.patient.queue;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;

class Patient {
    private String id;
    private String name;
    private int age;
    private String disease;

    public Patient(String id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String getId() {
        return id;
    }

    public void display() {
        System.out.printf("ID: %-10s Name: %-15s Age: %-5d Disease: %s%n", id, name, age, disease);
    }
}

public class SmartPatientQueue {

    private LinkedList<Patient> patientQueue = new LinkedList<>();
    private HashSet<String> patientIDs = new HashSet<>();
    private Scanner sc = new Scanner(System.in);

    public String generateRandomId() {
        String id;
        do {
            id = "P" + (int)(Math.random() * 90000 + 10000);
        } while (patientIDs.contains(id));
        return id;
    }

    public void addPatient(boolean isEmergency) {
        String id = generateRandomId();
        System.out.println("Generated ID: " + id);

        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        Patient p = new Patient(id, name, age, disease);

        if (isEmergency) {
            patientQueue.addFirst(p);
            System.out.println("Emergency patient added at front.");
        } else {
            patientQueue.addLast(p);
            System.out.println("Patient added to queue.");
        }
        patientIDs.add(id);
    }

    public void cancelAppointment() {
        System.out.print("Enter ID to cancel: ");
        String id = sc.next();
        boolean removed = false;

        Iterator<Patient> itr = patientQueue.iterator();
        while (itr.hasNext()) {
            Patient p = itr.next();
            if (p.getId().equals(id)) {
                itr.remove();
                patientIDs.remove(id);
                removed = true;
                System.out.println("Appointment canceled for ID: " + id);
                break;
            }
        }

        if (!removed) {
            System.out.println("Patient ID not found.");
        }
    }

    public void viewAllPatients() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients in queue.");
            return;
        }
        System.out.println("All Patients:");
        for (Patient p : patientQueue) {
            p.display();
        }
    }

    public void lastPatient() {
        if (!patientQueue.isEmpty()) {
            System.out.println("Last Patient:");
            patientQueue.getLast().display();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void nextPatient() {
        if (!patientQueue.isEmpty()) {
            System.out.println("Next Patient:");
            patientQueue.peek().display();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void run() {
        int choice;
        do {
            System.out.println("\n--- Smart Patients Queue Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Emergency Patient");
            System.out.println("3. Cancel Appointment");
            System.out.println("4. View All Patients");
            System.out.println("5. View Last Patient");
            System.out.println("6. View Next Patient");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addPatient(false);
                case 2 -> addPatient(true);
                case 3 -> cancelAppointment();
                case 4 -> viewAllPatients();
                case 5 -> lastPatient();
                case 6 -> nextPatient();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }

        } while (choice != 0);
    }

    public static void main(String[] args) {
        new SmartPatientQueue().run();
    }
}

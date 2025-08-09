package com.patient.queue;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Objects;

class Patient1 {
	private String id;
	private String name;
	private int age;
	private String disease;

	public Patient1(String id, String name, int age, String disease) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease;
	}
//    public void display() {
//        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease);
//    }

	// 🔁 Override equals and hashCode to prevent duplicate IDs
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Patient1) )
			return false;// check the current object is same for class object
		Patient1 patient = (Patient1) obj;// typecase
		return Objects.equals(id, patient.id); // Only ID matters for equality
	}

	@Override
	public int hashCode() {
		return id.hashCode(); // Hash based only on ID
	}
}

public class UniquePatientReg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Patient1> patients = new HashSet<>();

		while (true) {
			System.out.println("\n1. Register Patient\n2. View All Registered Patients\n3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				String id = sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Disease: ");
				String disease = sc.nextLine();

				Patient1 newPatient = new Patient1(id, name, age, disease);
				if (patients.add(newPatient)) {
					System.out.println("Patient Registered Successfully!");
				} else {

					System.out.println("Patient with ID " + id + " is already registered.");

				}
				break;

			case 2:
				if (patients.isEmpty()) {
					System.out.println("No patients registered.");
				} else {
					System.out.println("\nRegistered Patients:");
					for (Patient1 p : patients) {
//                            p.display();
						System.out.println(p);
					}
				}
				break;

			case 3:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
}

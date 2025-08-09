package com.patient.queue;

import java.util.*;

class HashPatient {
	private String name;
	private int age;
	private int id;

	public HashPatient(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String toString() {
		return "Patient Name: " + name + " | Age: " + age + " | ID: " + id;
	}
}

public class HashMapPatient {
	public static void main(String[] args) {
		HashMap<Integer, HashPatient> patient = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n---- Patient Management System ----");
			System.out.println("1. Add a Patient");
			System.out.println("2. Show all Patients");
			System.out.println("3. Remove Patient");
			System.out.println("4. Update Patient Details");
			System.out.println("5. How Many Patient");
			System.out.println("6. Clear Record");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Patient ID: ");
				int patientId = sc.nextInt();
				sc.nextLine();

				if (patient.containsKey(patientId)) {
					System.out.println("Patient ID already exists. Use a unique ID.");
					break;
				}

				System.out.print("Enter Patient Name: ");
				String patientName = sc.nextLine();

				System.out.print("Enter Patient Age: ");
				int patientAge = sc.nextInt();

				HashPatient p1 = new HashPatient(patientName, patientAge, patientId);
				patient.put(patientId, p1);
				System.out.println("Patient Registered Successfully!");
				break;

			case 2:
				System.out.println("\nAll Patient Details:");
				if (patient.isEmpty()) {
					System.out.println("No patients registered yet.");
				} else {
					for (HashPatient p : patient.values()) {
						System.out.println(p);
					}
				}
				break;
			case 3:
				System.out.println("Enter the Patient Id: ");
				int id = sc.nextInt();
				patient.remove(id);
				System.out.println("Patient Remove Sucessfully.");
				break;

			case 4:
				System.out.println("Enter Patient ID: ");
				int id1 = sc.nextInt();
				sc.nextLine();

				if (patient.containsKey(id1)) {
					System.out.println("Patient ID already exists. Now You can Update.");
					System.out.print("Enter New Patient Name: ");
					String pName = sc.nextLine();

					System.out.print("Enter New Patient Age: ");
					int pAge = sc.nextInt();

					HashPatient p2 = new HashPatient(pName, pAge, id1);
					patient.put(id1, p2);
					System.out.println("Patient Update Successfully!");

				} else {
					System.out.println("Patient Id Wrong !");
				}
				break;

			case 5:
				System.out.println("Total Patient: " + patient.size());
				break;
			case 6:
				System.out.println("Clearing Record...");
				patient.clear();
				System.out.println("All Record Cleared!");
				break;
				
			case 7:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}

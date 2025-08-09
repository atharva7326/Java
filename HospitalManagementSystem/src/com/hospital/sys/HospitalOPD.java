package com.hospital.sys;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
	private String name;
	private int age;
	private String disease;

	public Patient(String name, int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getDisease() {
		return disease;
	}

	public void displayDetails() {
		System.out.println();
		System.out.println("Name: " + name + "\nAge: " + age + "\nDisease: " + disease);
	}
}

public class HospitalOPD {
	public static void main(String[] args) {
		ArrayList<Patient> patientList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		patientList.add(new Patient("Daya", 45, "Fever"));
		patientList.add(new Patient("Abhijeet", 40, "Cough"));
		patientList.add(new Patient("Tasha", 30, "Pain"));

		while (true) {
			System.out.println("\nHospital OPD Menu:");
			System.out.println("1. Add New Patient");
			System.out.println("2. Display All Patients");
			System.out.println("3. Search Patient by Name");
			System.out.println("4. Update Patient Details");
			System.out.println("5. Display Patients by Disease");
			System.out.println("6. Show Total Number of Patients");
			System.out.println("7. Remove Patient by Name");
			System.out.println("8. Find Last Index and First Index of Patient");
			System.out.println("9. Clear All Record");
			System.out.println("10. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (choice) {
				case 1:
					System.out.print("Enter patient name: ");
					String name = scanner.nextLine();
					System.out.print("Enter patient age: ");
					int age = scanner.nextInt();
					scanner.nextLine(); // consume newline
					System.out.print("Enter disease: ");
					String disease = scanner.nextLine();
					patientList.add(new Patient(name, age, disease));
					System.out.println("Patient added successfully!");
					break;

				case 2:
					System.out.println("All Registered Patients:");
					for (Patient p : patientList) {
						p.displayDetails();
					}
					break;

				case 3:
					System.out.print("Enter patient name to search: ");
					String searchName = scanner.nextLine();
					boolean found = false;
					for (Patient p : patientList) {
						if (p.getName().equalsIgnoreCase(searchName)) {
							p.displayDetails();
							found = true;
							break;
						}
					}
					if (!found) {
						System.out.println("No patient found with name: " + searchName);
					}
					break;

				case 4:
					System.out.print("Enter patient name to update: ");
					String updateName = scanner.nextLine();
					boolean updated = false;
					for (Patient p : patientList) {
						if (p.getName().equalsIgnoreCase(updateName)) {
							System.out.print("Enter new age: ");
							int newAge = scanner.nextInt();
							scanner.nextLine();
							System.out.print("Enter new disease: ");
							String newDisease = scanner.nextLine();
							p.setAge(newAge);
							p.setDisease(newDisease);
							System.out.println("Patient details updated.");
							updated = true;
							break;
						}
					}
					if (!updated) {
						System.out.println("No patient found with name: " + updateName);
					}
					break;

				case 5:
					System.out.print("Enter disease to filter by: ");
					String diseaseFilter = scanner.nextLine();
					boolean matchFound = false;
					for (Patient p : patientList) {
						if (p.getDisease().equalsIgnoreCase(diseaseFilter)) {
							p.displayDetails();
							matchFound = true;
						}
					}
					if (!matchFound) {
						System.out.println("No patients found with disease: " + diseaseFilter);
					}
					break;

				case 6:
					System.out.println("Total Registered Patients: " + patientList.size());
					break;
				case 7:
					System.out.println("Enter Patients Name: ");
					String patientName = scanner.nextLine();
					boolean patientRemove = false;
					int index = -1;
					for(Patient p:patientList) {
						index++;
						if(p.getName().equalsIgnoreCase(patientName)) {
							patientList.remove(index);
							index = -1;
							patientRemove = true;
							System.out.println("Patient Remove Successfully!");
							break;
						}
					}
					if(!patientRemove) {
						System.out.println("No patinet found with name: " + patientName);
					}
					break;
				case 8:
					System.out.println("First Index of Patient: " + 0);
					System.out.println("Last Index of Patient: " + (patientList.size() -1));
				case 9:
					patientList.clear();
					System.out.println("All Record is Deleted");
					break;
				case 10:
					System.out.println("Exiting...");
					scanner.close();
					return;

				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}

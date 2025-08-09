package com.patient.queue;

import java.util.*;
import java.util.UUID;

class Doctor {
	private String licenseNo;
	private String name;
	private String department;

	public Doctor(String licenseNo, String name, String department) {
		this.licenseNo = licenseNo;
		this.name = name;
		this.department = department;
	}

	public String toString() {
		return "License Number: " + licenseNo + " Doctor Name: " + name + " Department: " + department;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Doctor))
			return false;
		Doctor d = (Doctor) obj;
		return Objects.equals(licenseNo, d.licenseNo);
	}

	public int hashCode() {
		return licenseNo.hashCode();
	}

}

public class DoctorRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Doctor> d = new HashSet<>();
		while (true) {
			System.out.println("\n----- Doctor Registration -----");
			System.out.println("1. Add a new Doctor");
			System.out.println("2. Display All Registered Doctor");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter Doctor License Number: ");
				String doctorLicense = sc.nextLine();
			    String uniqueId = doctorLicense + "-" + UUID.randomUUID().toString();
				
				System.out.println("Enter Doctor Name: ");
				String doctorName = sc.nextLine();
				
				System.out.println("Enter Doctor Department: ");
				String doctorDepartment = sc.nextLine();
				
				Doctor doctor = new Doctor(uniqueId, doctorName, doctorDepartment);
				if (d.add(doctor)) {
					System.out.println("Doctor Registered Successfully!");
				} else {
					System.out.println("Doctor with license No. " + doctorLicense + " is already registered.");
				}
				break;
			case 2:
				if (d.isEmpty()) {
					System.out.println("No Doctor Registered!");
				} else {
					System.out.println("Registered Doctor!");
					for (Doctor d2 : d) {
						System.out.println(d2);
					}
				}
				break;
			case 3:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid Choice");

			}

		}
	}

}

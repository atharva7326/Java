package com.patient.queue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.UUID;

class PatientApp implements Comparable<PatientApp> {
	private String id;
	private String dateTime;
	private String appointment;
	private String name;
	private LocalDateTime dateTimeParsed;

	public PatientApp(String id, String dateTime, String appointment, String name) {
		this.id = id;
		this.dateTime = dateTime;
		this.appointment = appointment;
		this.name = name;
		this.dateTimeParsed = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
	}

//	public String toString() {
//		return "ID: " + id + " | Patient: " + name + " | DateTime: " + dateTime + " | Reason: " + appointment;
//	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PatientApp))
			return false;
		PatientApp p = (PatientApp) obj;
		return Objects.equals(id, p.id);
	}

	public int hashCode() {
		return id.hashCode();
	}

	public int compareTo(PatientApp other) {
		int cmp = this.dateTimeParsed.compareTo(other.dateTimeParsed);
		if (cmp == 0) {
			return this.id.compareTo(other.id); // Ensure uniqueness in TreeSet
		}
		return cmp;
	}
}

public class AppointmentsScheduler {
	public static void main(String[] args) {
		TreeSet<PatientApp> appointments = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
//		appointments.add(new PatientApp("P001", "2025-08-01 10:30", "Dental Checkup", "Daya"));
//		appointments.add(new PatientApp("P002", "2025-08-01 09:00", "Eye Test", "Abhijeet"));
//		appointments.add(new PatientApp("P003", "2025-08-01 11:00", "General", "ACP"));
//		appointments.add(new PatientApp("P001", "2025-08-01 10:30", "Dental Checkup", "Chitrole")); // duplicate
//
//		System.out.println("Scheduled Appointments (Chronological Order):");
//		for (PatientApp app : appointments) {
//			System.out.println(app);
//		}
		while (true) {
			System.out.println("\n----- Patient Appointment -----");
			System.out.println("1. Add a new Appointment");
			System.out.println("2. Display All Appointment");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter Patient ID: ");
				String patientId = sc.nextLine();
//			    String uniqueId = patientId + "-" + UUID.randomUUID().toString();
				
				System.out.println("Enter Patient Name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter Appointment: ");
				String appointment = sc.nextLine();
				
				System.out.println("Enter Date and time (yyyy-MM-dd HH:mm): ");
				String dateTime = sc.nextLine();
//				 LocalDateTime dateTime = LocalDateTime.now();
//				 String t = dateTime.toString();
				
				
				
				PatientApp patient = new PatientApp(patientId, dateTime, appointment,name);
				if (appointments.add(patient)) {
					System.out.println("Appointment Registered Successfully!");
				} else {
					System.out.println("Appointment with date and time " + dateTime + " is already registered.");
				}
				break;
			case 2:
				if (appointments.isEmpty()) {
					System.out.println("No Appointment Registered!");
				} else {
					System.out.println("Scheduled Appointments (Chronological Order):");
					for (PatientApp p : appointments) {
						System.out.println(p);
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

//Patient record system: protect patient health info.
package wd;

import java.util.Scanner;

public class Patient_Rs {
	private String patientName;
	private int age;
	private int healthStatus;
	private int bloodPressure;
	Scanner s = new Scanner(System.in);

	public void setPatientHealth() {
		System.out.println("==== Enter Details of Patient ====");
		System.out.println("Enter Patient Name: ");
		this.patientName = s.nextLine();
		System.out.println("Enter Patient Age: ");
		this.age = s.nextInt();
		System.out.println("Enter Patient Health Status: ");
		this.healthStatus = s.nextInt();
		System.out.println("Enter Patient Blood Pressure: ");
		this.bloodPressure = s.nextInt();
	}
    
	public void getPatientHealth() {
		System.out.println();
		System.out.println("==== Deatils of Patient Health ====");
		System.out.println("Patient Name: " + patientName);
		System.out.println("Patient age: " + age);
		System.out.println("Patient Health Status: " + healthStatus + "%");
		System.out.println("Patient Blood Pressure: " + bloodPressure);
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient_Rs h = new Patient_Rs();

		h.setPatientHealth();
		h.getPatientHealth();

	}
 
}

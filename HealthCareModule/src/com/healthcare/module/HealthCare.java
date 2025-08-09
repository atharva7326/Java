package com.healthcare.module;

public class HealthCare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientRegistration patient1 = new PatientRegistration(1,"Gojo",23,"Heart");
		PatientRegistration patient2 = new PatientRegistration(2,"Goku",22,"Mind");
		
		PatientService ps1 = new PatientServiceImpl();
		PatientService ps2 = new PatientServiceImpl();
		//passing details to interface of patient
		ps1.registerPatient(patient1);
		ps2.registerPatient(patient2);
		ps1.showPatientDetails(patient1.getId());
		ps2.showPatientDetails(patient2.getId());
		
		Doctor d1 = new General_Physician("Dr. Gojo");

		Doctor d2 = new Cardiologist("Dr. Goku");
		
		System.out.println("\nDiagnosis: ");
		d1.diagnose(patient1);
		d2.diagnose(patient2);

	}

}

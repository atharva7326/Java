package com.healthcare.module;

public class PatientServiceImpl implements PatientService {
	PatientRegistration[] patientDetails = new PatientRegistration[100];

	@Override
	public void registerPatient(PatientRegistration patient) {
		patientDetails[patient.getId()] = patient;
		System.out.println("Patient registered successfully!");
	}

	@Override
	public void showPatientDetails(int id) {
		PatientRegistration p = patientDetails[id];
		if (p != null) {
			System.out.println("Patient Found:");
			System.out.println("ID: " + p.getId());
			System.out.println("Name: " + p.getName());
			System.out.println("Age: " + p.getAge());
			System.out.println("Illness: " + p.getIllness());
		} else {
			System.out.println("Patient with ID " + id + " not found.");
		}
	}
}

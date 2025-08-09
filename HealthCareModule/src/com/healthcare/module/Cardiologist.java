package com.healthcare.module;

public class Cardiologist extends Doctor {
     public Cardiologist(String name) {
    	 super(name,"Cardiologist");
     }
     public void diagnose(PatientRegistration patient) {
    	 System.out.println(DoctorName + " (" + specialization + ") is treating " + patient.getName()
    	 + ":General Checkup for " + patient.getIllness());
     }
}

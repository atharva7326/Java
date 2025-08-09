package com.healthcare.module;

public class General_Physician extends Doctor {
     public General_Physician(String name) {
    	 super(name,"General Physician");
     }
     public void diagnose(PatientRegistration patient) {
    	 System.out.println(DoctorName + " (" + specialization + ") is treating " + patient.getName()
    	 + ":General Checkup for " + patient.getIllness());
     }

}
package com.healthcare.module;

public abstract class Doctor {
        protected String DoctorName;
        protected String specialization;
        
        public  Doctor(String d, String s) {
        	this.DoctorName = d;
        	this.specialization = s;
        }
        public abstract void diagnose(PatientRegistration patient);
}

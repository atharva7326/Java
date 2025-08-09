package com.healthcare.module;

public class PatientRegistration {
        private int id;
        private String name;
        private int age;
        private String illness;
        
        public PatientRegistration(int i, String n, int a, String il) {
        	this.id = i;
        	this.name = n;
        	this.age = a;
        	this.illness = il;
        } 
        public int getId() {
        	return id;
        }
        public String getName() {
        	return name;
        }
        public int getAge() {
        	return age;
        }
        public String getIllness() {
        	return illness;
        }
}

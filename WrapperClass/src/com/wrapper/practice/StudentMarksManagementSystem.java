package com.wrapper.practice;
import java.util.*;
class Student{
	private int rollNo;
	private String name;
	private HashMap<String,Integer> subjectMarks= new HashMap<>();
	public Student(int rollNo,String name, HashMap<String,Integer> subjectMarks) {
		this.rollNo = rollNo;
		this.name = name;
		this.subjectMarks = subjectMarks;
	}
	void displayStudentDetails() {
		System.out.println();
		System.out.println("Roll Number: "+ rollNo);
		System.out.println("Name: "+ name);
		System.out.println("Marks list: ");
		for(String i: subjectMarks.keySet()) {
			System.out.println(i + ": " +  subjectMarks.get(i));
		}
	}
	
	
	
}
public class StudentMarksManagementSystem {

	public static void main(String[] args) {
		  HashMap<String,Integer> subjectMarks= new HashMap<>();
		  subjectMarks.put("Maths", 80);
		  subjectMarks.put("Englist", 90);
          Student s1 = new Student(1,"Ajay",subjectMarks);
          s1.displayStudentDetails();
          subjectMarks.clear();
          
          
          subjectMarks.put("Maths", 85);
		  subjectMarks.put("Englist", 95);
          Student s2 = new Student(2,"Jai",subjectMarks);
          s2.displayStudentDetails();
          
	}

}

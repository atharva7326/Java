package com.sorting.d;

public class Employee {
      String name;
      int salary;
      
      Employee(String n, int s) {
    	  this.name = n;
    	  this.salary = s;
      }
      
      void display() {
          System.out.println(name + " - " + salary);
      }
}

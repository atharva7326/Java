package com.patient.queue;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetImp {

	public static void main(String[] args) {
		  TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
		  TreeSet<String> s = new TreeSet<>();

	        set.add(10);
	        set.add(5);
	        set.add(20);
	        set.add(15);
//	        s.add(null);
	        s.add("a");
	        s.add("A");
	        s.add("z");
	        s.add("B");
	        s.add("Ajay");
	        s.add("Bob");

	        System.out.println("Descending TreeSet: " + set);
	        System.out.println("String TreeSet: " + s);
	        

	}

}

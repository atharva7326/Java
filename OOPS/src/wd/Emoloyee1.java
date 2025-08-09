package wd;

class Employee1 {
	String fName;
	String lName;

	void setFirstName(String f, String l) {
		this.fName = f;
		this.lName = l;
	}

	void work() {
		System.out.println(fName + " " + lName + " is working.");
	}
}

class Manager extends Employee1 {
	void manage() {
		System.out.println(fName + " " + lName + " is managing the team.");
	}
}

class Developer extends Employee1 {
	void code() {
		System.out.println(fName + " " + lName + " is writing code.");
	}
}

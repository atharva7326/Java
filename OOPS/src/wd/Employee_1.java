package wd;

public class Employee_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e = new Employee1();
		e.setFirstName("Atharva", "Sawant");
		e.work();
		
		
		Manager m = new Manager();
		m.setFirstName("Kiran", "Parab");
		m.work();
		m.manage();
		
		Developer d = new Developer();
		d.setFirstName("Omkar", "Nadkarni");
		d.work();
		d.code();		

	}

}

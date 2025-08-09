//1. Employee class: hide salary and allow access only through getter/setter.
//2. Bank Account: allow only secure deposit/withdrawal.
//3. Car class: encapsulate engine status, speed, fuelLevel.
//4. Patient record system: protect patient health info.
//5. Voting app: encapsulate user voting rights and identity.
package wd;
public class Employee_Encap {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setSalary(50000);
		System.out.println(emp.getSalary());

	}

}

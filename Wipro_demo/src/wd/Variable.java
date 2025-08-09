package wd;

public class Variable {
    static int factorial2 = 5;
    int factorial3 = 6;
    
    
	public static void main(String[] args) {
		
		int ans = 1;
		int factorial1 = 4;
		for(int i = 1; i <= factorial1; i++) {
		    ans = ans*i;
		}
		System.out.println("Factorial local variable is: " + ans);
		ans = 1;
		for(int i = 1; i <= factorial2; i++) {
		    ans = ans*i;
		}
		System.out.println("Factorial static variable 2 is: " + ans);
		
		int age = 18;
		if(age != 18) {
			System.out.println("Not a Logincal op");
		}
		else {
			System.out.println("Logincal op");
		}
		System.out.println("Right shift");
		System.out.println(age<<1);

	}

}

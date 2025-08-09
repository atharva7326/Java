package print;

public class Print_Some {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name = "Atharva Sawant";
//		int age = 22;
//		long mobileNo = 1234567890;
//		
//		System.out.println("My name is " + name + ". My age is "+ age + ". My Phone number is " + mobileNo);
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				if (i == 2) {
					continue;
				}
				System.out.println("Even number " + i);
			} else {
				System.out.println("Odd number " + i);
			}
		}
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thru");
			break;
		case 5:
			System.out.println("Fri");
			break;
		default:
			System.out.println("other date");
			break;

		}

	}

}

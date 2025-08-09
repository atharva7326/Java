package wd;

public class UniversityPortal {
	String universityName;
	String universityAddress;

	void setUniversityDetails(String n, String a) {
		this.universityName = n;
		this.universityAddress = a;
	}

	void showUniversityDetails() {
		System.out.println("University Name: " + universityName);
		System.out.println("University Address: " + universityAddress);
	}
}

class CourseProvieded extends UniversityPortal {
	String[] courses = new String[5];

	void setCourses(String[] a) {
		for (int i = 0; i < courses.length; i++) {
			courses[i] = a[i];
		}
	}

	void showCourses() {
		System.out.println("Courses Offered:");
		for (String course : courses) {
			System.out.println("- " + course);
		}
	}
}

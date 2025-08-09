package wd;

public abstract class Shape {
	abstract void area();
}

class CircleArea extends Shape {
	int radius = 3;
	float pi = 3.14f;

	void area() {
		float areaOfCircle = pi * radius * radius;

		System.out.println("The area of circle is: " + areaOfCircle);
	}
}

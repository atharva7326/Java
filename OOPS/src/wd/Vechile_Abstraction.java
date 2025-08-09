package wd;

public abstract class Vechile_Abstraction {
       abstract void startEngine();
}

class BikeStartEngine extends Vechile_Abstraction{
	void startEngine() {
		System.out.println("The Bike engine get start");
	}
}

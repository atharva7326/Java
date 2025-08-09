package wd;

public class Vechile_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars c = new Cars();
		c.setVechileDetails("Car", "BMW");
		c.carDetails();
		
		Bike b = new Bike();
		b.setVechileDetails("Bike", "TVS");
		b.bikeDetails();
		
		Truck t = new Truck();
		t.setVechileDetails("Truck", "Tata");
		t.truckDetails();

	}

}

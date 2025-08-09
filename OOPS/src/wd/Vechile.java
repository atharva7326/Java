//Vehicle -> Car/Bike/Truck subclasses.
package wd;

public class Vechile {
      String vechileName;
      String vechileModel;
      
      void setVechileDetails(String vechileName, String vechileModel) {
    	  this.vechileName = vechileName;
    	  this.vechileModel = vechileModel;
      }
}
class Cars extends Vechile{
	void carDetails() {
		System.out.println("The Vechile Name is: " + vechileName);
		System.out.println("The Vechile Model is: "+ vechileModel + "\n");
	}
}
class Bike extends Vechile{
	void bikeDetails() {
		System.out.println("The Vechile Name is: "+ vechileName);
		System.out.println("The Vechile Model is: "+ vechileModel + "\n");
	}
}
class Truck extends Vechile{
	void truckDetails() {
		System.out.println("The Vechile Name is: "+ vechileName);
		System.out.println("The Vechile Model is: "+ vechileModel + "\n");
	}
}

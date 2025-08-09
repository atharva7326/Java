//Car class: encapsulate engine status, speed, fuelLevel.
package wd;

public class Car {
     private String engineStatus;
     private int carSpeed;
     private int fuelLevel;
     public void setDetailsOfCar(String e,int c, int f) {
    	 this.engineStatus = e;
    	 this.carSpeed = c;
    	 this.fuelLevel = f;
     }
     public void getDetailsOfCar() {
    	 System.out.println();
    	 System.out.println("The car Engine Status is: " + engineStatus);
    	 System.out.println("The car Speed is: " + carSpeed);
    	 System.out.println("The Fuel Level is: " + fuelLevel + "%");
     }
     
}

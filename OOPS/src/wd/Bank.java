package wd;

public class Bank {
      private int balance = 50000;
      public void SetDeposit(int d) {
    	  balance += d;
    	  System.out.println("After deposit Total Balance is: " + balance);
      }
      public void Setwithdrawal(int w) {
    	  if(balance > w) {
    		  balance -= w;
        	  System.out.println("After Withdrawal Total Balance is: " + balance);
    	  }
    	  else {
    		  System.out.println("Amount is not sufficient for withdrawal.");
    	  }
    	  
      }
      
}
//public class Car {
//    private String engineStatus;
//    private int carSpeed;
//    private int fuelLevel;
//    public void setDetailsOfCar(String e,int c, int f) {
//   	 this.engineStatus = e;
//   	 this.carSpeed = c;
//   	 this.fuelLevel = f;
//    }
//    public void getDetailsOfCar() {
//   	 System.out.println("The car Engine Status is: " + engineStatus);
//   	 System.out.println("The car Speed is: " + carSpeed);
//   	 System.out.println("The Fuel Level is: " + fuelLevel + "%");
//    }
//    
//}

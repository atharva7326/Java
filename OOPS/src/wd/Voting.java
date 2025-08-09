//Voting app: encapsulate user voting rights and identity.
package wd;

public class Voting {
      private String name;
      private int age;
      private  boolean votingRights;
      public void setUserDetails(String name, int age) {
    	  this.name = name;
    	  this.age = age;
    	  if(age >= 18) {
    		  votingRights = true;
    	  }
    	  else {
    		  votingRights = false;
    	  }
      }
      public void getUserDetails() {
    	  System.out.println("==== Voting Right and Identity ===");
    	  System.out.println("Name: " + name);
    	  System.out.println("Age: " + age);
    	  System.out.println("Voting Rights: " + votingRights + "\n");
    	  
      }
      

}

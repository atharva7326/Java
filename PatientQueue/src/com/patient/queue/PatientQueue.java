package com.patient.queue;
import java.util.LinkedList;
import java.util.Scanner;
 
public class PatientQueue {
public static void main(String[] args)
    {
 
	LinkedList<String> patientQueue=new LinkedList<>();   
	Scanner sc= new Scanner(System.in);
	int choice;
	
	do {
		System.out.println("\n Hospital Patient Queue_ _ _ :");
		System.out.println("1. Add New Patient(normal)");
		System.out.println("2. Add emergeny patient");
		System.out.println("3. Remove patient");
		System.out.println("4. View all Patient");
		System.out.println("5. View first and last patient");
		System.out.println("6. Clear All Patient");
		System.out.println("7. Number of Patient");
		System.out.println("8. Remove Patient by Name");
		System.out.println("9. Exit");
		System.out.println("Enter your choice :");
		choice =sc.nextInt();
		sc.nextLine();
		
	switch(choice)
	{
	case 1:
		System.out.println("Enter patient name :");
        String patient =sc.nextLine();
        patientQueue.addLast(patient);
	    System.out.println("Added to queue.");
	    break;    
	case 2:
		System.out.println("Enter emergency patient name :");
		String emergencyPatient= sc.nextLine();
        patientQueue.addFirst(emergencyPatient);
	    System.out.println("Emergency pateint added to front :");
	    break;
	    
	case 3:
		if(!patientQueue.isEmpty())
{
	String remove= patientQueue.removeFirst();
	System.out.println("Removed patient :" + remove );
}
		else
		{
			System.out.println("No patient in queue");
		}
		break;
 
	case 4:
		System.out.println("Current Queue :" +patientQueue);
        break;
        
	case 5:
		if(!patientQueue.isEmpty())
		{
			System.out.println(" First :" +patientQueue.getFirst());
			System.out.println("Last :" +patientQueue.getLast());
		}
        else
		{
			System.out.println("Queue is empty");
		}
        break;
	case 6:
		System.out.println("Removing all patient's.....");
		patientQueue.clear();
		System.out.println("All patient removed successfully!");
		break;
	case 7:
		System.out.println("Total number of patient: " + patientQueue.size());
		break;
	case 8:
		System.out.println("Enter Name of Pateint: ");
		String patientName = sc.nextLine();
		int index = -1;
		for(int i = 0; i< patientQueue.size();i++) {
			if(patientQueue.get(i).equalsIgnoreCase(patientName)) {
				index = i;
				patientQueue.remove(index);
				System.out.println("Patient Remove Successfully...");
			}
		}
		if(index == -1) {
			System.out.println("No Patient with this name..");
		}
		break;
		
		
	case 9:
		System.out.println("Exiting......");
		break;
    
	default:
		System.out.println("Invalid Choice");
	}
    }while (choice !=9);
	sc.close();
}
}
 
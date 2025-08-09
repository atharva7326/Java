package com.filehandling.r;
import java.io.File;
import java.io.IOException;
public class FileCreate {

	public static void main(String[] args) {
		try {
			  File myFile = new File("myFile1.txt");
		        if(myFile.createNewFile()) {
		        	System.out.println("File Created Successfully! " + myFile.getName() + " File Path: "+ myFile.getAbsolutePath());
		        }
		        else {
		        	System.out.println("");
		        }
		}
		catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			
		}
      
	}

}

package com.filehandling.r;

import java.io.*;

class PatientRecord1 {
	private int patientId;
	private String patientName;
	private String disease;
	private int age;
	StringBuilder sb = new StringBuilder("Patient Details: ");

	public PatientRecord1(int patientId, String patientName, String disease, int age) {
		this.patientId = patientId;
		this.age = age;
		this.disease = disease;
		this.patientName = patientName;
	}

	public String getStringBuilder() {
		sb.append(" Patient Id: ").append(patientId);
		sb.append(", Patient Name: ").append(patientName);
		sb.append(", Patient Disease: ").append(disease);
		sb.append(", Patient Age: ").append(age);
		return sb.toString();
	}
}

public class PatientRecord {

	public static void main(String[] args) {

		PatientRecord1 p1 = new PatientRecord1(1, "Ajay", "Lungs", 19);
        //create file
		try {
			File myFile = new File("ajay.pdf");
			if (myFile.createNewFile()) {
				System.out.println(
						"File Created Successfully! " + myFile.getName() + " File Path: " + myFile.getAbsolutePath());
				System.out.println();
			} else {
				System.out.println("File already exists.");
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
        //write on file
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("ajay.pdf", true));
			writer.write(p1.getStringBuilder()); 
			writer.newLine();
			writer.write("All good");
			writer.newLine();
			writer.flush();

			System.out.println("Successfully Written to file");
			System.out.println();
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file: " + e.getMessage());
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				System.out.println("Error while closing the writer: " + e.getMessage());
			}
		}
        // read the file
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("Patient.txt")); 
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				System.out.println();
			}
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("Error while closing the reader: " + e.getMessage());
			}
		}
	}
}
//Java Program to Extract Content from a PDF

//Importing java input/output classes
//import java.io.File;
//import java.io.FileInputStream;
//Importing Apache POI classes
//import org.apache.tika.metadata.Metadata;
//import org.apache.tika.parser.ParseContext;
//import org.apache.tika.parser.pdf.PDFParser;
//import org.apache.tika.sax.BodyContentHandler;

//Class 
//public class GFG {
//
// // Main driver method
// public static void main(String[] args) throws Exception
// {
//
//     // Create a content handler
//     BodyContentHandler contenthandler
//         = new BodyContentHandler();
//
//     // Create a file in local directory
//     File f = new File("C:/extractcontent.pdf");
//
//     // Create a file input stream
//     // on specified path with the created file
//     FileInputStream fstream = new FileInputStream(f);
//
//     // Create an object of type Metadata to use
//     Metadata data = new Metadata();
//
//     // Create a context parser for the pdf document
//     ParseContext context = new ParseContext();
//
//     // PDF document can be parsed using the PDFparser
//     // class
//     PDFParser pdfparser = new PDFParser();
//
//     // Method parse invoked on PDFParser class
//     pdfparser.parse(fstream, contenthandler, data,
//                     context);
//
//     // Printing the contents of the pdf document
//     // using toString() method in java
//     System.out.println("Extracting contents :"
//                        + contenthandler.toString());
// }
//}

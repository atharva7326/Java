package com.filehandling.r;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
    public static void main(String[] args) {
    	BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("myFile.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				System.out.println("Error while closing the writer: " + e.getMessage());
			}
		}
    }
}
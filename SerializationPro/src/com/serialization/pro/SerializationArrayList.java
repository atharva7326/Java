package com.serialization.pro;

import java.io.*;
import java.util.*;

class PatientSer implements Serializable {

    String name;
    int id;

    PatientSer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Patient: " + name + ", ID: " + id;
    }
}

public class SerializationArrayList {
    public static void main(String[] args) {

        List<PatientSer> list = new ArrayList<>();
        list.add(new PatientSer("Ravi", 101));
        list.add(new PatientSer("Simran", 102));
        //save patient object to file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("patients.dat"))) {
            out.writeObject(list);
            System.out.println("Patient list serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
         //read patient object from file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("patients.dat"))) {
            List<PatientSer> list1 = (List<PatientSer>) in.readObject();
            System.out.println("\nDeserialized Patient List:");
            for (PatientSer p : list1) {
                System.out.println(p);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}

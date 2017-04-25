package org.launchcode.java.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentID {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer studentID;

        System.out.println("Enter your students (or enter 0 to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            studentID = in.nextInt();

            if (!studentID.equals(0)) {
                System.out.print("Student: ");
                String student = in.next();
                students.put(studentID, student);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!studentID.equals(0));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Integer, String> studentEntry : students.entrySet()) {
            System.out.println(studentEntry.getKey() + " (" + studentEntry.getValue() + ")");
        }
    }

}
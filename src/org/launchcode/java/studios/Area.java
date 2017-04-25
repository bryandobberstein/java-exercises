package org.launchcode.java.studios;

/**
 * Created by max on 4/25/17.
 */
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        double radius;
        double area;
        Scanner in;

        do {
            System.out.println("Enter a radius (positive number):");
            in = new Scanner(System.in);
            radius = in.nextDouble();
            area = 3.14 * radius * radius;
        } while (radius < 0);

        System.out.printf("The area of the circle is %s%n", area);
    }
}

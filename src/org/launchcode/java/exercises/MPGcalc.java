package org.launchcode.java.exercises; /**
 * Created by max on 4/25/17.
 */
import java.util.Scanner;
public class MPGcalc {
    public static void main(String[] args)
    {
        double distance;
        double gallons;
        double mpg;
        Scanner in;

        System.out.println("How far did you drive?");
        in = new Scanner(System.in);
        distance = in.nextDouble();
        System.out.println("How many gallons did you burn?");
        gallons = in.nextDouble();
        mpg = distance / gallons;

        System.out.println("You got " + mpg + " miles per gallon.");
    }
}

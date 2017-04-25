package org.launchcode.java.exercises; /**
 * Created by max on 4/25/17.
 */
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        double length;
        double height;
        double area;
        Scanner in;

        System.out.println("Enter rectangle height: ");
        in = new Scanner(System.in);
        height = in.nextDouble();
        System.out.println("Enter rectangle length: ");
        length = in.nextDouble();
        area = length * height;
        System.out.println("The area of the rectangle is " + area);


    }
}

package org.launchcode.java.exercises; /**
 * Created by max on 4/25/17.
 */
import java.util.Scanner;

public class HelloName {
    public static void main(String[] args){
        Scanner in;
        String name;
        System.out.println("Enter your name: ");
        in = new Scanner(System.in);
        name = in.next();
        System.out.println("Hello, " + name);
    }
}

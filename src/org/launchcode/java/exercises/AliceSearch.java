package org.launchcode.java.exercises; /**
 * Created by max on 4/25/17.
 */
import java.util.Scanner;
public class AliceSearch {
    public static void main(String[] args){
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String searchTerm;
        Scanner in;

        String[] splAl = alice.split(" ");

        System.out.println("What word do you wish to search for?");
        in = new Scanner(System.in);
        searchTerm = in.next();

        for (String x : splAl){
            if (x.equalsIgnoreCase(searchTerm)){
                System.out.println("Term found.");
            }
        }
    }
}

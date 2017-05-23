package org.launchcode.java.demos;

import java.util.ArrayList;

/**
 * Created by max on 5/22/17.
 */
public class FiveLetterWords {
    public static void main(String[] args){

        System.out.println("Example 1:");
        String strWords = "This is an ArrayList of a bunch of words of different length";
        String[] fromStrWords = strWords.split(" ");

        for (String strng : fromStrWords){
            if (strng.length() == 5){
                System.out.println("An example of a 5 letter word is " + strng);
            }
        }

        System.out.println();
        System.out.println("Example 2:");
        ArrayList<String> words = new ArrayList<>();
        words.add("This");
        words.add("is");
        words.add("an");
        words.add("ArrayList");
        words.add("of");
        words.add("a");
        words.add("bunch");
        words.add("of");
        words.add("words");
        words.add("of");
        words.add("different");
        words.add("length.");

        for (String str : words){
            if (str.length() == 5){
                System.out.println("An example of a 5 letter word is " + str);
            }
        }
    }
}

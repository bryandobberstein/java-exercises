package org.launchcode.java.exercises;

/**
 * Created by max on 4/25/17.
 */
public class EqualsFive {
    public static void main(String[] args){
        String[] words;
        words = new String[]{"Write", "a", "static", "method", "to", "print", "out", "each", "in", "list", "that"};

        fiveLetter(words);
    }

    static void fiveLetter(String[] words){
        for(String s: words){
            if (s.length() == 5){
                System.out.println(s);
            }
        }
    }
}

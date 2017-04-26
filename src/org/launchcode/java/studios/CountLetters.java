package org.launchcode.java.studios;

/**
 * Created by max on 4/26/17.
 */

import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args){
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] fromS = s.toCharArray();
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char c : fromS){
            c = Character.toLowerCase(c);
            if(! letterCount.containsKey(c)) {
                if (Character.isLetter(c)) {
                    letterCount.put(c, 1);
                }
            }
            else {
                letterCount.computeIfPresent(c, (k, v) -> v + 1);
            }
         }

        for (Map.Entry<Character, Integer> line : letterCount.entrySet()){
            System.out.println(line);
        }
    }
}

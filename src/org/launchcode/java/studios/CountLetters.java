package org.launchcode.java.studios;

/**
 * Created by max on 4/26/17.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s;
        HashMap<Character, Integer> letterCount = new HashMap<>();

        System.out.println("Enter some text and I will count how many of each letter there are.");
        s = in.nextLine();
        char[] fromS = s.toCharArray();

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

package org.launchcode.java.exercises.tests;

import java.util.ArrayList;

/**
 * Created by max on 5/12/17.
 */
public class ForEachTest {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i =1; i < 21; i++){
            numList.add(i);
        }

        numList.forEach(System.out::println);

    }
}

package org.launchcode.java.exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by max on 5/11/17.
 */
public class AListAsList {
    public static void main(String[] args){
        ArrayList<Integer> iList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        for (Integer i : iList){
            System.out.println(i);
        }
    }
}

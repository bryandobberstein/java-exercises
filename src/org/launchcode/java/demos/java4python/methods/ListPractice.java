package org.launchcode.java.demos.java4python.methods;

import java.util.ArrayList;

/**
 * Created by max on 5/11/17.
 */
public class ListPractice {

    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        //find out which one is bigger
        ArrayList<Integer> bigger = a;
        ArrayList<Integer> smaller = b;
        if(a.size() < b.size()) {
            bigger = b;
            smaller = a;
        }
        //create a new array list that holds the results
        ArrayList<Integer> result = new ArrayList<Integer>();

        //for each index in larger list
        for (Integer i : bigger){
            int index = bigger.indexOf(i);
            if (index < smaller.size()){
                int temp = smaller.get(index);
                result.add(i + temp);
            }
            else{
                result.add(i);
            }
        }
        //if index exists in smaller list
        //add values, store in result
        //else
        //put value from larger list in result

        return result;
    }

    public static void main(String[] args){
        ArrayList<Integer> aList1 = new ArrayList<>();
        ArrayList<Integer> aList2 = new ArrayList<>();
        aList1.add(42);
        aList1.add(69);
        aList1.add(38);
        aList1.add(100);
        aList1.add(2);
        aList1.add(43);
        aList1.add(1023);
        aList2.add(1);
        aList2.add(2);
        aList2.add(3);
        aList2.add(4);

        System.out.println(add(aList1, aList2));
    }
}

package org.launchcode.java.exercises;

/**
 * Created by max on 4/25/17.
 */
import java.util.ArrayList;

public class SumOfPos {
    private static ArrayList<Integer> nums;

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i < 11; i++){
            nums.add(i);
        }

        int sum = total(nums);

        System.out.println(sum);
    }

    static int total(ArrayList<Integer> nums){
        SumOfPos.nums = nums;
        int sum = 0;
        for (Integer i: nums){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}

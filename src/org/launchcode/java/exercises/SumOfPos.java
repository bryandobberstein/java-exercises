package org.launchcode.java.exercises;

/**
 * Created by max on 4/25/17.
 */
public class SumOfPos {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = total(nums);

        System.out.println(sum);
    }

    static int total(int[] nums){
        int sum = 0;
        for (int i: nums){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}

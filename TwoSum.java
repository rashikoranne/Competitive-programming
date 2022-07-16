package com.example;

import java.util.Arrays;

public class TwoSum {
    public static void main (String[] args){
        int[] nums = new int[]{3,2,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));



    }



    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}

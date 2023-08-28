package com.leetcode.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> sumMap = new HashMap<>();

        for (int i=0; i < nums.length; i++) {
            int tempPair = target - nums[i];
            if (sumMap.containsKey(tempPair)) {
                return new int[] {sumMap.get(tempPair), i};
            } else {
                sumMap.put(nums[i], i);
            }
        }

        return null;
    }

    public static void main(String args[]) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[] {2, 7, 3}, 9)));
    }
}

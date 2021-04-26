package leetcode;

import java.util.HashMap;
import java.util.Map;

class TwoSumProblem {
    //Brute force solution:Input: nums = [1,15,11,2,7], target = 9
    // public int[] twoSum(int[] nums, int target) {        
        
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i+1; j < nums.length; j++) {                              
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[]{i,j};                    
    //             }
    //         }
    //     }
    //     throw new IllegalArgumentException("Invalid solution.");
    // }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { i, map.get(target - nums[i]) };
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}

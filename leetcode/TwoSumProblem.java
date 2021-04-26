package leetcode;

class TwoSumProblem {
    //Input: nums = [1,15,11,2,7], target = 9
    public int[] twoSum(int[] nums, int target) {        
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {                              
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};                    
                }
            }
        }
        throw new IllegalArgumentException("Invalid solution.");
    }

}

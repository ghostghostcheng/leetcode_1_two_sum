package leetcode_1_two_sum;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        int[] result = {0,0};
        
        for (int i = 0; i < nums.length; i++) {
    		for (int j = 0; j < nums.length; j++) {
			    if ((nums[i] + nums[j]) == target) {
					result[0] = nums[i];
					result[1] = nums[j];
				}
				else {
					continue;
				}
    		}
        }
        
        return result;
    }
}
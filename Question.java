package leetcode_1_two_sum;

/*Given an array of integers, 
return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, 
and you may not use the same element twice.
*/

public class Question {
	public static void main(String args[]) {
		int[] nums = {2, 7, 11, 15};
		int[] result = {0, 0};
		
		result = Solution.twoSum(nums, 9);
		
		System.out.print(result[0] + "," + result[1]);
		
	}
}


package Leetcode;

import java.util.HashMap;

//1 Two Sum
public class Question_1 {
	 public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            int k = target - nums[i];
	            if(hm.containsKey(k)){
	                return new int[]{hm.get(k),i};
	            }
	            hm.put(nums[i],i);
	        }
	        return null;
	    }
}
package com.runcode.springstudy.simulationcircleref;

import java.util.HashMap;
import java.util.Map;

/**
 *https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-2/
 * @author chriswong
 */
public class TwoSum {

	public static int[] twoSum(int[] nums,int target){
		Map<Integer,Integer> map = new HashMap<>();

		for(int i=0;i<nums.length;i++){
			int complement = target-nums[i];
			if (map.containsKey(complement)){
				return new int[]{map.get(complement),i};
			}
			map.put(nums[i],i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,4,6,3,7};
		int target = 10;
		int[] result = twoSum(nums,target);
		System.out.println(result[0]+":"+result[1]);
	}

}

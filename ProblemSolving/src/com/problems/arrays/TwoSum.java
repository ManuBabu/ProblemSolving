package com.problems.arrays;

import java.util.HashMap;

public class TwoSum {


//	Problem statement:
//		
//		Given an array of integers,
//		return indices of the two numbers such that they add up to a specific target.
//
//		You may assume that each input would have exactly one solution, and 
//		you may not use the same element twice.	

//	Example:
//
//		Given nums = [2, 7, 11, 15], target = 9,
//
//		Because nums[0] + nums[1] = 2 + 7 = 9,
//		return [0, 1].

	
	public static void main(String[] args) {
	
		// My Solution
	
		int[] nums = {3,2,4};
		int target =6;
		
		   HashMap<Integer,Integer> map =  new HashMap();

	        int[] output = new int[2];
	        
	        int i=0;
	       for(int num :nums)
	           map.put(num,i++);

	        for(int a: nums)
	            if(map.containsKey(Math.abs(target-a))){
	                
	                output[0]=map.get(a);
	                if(map.get(Math.abs(target-a))!=output[0]) {
	                output[1]=map.get(Math.abs(target-a));
	                break;
	                }
	            }
	       
	        System.out.println(output[0]+" : "+output[1]);
		
		}
}

package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] nums = {6,3,8,9,6,18,27,8};
		Set<Integer> findDups=new HashSet<Integer>();
		 for(int i=0;i<nums.length;i++)
		 {
	        if(findDups.contains(nums[i])) {
	        	System.out.println("Duplicate number is " +nums[i]);
	        }
			 findDups.add(nums[i]);
	        
		 }

	}

}

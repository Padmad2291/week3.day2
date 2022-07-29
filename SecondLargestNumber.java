package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
        Set<Integer> data1=new TreeSet<Integer>();
        for(int i=0;i<data.length;i++) {
        	data1.add(data[i]);
        	
        }
        System.out.println("data "+data1);
        List<Integer> data2=new ArrayList<Integer>();
        data2.addAll(data1);
        System.out.println("Second Largest Number is "  +data2.get(data2.size()-2));

	}

}

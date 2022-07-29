package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		    int[] data1= {5,8,9,4,2,1};
	        int[] data2= {3,6,8,4,9,5};
	        List<Integer> input1 =new ArrayList<Integer>();
	        List<Integer> input2 =new ArrayList<Integer>();
	        for(int i=0;i<data1.length;i++) {
	        	input1.add(data1[i]);
	        }
	        for(int i=0;i<data2.length;i++)
	        {
	        	input2.add(data2[i]);
	        }
	        for(int i=0;i<input1.size();i++) {
	        	for(int j=0;j<input2.size();j++) {
	        		if(input1.get(i)== input2.get(j)) {
	        			System.out.println("Intersection is" + input1.get(i));
	        			
	        		}
	        	}
	        }
		}

	}


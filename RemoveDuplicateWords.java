package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] input=	text.split(" ");
		Set<String> value=new LinkedHashSet<String>();
		for(int i=0;i<input.length;i++) {
			value.add(input[i]);
		}
		List<String>unique=new ArrayList<String>();
		unique.addAll(value);
		for(int i=0;i<unique.size();i++)
		{
			System.out.println("Unique word is " + unique.get(i));
		}
	}

}

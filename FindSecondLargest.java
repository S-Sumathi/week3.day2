package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		//Declaring array
		int[] numbers = {34,2,11,24,6,7};
		
		//sorting array
		Set<Integer> nums = new LinkedHashSet<Integer>();
		
		//Traversing through the array using for loop
		for(int i = 0; i<numbers.length; i++){
			nums.add(numbers[i]);
		}
		//Creating list 
	   List<Integer> secondLargest=new ArrayList<Integer>(nums);
	   Collections.sort(secondLargest);
	   System.out.println("The second largest number is: "+secondLargest.get(secondLargest.size()-2));		
	}
}

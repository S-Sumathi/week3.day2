package week3.day2;


import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		
		//Declaring two integer arrays		
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		
		Set<Integer> intersection= new HashSet<Integer>();
	        	
		// for loop to iterate through first array length
	    for (int i = 0; i < array1.length; i++) {
	    	
	      //Nested loop to iterate over second array length
	      for (int j = 0; j < array2.length; j++) {	
	      if (array1[i]==array2[j]) {
	    	  
	    //Add array elements
	    intersection.add(array1[i]);		
				}  		
		      }	
	       }
	    System.out.println(intersection); 
    }	
 }

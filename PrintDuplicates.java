package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {
  public static void main(String[] args) {
	  
	//Declaring integer array		
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
	//Sorting array
	Arrays.sort(arr);
	Set<Integer> duplicates= new HashSet<Integer>();
	
	//Iterate over the array     	
	for (int num : arr) {
	if (duplicates.add(num)==false) {
	System.out.println(num);	
			}
		}
    }	
 }

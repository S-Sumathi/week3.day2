package week3.day2;


import java.util.Map;
import java.util.TreeMap;

public class FindNumberOccurences {
	public static void main(String[] args) {
		
		//Declaring integer array		
		int[] array1= {2,3,5,6,3,2,1,4,2,1,6,-1,-1,0};
		
		//Create Map
		Map<Integer, Integer> num = new TreeMap<Integer,Integer>();
		//Traverse through the array
		for(int i = 0; i<array1.length; i++) {
		num.put(array1[i], num.getOrDefault(array1[i], 0)+1);
		}
		System.out.println(num);
		}  
    }	
 

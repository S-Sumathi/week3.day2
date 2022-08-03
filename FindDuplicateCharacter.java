package week3.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindDuplicateCharacter {
	public static void main(String[] args) {
		
		//Creating an empty HashMap
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		//Inserting pairs using put method
		map.put('a', 4);
		map.put('b', 9);
		map.put('c', 7);
		
		int maxOccurance = 0;
		char maxOcc = 0;
		//Traversing through the map using for -each loop
		for(Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() > maxOccurance) {
				maxOccurance = entry.getValue();
				maxOcc = entry.getKey();
			}
		}
		//Printing maximum occurences
		System.out.println("Maximum occuring character is " +maxOcc+ " and by number of occurances is: " +maxOccurance);
		
		}  
    }	
 

package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	/*Declare a string as "We learn java basics as part of java sessions in java week1"
	 * Convert the string to array
	 * Iterate through the array values to find the count of particular repeated values
	 * Replace the word with " " 
	 * Display the string without duplicate values
	 */
	

	public static void main(String[] args) {
		
		//Declaring  variable
	    String stringStmt="We learn java basics as part of java sessions in java week";
		
		//Convert string to array
		String stringStmtArray[]=stringStmt.split(" ");
		Set<String> stmt=new LinkedHashSet<String>();
		
		//Iterate over the set	
        for (String string1 : stringStmtArray) {
        	
	    stmt.add(string1);
        }
	    StringBuilder bb=new StringBuilder();
	    
	    for (String string2 : stmt) {
		bb.append(string2 + " ");
	    }
	System.out.println(bb);	
}	
}	
	



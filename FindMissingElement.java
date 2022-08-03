package week3.day2;
import java.util.Arrays;

public class FindMissingElement {
  public static void main(String[] args) {
	//Declaring array
	int[] arr = {1,2,3,4,7,6,8};
	//sort the array
	Arrays.sort(arr);
	//Iterate over the array
	for(int i = 1; i<=arr.length; i++) {
	if(i != arr[i-1]) {
	System.out.println("Missing Element is " + i);
	break;
			}
		}
				
	}
}

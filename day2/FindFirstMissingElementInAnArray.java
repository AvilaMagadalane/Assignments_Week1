package week1.day2;

import java.util.Arrays;


public class FindFirstMissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8}; 
		Arrays.sort(arr);//1234 678
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1]!=arr[i]+1) {
				System.out.println(arr[i]+1);
			}	
		} 
	}

}

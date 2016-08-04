package org.shravan.sample;

import java.util.Arrays;

public class BinarySearch {

	public static int index;
	
	public static void main(String[] args) {
		
		int[] A = {1,20,3,45,5,65,7,8};
		Arrays.sort(A);
		index = searchItem(A, 64);
		if (index !=-1)
			System.out.println("Given number found in array");
		else
			System.out.println("Given number does not exist in array");

	}
	
	public static int searchItem(int[] numbers, int search){
		
		int min = 0;
		int max= numbers.length-1;
		int mid ;
	
		while(min<=max){
			
			mid= ((max-min)/2) + min;
			if (search > numbers[mid] ){
				min = mid +1;
				//mid= midItem(min, max);
			}
			else if( search < numbers[mid]){
				max = mid-1;
				//mid= midItem(min, max);
			}
			else
				return mid;
		}
		
		return -1;
	}
	
	/*public static int midItem(int min, int max){
		return ((max-min)/2) + min;
	}*/

}

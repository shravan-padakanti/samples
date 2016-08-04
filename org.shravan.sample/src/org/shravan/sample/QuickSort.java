package org.shravan.sample;

public class QuickSort {

	/**
	 * time complexity O(nlogn) => average time complexity 
	 * O(n^2) => worst case
	 */

	public static int[] A = { 20, 90, 10, 70, 30, 60, 80 };
	
	public static void main(String[] args) {

		
		sort(A, 0, A.length-1);

		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}

	}

	/*uses middle element as pivot
	 * 
	 * public static int[] sort(int[] arr, int low, int high) {
		int lowIndex = low;
		int highIndex = high;
		int pivotIndex = (lowIndex + highIndex) / 2;
		int pivot = arr[pivotIndex];

		while (lowIndex < highIndex) { // loops  till lower index and higher index becomes equal
			while (pivotIndex >= lowIndex && arr[lowIndex] < pivot) 
				// checking lower  elements value less that pivot value
				lowIndex++;
			while (pivotIndex <= highIndex && arr[highIndex] > pivot) 
				// checking  higher elements value  greater than pivot value
				highIndex--;
			if (lowIndex < highIndex) { 
				// swapping elements to move higher values to right and lower values to left
				int temp = arr[highIndex];
				arr[highIndex] = arr[lowIndex];
				arr[lowIndex] = temp;
			}

			// moving index to next position
			lowIndex++;
			highIndex--;
		}

		if (low < highIndex)
			sort(arr, low, highIndex);
		if (high > lowIndex)
			sort(arr, highIndex+1, high);

		return arr;
	}
*/
	
	public static void sort(int[] arr, int start, int end){
		
		// splitpoint is the point where the element is pivot element and is in correct place.
		if(start < end){
			int splitpoint = partition(arr,start,end); 
			System.out.println(splitpoint + "  "+ start +"  "+ end);
			sort(arr,start,splitpoint-1);
			sort(arr,splitpoint+1,end);
		}
		
	}
	
	public static int partition(int[] arr, int start, int end){
		
		//assigning first element as pivot
		int pivot = arr[start];
		int leftIndex = start+1;
		int rightIndex = end;
		int temp =0;
		
		while (rightIndex>leftIndex){
			while( leftIndex <=rightIndex && arr[leftIndex] <= pivot )
				leftIndex++;
			while(rightIndex >= leftIndex && arr[rightIndex]>=pivot)
				rightIndex--;
			if(rightIndex >= leftIndex){
				// swapping left index element with right index element to make 
				//right side of pivot elements greater and left side of pivot element less value
				temp =arr[rightIndex];
				arr[rightIndex] = arr[leftIndex];
				arr[leftIndex] = temp;
			}
		}
		
		//when right index is less than left index, the right index point is pivot element.
		// as we considered first element as pivot, we need to swap pivot element with right index element to keep pivot in its place.
		temp = arr[start]; //pivot element
		arr[start]=arr[rightIndex]; //placing right index element in pivot element place
		arr[rightIndex] = temp; // keeping pivot in its place.
		
		System.out.println(rightIndex);
		return rightIndex; 
		// this is the current pivot element position, 
		//which makes sure that the element in array is in its correct position
		//and also the elements to left of this index is less that element at this position,
		//elements to the right of this index is greater than element at this position.
	}
}























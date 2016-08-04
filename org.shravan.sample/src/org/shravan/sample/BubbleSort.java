package org.shravan.sample;

/**
 * @author Shravan 
 * Time Complexity => O(n^2)
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] A = { 20, 30, 10, 70, 90, 60 };
		int[] sortedArr = sort(A);

		for (int i = 0; i < sortedArr.length; i++) {
			System.out.println(sortedArr[i]);
		}
	}

	public static int[] sort(int[] arr) {
		int temp = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < j; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		return arr;
	}
}

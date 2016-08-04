package org.shravan.sample;

public class SelectionSort {
	public static void main(String[] args) {

		int[] A = { 20, 30, 10, 70, 90, 60 };
		int[] sortedArr = sort(A);

		for (int i = 0; i < sortedArr.length; i++) {
			System.out.println(sortedArr[i]);
		}

	}

	public static int[] sort(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int min = arr[i];
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			arr[index] = arr[i];
			arr[i] = min;
		}
		return arr;
	}
}

package org.shravan.sample;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 20, 30, 10, 70, 90, 60 };
		int[] sortedArr = sort(A);

		for (int i = 0; i < sortedArr.length; i++) {
			System.out.println(sortedArr[i]);
		}
	}

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j >0; j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}

}

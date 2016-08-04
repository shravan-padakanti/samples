package org.shravan.sample;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayUnion {

	public static void main(String[] args) {
		
		Integer[] A= {5,4,3,2,1,0};
		Integer[] B= {5,6,7,1,2};
		
		ArrayUnion au = new ArrayUnion();
		au.union(A, B);
		
	}
	
	public void union(Integer[] a, Integer[] b){
		Set<Integer> union = new TreeSet<>();
		union.addAll(Arrays.asList(a));
		union.addAll(Arrays.asList(b));
		
		System.out.println("union of two arrays is");
		for (Integer i: union)
			System.out.println(i);
	}
}

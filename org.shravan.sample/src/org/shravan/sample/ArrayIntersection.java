package org.shravan.sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
	
	public static void main(String[] args) {
		
		Integer[] A= {5,4,3,2,1,0};//new Integer[5];
		Integer[] B= {5,6,7,1,2,5,5,2};
		
		ArrayIntersection ai = new ArrayIntersection();
		ai.intersect(A, B);
	}
	
	public void intersect(Integer[] a, Integer[] b){
		
		Set<Integer> intersect = new HashSet<Integer>();
		
		intersect.addAll(Arrays.asList(a));
		
		for(Integer i:b){
			if(intersect.contains(i)){
				intersect.remove(i);
				System.out.println(i);
			}
		}
	}
	
}

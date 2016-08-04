package org.shravan.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequentInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers ={1,8,9,2,3,6,7,7,3,4,2,2,4,4};
		
		FrequentInteger fi = new FrequentInteger();
		fi.calculateMaxFrequencyInt(numbers);

	}
	
	public void calculateMaxFrequencyInt(int[] numbers){
		
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		
		for(int i:numbers){
			if(countMap.containsKey(i))
				countMap.put(i,countMap.get(i)+1);
			else
				countMap.put(i,1);
		}
			
		int max = 0;
		int maxOccuranceInt =0;
		for(Entry<Integer, Integer> entry:countMap.entrySet()){
			// return first max occurrence. change to >= for last max occurrence.
			if(entry.getValue()>max){ 
				max=entry.getValue();
				maxOccuranceInt = entry.getKey();
			}
		}
		
		 System.out.println("max occured integer is: " +" " + maxOccuranceInt);
		 System.out.println("number of times occured:" + " " + max);
	}
}

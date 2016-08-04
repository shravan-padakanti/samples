package org.shravan.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	
	static int x=5;
	 public static void testprint(){
		 System.out.println(x);
		 int x=10;
		 System.out.println(x);
		 
	 }
	 
	 public static boolean isInRequiredPattern(String input){
		Pattern p = Pattern.compile("\\d{3}");
		Matcher m = p.matcher(input);
		return m.matches(); 
	 }
	 
	 public static int isInGroupPattern(String input){
			Pattern p = Pattern.compile("\\^d{}");
			Matcher m = p.matcher(input);
			return m.groupCount(); 
		 }
	 
	 public int sum(int a, int b){
		 return a+b;
	 }
	 
	 public float sum(float a, int b){
		 return (float)a+b;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isInRequiredPattern("123"));
		System.out.println(isInRequiredPattern("abc"));
		System.out.println(isInGroupPattern("{[{}]}"));
		int[] i = new int[2];
		i[0]=0;
		i[1]=1;
		
		int[][] j = {{1,2,3},{4,5,6}};
		
		for(int k=0;k<j.length;k++){
			for(int m=0;m<j[k].length;m++){
				System.out.println(j[k][m]);
				
			}
		}
		
		testprint();	

	}

}

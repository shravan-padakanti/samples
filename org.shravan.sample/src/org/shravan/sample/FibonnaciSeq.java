package org.shravan.sample;

import java.util.Scanner;


public class FibonnaciSeq {
	
	public static void main(String[] args) {
		System.out.println("how many numbers need to be generated?");
		Scanner s= new Scanner(System.in);
		int digits = s.nextInt();
		 for (int i = 1; i <= digits; i++)
			 System.out.println(fibonnaciRecGenerator(i));
		s.close();
	}
	
	public static void fibonnaciGenerator(int digits){
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<digits-1;i++){
			System.out.println(a+b);
			int temp=b;
			b+=a;
			a=temp;
		}
	}
	
	public static int fibonnaciRecGenerator(int digits){
		//System.out.println(a+b);
		//fibonnaciRecGenerator(b,a+b);
		if(digits ==1 || digits ==2 )
			return 1;
		
		return fibonnaciRecGenerator(digits-1) + fibonnaciRecGenerator(digits-2);
	}
}

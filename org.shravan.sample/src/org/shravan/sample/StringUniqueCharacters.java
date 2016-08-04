package org.shravan.sample;

import java.util.Scanner;

public class StringUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the character to check uniqueness");
		Scanner s= new Scanner(System.in);
		String checkString = s.nextLine();
		
		StringUniqueCharacters suc = new StringUniqueCharacters();
		suc.isUnique(checkString);
		s.close();
	}
	
	public void isUnique(String word){
		for(int i=0;i<word.length();i++){
			for(int j =i+1; j<word.length();j++){
				if(word.charAt(i)==word.charAt(j)){
					System.out.println("first repeated character in word is:" + " "+ word.charAt(i));
					return;
				}
			}
		}
		System.out.println("No repeated characters found");
	}

}

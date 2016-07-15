package com.rama.daily.dataStructures.ArraysAndStrings;

public class Example52 {

	// Check the given string is Palindrome
	
	public static boolean isPalindrome(String str) {
		String reversedStr = "";
		for(int i = str.length()-1; i >= 0 ; i-- ) {
			reversedStr += str.charAt(i);
		}
		System.out.println(str);
		return reversedStr.equals(str);
	}
	
	public static void main(String[] args) {
		System.out.println("Is the given string a palindrome " + isPalindrome("ama"));
	}

}

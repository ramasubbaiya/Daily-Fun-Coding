package com.rama.daily.dataStructures.ArraysAndStrings;

public class Example55 {

	public static String reverseWords(String str) {
		String[] words = str.split(" ");
		
		// Using regex for multiple spaces
		// String[] words = str.split("\\s+");
		
		String reversedSentence = "";
		int n = words.length-2;
		
		for(int i = n; i >= 0 ; i--) {
			reversedSentence += words[i] + " ";
		}
		reversedSentence = words[n+1] + " " + reversedSentence;
		
		return reversedSentence;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWords("It's a hot sunny day"));
	}
}

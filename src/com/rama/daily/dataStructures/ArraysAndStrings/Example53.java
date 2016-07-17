package com.rama.daily.dataStructures.ArraysAndStrings;

import java.util.Arrays;

public class Example53 {
	
	public static boolean isAnagram(String str1, String str2) {
		char[] strToChar1 = str1.toCharArray();
		char[] strToChar2 = str2.toCharArray();
		
		Arrays.sort(strToChar1);
		Arrays.sort(strToChar2);
		
		return Arrays.equals(strToChar1, strToChar2);
	}
	
	public static void main(String[] args) {
		System.out.println("Is the given strins a Anagram : " + isAnagram("cinema", "iceman"));
	}

}

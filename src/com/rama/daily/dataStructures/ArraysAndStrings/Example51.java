package com.rama.daily.dataStructures.ArraysAndStrings;

public class Example51 {

	// Is the given Strings - permutation
	
	public static boolean checkPermutation(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	private static String sort(String str) {
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	public static void main(String[] args) {
		System.out.println("Check the given strings are permutation ?");
		System.out.println("String1 = 'god       '");
		System.out.println("String1 = 'dog'");
		System.out.println(Example51.checkPermutation("god       ", "dog"));
	}

}

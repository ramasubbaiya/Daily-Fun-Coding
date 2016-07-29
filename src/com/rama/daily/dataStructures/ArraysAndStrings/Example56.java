package com.rama.daily.dataStructures.ArraysAndStrings;

public class Example56 {

	public static void occurenceOfString() {
		String str = "aaabbbcccas";
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			char[] ch = str.toCharArray();
			int count = 0;
			//char[] checkChar = 
			for(int j = 0; j < str.length(); j++) {
				if(ch[j] == c) {
					count++;
				}
			}
			System.out.println("The character : " +c);
			System.out.println("Counter : " + count);
		}
	}
	
	public static void main(String[] args) {
		occurenceOfString();
	}

}

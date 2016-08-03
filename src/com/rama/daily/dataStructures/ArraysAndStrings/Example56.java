package com.rama.daily.dataStructures.ArraysAndStrings;

public class Example56 {

	public static void occurenceOfString() {
		String str = "aaabbbcccas";
		int strLen = str.length();
		// boolean[] isChecked = new boolean[124];
		for(int i = 0; i < strLen; i++) {
			char c = str.charAt(i);
			char[] ch = str.toCharArray();
			int count = 0;
			//char[] checkChar = 
			for(int j = 0; j < strLen; j++) {
				//int chNum = ch[j];
				if(ch[j] == c) {
					
					count++;
				}
			}
			//isChecked[chNum] = true;
			System.out.println("The character : " +c);
			System.out.println("Counter : " + count);
		}
	}
	
	public static void main(String[] args) {
		occurenceOfString();
	}

}

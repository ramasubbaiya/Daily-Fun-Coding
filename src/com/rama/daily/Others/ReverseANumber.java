package com.rama.daily.Others;

public class ReverseANumber {

	public static int reverseNumber(int num) {
		
		int reversedNum = 0, reminder=0;
		while(num > 0) {
			reminder = num % 10;
			num = num/10;
			reversedNum = (reversedNum*10) + reminder;
		}
		return reversedNum;
	}
	
	public static void main(String[] args) {
		System.out.println("Reversed Number : " + reverseNumber(123));
	}
}

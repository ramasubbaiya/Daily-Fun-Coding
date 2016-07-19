package com.rama.daily.Others;

public class ArmstrongNumber {

	private static boolean isArmstrong(int num) {
		int result = 0, reminder = 0, originalNum = num;
		while(num > 0) {
			reminder = num % 10;
			num = num / 10;
			result = (reminder * reminder * reminder) + result;
		}
		return result == originalNum;
	}
	
	public static void main(String[] args) {
		System.out.println("Is the given number Armstrong : " + isArmstrong(371));
	}

}

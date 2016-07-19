package com.rama.daily.Others;

public class PerfectNumber {

	public static boolean isPerfect(int num) {
		int sum = 0;
		for(int i = 1;i <= num/2; i++) {
			if(num%i == 0) {
				sum = sum + i;
			}
		}
		return sum == num;
	}
	
	public static void main(String[] args) {
		System.out.println("Is the given number perfect number : " + isPerfect(6));
	}

}

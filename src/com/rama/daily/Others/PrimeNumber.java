package com.rama.daily.Others;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		for(int i = 2; i < num/2; i++ ) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Is the given number prime : " + isPrimeNumber(8));
	}

}

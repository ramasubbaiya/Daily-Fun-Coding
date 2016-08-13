package com.rama.daily.dataStructures.ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;


public class Example57 {

	public static List<Integer> findOddNumbers(List<Integer> nums) {
		List<Integer> oddNums = new ArrayList<Integer>();
		for(int num: nums) {
			if(num%2 != 0) {
				oddNums.add(num);
			}
		}	
		return oddNums;
	}
	
	public static List<Integer> findEvenNumbers(List<Integer> nums) {
		List<Integer> evenNums = new ArrayList<Integer>();
		for(int num: nums) {
			if(num%2 == 0) {
				evenNums.add(num);
			}
		}	
		return evenNums;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		
		System.out.println("Even Numbers");
		for(int num: findEvenNumbers(numbers)) {
			System.out.println(num);
		}
		
		System.out.println("Odd Numbers");
		for(int num: findOddNumbers(numbers)) {
			System.out.println(num);
		}

	}

}

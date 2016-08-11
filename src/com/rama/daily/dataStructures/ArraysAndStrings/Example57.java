package com.rama.daily.dataStructures.ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;


public class Example57 {

	public List<Integer> findOddNumbers(List<Integer> nums) {
		List<Integer> oddNums = new ArrayList<Integer>();
		for(int num: nums) {
			if(num%2 != 0) {
				oddNums.add(num);
			}
		}	
		return oddNums;
	}
	
	public List<Integer> findEvenNumbers(List<Integer> nums) {
		List<Integer> evenNums = new ArrayList<Integer>();
		for(int num: nums) {
			if(num%2 == 0) {
				evenNums.add(num);
			}
		}	
		return evenNums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

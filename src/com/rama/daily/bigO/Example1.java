package com.rama.daily.bigO;

/* 
 * Big O time is a difficult concept at first. 
 * However, once it "clicks",it gets fairly easy. 
 * The same patters come up again and again, and the rest you can derive.
 * 
 * We'll start off easy and get progressively more difficult.
 * 
*/

// Q. What is the runtime of below code?

public class Example1 {

	public void foo(int[] array) {
		int sum = 0;
		int product = 1;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		for (int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		
		System.out.println(sum + ", " + product);
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[]{1,253,4,4};
		Example1 obj = new Example1();
		obj.foo(numbers);
	}
}

// A. This will take O(N) time. The fact that we iterate through the array twice doesn't matter

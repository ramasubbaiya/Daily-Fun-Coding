package com.rama.daily.bigO;

//Q. What is the runtime of below code?

public class Example2 {

	public void printPairs(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.println(array[i] + " | " + array[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[]{1,2,3,4,5};
		Example2 obj = new Example2();
		obj.printPairs(numbers);
	}
}

// A. The inner loop has O(N) iterations and it is called N times. Therefore, the runtime is O(N^2)
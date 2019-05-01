package com.datastructure.arrays;

import java.util.Arrays;

public class RotateArray1 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		rotateArray(array, 3);
	}

	private static void rotateArray(int[] array, int d) {
		//rotating one element at a time.
		//Time complexity would be O(n*d) where n is the length and 
		//d is the no of position to be shifted.
		for(int i = 0; i < d; i++) {
			rotateArrayByOne(array);
		}
		System.out.println(Arrays.toString(array));
	}

	private static void rotateArrayByOne(int[] array) {
		int temp = array[0];
		int i;
		for( i = 0; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[i] = temp;
	}

}

package com.datastructure.arrays;

import java.util.Arrays;

public class RotateArray2 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8};
		rotateArray(array, 4);
	}

	private static void rotateArray(int[] array, int d) {
		//reverse array from 0 to d-1 index.
		reverse(array, 0, d-1);
		//reverse array from d to length-1 index.
		reverse(array, d, array.length-1);
		//reverse array from 0 to length-1 index.
		reverse(array, 0, array.length-1);
		
		System.out.println(Arrays.toString(array));
		
	}

	private static void reverse(int[] array, int start, int end) {
		while(start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		
	}

}

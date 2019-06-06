package com.datastructure.arrays;

import java.util.Arrays;

public class RearrangeArray {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		rearrange(array);
	}

	private static void rearrange(int[] array) {
		int n = array.length;
		int evenPosition = n/2;
		int oddPosition = n-(n/2);
		int[] tempArray = new int[n];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		int j = oddPosition-1;
		for (int i = 0; i < array.length; i+=2) {
			array[i] = tempArray[j];
			j--;
		}
		j = oddPosition;
		for (int i = 1; i < array.length; i+=2) {
			array[i] = tempArray[j];
			j++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}

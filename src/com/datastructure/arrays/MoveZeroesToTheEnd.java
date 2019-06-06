package com.datastructure.arrays;

public class MoveZeroesToTheEnd {
	
	public static void main(String[] args) {
		int[] array = {1,2,0,4,5,0,0,5,7,0};
		moveZeroes(array);
	}

	private static void moveZeroes(int[] array) {
		int count = 0;
		for(int i =0; i <array.length;i++) {
			if(array[i] != 0) {
				array[count++] = array[i];
			}
		}
		
		while(count < array.length) {
			array[count] = 0;
			count++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}

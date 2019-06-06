package com.datastructure.arrays;

public class FindSumInSortedAndRotated {
	
	public static boolean findSum(int[] array, int sum) {
		int i;
		for(i = 0; i <array.length; i++ ) {
			if(array[i] > array[i+1]) {
				break;
			}
		}
		int lower = (i+1)%array.length;
		int higher = i;
		
		
		while(higher != lower) {
			if(array[lower] + array[higher]==sum) {
				return true;
			}
			if(array[lower] + array[higher] < sum) {
				lower = (lower+1)%array.length;
			} else {
				higher = (array.length+higher-1)%array.length;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] array = {11,15,6,8,9,10};
		if(findSum(array, 17)) {
			System.out.println("Exist");
		} else {
			System.out.println("Doesn't exist");
		}
	}

}

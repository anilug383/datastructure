package com.datastructure.arrays;

public class FindPivot {
	public static void main(String[] args) {
		int[] array = {3,4,5,1,2};
		System.out.println(findPivot(array, 0, array.length-1));
	}

	private static int findPivot(int[] array, int low, int high) {
		if(low > high) {
			return -1;
		}
		if(low == high) {
			return low;
		}
		
		int mid = (low+high)/2;
		if(mid < high && array[mid] > array[mid+1]) {
			return mid;
		}
		if(mid > low && array[mid] < array[mid-1]) {
			return mid-1;
		}
		if (array[low] >= array[mid]) {
			return findPivot(array, low, mid-1);
		} else {
			return findPivot(array, mid+1, high);
		}
	}

}

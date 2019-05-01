package com.datastructure.arrays;

public class FindElementInSortdedAndRotatedArray {
	public static void main(String[] args) {
		int[] array = {3,4,5,6,7,8,1,2};
		int index = findKey(array, 10);
		if(index == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found at "+index);
		}
	}

	private static int findKey(int[] array, int key) {
		int pivotElement = findPivot(array, 0, array.length-1);
		System.out.println(pivotElement);
		if(array[pivotElement] == key) {
			return pivotElement;
		}
		if(pivotElement == -1) {
			return binarySearch(array, 0, array.length-1, key);
		}
		if(array[0] <= key) {
			return binarySearch(array, 0, pivotElement-1, key);
		} else {
			return binarySearch(array, pivotElement+1, array.length-1, key);
		}
	}

	private static int binarySearch(int[] array, int start, int end, int key) {
		if(start > end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(array[mid] == key) {
			return mid;
		}
		if(key > array[mid]) {
			return binarySearch(array, mid+1, end, key);
		} else {
			return binarySearch(array, start, mid-1, key);
		}
	}

	private static int findPivot(int[] array, int low, int high) {
		if(high < low) {
			return -1;
		}
		if(high == low) {
			return low;
		}
		int mid = (high + low)/2;
		
		if(mid < high && array[mid] > array[mid+1]) {
			return mid;
		}
		if(mid > low && array[mid] < array[mid-1]) {
			return mid-1;
		}
		if(array[low] >= array[mid]) {
			return findPivot(array, low, mid-1);
		} else {
			return findPivot(array, mid+1, high);
		}
	}

}

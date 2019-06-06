package com.sorting;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = {3,5,2,7,5,9,34,2,1,24};
		mergeSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	private static void mergeSort(int[] array) {
		int n = array.length;
		
		if(n < 2) {
			return;
		}
		
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];

		for(int i = 0; i < mid; i++) {
			left[i] = array[i];
		}
		
		for(int i = mid; i < n; i++) {
			right[i-mid] = array[i];
		}

		mergeSort(left);
		mergeSort(right);
		merge(left, right, array);
	}

	private static void merge(int[] left, int[] right, int[] array) {
		int nL = left.length;
		int nR = right.length;
		int i = 0,j = 0,k =0;

		while(i < nL && j < nR) {
			if(left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < nL) {
			array[k] = left[i];
			i++;
			k++;
		}

		while(j < nR) {
			array[k] = right[j];
			j++;
			k++;
		}
	}
}

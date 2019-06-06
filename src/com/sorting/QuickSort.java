package com.sorting;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = {7,2,1,6,8,5,3,4};
		quickSort(array, 0, array.length-1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	private static void quickSort(int[] array, int start, int end) {
		if(start < end) {
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot-1);
			quickSort(array, pivot+1, end);
		}
	}

	private static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int pIndex = 0;
		for(int i =0; i <end; i++) {
			if(array[i] <= pivot) {
				swap(array, i, pIndex);
				pIndex++;
			}
		}
		swap(array, pIndex, end);
		return pIndex;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}

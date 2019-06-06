package com.datastructure.string;

public class StringPermutation {
	public static void main(String[] args) {
		String str = "ABC";
		permuteString(str, 0, str.length()-1);
	}

	private static void permuteString(String str, int i, int j) {
		if(i == j) {
			System.out.println(str);
		}
		else {
			for (int k = i; k <= j; k++) {
				str = swap(str, i, k);
				permuteString(str, i+1, j);
				str = swap(str, i, k);
			}
		}
		
	}

	private static String swap(String str, int i, int k) {
		 	char temp; 
	        char[] charArray = str.toCharArray(); 
	        temp = charArray[i] ; 
	        charArray[i] = charArray[k]; 
	        charArray[k] = temp; 
	        return String.valueOf(charArray);
	}

}

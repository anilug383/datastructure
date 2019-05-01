package com.datastructure.string;

public class ReverseString3 {
	public static void main(String[] args) {
		String str = "string";
		char[] charArray = str.toCharArray();
		for(int i =charArray.length-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}
	}
}

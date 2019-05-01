package com.datastructure.string;

public class ReverseWordsInGivenString {
	
	public static void main(String[] args) {
		String str = "its just the beginning";
		String[] strArray = str.split("\\s");
		String result = "";
		for(int i = strArray.length-1; i >=0; i--) {
			result += strArray[i]+" ";
		}
		System.out.println(result);
	}

}

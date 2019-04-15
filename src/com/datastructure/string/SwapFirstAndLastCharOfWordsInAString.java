package com.datastructure.string;

public class SwapFirstAndLastCharOfWordsInAString {
	public static void main(String[] args) {
		String str = "Im learning datastructure";
		String[] strArray = str.split(" ");
		String newStr = "";
		
		for(String s : strArray) {
			char[] charArray = s.toCharArray();
			char temp = charArray[0];
			charArray[0] = charArray[charArray.length-1];
			charArray[charArray.length-1] = temp;
			newStr += new String(charArray)+" ";
		}
		System.out.println(newStr);
	}
}

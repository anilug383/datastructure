package com.datastructure.string;

public class ReverseSTring1 {
	
	public static void main(String[] args) {
		String str = "string";
		String result = "";
		for(int i = str.length()-1; i >=0; i--) {
			result += str.charAt(i);
		}
		System.out.println(result);
	}

}

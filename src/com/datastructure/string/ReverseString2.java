package com.datastructure.string;

public class ReverseString2 {
	public static void main(String[] args) {
		String str = "string";
		StringBuilder builder = new StringBuilder(str);
		builder = builder.reverse();
		System.out.println(builder);
	}
}

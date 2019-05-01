package com.datastructure.string;

public class CompareStringWithoutLibraryFunction {
	
	public static void main(String[] args) {
		String str1 = new String("Anil");
		String str2 = new String("Sunil");
		String str3 = new String("Anil");
		String str4 = new String("Jeetu");
		String str5 = new String("Avunash");
		
		System.out.println(compareString(str1, str2));
		System.out.println(str1.compareTo(str2));
		
	}

	private static int compareString(String str1, String str2) {
		for(int i =0; i < str1.length() && i < str2.length(); i++) {
			if((int)str1.charAt(i) == (int)str2.charAt(i)) {
				continue;
			} else {
				return (int)str1.charAt(i) - (int)str2.charAt(i);
			}
		}
		if(str1.length() < str2.length()) {
			return str1.length() - str2.length();
		} else if(str2.length() < str1.length()){
			return str2.length() - str1.length();
		} else {
			return 0;
		}
	}

}

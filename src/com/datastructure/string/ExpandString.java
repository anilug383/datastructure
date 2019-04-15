package com.datastructure.string;

public class ExpandString {
	
	public static void main(String[] args) {
		String str = "1-5, 8, 11-14, 18, 20, 26-29";
		String[] strArray = str.split(",");
		String result = "";
		for (String s : strArray) {
			if(s.contains("-")) {
				String[] range = s.split("-");
				int start = Integer.parseInt(range[0].trim());
				int end = Integer.parseInt(range[1].trim());
				for(int i = start; i <=end; i++) {
					result += Integer.toString(i)+",";
				}
			} else {
				result += s.trim()+",";
			}
		}
		System.out.println(result);
	}

}

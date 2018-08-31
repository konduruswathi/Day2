package com.capgemini.day2;

public class ReverseString {

	public static String findReverseString(String input) {
		String words[]=input.split(" ");
		String fnl="";
		for(int i=0;i<words.length;i++)
		{
			String rev="";
		for(int j=words[i].length()-1;j>=0;j--)
		{
			rev+=words[i].charAt(j);
		}
		fnl+=rev+"";
		}
	
		return fnl;
	}

}

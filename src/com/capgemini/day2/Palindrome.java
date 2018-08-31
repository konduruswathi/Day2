package com.capgemini.day2;

public class Palindrome {

	public static boolean checkPalindrome(int number) {
		// TODO Auto-generated method stub
		int result=0;
		int m;
		int remainder;
		m=number;
		while(number>0)
		{
			remainder=number%10;
			result=result*10+remainder;
			number=number/10;
		}
		if(result==number) {
			return true;
		}
		else
		{
			return false;
		}
	
	}

}

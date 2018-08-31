package com.capgemini.day2;

public class Armstrongg {

	public static boolean checkArmstrong(int n) {
		// TODO Auto-generated method stub
		int c=0,a,temp;
		
		temp=n;
		while(n>0)
		{
			a=n%10;
			
			c=c+(a*a*a);
			n=n/10;
		}
		if(temp==c)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

}

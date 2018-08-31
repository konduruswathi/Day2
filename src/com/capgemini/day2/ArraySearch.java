package com.capgemini.day2;

import java.util.Scanner;

public class ArraySearch {

	
		public static boolean searchWord(String[] list,String find) {
			// TODO Auto-generated method stub
			String name=" ";
			int flag=0;
			int siz=list.length;
			for(int i=0;i<siz;i++)
			{
				name=list[i];
				if(list[i].equals(find))
				{
					flag++;
				}
			}
			if(flag!=0)
			{
			return true;
			}
			else
			{
				return false;
			}
		}
}
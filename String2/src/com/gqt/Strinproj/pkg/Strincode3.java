package com.gqt.Strinproj.pkg;
//WAP to remove the unncessary spaces in between the strings
//sample ip : hi   good   morning
//sample op : hi good morning

import java.util.Scanner;

public class Strincode3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		String str2="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)==' ') {
				
			}
			else { 
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);
	}
}
		
		


package com.gqt.Strinproj.pkg;
//WAP to reverse the given string and check if it is palindrome or not

import java.util.Scanner;

public class Stringcode4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc .next();
		
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
		}
		if(str.equals(str2)) {
		System.out.println("palindrom");
	}
	else {
		System.out.println(" Not a palindrom");
	}

}
}

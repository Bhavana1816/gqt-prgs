package com.gqt.Strinproj.pkg;

import java.util.Scanner;
//WAP to count total number of words in the given string
//input : hi good morning
//output :3
//accoring to the general english terms
public class String1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int spc_cnt=0;
		str = str.trim();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				spc_cnt++;
			}
		}
		int word_cnt=spc_cnt+1;
		System.out.println("Word count = " +word_cnt);
	}

}

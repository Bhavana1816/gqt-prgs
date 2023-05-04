package com.gqt.oopsproj.pkg1;

import java.util.Scanner;

//import com.gqt.tudoproj.MainApp:
//import com.gqt.tudoproj.users:

public class project {
	public static void main(String[] args) {
		//todo auto-generated method stub
		System.out.println("welcome to To-Do-List App");
		System.out.println("Dear user please select an option\n"
				+"1. Register\n"
				+"2. Login\n"
				+"3. Logout\n");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1 :{
			Users1.registerUser();
			MainApp1.main(null);
		}
		case 2 :{
			boolean b=Users1.loginUser();
			if(b==true) {
				MainApp1.main(null);
			}
			else{
				System.out.println("Login Failed:");
				MainApp1.main(null);
				
			}
		}
		case 3 : {
			System.out.println("Thank you");
			System.exit(0);
		}
		default:
			System.out.println("nvalid entry.please try again");
			MainApp1.main(null);
		}
	}

}


package com.metalight.employee.admin;

import java.util.Scanner;

public class AdminFirst {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Hello first Admin :");
		Scanner inputObj = new Scanner(System.in);
		try
		{
			System.out.println("Please enter two intergers : ");
			a = inputObj.nextInt();
			b = inputObj.nextInt();
			
		}
		finally {
			inputObj.close();
		}
		
		int x = a + b ;
		System.out.println("Sum is = "+x);
		
	}
		

}

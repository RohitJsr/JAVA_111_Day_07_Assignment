package com.masaiQ2;

import java.util.Scanner;

public class InputDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String Name=sc.nextLine();
		
		System.out.println("Enter the character position you want to access:");
		
		int num=sc.nextInt();
		int index1=Name.charAt(num);
		
		System.out.println("Character at position "+num+" is "+"\n"+(char)index1);

		
		

	}

}

package com.masaiQ3;

import java.util.Objects;
import java.util.Scanner;

public class Course {
	int courseld;
	String courseName;
	int courseFee;
	
	public Course() {
		
	}
	
	public void displayCourseDetails() {
		System.out.println("The course Id is "+courseld+"\n"+"The course Name is "+courseName+"\n"+"The course fee is "+courseFee);
	}
	
	static void authenticate(String username,String password) {
		if(Objects.equals(username,"Admin")&& Objects.equals(password,"1234")) {
			Scanner sc =new Scanner (System.in);
			
			Course c1=new Course();
			
			System.out.println("Enter Your Couse Name");
			c1.courseName= sc.nextLine();
			
			System.out.println("Enter Your Couse Course Id");
			c1.courseld= sc.nextInt();
			
			System.out.println("Enter Your Couse Course Fee");
			c1.courseFee= sc.nextInt();
			
			c1.displayCourseDetails();
			
		}
		else {
			System.out.println("Invalid userName or Password");
		}
	}
	 public static void main(String[] args) {
         authenticate("Admin","1234");
     }

}

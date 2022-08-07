package com.masaiQ1;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 With new operator String create the string in heap area
		 and put a copy in string const pool area so the result of 
		 hashcode is same in below case;
		 
		 */
			
			String s1=new String("Test");
			String s2=new String("Test");
		   System.out.println(s1.hashCode() + " "+ s2.hashCode() + " " + s1.equals(s2));
		   
		   String s3="Test";
		    System.out.println(s1.hashCode() + " "+ s3.hashCode() + " " + s1.equals(s3));

		    /*
		     Then is the differnce between above two notation of string creation although 
		     they are referening to same string in string const. pool
		     */
	}

}

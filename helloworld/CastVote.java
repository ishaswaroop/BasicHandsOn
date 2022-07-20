package com.globallogic.helloworld;
//Write a program to vote system if age is > 18 allow to cast a vote
import java.util.*;
public class CastVote {
	 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18) 
			System.out.println("Eligible to cast vote");
		else
		
			System.out.println("Not eligible to cast the vote");
		
	}
}

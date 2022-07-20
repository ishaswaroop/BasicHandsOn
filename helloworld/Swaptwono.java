package com.globallogic.helloworld;
import java.util.*;
public class Swaptwono {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the first number");
	 int num=sc.nextInt();
	 System.out.println("Enter the second number");
	 int num2=sc.nextInt();
	 num=num+num2;
	 num2=num-num2;
	 num=num-num2;
	 System.out.println("First number is"+num);
	 System.out.println("Second number is"+num2);
 }
}

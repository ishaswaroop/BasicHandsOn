package com.globallogic.helloworld;
import java.util.*;
public class RevString {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the string");
	 String s=sc.nextLine();
	 int len=s.length();
	 String m="";
	 for(int i=len-1;i>=0;i--) {
		 m=m+s.charAt(i);
	 }
	 System.out.println(m);
	 
 }
}

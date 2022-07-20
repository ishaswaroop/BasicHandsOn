package com.globallogic.helloworld;
class A1{
	public void printA() {
		System.out.println("Print A");
	}
}
class B1 extends A1{
	public void printB() {
		System.out.println("Print B");
	}
}
class C1 extends B1{
	public void printC() {
		System.out.println("Print C");
	}
}
public class HierachicalI {
 public static void main(String args[]) {
	 C1 c=new C1();
	 c.printC();
	 c.printA();
	 B1 b=new B1();
	 b.printB();
	 b.printA();
	 
 }
}

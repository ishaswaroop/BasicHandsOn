package com.globallogic.helloworld;
class A{
	public void printA() {
		System.out.println("Print A ");
	}
}
class B extends A{
	public void printB() {
		System.out.println("Print B");
	}
}
class C extends B{
	public void printC() {
		System.out.println("Print C");
	}
}
public class MultilevelI {
	public static void main(String args[]) {
		
	
      C c=new C();
      c.printA();
      c.printB();
      c.printC();
     
      
}
}

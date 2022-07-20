package com.globallogic.helloworld;
class A{
	public void printA() {
		System.out.println("Print A");
	}
}
class B extends A{
	public void printB() {
		System.out.println("Print B");
	}
}
public class SingleI {
    public static void main(String args[]) {
    	B b=new B();
    	b.printA();
    	b.printB();
    }
}

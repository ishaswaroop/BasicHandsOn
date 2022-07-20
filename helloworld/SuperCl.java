package com.globallogic.helloworld;
class A{
	int  id;
	public A(int id) {
		this.id=id;
	}
	public void printA() {
		System.out.println(id);
	}
}
class B extends A{
          int id1;
	public B(int id1) {
		super(id1);
	}
	public void printB() {
	super.printA();
	
}
}
public class SuperCl {
       public static void main(String args[]) {
        B b=new B(12);
        
    	   
       }
}

package com.globallogic.helloworld;
class Person{
	public void work() {
		System.out.println("Working as person");
	}
	
}
class Office extends Person{
	public void work() {
		System.out.println("Working from office as a person");
	}
	
}
class Employee1 extends Person {
	public void work() {
		System.out.println("Working as an employee");
	}
}
public class Polymorphism {
      public static void main(String args[]) {
    	  Person p=new Person();
    	  p.work();
    	  p=new Office();
    	  p.work();
    	  p=new Employee1();
    	  p.work();
      }
}

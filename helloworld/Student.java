package com.globallogic.helloworld;

 class Student1 {
  private int id;
  private String name;
  private int roll_no;
  private int enrollment_no;
  private String address;

	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public int getEnrollment_no() {
	return enrollment_no;
}
public void setEnrollment_no(int enrollment_no) {
	this.enrollment_no = enrollment_no;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int id, String name, int roll_no, int enrollment_no, String address) {
	   super();
		this.id = id;
		this.name = name;
		this.roll_no = roll_no;
		this.enrollment_no = enrollment_no;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll_no=" + roll_no + ", enrollment_no=" + enrollment_no
				+ ", address=" + address + ", getId()=" + getId() + ", getName()=" + getName() + ", getRoll_no()="
				+ getRoll_no() + ", getEnrollment_no()=" + getEnrollment_no() + ", getAddress()=" + getAddress()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
 }
 
	public class Student{
		public static void main(String args[]) {
			
			Student1 sc1=new Student1(1,"Isha",12,345,"6/78 Vikas Nagar");
			System.out.println(sc1.toString());
		}
	}
 



package com.globallogic.helloworld;
class Student{
	int id;
	int roll_no;
	String name;
	String address;
	String Subject;
	String college;
	double stipend;
	double marks;
	int favColor;
	String blood_group;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public double getStipend() {
		return stipend;
	}
	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getFavColor() {
		return favColor;
	}
	public void setFavColor(int favColor) {
		this.favColor = favColor;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", roll_no=" + roll_no + ", name=" + name + ", address=" + address + ", Subject="
				+ Subject + ", college=" + college + ", stipend=" + stipend + ", marks=" + marks + ", favColor="
				+ favColor + ", blood_group=" + blood_group + "]";
	}
	public Student(int id, int roll_no, String name, String address, String subject, String college, double stipend,
			double marks, int favColor, String blood_group) {
		super();
		this.id = id;
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
		Subject = subject;
		this.college = college;
		this.stipend = stipend;
		this.marks = marks;
		this.favColor = favColor;
		this.blood_group = blood_group;
	}
	
}
public class MyStudent {
	Student[] ss=new Student[10];
	System.out.println("Enter the student data");
	for(int i=0;i<)
}

package com.constructor;
public class Student {
	private int studentId;
	private String studentName;
	
	private double studentAge;
	
	public Student(int id,String name,double age) {
		studentId=id;
		studentName="name";
		studentAge=age;
		
		
	}
	public Student() {
		studentId=102;
		studentName="niks";
		studentAge=45;
		
	}
	public void printInfo() {
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Age:"+studentAge);
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int id) {
		studentId=id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName=name;
	}
	public double getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(double age) {
		studentAge=age;
	}
	


	

}

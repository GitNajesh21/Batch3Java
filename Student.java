package com.main;

public class Student {
	
	String name;
	Integer age;
	String address;
	
	private static Student student = null;
	
	public static Student getObject() {
		if(null == student) {
			student = new Student();
		}
		return student;
	}
	
	private Student() { //contructor
	}


	/*
	 * public Student(String name, Integer age, String address) {//constructor
	 * super(); this.name = name; this.age = age; this.address = address; }
	 */


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	

	public Student getDetails() {
		return new Student();
		
	}
	
	/*
	 * public Student getDetails(String name) { return new Student(name, null,
	 * null); }
	 */
	

}

//method overloading, constructor overloading -- static/compiletime polymorphism

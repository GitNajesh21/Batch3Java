package com.main;

public class MainTest {
	
	public static void main(String[] args) {
		
		Student std = Student.getObject();// Student();
		std.setName("Anthony");
		System.out.println(std.getName());
		Student std1 = Student.getObject();
		System.out.println("Done ..");
		
		
		
		/*
		Student std1 = new Student("Anthony",30,null);
		System.out.println(std1.getName());
		
		std = std.getDetails("Anthony");
		System.out.println(std.getName());
		System.out.println(std.getAge());
		
		std = std.getDetails();
		System.out.println(std.getName());
		System.out.println(std.getAge());
		*/
		
		String s1 = "java";
		String s2 = "java"; 
		
		
		System.out.println(s1 == s2 );// compares adresses
		
		System.out.println(s1.equals(s2));  //compares values
	}

}

package org.emp;

import org.demo.CourseDetails;

//import package name.className;

public class StudentDetails {
	
	public void stuName() {
		System.out.println("Student Name");
	}
	public void stdId() {
		System.out.println("student id 9876");
	}
	public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
		s.stuName();
		s.stdId();
		CourseDetails c = new CourseDetails();
		c.javaCourse();
		c.pythonCourse();
		
	}
	}



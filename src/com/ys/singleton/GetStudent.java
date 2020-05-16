package com.ys.singleton;
public class GetStudent {
	public GetStudent() {
		// TODO Auto-generated constructor stub
		StudentManager sManager = StudentManager.getStudentManagerIns();
		Student student=sManager.getStudent();
		System.out.println(student.getNameString()+","+student.getPasswordString());
	}
}

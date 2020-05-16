package com.ys.singleton;
/*
 * 
 * @author:ys
 * 单例模式：饿汉模式
 * 
 */
public class StudentManager {
	private static Student student = new Student();
	private static StudentManager sManager = new StudentManager();
	private StudentManager()
	{
		
	}
	public Student getStudent()
	{
		return student;
	}
	public  static StudentManager getStudentManagerIns()
	{
		return sManager;
	}
}

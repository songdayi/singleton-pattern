package com.ys.singleton;

public class Main {
	
	public static void main(String[] args) {
		StudentManager sManager = StudentManager.getStudentManagerIns();
		sManager.getStudent().setNameString("forys");
		sManager.getStudent().setPasswordString("password");
		
		GetStudent getStudent =new GetStudent();
	}
}

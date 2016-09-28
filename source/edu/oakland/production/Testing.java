package edu.oakland.production;

import edu.oakland.helper.Student;

public class Testing {

	public static void main(String[] args) {

		SIS sis = new SIS();


		sis.addStudent(new Student(1));
		sis.addStudent(new Student(123));
		sis.addStudent(new Student(321));
		sis.addStudent(new Student(54));


		System.out.println(sis.getStudentByID(2));
		System.out.println(sis.getStudentByID(123));
		System.out.println(sis.getStudentByID(321));
		System.out.println(sis.getStudentByID(54));
	}
}

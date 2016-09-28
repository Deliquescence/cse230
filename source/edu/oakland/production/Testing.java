package edu.oakland.production;

import edu.oakland.helper.Student;

public class Testing {

	public static void main(String[] args) {

		SIS sis = new SIS();


		sis.addStudent(new UnderGraduate(1));
		sis.addStudent(new UnderGraduate(123));
		sis.addStudent(new UnderGraduate(321));
		sis.addStudent(new UnderGraduate(54));


		System.out.println(sis.getStudentByID(2));
		System.out.println(sis.getStudentByID(123));
		System.out.println(sis.getStudentByID(321));
		System.out.println(sis.getStudentByID(54));
	}
}

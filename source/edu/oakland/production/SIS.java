package edu.oakland.production;

import edu.oakland.helper.Student;

public class SIS {

	private Student[] students = new Student[5];
	private int numStudents = 0;

	public SIS() {
	}

	public void addStudent(Student student) {
		this.students[numStudents] = student;
		this.numStudents++;
	}

	public Student getStudent(String GID) {
		for (Student s : students) {
			if (s.getGrizzlyID() == GID) {
				return s;
			}
		}

		return null;
	}
}

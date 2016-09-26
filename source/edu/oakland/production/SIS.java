package edu.oakland.production;

import edu.oakland.helper.Student;

public class SIS {

	private Student[] students;
	private int numStudents = 0;

	public SIS() {
		students = new Student[5];
	}

	public SIS(int maximumStudents) {
		students = new Student[maximumStudents];
	}

	public void addStudent(Student student) {
		this.students[numStudents] = student;
		this.numStudents++;
	}

	public Student getStudent(int GID) {
		for (Student s : students) {
			if (s.getGrizzlyID() == GID) {
				return s;
			}
		}

		return null;
	}
}

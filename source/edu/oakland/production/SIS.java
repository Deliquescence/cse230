package edu.oakland.production;

import edu.oakland.helper.Student;

public class SIS {

	private Student[] students = new Student[6];

	public SIS() {
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

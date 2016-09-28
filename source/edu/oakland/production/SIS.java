package edu.oakland.production;

import edu.oakland.helper.Student;

public class SIS {

	private Student[] students;
	private int numStudents = 0;

	/**
	 * Create a new SIS with the default capacity of 5 students.
	 */
	public SIS() {
		students = new Student[5];
	}

	/**
	 * Create a new SIS with the specified capacity of students.
	 *
	 * @param maximumStudents The maximum number of students that will be stored.
	 */
	public SIS(int maximumStudents) {
		students = new Student[maximumStudents];
	}

	/**
	 * Add a student to the SIS.
	 *
	 * @param student The {@link Student} to add.
	 */
	public void addStudent(Student student) {
		this.students[numStudents] = student;
		this.numStudents++;
	}

	/**
	 * Retrieve a student from the SIS.
	 *
	 * @param GID The student's Grizzly ID.
	 */
	public Student getStudent(int GID) {
		for (Student s : students) {
			if (s == null) {
				continue;
			}
			if (s.getGrizzlyID() == GID) {
				return s;
			}
		}

		return null;
	}
}

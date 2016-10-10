package edu.oakland.production;

import java.util.Arrays;

public class SIS {

	private UnderGraduate[] students;
	private int numStudents = 0;

	/**
	 * Create a new SIS.
	 */
	public SIS() {
		students = new UnderGraduate[1];
	}

	/**
	 * Add a student to the SIS.
	 *
	 * @param student The student to add.
	 */
	public void addStudent(UnderGraduate student) {
		if (this.students.length <= this.numStudents) { //No space left
			this.students = Arrays.copyOf(this.students, numStudents + 1);
		}
		this.students[numStudents] = student;
		this.numStudents++;
	}

	/**
	 * Retrieve a student from the SIS based on Grizzly ID.
	 *
	 * @param GID The student's Grizzly ID.
	 */
	public UnderGraduate getStudentByID(int GID) {
		for (UnderGraduate s : students) {
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

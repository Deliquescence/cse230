package edu.oakland.production;

import edu.oakland.helper.*;

public class SIS {
	private StudentRecord[] student = new StudentRecord[1];
	private int indexInArrray = 0;

	public SIS() {
		StudentRecord[] student = new StudentRecord[0];
		System.out.println("\nTurning On Student Database Welcome....\n");
	}

	public StudentRecord getStudentByID(int grizzlyID) { //Int Grizzly ID. loop array student.griz
		int indexOfStudent = 0;

		for (StudentRecord thisStudents : student) {
			if (thisStudents == null) {
				continue;
			}
			if (thisStudents.getGrizzlyID() == grizzlyID) {
				System.out.println("\nFound A Match...");

				return student[indexOfStudent];
			}
			indexOfStudent++;
		}

		return null;
	}

	public StudentRecord getStudentByName(String name) {
		int indexOfStudent = 0;

		for (StudentRecord thisStudents : student) {
			if (thisStudents == null) {
				continue;
			}
			if (thisStudents.getName().equalsIgnoreCase(name)) {
				System.out.println("\nFound A Match...");

				return student[indexOfStudent];
			}
			indexOfStudent++;
		}

		return null;
	}

	public void addStudent(StudentRecord student) {
		this.student[indexInArrray] = student;
		indexInArrray++;
		if (this.student.length == indexInArrray) {
			growArray();
		}
	}

	public void growArray() {
		StudentRecord[] stuArray = new StudentRecord[this.student.length + 1];
		for (int x = 0; x < this.student.length; x++) {
			stuArray[x] = this.student[x];
		}
		this.student = stuArray;
	}
}

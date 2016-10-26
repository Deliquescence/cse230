package edu.oakland.test;

import edu.oakland.production.*;

import junit.framework.*;


public class SISTest extends TestCase {

	public void testSIS() {
		SIS sis = new SIS();
		UnderGraduate student = new UnderGraduate(1);

		sis.addStudent(student);


		assertEquals(student, sis.getStudentByID(1));
	}
}

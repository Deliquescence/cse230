package edu.oakland.test;

import edu.oakland.helper.*;
import edu.oakland.production.*;
import junit.framework.*;

public class SISTest extends TestCase {
	private String grizzlyID = "1234";
	private String major = "CSE";
	private String name = "Bob";
	private String studentLevel = "Grad";
	private String hasMajorStanding = "True";
	SISManager Man = new SISManager();
	StudentRecord returnedStudent;
	private boolean getByIDPassed = false;
	private boolean getByNamePassed = false;
	
	public void setUp() {
		
	}
	
	
	public void testSISManager() {
		Man.createRecord(grizzlyID, name, major, studentLevel, hasMajorStanding);
		Man.storeRecord();
		returnedStudent = Man.retrieveByID(grizzlyID);
		returnedStudent.printStudent();
		
		getByIDPassed = compareStudent();
		
		returnedStudent = Man.retrieveByName(name);
		returnedStudent.printStudent();
		getByNamePassed = compareStudent();
		
		if(getByIDPassed == true && getByNamePassed == true){
			assertTrue(true);
		}
		
		
	}
	
	public boolean compareStudent(){
		
		if(this.returnedStudent.getGrizzlyID() == Integer.parseInt(grizzlyID) &&
			this.returnedStudent.getName().equals(name) &&
			this.returnedStudent.getMajor().equals(major) &&
			this.returnedStudent.getStudentType().equals(studentLevel) &&
			this.returnedStudent.getMajorStandingAchieved() == true) {
				
				return true;
			}
		else {
			return false;
		}
	}
	
}
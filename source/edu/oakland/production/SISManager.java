package edu.oakland.production;

import edu.oakland.helper.*;
import edu.oakland.production.*;
import java.awt.event.*;
import javax.swing.*;

public class SISManager {
    public int studentID;
    public String nameOfMajor;
    public String studentName;
    public String studentEnrollment;
    public boolean majorQualified;
	SIS sis = new SIS();
	StudentRecord createStudent;
	
    public void createRecord(String ID, String name, String majName, String Studentlvl, String standing) {
      
        //andrew&josh
        
        studentID = Integer.parseInt(ID);
        studentName = name;
        nameOfMajor = majName;
        studentEnrollment = Studentlvl;
		//majorQualified =
        if(standing.equalsIgnoreCase("true")){
			majorQualified = true;
		}
		else{
			majorQualified = false;
		}
        
		createStudent = new StudentRecord(studentID, nameOfMajor, majorQualified, studentName, studentEnrollment);                //Sends data to studentRecord
        
		
        //send to student.java to store in variables.
      
    }
    
    public void storeRecord() {
        
        //anthony&richard
        sis.addStudent(createStudent);                         //passes the tempRecord object to the SIS as a variable
      //takes data from student class and sends it over to sis for storage.
       
    }
    
    public StudentRecord retrieveByName(String nameinput){
        return sis.getStudentByName(nameinput);
    }
    
    public StudentRecord retrieveByID(String idinput){
		return sis.getStudentByID(Integer.parseInt(idinput));
    }
    
}
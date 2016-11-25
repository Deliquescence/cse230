package edu.oakland.test;


import edu.oakland.production.*;
import edu.oakland.helper.*;
import junit.framework.*;


public class SISTests extends TestCase{


  SIS sis;
  protected void setUp(){
    sis = new SIS();
    sis.addStudent(new StudentRecord(
      1234, "CSE", true, "Joshua Chamberlain", "Graduate"
    ));
    sis.addStudent(new StudentRecord(
      5678, "CSE", false, "Abraham Lincoln", "Undergraduate"
    ));
    sis.addStudent(new StudentRecord(
      1357, "IT", true, "James Longstreet", "Undergraduate"
    ));
    sis.addStudent(new StudentRecord(
      2468, "IT", false, "Mary Lincoln", "Graduate"
    ));
    sis.addStudent(new StudentRecord(
      9876, "IT", true, "George Pickett", "Graduate"
    ));
  }


  public void testRetrievalByGrizzID(){
      assertEquals(sis.getStudentByID(1234).getName(), "Joshua Chamberlain");
      assertEquals(sis.getStudentByID(5678).getName(), "Abraham Lincoln");
      assertEquals(sis.getStudentByID(1357).getName(), "James Longstreet");
      assertEquals(sis.getStudentByID(2468).getName(), "Mary Lincoln");
      assertEquals(sis.getStudentByID(9876).getName(), "George Pickett");
  }


   public void testRetrievalByName(){
    assertEquals(sis.getStudentByName("Joshua Chamberlain").getGrizzlyID(), 1234);
    assertEquals(sis.getStudentByName("Abraham Lincoln").getGrizzlyID(), 5678);
    assertEquals(sis.getStudentByName("James Longstreet").getGrizzlyID(), 1357);
    assertEquals(sis.getStudentByName("Mary Lincoln").getGrizzlyID(), 2468);
    assertEquals(sis.getStudentByName("George Pickett").getGrizzlyID(), 9876);
  }


  protected void tearDown(){
    sis = null;
    assertNull(sis);
}}

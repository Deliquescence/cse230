package edu.oakland.test;


import edu.oakland.production.*;
import edu.oakland.helper.*;
import junit.framework.*;


public class StudentRecordTests extends TestCase{


  StudentRecord stu;


  protected void setUp(){
    stu = new StudentRecord(1234, "Computer Science", true,
    "Joe Smith", "Undergraduate");
  }


  public void testID(){
    assertEquals(stu.getGrizzlyID(), 1234);
  }


  public void testMajor(){
    assertEquals(stu.getMajor(), "Computer Science");
  }


  public void testStanding(){
    assertTrue(stu.getMajorStandingAchieved());
  }


  public void testName(){
    assertEquals(stu.getName(), "Joe Smith");
  }


  public void testType(){
    assertEquals(stu.getStudentType(), "Undergraduate");
  }


  protected void tearDown(){
    stu = null;
    assertNull(stu);
  }}

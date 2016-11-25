package edu.oakland.helper; //creates the package


public class StudentRecord {

	protected String name;
	protected int grizzlyID;
	protected String major;
	protected boolean majorStandingAchieved;
	protected String studentType;


	public int getGrizzlyID() {
		return this.grizzlyID;
	}
	
	public String getStudentType(){
		return this.studentType;
	}


	public String getMajor() {
		return this.major;
	}
	
	public boolean getMajorStandingAchieved() {
		return this.majorStandingAchieved;
	}


	public String getName() {
		return this.name;
	}


	public StudentRecord(){ //Default constructor
		grizzlyID = 0000;
		major = "None";
		majorStandingAchieved = false;
		name = "None";
		studentType = "None";
	}


    //overloaded constructor to set the Undergraduates instance variables
	public StudentRecord(int grizInput, String majorInput,
		boolean majorStandingInput, String recordName, String studentType) {
			this.grizzlyID = grizInput;
			this.major = majorInput;
			this.majorStandingAchieved = majorStandingInput;
			this.name = recordName;
			this.studentType = studentType;
		    System.out.println("Student Created");
	}


    //prints the students information
    public void printStudent(){
		System.out.println(this.grizzlyID +  " " + this.getName() + " " + 
						   this.major + " " + this.majorStandingAchieved + " " + this.studentType);
	}


}

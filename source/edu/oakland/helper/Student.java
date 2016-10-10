package edu.oakland.helper;
public class Student {

	protected int grizzlyID;
	protected String major;
	protected boolean majorStandingAchieved;

	public Student(int GID) {
		grizzlyID = GID;
	}

	public int getGrizzlyID() {
		return grizzlyID;
	}
}

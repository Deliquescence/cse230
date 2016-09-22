package edu.oakland.homework.hw01;
public class PrintExample{
	//this method is being called
	public static void PrintLine(){
		System.out.println("This is a line of text.");
	}
	
	public static void main(String[] args){
		//print out start here
		System.out.println("Start Here");
		//initial a method called PrintLine 
		PrintLine();
		//print out back to the main
		System.out.println("Back to the Main");
		//initial a method classed PrintLine
		PrintLine();
		//print out end here
		System.out.println("End Here");
	}
}
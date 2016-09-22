package edu.oakland.homework.hw01;
public class PrintExample {
	//this method is being called
	public static void PrintLine() {
		//Write "This is a line of text." to standard output
		System.out.println("This is a line of text.");
	}

	public static void main(String[] args){
		//Write "Start Here" to standard output
		System.out.println("Start Here");
		//Call method PrintLine()
		PrintLine();
		//Write "Back to the Main" to standard output
		System.out.println("Back to the Main");
		//Call method PrintLine()
		PrintLine();
		//Write "End Here" to standard output
		System.out.println("End Here");
	}
}

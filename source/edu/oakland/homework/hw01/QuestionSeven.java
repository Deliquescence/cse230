package edu.oakland.homework.hw01;

import java.util.*;

//Number 7
class QuestionSeven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number (integer): ");
		int n1 = scan.nextInt();
		System.out.print("Enter the second number (double): ");
		double n2 = scan.nextDouble();
		
		int iresult, irem;
		double dresult, drem;
		
		iresult = n1 / (int) n2;
		irem = n1 % (int) n2;
		
		dresult = (double) n1 / n2;
		drem = (double) n1 % n2;
		
		System.out.println("Result and remainder (integer version): " + iresult + " " + irem);
		System.out.println("Result and remainder (double version): " + dresult + " " + drem);
	}
}
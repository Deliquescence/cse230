package edu.oakland.homework.hw01;

import java.util.*;

//Number 6
class YearOfBirth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		System.out.println("You are " + age + " years old now.");
		int year = 2016 - age;
		System.out.println("You were probably born in " + year);
	}
}
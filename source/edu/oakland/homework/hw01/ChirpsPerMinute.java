package edu.oakland.homework.hw01;

import java.util.*;

//Number 10
public class ChirpsPerMinute {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input the chirps per minute: ");
		double chirps = scan.nextDouble();
		System.out.println("Temperature (F): " + (40.0 + (chirps / 4.0)));
	}
}

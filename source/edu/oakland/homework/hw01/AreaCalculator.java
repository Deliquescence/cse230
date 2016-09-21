package edu.oakland.homework.hw01;

import java.util.*;

// Number 8
class AreaCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input the radius of the circle: ");
		double r = scan.nextDouble();

		System.out.print("Input the length of the rectangle: ");
		double l = scan.nextDouble();
		System.out.print("Input the width of the rectangle: ");
		double w = scan.nextDouble();

		printCircleArea(r);
		printRectangleArea(l, w);
	}

	public static void printCircleArea(double radius) {
		System.out.println("Circle area: " + Math.PI * radius * radius);
	}

	public static void printRectangleArea(double length, double width) {
		System.out.println("Rectangle area: " + length * width);
	}
}

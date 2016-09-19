package edu.oakland.homework.hw02;

public class Foo {

	private int sum;

	public static void main(String[] args) {
		Foo foo = new Foo(args[0], args[1], args[2]);
	}

	public Foo(String v1, String v2, String v3) {
		this.sum = Integer.parseInt(v1) + Integer.parseInt(v2) + Integer.parseInt(v3);
		System.out.println(this.sum);
	}
}

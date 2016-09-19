package edu.oakland.homework.hw02;

import java.util.Arrays;

public class Foo2 {

	private int alfa, bravo, charlie;

	public static void main(String[] args) {
		Foo2 foo = new Foo2(args[0], args[1], args[2]);
	}

	public Foo2(String v1, String v2, String v3) {
		int sorter[] = new int[3];
		sorter[0] = Integer.parseInt(v1);
		sorter[1] = Integer.parseInt(v2);
		sorter[2] = Integer.parseInt(v3);

		Arrays.sort(sorter);

		System.out.println(sorter[0]);
		System.out.println(sorter[1]);
		System.out.println(sorter[2]);
	}
}

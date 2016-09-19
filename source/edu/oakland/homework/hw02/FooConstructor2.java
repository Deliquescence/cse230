package edu.oakland.homework.hw02;

public class FooConstructor2 {

	private String name;

	public static void main(String[] args) {
		FooConstructor2 foo = new FooConstructor2(args[0]);
	}

	void storeArg(String variable) {
		this.name = variable;
		System.out.println(name);
	}

	public FooConstructor2(String variable) {
		storeArg(variable);
	}
}

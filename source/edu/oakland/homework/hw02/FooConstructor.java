package edu.oakland.homework.hw02;

public class FooConstructor {

	private String name;

	public static void main(String[] args) {
		FooConstructor foo = new FooConstructor();
		foo.storeArg(args[0]);
	}

	void storeArg(String variable) {
		this.name = variable;
		System.out.println(name);
	}
}

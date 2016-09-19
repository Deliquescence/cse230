package edu.oakland.homework.hw02;

public class FooConstructor3 {

	private String name;
	private String name2;

	public static void main(String[] args) {
		FooConstructor3 fooA = new FooConstructor3(args[0], args[1]);
		FooConstructor3 fooB = new FooConstructor3(args[0] + args[1], null);
	}

	void storeArgs(String variable, String variable2) {
		this.name = variable;
		this.name2 = variable2;

		System.out.println(name);

		System.out.println(name2 != null ? name2 : "");
	}

	public FooConstructor3(String variable1, String variable2) {
		storeArgs(variable1, variable2);
	}
}

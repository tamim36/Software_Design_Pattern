package StrategyPattern;

public class Main {

	public static void main(String[] args) {

		Context context = new Context(new AddClass());
		System.out.println("the result : " + context.executeOperation(10, 15));

		context = new Context(new SubstractClass());
		System.out.println("The result : " + context.executeOperation(30, 15));
	}
}

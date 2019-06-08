package TemplateDesignPattern;

public class PatternMain {

	public static void main(String[] args) {

		System.out.println("Starting postman \n");
		Worker worker = new Postman("Mr. postman");
		worker.executeDay();

		System.out.println("\n\nStarting Fire fighter\n");

		worker = new FireFighter("Mr. Fire Fighter");
		worker.executeDay();
	}
}

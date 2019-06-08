package TemplateDesignPattern;

public class Postman extends Worker {

	public Postman(String name) {
		super("Postman");
		this.name = name;
	}

	@Override
	void goToWork() {
		System.out.println(name + " going to Post Office");
	}

	@Override
	void work() {
		System.out.println(name + " deliver the mails");
	}
}

package TemplateDesignPattern;

public abstract class Worker {

	String name;

	String type;

	public Worker(String type) {
		this.type = type;
	}

	void getUp() {
		System.out.println(name + " woke up");
	}

	void eatBreakfast() {
		System.out.println(name + " ate Breakfast");
	}

	abstract void goToWork();

	abstract void work();

	void returnToHome() {
		System.out.println(name + " returned to home");
	}

	void sleep() {
		System.out.println(name + " went to sleep");
	}

	void executeDay() {
		getUp();
		eatBreakfast();
		goToWork();
		work();
		returnToHome();
		sleep();
	}
}

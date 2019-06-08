package TemplateDesignPattern;

public class FireFighter extends Worker {

	public FireFighter(String name) {
		super("Fire Fighter");
		this.name = name;
	}

	@Override
	void goToWork() {
		System.out.println(name + " going to Fire Station");
	}

	@Override
	void work() {
		System.out.println(name + " extinguish a fire");
	}

}

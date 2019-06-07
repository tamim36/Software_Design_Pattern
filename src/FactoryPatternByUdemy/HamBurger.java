package FactoryPatternByUdemy;

public class HamBurger {

	public String name;
	public String sauce;
	public String buns;

	public void prepare() {
		System.out.println("Preparing ... " + name);
		System.out.println("Adding ... " + sauce);
		System.out.println("Adding ... " + buns);
	}

	public void cook() {
		System.out.println("cooking");
	}

	public void box() {
		System.out.println("boxing");
	}

	public String getName() {
		return name;
	}

}

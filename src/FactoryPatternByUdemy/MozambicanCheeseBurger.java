package FactoryPatternByUdemy;

public class MozambicanCheeseBurger extends HamBurger {

	public MozambicanCheeseBurger() {
		name = "Mozambican Style Cheese Burger";
		sauce = "Spicy Mozambican sauce";
		buns = "Cookie dough buns!";
	}

	@Override
	public void cook() {
		System.out.println("Mozambican cooking ... ");
	}

}

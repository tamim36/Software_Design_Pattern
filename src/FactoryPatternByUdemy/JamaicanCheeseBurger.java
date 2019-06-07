package FactoryPatternByUdemy;

public class JamaicanCheeseBurger extends HamBurger {

	public JamaicanCheeseBurger() {
		name = "Jamaican Style Cheese Burger";
		sauce = "Spicy jamaican sauce";
		buns = "Cookie dough buns!";
	}

	@Override
	public void cook() {
		System.out.println("Cooking Jamaican style....");
	}

}

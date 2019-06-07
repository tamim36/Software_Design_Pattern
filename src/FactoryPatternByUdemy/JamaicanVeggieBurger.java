package FactoryPatternByUdemy;

public class JamaicanVeggieBurger extends HamBurger {

	public JamaicanVeggieBurger() {
		name = "Jamaican Style Veggie Burger";
		sauce = "Spicy jamaican sauce";
		buns = "Lettuce wrap!";
	}

	@Override
	public void cook() {
		System.out.println("Cooking Jamaican style....");
	}
}

package FactoryPatternByUdemy;

public class MozHamburgerStore extends HamBurgerStore {
	@Override
	public HamBurger createHamburger(String type) {

		if (type.equals("cheese")) {
			return new MozambicanCheeseBurger();
		} else if (type.equals("Veggie")) {
			return new MozambicanVeggieBurger();

		} else
			return null;

	}
}

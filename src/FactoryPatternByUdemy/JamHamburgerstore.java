package FactoryPatternByUdemy;

public class JamHamburgerstore extends HamBurgerStore {
	@Override
	public HamBurger createHamburger(String type) {

		if (type.equals("cheese")) {
			return new JamaicanCheeseBurger();
		} else if (type.equals("veggie")) {
			return new JamaicanVeggieBurger();

		} else
			return null;
	}
}

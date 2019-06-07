package FactoryPatternByUdemy;

public abstract class HamBurgerStore {

	public HamBurger orderHumburger(String type) {
		HamBurger burger;

		burger = createHamburger(type); // factory.createHamburger(type);

		burger.prepare();
		burger.cook();
		burger.box();

		return burger;
	}

	abstract public HamBurger createHamburger(String type);
}

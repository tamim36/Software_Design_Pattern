package FactoryPatternByUdemy;

public class Main {

	public static void main(String[] args) {
		HamBurgerStore mozBurgerStore = new MozHamburgerStore();

		HamBurgerStore jamBurgerStore = new JamHamburgerstore();

		HamBurger hamBurger = mozBurgerStore.orderHumburger("cheese");
		System.out.println("Paolo ordered " + hamBurger.getName() + "\n\n");

		hamBurger = jamBurgerStore.orderHumburger("veggie");
		System.out.println("Tamim  ordered " + hamBurger.getName());

	}

}

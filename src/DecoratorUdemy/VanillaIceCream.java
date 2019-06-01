package DecoratorUdemy;

public class VanillaIceCream extends IceCreamDecorator {

	public VanillaIceCream(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		System.out.println("Adding Vanilla");
		return 1.5 + super.cost();
	}

}

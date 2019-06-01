package DecoratorUdemy;

public class MintIceCream extends IceCreamDecorator {

	public MintIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		System.out.println("Adding Mint");
		return 1.0 + super.cost();
	}

}

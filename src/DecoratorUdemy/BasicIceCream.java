package DecoratorUdemy;

public class BasicIceCream implements IceCream {

	public BasicIceCream() {
		System.out.println("Creating Basic IceCream !");
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.50;
	}

}

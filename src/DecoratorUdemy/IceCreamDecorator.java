package DecoratorUdemy;

public class IceCreamDecorator implements IceCream {
	private IceCream iceCream;

	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public double cost() {
		System.out.println("This decorator");
		return this.iceCream.cost();
	}

}

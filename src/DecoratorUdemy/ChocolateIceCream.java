package DecoratorUdemy;

public class ChocolateIceCream extends IceCreamDecorator {

	public ChocolateIceCream(IceCream iceCream) {
		super(iceCream);
	}

	@Override
	public double cost() {
		System.out.println("Adding Chocolate");
		return 1.8 + super.cost();
	}

}

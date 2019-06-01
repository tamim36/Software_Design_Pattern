package DecoratorUdemy;

public class MainDecorator {

	public static void main(String[] args) {

		IceCream basicIceCream = new BasicIceCream();
		System.out.println("The cost of basic ice cream = " + basicIceCream.cost());

		IceCream vanilla = new VanillaIceCream(new BasicIceCream());
		System.out.println("The cos of vanilla : " + vanilla.cost());

		IceCream mixed = new MintIceCream(new ChocolateIceCream(new VanillaIceCream(new BasicIceCream())));
		System.out.println("The all mixed IceCream cost : " + mixed.cost());

	}

}

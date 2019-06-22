package NullObjectPattern;

public class Main {

	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("abc");

		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
	}

}

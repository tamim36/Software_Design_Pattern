package IteratorPatternByUdemy;

public class DevStore {

	public static final int MAX_ITEMS = 4;
	private int numberOfProducts = 0;
	Product[] catalog;

	public DevStore() {
		catalog = new Product[MAX_ITEMS];

		addItems("C++ is not dead !", "T-Shirt", 39.99);
		addItems("Java Rocks", "Books", 29.99);
		addItems("GAME OF THRORNES", "Mouse-Pad", 25.99);
		addItems("Design Pattern", "Tutorial", 19.99);
	}

	private void addItems(String name, String description, double price) {
		Product product = new Product(name, description, price);

		if (numberOfProducts >= MAX_ITEMS) {
			System.out.println("Catalog is full !");
		} else {
			catalog[numberOfProducts] = product;
			numberOfProducts++;
		}
	}

	public Product[] getCatalog() {
		return catalog;
	}

	public DevStoreIterator createIterator() {
		return new DevStoreIterator(catalog);
	}

}

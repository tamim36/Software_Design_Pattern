package IteratorPatternByUdemy;

import java.util.ArrayList;

public class GeekyStore {

	private ArrayList<Product> catalog;

	public GeekyStore() {
		catalog = new ArrayList<Product>();

		addItems("SuperMan", "T-Shirt", 35.99);
		addItems("Lenovo", "Laptop", 1145.99);
		addItems("Batman The Hero", "Comics", 15.99);
		addItems("Apple Iphone", "Smartphone", 399.99);
	}

	private void addItems(String name, String description, double price) {
		Product product = new Product(name, description, price);
		catalog.add(product);
	}

	public ArrayList<Product> getCatalog() {
		return catalog;
	}

	public GeekyStoreIterator createIterator() {
		return new GeekyStoreIterator(catalog);
	}

}

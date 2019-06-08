package IteratorPatternByUdemy;

public class Main {

	public static void main(String[] args) {
		GeekyStore geekyStore = new GeekyStore();
		DevStore devStore = new DevStore();

		Seller seller = new Seller(geekyStore, devStore);
		seller.printCatalog();

	}

}

package IteratorPatternByUdemy;

public class Seller {

	GeekyStore geekyStore;
	DevStore devStore;

	public Seller(GeekyStore geekyStore, DevStore devStore) {
		this.geekyStore = geekyStore;
		this.devStore = devStore;
	}

	public void printCatalog() {
		GeekyStoreIterator geekyStoreIterator = geekyStore.createIterator();
		System.out.println("Printing GeekyStore Catalog .... \n");
		printCatalog(geekyStoreIterator);

		DevStoreIterator devStoreIterator = devStore.createIterator();
		System.out.println("\n\nDevStore catalog is now displaying ....  \n");
		printCatalog(devStoreIterator);

	}

	private void printCatalog(GeekyStoreIterator geekyStoreIterator) {
		while (geekyStoreIterator.hasNext()) {
			Product product = (Product) geekyStoreIterator.next();
			System.out.print(product.getName() + " , ");
			System.out.print(product.getDescription() + " , ");
			System.out.println(product.getPrice() + " , ");
		}

	}

	private void printCatalog(DevStoreIterator devStoreIterator) {
		while (devStoreIterator.hasNext()) {
			Product product = (Product) devStoreIterator.next();
			System.out.print(product.getName() + " , ");
			System.out.print(product.getDescription() + " , ");
			System.out.println(product.getPrice() + " , ");
		}

	}
}

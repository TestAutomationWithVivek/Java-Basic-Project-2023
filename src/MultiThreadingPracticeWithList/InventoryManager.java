package MultiThreadingPracticeWithList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	
	List<Product> soldProductList = new CopyOnWriteArrayList<>();
	List<Product> purchasedProductList = new ArrayList<Product>();
	
	public void populateSoldProducts() {
		for(int i = 0; i < 1000; i++) {
			Product product = new Product(i, "test_product " + i);
			soldProductList.add(product);
			System.out.println("Product added "+ product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProduct() {
		for(Product product : soldProductList) {
			System.out.println("Printing Sold product :"+ product);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

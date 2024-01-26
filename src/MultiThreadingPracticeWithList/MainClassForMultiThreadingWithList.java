package MultiThreadingPracticeWithList;

public class MainClassForMultiThreadingWithList {

	public static void main(String[] args) throws InterruptedException {
		InventoryManager inventoryManager = new InventoryManager();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				inventoryManager.populateSoldProducts();
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				inventoryManager.displaySoldProduct();

			}
		});
		
		thread1.start();
		Thread.sleep(2000);
		thread2.start();


	}

}

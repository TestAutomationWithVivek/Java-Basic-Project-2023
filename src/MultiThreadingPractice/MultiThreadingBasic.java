package MultiThreadingPractice;

public class MultiThreadingBasic {

	public static void main(String[] args) {
		//Although this thread run first but second thread result printed because first thread time to execute 
		System.out.println("Starting first thread......");
		Task task = new Task("Thread - A");
	    //task.start();
		//Another way to invoke thread
		Thread t1 = new Thread(task);
		t1.start();
		

		System.out.println("Hello there ............");
		
		System.out.println("Starting second thread......");
		Task task1 = new Task("Thread - B");
		//task1.start();
		Thread t2 = new Thread(task1);
		t2.start();
		
		//Task task = new Task();
		//task.start();

	}

}

class Task extends Thread {
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i =0; i <= 1000; i++) {
			Thread.currentThread().setName(name);
			System.out.println("numbers === "+i+ "-"+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package ThreadSafetyUsingSynchronization;

public class RunClassWhereMainMethodExist {

	public static void main(String[] args) {
		
		Sequence sequence = new Sequence();
		
//		for(int i = 0; i < 100; i ++) {
//			System.out.println(sequence.getNext());
//		}
		
		Worker worker1 = new Worker(sequence);
		worker1.start();
		
		Worker worker2 = new Worker(sequence);
		worker2.start();

	}

}

class Worker extends Thread {
	Sequence sequence = null;
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void run() {
		for(int i = 0; i < 100; i ++) {
			System.out.println(Thread.currentThread().getName() + " got value " + sequence.getNext());
		}

	}
	
}

package ThreadSafetyUsingSynchronization;

public class Sequence {
	int val = 0;
	
	public synchronized int getNext() {
		
		
			val = val +1;
			return val;
		
		
	}

}

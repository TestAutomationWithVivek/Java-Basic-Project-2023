package ProducerConsumerPatternUsingBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainClassApplicationBlockingQueueForConsumerProducerPattern {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);
		Thread t1 = new Thread(new ProducerB(questionQueue));
		Thread t2 = new Thread(new ConsumerB(questionQueue));
		
		t1.start();
		t2.start();

	}

}

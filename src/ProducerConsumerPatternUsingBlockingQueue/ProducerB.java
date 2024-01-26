package ProducerConsumerPatternUsingBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class ProducerB implements Runnable{
	BlockingQueue<Integer> blockingQueue;
	int questionNo;
	
	public ProducerB(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				synchronized (blockingQueue) {
					int nextQuestion = questionNo++;
					System.out.println("Next Question = "+ nextQuestion);
					blockingQueue.put(nextQuestion);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

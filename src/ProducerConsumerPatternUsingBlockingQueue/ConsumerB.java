package ProducerConsumerPatternUsingBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerB implements Runnable{
	
	BlockingQueue<Integer> blockingQueue;
	
	public ConsumerB(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while(true) {

			try {
				Thread.sleep(2000);
				System.out.println("Answerred Question: "+ blockingQueue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

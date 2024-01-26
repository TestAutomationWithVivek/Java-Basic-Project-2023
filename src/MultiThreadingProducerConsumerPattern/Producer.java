package MultiThreadingProducerConsumerPattern;

import java.util.List;

public class Producer implements Runnable{
	List<Integer> questionLists = null;
	final int limit = 5;
	private int questionNumber;
	
	public Producer(List<Integer> questionLists) {
		this.questionLists = questionLists;
	}
	
	//wait() and notify() functions can only be called in synchronization block
	public void readQuestion(int questionNo) throws InterruptedException {
		synchronized (questionLists) {
			while(questionLists.size() == limit) {
			System.out.println("Questions limit has reached ....... Please wait for the answers");		}
			//wait() tells current thread to wait and gives control to another thread to perform operation
			//In this example producer thread has reached its limit of questions so now consumer thread will answer it 
			questionLists.wait();
		}
		
		synchronized (questionLists) {
			questionLists.add(questionNumber);
			System.out.println("New question : " + questionNumber);
			//notify() works as a notification to another thread and relinquishes control to another thread
			// Here it is giving control after adding all questions
			questionLists.notify();
		}
		
	}

	@Override
	public void run() {
		while(true){
		try {
			readQuestion(questionNumber++);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

}

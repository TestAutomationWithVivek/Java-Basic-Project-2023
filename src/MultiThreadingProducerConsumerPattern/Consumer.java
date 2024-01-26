package MultiThreadingProducerConsumerPattern;

import java.util.List;

public class Consumer implements Runnable{
	List<Integer> questionLists = null;
	
	public Consumer(List<Integer> questionLists) {
		this.questionLists = questionLists;
	}
	
	//wait() and notify() functions can only be called in synchronization block
	public void answerQuestion() throws InterruptedException {
		synchronized (questionLists) {
			while(questionLists.isEmpty() ==  true) {
			System.out.println("No question to answer ....... Waiting for producer to get question");		}
			//wait() tells current thread to wait and gives control to another thread to perform operation
			//In this example consumer thread is empty so now producer thread will add question and this thread will give control
			questionLists.wait();
		}
		
		synchronized (questionLists) {
			Thread.sleep(5000);
			System.out.println("Answer Question ....... " + questionLists.remove(0));
			//HEy I just answer question and removed question plz take control
			questionLists.notify();
		}
		
	}

	@Override
	public void run() {
		
		while(true){
		try {
			answerQuestion();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

}

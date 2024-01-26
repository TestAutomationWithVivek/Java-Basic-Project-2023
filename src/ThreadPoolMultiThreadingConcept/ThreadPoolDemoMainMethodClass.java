package ThreadPoolMultiThreadingConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemoMainMethodClass {

	public static void main(String[] args) {
		
		ExecutorService excutExecutorService = Executors.newFixedThreadPool(2);
		
		Runnable processer = new MessageProcessor(2);
		excutExecutorService.execute(processer);
		
		Runnable processer1 = new MessageProcessor(3);
		excutExecutorService.execute(processer1);
		
		Runnable processer2 = new MessageProcessor(4);
		excutExecutorService.execute(processer2);
		
		Runnable processer3 = new MessageProcessor(5);
		excutExecutorService.execute(processer3);
		
		excutExecutorService.shutdown(); //Reject any new tasks from being submitted. Gracefully shut down the service
        
		
		while(!excutExecutorService.isTerminated()) {
			
		}
		System.out.println("Submitted all task ..");
	}

}

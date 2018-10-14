package threading.printsequence;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreeThreadsOrderedLockLess {

	AtomicInteger sharedOutput = new AtomicInteger(0);

	public static void main(String args[]) {

		AtomicInteger sharedOutput = new AtomicInteger(0);


		ThreadTasks t1 = new ThreadTasks(0,sharedOutput);
		ThreadTasks t2 =new ThreadTasks(1,sharedOutput);
		ThreadTasks t3 = new ThreadTasks(2,sharedOutput);

		Thread ts1 = new Thread(t1);
		Thread ts2 = new Thread(t2);
		Thread ts3 = new Thread(t3);
		ts1.start();
		ts2.start();
		ts3.start();

	}
	
	


}

package threading.printsequence;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTasks implements Runnable{
	
	private final int threadPosition;
	AtomicInteger sharedOutput;

	public ThreadTasks(int threadPosition,AtomicInteger sharedOutput) {
		super();

		this.threadPosition = threadPosition;
		this.sharedOutput=sharedOutput;
	}

	public void run() {
		while (sharedOutput.get() < 10) {

			if (sharedOutput.get() % 3 == this.threadPosition) {

				int value = sharedOutput.get() + 1;
				System.out.println("Printing output for Thread: " + this.threadPosition + "  " + value);
				sharedOutput.incrementAndGet();
			}
			
		}
		
	}

	
}

package threading.printsequence;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class ThreadPrintSequenceInTest {
	

	public static  void main(String args[])
	{
		
		
		 Object lock = new Object();

		
		AtomicInteger atomic = new AtomicInteger(0);
		
		MyPrintSequenceRunnabe threadOneRunnable =
				new  MyPrintSequenceRunnabe(0,atomic,lock);
		MyPrintSequenceRunnabe threadTwoRunnable = 
				new  MyPrintSequenceRunnabe(1,atomic,lock);
		MyPrintSequenceRunnabe threadThreeRunnable = 
				new  MyPrintSequenceRunnabe(2,atomic,lock);
		
		
	Thread threadOne = new Thread(threadOneRunnable);
	Thread threadTwo = new Thread(threadTwoRunnable);
	Thread threadThree = new Thread(threadThreeRunnable);
	
	threadOne.start();
	threadTwo.start();
	threadThree.start();
	
	
	
	}
	

}

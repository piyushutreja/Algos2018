package threading.printsequence;

import java.util.concurrent.atomic.AtomicInteger;

public class MyPrintSequenceRunnabe implements Runnable{


	
	final int threadId;
	

	
	private AtomicInteger sharedOutput ;
	

	
	
	public  MyPrintSequenceRunnabe(int threadId,AtomicInteger sharedOutput, Object lock)
	{
		this.threadId = threadId;
		this.sharedOutput =  sharedOutput;
	
	}
	
	
	public void run() {
		

		
		
	
		
		while(sharedOutput.get()<10)
		{
		
				
			if(sharedOutput.get() % 3==this.threadId)
			{

				int value = sharedOutput.get() + 1;
				System.out.println("Printing output for Thread: " + this.threadId + "  " + value);
			
				
				sharedOutput.incrementAndGet();
				
				
			
				
			}
		
			
				
			
			
			
		


		
			
		}
	
		
		
		
		}
		
		
	

}

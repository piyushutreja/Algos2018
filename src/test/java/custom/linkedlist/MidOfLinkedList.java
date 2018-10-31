package custom.linkedlist;

import linkedlist.CustomLinkedList;
import linkedlist.CustomLinkedList.Node;

public class MidOfLinkedList {
	
	public int gindMidElement(CustomLinkedList linkeList)
	{
		Node head = linkeList.getHead();
		
		Node slow_pointer=head;
		Node fast_pointer =head;
		
	 while (null!=fast_pointer.getNext() && null!=fast_pointer)
	 {
		 
		 slow_pointer= slow_pointer.getNext();
		 fast_pointer=fast_pointer.getNext().getNext();
		 
		 
	 }
		
	
	 return slow_pointer.getData();
		
	}

	
	
}

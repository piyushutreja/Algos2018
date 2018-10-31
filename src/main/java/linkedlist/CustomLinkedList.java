package linkedlist;

public class CustomLinkedList {
	
	private  Node head; 
	
	public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}




	
	 public class Node {
		
		private	int data; 
		private	Node next; 
		
	
	public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}

		
	
		
	}

}

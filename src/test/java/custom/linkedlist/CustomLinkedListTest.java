package custom.linkedlist;

import java.util.LinkedList;

import linkedlist.CustomLinkedList;

public class CustomLinkedListTest {
	
	
public static void main(String args [] )
{
	CustomLinkedList linkedList = new CustomLinkedList(); 
	
	CustomLinkedList.Node node1 =linkedList.new Node();	
	CustomLinkedList.Node node2 = linkedList.new Node(); 	
	CustomLinkedList.Node node3 = linkedList.new Node();
	CustomLinkedList.Node node4 = linkedList.new Node();
	CustomLinkedList.Node node5 = linkedList.new Node();
	
	node1.setData(1);
	node1.setNext(node2);
	node2.setData(2);
	node2.setNext(node3);
	node3.setData(3);	
	node3.setNext(node4);
	node4.setNext(node5);
	node4.setData(4);
	node5.setData(5);
	
	linkedList.setHead(node1);
	
MidOfLinkedList mid = new MidOfLinkedList();
System.out.println(mid.gindMidElement(linkedList));
	
}


public void printAll()
{
	
}

}

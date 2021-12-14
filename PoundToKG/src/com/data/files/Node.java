package com.data.files;

public class Node<datatype> {
	
	private datatype head;
	private Node<datatype> next;
	
	public void setNext(Node<datatype> next) {
		this.next = next;
	}

	public Node(datatype a) {
		this.head = a;
	}

	public datatype getHead() {
		return head;
	}

	public void setHead(datatype head) {
		this.head = head;
	}

	public Node getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	
	
	

}

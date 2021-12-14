package com.java.utilits;

import com.data.files.Node;

public class List<datatype> {

	private Node<datatype> current;
	
	private int size;
	public void add(datatype a) {

		Node<datatype> temp = new Node<datatype>(a);
		//Node<datatype> newValue = new Node<datatype>(a);

		// newValue = current;
		temp.setNext(current);
		current = temp;
		size++;

	}
	
	public void print() {
		
		while(current!=null) {
		System.out.println(current.getHead());
		
		current = current.getNext();
		
		}
	}

	
	public void removeFront() {
		
		
	}
	public int size() {
		
		if(isEmpty()) {
			return 0;
		}
		return size;}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		
		if(size==0) {
			return true;
		}
		return false;
	}
}

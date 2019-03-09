package com.datastructure.linkedlist;

public class LinkedListInsertion {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	/*
	 * Inserting new Node at the start of a linked list
	 */
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	/*
	 * Inserting new Node at the end of a linked list
	 */
	public void insertAtTheEnd(int data) {
		if(this.head == null) {
			head = new Node(data);
			return;
		}
		Node newNode = new Node(data);
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		newNode.next = null;
	}
	
	/*
	 * Inserting new Node in the middle of a linked list
	 */
	public void insertInTheMiddle(Node previous, int data) {
		if(previous == null) {
			System.out.println("Previous cannot be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = previous.next;
		previous.next = newNode;
	}
	
	/*
	 * Util Method to print Node data
	 */
	public void printListData(Node head) {
		if(head == null) {
			return;
		}
		Node n = head;
		while(n != null) {
			System.out.print("["+n.data+"]->");
			n= n.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		LinkedListInsertion list = new LinkedListInsertion();
		list.insertAtHead(50);
		list.insertAtHead(40);
		list.insertAtHead(30);
		list.insertAtHead(20);
		list.insertAtHead(10);
		list.insertAtTheEnd(1000);
		list.insertInTheMiddle(list.head.next.next, 2000);
		list.printListData(list.head);
	}

}

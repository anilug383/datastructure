package com.datastructure.linkedlist;

public class DeleteGivenKeyInLinkedList {

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
	 * method to delete a given node based on the key
	 * assuming list has unique keys
	 */
	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		//if head has key, then change the pointer
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		//if temp is null, then key is not present
		if (temp == null) return;
		
		prev.next = temp.next;
		
	}
	
	/*
	 * deleting a node in given position
	 */
	
	public void deleteNodeInGivenPosition(int position) {
		Node temp = head;
		if(position == 0) {
			head = temp.next;
			return;
		}
		
		for(int i = 0; temp!=null && i<position-1; i++) {
			temp = temp.next;
		}
		
		if(temp == null || temp.next == null) {
			return;
		}
		
		temp.next = temp.next.next;
	}
	
	/*
	 *method to delete a linked list 
	 */
	public void deleteList() {
		this.head = null;
	}
	
	public int lengthOfAList() {
		int length = 0;
		Node temp = head;
		while(temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
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
		DeleteGivenKeyInLinkedList list = new DeleteGivenKeyInLinkedList();
		list.insertAtHead(50);
		list.insertAtHead(40);
		list.insertAtHead(30);
		list.insertAtHead(20);
		list.insertAtHead(10);
		System.out.println("Linked list before deleting the key");
		list.printListData(list.head);
		System.out.println("Length of the list is "+list.lengthOfAList());
		list.deleteNode(30);
		System.out.println("Linked list after deleting the key");
		list.printListData(list.head);
		list.deleteNodeInGivenPosition(1);
		System.out.println("Linked list after deleting at position 1");
		list.printListData(list.head);
	}


}

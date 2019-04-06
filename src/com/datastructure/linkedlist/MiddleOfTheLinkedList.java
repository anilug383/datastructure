package com.datastructure.linkedlist;

public class MiddleOfTheLinkedList {
	
	Node head;
	static class Node {
		int data;
		Node next;

		Node (int data){
			this.data = data;
			this.next = null;
		}
	}

	private void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

	}

	private void print(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public int getMiddle(Node head) {
		Node slowPtr = head;
		Node fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr.data;
	}
	
	public static void main(String[] args) {
		
		MiddleOfTheLinkedList list = new MiddleOfTheLinkedList();
		list.push(30);
		list.push(20);
		list.push(10);
		list.push(00);
		list.push(00);
		
		System.out.println("Middle of the linked list : "+list.getMiddle(list.head));
	}

}

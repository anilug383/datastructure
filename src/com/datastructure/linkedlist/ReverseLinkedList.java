package com.datastructure.linkedlist;

public class ReverseLinkedList {
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

	private Node reverseList(Node head) {
		Node prev = null;
		Node current = head;
		Node next =  null;

		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
		return head;
	}

	public static void main(String[] args) {

		ReverseLinkedList list = new ReverseLinkedList();
		list.push(10);
		list.push(20);
		list.push(30);

		list.print(list.head);

		Node reverse = list.reverseList(list.head);
		System.out.println("Reversed list");
		list.print(reverse);

	}

}

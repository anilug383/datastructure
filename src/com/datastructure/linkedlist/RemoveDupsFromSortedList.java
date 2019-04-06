package com.datastructure.linkedlist;

public class RemoveDupsFromSortedList {
	
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
	
	public static void main(String[] args) {
		
		RemoveDupsFromSortedList list = new RemoveDupsFromSortedList();
		list.push(40);
		list.push(40);
		list.push(30);
		list.push(30);
		list.push(20);
		list.push(10);
		list.push(00);
		list.push(00);
		list.print(list.head);
		Node node = list.removeDups(list.head);
		System.out.println("After removing duplicates");
		list.print(node);
		
	}

	private Node removeDups(Node head) {
		Node temp = head;
		Node next_next = null;
		
		while(temp.next != null) {
			if(temp.data == temp.next.data) {
				next_next = temp.next.next;
				temp.next = null;
				temp.next = next_next;
			} else {
				temp = temp.next;
			}
		}
		
		return head;
	}

}

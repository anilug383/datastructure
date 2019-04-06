package com.datastructure.linkedlist;

public class NthNodeFromTheEnd {
	
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
	
	private void getNthNodeFromEnd(int i) {
		Node main_ptr = head;
		Node ref_ptr = head;
		int count = 0;
		if (head != null) {
			while(count < i) {
				if (ref_ptr == null) {
					System.out.println(i+" is greater than no of nodes in the list");
				}
				ref_ptr = ref_ptr.next;
				count++;
			}
			
			while(ref_ptr != null) {
				main_ptr = main_ptr.next;
				ref_ptr = ref_ptr.next;
			}
			System.out.println(main_ptr.data);
		}
		
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
		
		NthNodeFromTheEnd list = new NthNodeFromTheEnd();
		list.push(10);
		list.push(8);
		list.push(6);
		list.push(4);
		list.print(list.head);
		list.getNthNodeFromEnd(3);;
	}

}

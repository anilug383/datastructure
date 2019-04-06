package com.datastructure.linkedlist;

public class NthNodeInLinkedList {
	
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
	
	public Node findNthNode(int n) {
		Node node = null;
		Node current = head;
		int count = 0;
		while(current != null) {
			count ++;
			if(n == count) {
				node = current;
				return node;
			}
			current = current.next;
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		NthNodeInLinkedList list = new NthNodeInLinkedList();
		list.push(10);
		list.push(8);
		list.push(6);
		list.push(4);
		
		list.print(list.head);
		
		//find third node i.e 3
		Node node = list.findNthNode(1);
		System.out.println(node.data);
		
	}

}
